<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Insert title here</title>
</head>
<body background="pic.jpg"
	; style="background-repeat: no-repeat; background-size: cover; padding-top: 250px;">

	<script language="Javascript">
		function valid() {
			a = document.getElementById("n1")
			b = document.getElementById("n2")

			if (n1.value == '') {
				alert("نام نوع تسهیلات را وارد کنید");
				n1.focus();
				return false;
			}

			if (n2.value == '') {
				alert("نرخ سود را وارد کنید");
				n2.focus();
				return false;
			}

		}
	</script>

	<form name="notnull" action="addLoanSuccess" method="get"
		onsubmit="return valid()">
		<table align="center"
			style="border-color: black; border-width: 1px; border-style: solid">
			<tr>
				<td style="padding-top: 50px"><input dir="rtl" type="text" name="name"
					size="30" id="n1" /></td>
				<td
					style="padding-top: 50px; font-family: verdana; text-align: right;font-family:courier">:نام
					نوع تسهیلات</td>

			</tr>
			<tr>
				<td style="padding-top: 20px"><input type="text"
					name="interestRate" size="30" id="n2" /></td>
				<td
					style="padding-top: 20px; font-family: verdana; text-align: right;font-family:courier">:نرخ
					سود</td>

			</tr>

			<tr>


				<td align="center"
					style="padding-left: 100px; padding-top: 40px; font-family:courier">
					<input type="submit" value="ثبت" size="100"
					style="text-align: center; font-family:courier">
				</td>
			</tr>


		</table>

	</form>
	
	
	
</body>
</html>