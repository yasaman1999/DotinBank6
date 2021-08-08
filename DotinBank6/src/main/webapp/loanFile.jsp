<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
<script language="Javascript">
		function valid() {
			a = document.getElementById("n1")
			
			if (n1.value == '') {
				alert("شماره مشتری را وارد کنید");
				n1.focus();
				return false;
			}
		}
	</script>
</head>
<body background="picc.jpeg"
	; style="padding-top: 10px; background-repeat: no-repeat; background-size: cover">
	<form  action="checkCustomer" method="get">
		<table align="center"
		style="border-color: black; border-width: 1px;
		 border-top:1px solid black;border-right:1px solid black;border-left:1px solid black;
		 width:390px">
			<tr>
				<td style="padding-top: 5px"><input dir="rtl" type="text" name="customerNumber"
					size="30" id="n1"/></td>
				<td
					style="padding-top: 5px; font-family: verdana; text-align: right;font-family:courier">:شماره مشتری 
					</td>
			

			<tr>


				<td align="center"
					style="padding-left: 130px; padding-top: 40px; font-family:courier">
					<input type="submit" value="بازیابی" onclick="return valid()" size="100"
					style="text-align: center; font-family:courier">
					
				</td>
			</tr>
		    </table>

	</form>
	
	<form action="backToMainPage" method="get">
		<table align="center"
		style="border-right:1px solid black;border-left:1px solid black;border-bottom:1px solid black;width:390px">
		
		<tr>


				<td align="center"
					style="padding-left: 140px; padding-top: 20px;padding-right:140px; font-family:courier">
					<input type="submit" value="بازگشت" size="100" 
					style="text-align: center; font-family:courier height:50px; width:100px">
				</td>
			</tr>
		
		
		</table>
		
		
		</form>
	
		
		

</body>
</html>