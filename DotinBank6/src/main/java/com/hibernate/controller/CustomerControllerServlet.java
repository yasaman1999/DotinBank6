package com.hibernate.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.hibernate.bean.CustomerManagment;
import com.hibernate.dao.CustomerDao;

/**
 * Servlet implementation class CustomerControllerServlet
 */
public class CustomerControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		

		String name = request.getParameter("name");
		String family = request.getParameter("family");
		String fatherName = request.getParameter("fatherName");
		String gender = request.getParameter("gender");
		String birthday = request.getParameter("birthday");
		String nationalCode = request.getParameter("nationalCode");
		String placeOfBirth = request.getParameter("placeOfBirth");
		String address = request.getParameter("address");
		String mobileNumber = request.getParameter("mobileNumber");
		String phoneNumber = request.getParameter("phoneNumber");

		
		
		CustomerManagment customerManagment = new CustomerManagment();
		
	
			
		if (customerManagment.validationNationalCode(nationalCode)) {
			
			
			try {
				CustomerDao customerDAO = new CustomerDao();
		
				customerDAO.addCustomerDetails(name, family, fatherName, Boolean.parseBoolean(gender), 
							birthday, nationalCode, placeOfBirth, address, 
							mobileNumber, phoneNumber);
					response.sendRedirect("CustomerAddSuccessful.jsp");
					
				
				}

			 catch (Exception e) {

				e.printStackTrace();
			}
		}
		

	else {
			response.sendRedirect("EnterInvalidNationalCode.jsp");
		}

}
}
