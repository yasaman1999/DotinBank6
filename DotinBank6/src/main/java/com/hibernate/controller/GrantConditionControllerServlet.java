package com.hibernate.controller;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.bean.GrantCondition;
import com.hibernate.dao.GrantConditionDao;


/**
 * Servlet implementation class GrantConectionControllerServlet
 */
public class GrantConditionControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Set<GrantCondition> grantConditionSet = new HashSet<GrantCondition>();
		String[] grantConditions = request.getParameterValues("grantCondition");
		for (int i = 0; i< grantConditions.length; i++) {
			StringTokenizer st = new StringTokenizer(grantConditions[i], "#");
			String name = st.nextToken();
			String minimumContractPeriod = st.nextToken();
			String maximumContractPeriod = st.nextToken();
			String minimumContractAmount = st.nextToken();
			String maximumContractAmount = st.nextToken();
			
			GrantCondition grantcondition = new GrantCondition();
			grantcondition.setName(name);
			grantcondition.setMinimumContractPeriod(minimumContractPeriod);
			grantcondition.setMaximumContractPeriod(maximumContractPeriod);
			grantcondition.setMinimumContractAmount(minimumContractAmount);
			grantcondition.setMaximumContractAmount(maximumContractAmount);
			
			grantConditionSet.add(grantcondition);
		}
	
		try {
			
			GrantConditionDao grantconditionDao = new GrantConditionDao();
			
			grantconditionDao.addGrantConditionDetails(grantConditionSet);
			
			response.sendRedirect("CustomerAddSuccessful.jsp");
				
			
			}

		 catch (Exception e) {

			e.printStackTrace();
		}
	}

	

}
