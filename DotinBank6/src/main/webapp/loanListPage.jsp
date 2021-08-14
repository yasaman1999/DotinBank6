<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
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
	; style="padding-top: 10px; background-repeat: no-repeat; background-size: cover;width:460px;
  margin: auto;">
	
	
	 <%List<Object[]> list= (List<Object[]>) request.getAttribute("list"); %>  
	 
	 
	 <form action="checkInfo">
	 <table align="right" 
			style="border-color: black; border-width: 1px;
		 border-top:1px solid black;border-right:1px solid black;border-left:1px solid black;width:460px">
			
			<tr>
			<td>
					
	 <select style="box-shadow: 0px 6px 12px 0px rgba(0, 0, 0, 0.2);"   name="loanTypeId">
	 
         <option  value="" selected>انواع تسهیلات</option>  
         <!-- <optgroup label=" انواع تسهیلات  "> -->
        <%
        for(Object[] LoanType: list)
		 {	
			int id = (Integer)LoanType[0];
			String name = (String)LoanType[1];
        %>
        <option value="<%=id %>"><%out.print(name); %></option>
        <%} %>
        </optgroup>
    </select>
    </td>
    </tr>
    
   <tr>
				<td style="padding-top:50px"><input  type="text" name="contractPeriod"
					size="30" /></td>
				<td
					style="padding-top: 50px;  text-align: right;font-family:courier">
					(مدت قرارداد (ماه
					</td>

			</tr>
			<tr>
				<td style="padding-top:50px"><input  type="text" name="amountPeriod"
					size="30" /></td>
				<td
					style="padding-top: 50px; text-align: right;font-family:courier">(مبلغ قرارداد(تومان</td>
					

			</tr>
			<tr>
			<td align="center"
				style="padding-left: 190px; padding-top: 30px; font-family: verdana">
    <input type="submit" value="ثبت" size="120"
						style="text-align: center; font-family:courier">
    </td>
    </tr>
    </table>
    </form>
    <form action="backToMainPage" method="get">
		<table align="center"
		style="border-right:1px solid black;border-left:1px solid black;border-bottom:1px solid black;width:460px">
		
		<tr>


				<td align="center"
					style="padding-left: 150px; padding-top: 20px;padding-right:150px; font-family:courier">
					<input type="submit" value="بازگشت" size="100" 
					style="text-align: center; font-family:courier height:50px; width:100px">
				</td>
			</tr>
		
		
		</table>
		
		
		</form>

	
	
	

</body>
</html>