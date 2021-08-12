package com.hibernate.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Servlet implementation class checkInfoControllerServlet
 */
public class checkInfoControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String loanType = (String) request.getParameter("loanType"); 
		
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		
				Query query1 = session.createQuery(
						"select loanType.id from LoanType loanType WHERE loanType.name=:loanType");
				query1.setParameter("loanType",loanType);
				
					List<Object[]> collection = query1.getResultList();
					for(Object[] LoanType: collection)
					 {	
						int id =(Integer) LoanType[0];
						System.out.println(id);
					 }
					
					
					
				
				 
				RequestDispatcher rd = request.getRequestDispatcher("loanListPage.jsp");
				rd.forward(request, response);
				
				
				transaction.commit();
	}

	

}
