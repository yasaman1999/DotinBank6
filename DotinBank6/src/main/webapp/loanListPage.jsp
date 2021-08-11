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
	
	<%ArrayList list= (ArrayList)request.getAttribute("list"); %>
	
	
	<select name="database1">
        <option value="" selected>select</option>
        <%
        for(int i=0;i<list.size();i++) {
            String Field=list.get(i).toString();
        %>
        <option value="<%=Field %>"><%=Field %></option>
        <%} %>
    </select>
	
	
	
	
	
	
	<%-- <select>
	
	
	<c:forEach items ="${list }" var="loanName" varStatus="loop">
	<option value="${loop.index }">
	${loanName }
	</option>
	</c:forEach>
	</select> --%>
	
	
	
	
	
	
	
	
	
	
	
	
	
<%-- 	<p>Select Name :
	<select style="size: 500px;text-align=center">
 <option value="<%= %>"><%=%></option> 
<option value="2"> hello2</option>
<option value="2"> hello2</option> 
<c:forEach items="${list}">
        <option value="${list}">${list}</option>
    </c:forEach>
</select>
<select  array="list" name="my List">
        <c:forEach var="party" items="${list}">
    <option value="${party}" />
</c:forEach>
    </select>
</p> --%>
</body>
</html>