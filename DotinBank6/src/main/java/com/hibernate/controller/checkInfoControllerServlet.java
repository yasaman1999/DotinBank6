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
		
		
		
			int id = Integer.parseInt(request.getParameter("loanInfo"));
			System.out.println(id);
		

		
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery(
				"select grantCondition.minimumContractPeriod,grantCondition.maximumContractPeriod,grantCondition.minimumContractAmount,grantCondition.maximumContractAmount from GrantCondition grantCondition WHERE grantCondition.loanType.id=:id");
		query.setParameter("id",id);
		if(query.getResultList() != null) {
		List<Object[]> collection = query.getResultList();
		for(Object[] GrantCondition: collection)
		 {	
			
			int minimumContractPeriod = (Integer)GrantCondition[0];
			int maximumContractPeriod = (Integer)GrantCondition[1];
			int minimumContractAmount = (Integer)GrantCondition[2];
			int maximumContractAmount = (Integer)GrantCondition[3];
			
			

		 }
		
				
					
					
				
				 
				RequestDispatcher rd = request.getRequestDispatcher("hello.jsp");
				rd.forward(request, response);
				
				
				transaction.commit();
	}

	

}
}
