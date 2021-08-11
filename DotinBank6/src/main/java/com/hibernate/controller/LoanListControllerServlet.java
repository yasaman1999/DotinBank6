package com.hibernate.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
		
		HttpSession session = request.getSession();
		
		int id = (Integer) session.getAttribute("idKey");
//		int id = Integer.parseInt(id1);
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session2 = sessionFactory.openSession();
		Transaction transaction = session2.beginTransaction();

		
				Query query = session2.createQuery(
						"select loanType.name from LoanType loanType WHERE loanType.id=:id");
				query.setParameter("id",id);
				List list = query.list();
				
					
					request.setAttribute("list", list);
				
				 
				RequestDispatcher rd = request.getRequestDispatcher("loanListPage.jsp");
				rd.forward(request, response);
				
				
				transaction.commit();
		
		
	
	}
	
	
	

}
