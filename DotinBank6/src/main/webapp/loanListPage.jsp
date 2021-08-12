<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ page import="com.hibernate.bean.LoanType" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
</head>
<body background="picc.jpeg"
	; style="padding-top: 10px; background-repeat: no-repeat; background-size: cover;width:400px">
	
	 <%List<Object[]> list= (List<Object[]>) request.getAttribute("list"); %>  
	 <form action="checkInfo">
	 <select name="database1">
        <option value="" selected>select</option>
        <%
        for(Object[] LoanType: list)
		 {	
			int id = (Integer)LoanType[0];
			String name = (String)LoanType[1];
        %>
        <option value="<%=id %>"><%out.print(name); %></option>
        <%} %>
    </select>
    <input type="submit" value="Submit" />
    </form>

	
	
	

</body>
</html>