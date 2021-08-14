package com.hibernate.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.bean.Customer;
import com.hibernate.bean.GrantCondition;
import com.hibernate.bean.LoanFile;
import com.hibernate.bean.LoanType;
import com.hibernate.dao.GrantConditionDao;
import com.hibernate.dao.LoanFileDao;

/**
 * Servlet implementation class checkInfoControllerServlet
 */
public class checkInfoControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		boolean isMatch = false;
		int id = Integer.parseInt(request.getParameter("loanTypeId"));
		int contractPeriod = Integer.parseInt(request.getParameter("contractPeriod"));
		int amount = Integer.parseInt(request.getParameter("amountPeriod"));

		ServletContext servletcontext = getServletContext();
		int customerNumber = (Integer) servletcontext.getAttribute("customerNumber");

		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Query query1 = session
				.createQuery("select customer.id from Customer customer WHERE customer.customerNumber=:customerNumber");
		query1.setParameter("customerNumber", customerNumber);
		int customerId = (Integer) query1.uniqueResult();

		Customer customer = (Customer) session.load(Customer.class, customerId);
		LoanType loanType = (LoanType) session.load(LoanType.class, id);

		Query query2 = session.createQuery(
				"select grantCondition.minimumContractPeriod,grantCondition.maximumContractPeriod,grantCondition.minimumContractAmount,grantCondition.maximumContractAmount from GrantCondition grantCondition WHERE grantCondition.loanType.id=:id");
		query2.setParameter("id", id);
		if (query2.getResultList() != null) {
			List<Object[]> collection = query2.getResultList();
			for (Object[] GrantCondition : collection) {

				int minimumContractPeriod = (Integer) GrantCondition[0];
				int maximumContractPeriod = (Integer) GrantCondition[1];
				int minimumContractAmount = (Integer) GrantCondition[2];
				int maximumContractAmount = (Integer) GrantCondition[3];

				if (contractPeriod >= minimumContractPeriod && contractPeriod <= maximumContractPeriod
						&& amount >= minimumContractAmount && amount <= maximumContractAmount) {
					isMatch = true;
					break;

				}

			}

			if (isMatch) {

				LoanFileDao loanFileDao = new LoanFileDao();

				loanFileDao.addLoanFileDetails(contractPeriod, amount, loanType, customer);

				response.sendRedirect("loanFileCreate.jsp");

			} else {
				response.sendRedirect("loanFileNotCreate.jsp");

			}

		}

		transaction.commit();

	}
}

