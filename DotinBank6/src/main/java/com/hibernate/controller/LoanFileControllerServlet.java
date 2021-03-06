package com.hibernate.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.bean.Customer;

/**
 * Servlet implementation class LoanFileControllerServlet
 */
public class LoanFileControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int customerNumber = Integer.parseInt(request.getParameter("customerNumber"));
		Customer customer = new Customer();
		
		ServletContext servletcontext = getServletContext();
		servletcontext.setAttribute("customerNumber", customerNumber);

		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		

		
				Query query1 = session.createQuery(
						"select customer.name,customer.family from Customer customer WHERE customer.customerNumber=:customerNumber");
				query1.setParameter("customerNumber",customerNumber);
				if(query1.getResultList() != null) {
				List<Object[]> collection = query1.getResultList();
				for(Object[] Customer: collection)
				 {	
					
					String name = (String)Customer[0];
					String family = (String)Customer[1];
					
					request.setAttribute("name", name);
					request.setAttribute("family", family);
					
				
				 }
				}else {
					System.out.println("null input");
				}
				
				
				
				RequestDispatcher rd = request.getRequestDispatcher("loanFile.jsp");
				rd.forward(request, response);
				
				
			
				
			
		}


		
		
		


	}


