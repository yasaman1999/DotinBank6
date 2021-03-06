package com.hibernate.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginControllerServlet
 */
public class MainControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String servletPath = request.getServletPath();
		
		if("/addCustomer".equalsIgnoreCase(servletPath))
	    {
	        response.sendRedirect("customerForm.jsp");

	    }

	    if("/chooseLoanType".equalsIgnoreCase(servletPath))
	    {
	    	response.sendRedirect("loanType.jsp");
	    }
	    
	    if("/loanFile".equalsIgnoreCase(servletPath))
	    {
	    	response.sendRedirect("loanFile.jsp");
	    }
	    
	    if("/chooseGrantCondition".equals(servletPath)) {
	    	response.sendRedirect("grantCondition.jsp");
	    }
		
		
	}

	

}
