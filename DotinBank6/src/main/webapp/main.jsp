
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<title>welcome</title>
<body background="picc.jpg"
	; style="padding-top: 250px; background-repeat: no-repeat; background-size: cover">



	<h2 align="center" style="color:black,;font-family:courier">به سیستم بانکداری خوش آمدید</h2>
	<br></br>

	<form action="addCustomer" method="get">
		<table align="center"
			style="border-color:white; border-width: 1px; border-style: solid">
			<tr>
				<td style="padding-top: 20px; padding-bottom: 20px"><input
					type="submit" value="تعریف مشتری" size="70"
					style="text-align: center; width: 200px;font-family:courier"></td>
			</tr>
		</table>
	</form>

	<form action="chooseLoanType" method="get">
		<table align="center"
			style="border-color:white; border-width: 1px; border-style: solid">
			<tr>

				<td style="padding-top: 20; padding-bottom: 20px"><input
					type="submit" value=" تعیین نوع تسهیلات " size="70"
					style="text-align: center; width: 200px;font-family:courier"></td>
			</tr>
		</table>

	</form>

	<form action="loanFile" method="get">
		<table align="center"
			style="border-color:white; border-width: 1px; border-style: solid;">
			<tr>

				<td style="padding-top: 20; padding-bottom: 20px"><input
					type="submit" value="تشکیل پرونده" size="70"
					style="text-align: center; width: 200px;font-family:courier"></td>
			</tr>
		</table>

	</form>
</body>
</html>