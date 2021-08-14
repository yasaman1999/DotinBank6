package com.hibernate.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
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

import com.hibernate.bean.LoanType;

/**
 * Servlet implementation class LoanListControllerServlet
 */
public class LoanListControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		

		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		
				Query query = session.createQuery(
						"select loanType.id,loanType.name from LoanType loanType ");
				
				@SuppressWarnings("unchecked")
				List<LoanType> list =(List<LoanType>) query.list();
				
					
				request.setAttribute("list", list);
				
				 
				RequestDispatcher rd = request.getRequestDispatcher("loanListPage.jsp");
				rd.forward(request, response);
				
				
				transaction.commit();
		
		
	
	}
	
	
	

}
