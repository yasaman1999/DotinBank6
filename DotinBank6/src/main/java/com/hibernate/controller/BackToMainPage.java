package com.hibernate.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BackToMainPage
 */
public class BackToMainPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String servletPath = request.getServletPath();
		
		if("/backToMainPage".equalsIgnoreCase(servletPath))
	    {
	        response.sendRedirect("main.jsp");

	    }

	    
		
		
		
		
		
		
		
		
		
	}

	

}
