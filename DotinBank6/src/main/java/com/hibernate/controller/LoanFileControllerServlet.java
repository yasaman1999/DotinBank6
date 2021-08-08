package com.hibernate.controller;

import java.io.IOException;
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
 * Servlet implementation class LoanFileControllerServlet
 */
public class LoanFileControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int customerNumber =Integer.parseInt(request.getParameter("customerNumber"));
		
		/*try {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
			String hql1 = "FROM Customer WHERE customerNumber := Integer.parseInt(request.getParameter(\"customerNumber\"))";
			Query query1 = session.createQuery(hql1);
			List result1 = query1.list();
			for (int i = 0; i < result1.size(); i++) {
				int result2 = (Integer) (result1.get(i));

				Query query2 = session
						.createQuery("select NAME, FAMILY from Customer WHERE result2 == customerNumber ");
				List nameAndFamily = query1.list();
				for (int j = 0; j < result1.size(); j++) {
					String result3 = (String) (nameAndFamily.get(i));
					request.setAttribute("key1", result3);
			
		    }
				
				RequestDispatcher rd = request.getRequestDispatcher("loanType.jsp");
				rd.forward(request, response);
		      	  
		} 
		
    
    	
		
		
		
		transaction.commit();
		}
		catch (Exception e) {

			e.printStackTrace();
		}
		*/
		
		
		
	}


}
