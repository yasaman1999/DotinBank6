<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
<script language="Javascript">
	function valid(){
	    a=document.getElementById("n1")
	    b=document.getElementById("n2")
	    c=document.getElementById("n3")
	    d=document.getElementById("n4")
	    e=document.getElementById("n5")
	  
	    
	    if(n1.value ==''){
        	alert("نام  را وارد کنید");
        	n1.focus();
        	return false;
        }
	    
	        if(n2.value ==''){
	        	alert("حداقل مدت قرارداد را وارد کنید");
	        	n2.focus();
	        	return false;
	        }
	        
	   
	        
	        if(n3.value ==''){
	        	alert(" حداکثر مدت قرارداد را وارد کنید");
	        	n3.focus();
	        	return false;
	        }
	        
	        if(n4.value ==''){
	        	alert("حداقل مبلغ قرارداد را وارد کنید");
	        	n4.focus();
	        	return false;
	        }
	        
	        if(n5.value ==''){
	        	alert("حداکثر مبلغ قرارداد را وارد کنید");
	        	n5.focus();
	        	return false;
	        }
	        
	        
	    

	        
	    }
	function addRow() {
		  var table = document.getElementById("newTable");
		  var row = table.insertRow(0);
		  var cell1 = row.insertCell(0);
		  var cell2 = row.insertCell(1);
		  var cell3 = row.insertCell(2);
		  var cell4 = row.insertCell(3);
		  var cell5 = row.insertCell(4);
		  cell1.innerHTML = n1.value;
		  cell2.innerHTML = n2.value;
		  cell3.innerHTML = n3.value;
		  cell4.innerHTML = n4.value;
		  cell5.innerHTML = n5.value;  
		  
		}


		function deleteRow() {
			  document.getElementById("newTable").deleteRow(0);
			}
				

		  function submitGrantConditions() {
			  var container = document.getElementById("container");
		      // Clear previous contents of the container
		   //   while (container.hasChildNodes()) {
		     //     container.removeChild(container.lastChild);
		     // }
		      
			    var myTab = document.getElementById('newTable');
			
			    // loop through each row of the table.
			    for (row = 0; row < myTab.rows.length; row++) {
			        // loop through each cell in a row.
			        var rowValue = myTab.rows.item(row).cells[0].innerHTML;
			        for (c = 1; c < myTab.rows[row].cells.length; c++) {
			            var element = myTab.rows.item(row).cells[c];
			            rowValue = rowValue + '#' + element.innerHTML;
			        }
			        var input = document.createElement("input");
		            input.type = "text";
		            input.name = "grantCondition";
		            input.value = rowValue;
		            container.appendChild(input);
			        
			    }
			}   
		    
	
	</script>
</head>




<body background="picc.jpeg"; style="background-repeat: no-repeat; background-size: cover; padding-top:50px;">

	<%
	
	  String name =(String) request.getAttribute("key1");
	  int interestRate = (Integer) request.getAttribute("key2");
	 
	 session.setAttribute("key3", name);
	 session.setAttribute("key4", interestRate);
	 
	
	%>
	
	<table align="right" id="newTable"
			style="border-color:black; border-width: 1px; border-style: solid">
			
	</table>
	
		<table align="right" id="myTable"
			style="border-color:black; border-width: 1px; border-style: solid">
			<tr>
				<td style="padding-top:50px"><input dir="rtl" type="text" name="name"
					size="30" id="n1" /></td>
				<td
					style="padding-top: 50px; font-family: verdana; text-align: right;font-family:courier">:نام
					</td>

			</tr>
			<tr>
				<td style="padding-top: 20px"><input type="text"
					name="minimumContractPeriod" size="30" id="n2"/></td>
				<td
					style="padding-top: 20px; font-family: verdana; text-align: right;font-family:courier">(حداقل مدت قرارداد(ماه
					</td>
			</tr>
			
			<tr>
				<td style="padding-top: 20px"><input type="text"
					name="maximumContractPeriod" size="30" id="n3" /></td>
				<td
					style="padding-top: 20px; font-family: verdana; text-align: right;font-family:courier">(حداکثرمدت قرارداد(ماه
					</td>
			</tr>
			
			<tr>
				<td style="padding-top: 20px"><input type="text"
					name="minimumContractAmount" size="30" id="n4" /></td>
				<td
					style="padding-top: 20px; font-family: verdana; text-align: right;font-family:courier">(حداقل مبلغ قرارداد(ماه
					</td>
			</tr>
			
			<tr>
				<td style="padding-top: 20px"><input type="text"
					name="maximumContractAmount" size="30" id="n5" /></td>
				<td
					style="padding-top: 20px; font-family: verdana; text-align: right;font-family:courier">(حداکثر مبلغ قرارداد(ماه
					</td>
			</tr>
		<tr>
			<td align="center" style="padding-left:100px;padding-top:20px">
			<button type="button" onclick="deleteRow()">-</button>
			<button type="button" onclick="addRow()">+</button>
			</td>
		</tr>
		
		 <tr>

			<td align="center"
				style="padding-left: 100px; padding-top: 10px; font-family: verdana">
				<form name="notnull" action="registrationofGrantConditions"
					method="get" onsubmit="return submitGrantConditions()">
					<div id="container"></div>
					<input onclick="return valid()" type="submit" value="ثبت" size="120"
						style="text-align: center; font-family:courier">
				</form>  


			</td>
		 </tr> 
		
		
		</table>
	
</body>
</html>