package com.hibernate.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hibernate.dao.LoanTypeDao;

/**
 * Servlet implementation class LoanTypeControolerServlet
 */
public class LoanTypeControolerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String interestRate = request.getParameter("interestRate");
		
		try {
			
			LoanTypeDao loanDao = new LoanTypeDao();
			
			loanDao.addLoanTypeDetails(name, interestRate);
			RequestDispatcher rd = request.getRequestDispatcher("grantCondition.jsp");
			rd.forward(request, response);
			
			/*response.sendRedirect("grantCondition.jsp");*/
				
			
			}

		 catch (Exception e) {

			e.printStackTrace();
		}
	}


}
	

	
