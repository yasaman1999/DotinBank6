<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
</head>
<body background="picc.jpeg"
	; style="padding-top: 10px; background-repeat: no-repeat; background-size: cover;width:400px">
	
	 <%List list= (List)request.getAttribute("list"); %>
	
	
	 <select name="database">
        <option value="selected">select</option>
        <%
        for(int i=0;i<list.size();i++) {
            String Field=list.get(i).toString();
        %>
        <option value="<%=Field %>"><%=Field %></option>
        <%} %>
       
        
    </select> 
	
<%-- 	<select name="database1">
  <c:forEach items="${list}" var="LoanName" varStatus="loop">
    <option value="${loop.index}">
        ${LoanName}
    </option>
  </c:forEach>
</select> --%>
	
	
	

</body>
</html>