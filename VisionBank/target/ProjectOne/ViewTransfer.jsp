<%@page import="com.revature.project.banking.model.TransferAmount"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Imran Banking</title>
<link rel="stylesheet" href="css/ViewDetails.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<header>
		<br>
		<h3>IMRAN'S BANKING APP</h3>
		<br>
	</header>

	<div class="nav">
		<a href="EmployeeHome.html">HOME</a> <a href="AboutUs.html">ABOUT
			US</a> <a href="Contact.html">CONTACT</a>
	</div>
	<br>
	<br>
	<h4>CUSTOMER TRANSFER DETAILS</h4>
	<br>
	<%
	List<TransferAmount> transferList = (List<TransferAmount>) session.getAttribute("transferList");
	%>

	<table class = "table table-hover">
	<thead class = "thead-dark">
		<tr>
			<th>SENDER</th>
			<th>RECEIVER</th>
			<th>AMOUNT</th>
		</tr>
		</thead>
		<%
		TransferAmount customerTransferList;
		for(int i = 0; i < transferList.size(); i++){
			customerTransferList = transferList.get(i);
			%>
			<tr>
			<td><%=customerTransferList.getSenderCustomerId() %></td>
			<td><%=customerTransferList.getReceiverCustomerId() %></td>
			<td><%=customerTransferList.getAmount() %></td>
			</tr>
		<% 
		}
		%>
	</table>
	
	<br>
		<a href = "EmployeeHome.html">HOME</a>
		<a href = "LogOutEmployeeServlet">LOGOUT</a>
	
</body>
</html>