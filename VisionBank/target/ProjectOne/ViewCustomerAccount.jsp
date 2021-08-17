<%@page import="com.revature.project.banking.model.Customer"%>
<%@page import="com.revature.project.banking.model.CustomerDeposit"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Imran's Banking</title>
<link rel="stylesheet" href="css/ViewTable.css">
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
		<a href="Home.html">HOME</a> <a href="#">ABOUT US</a> <a href="#">CONTACT</a>
	</div>
	<br>
	<br>
	<h4>CUSTOMER DETAILS</h4>
	<br>

	<%
	List<Customer> customerList = (List<Customer>) session.getAttribute("customerList");
	%>

	<table class = "table table-hover">
	<thead class = "thead-dark">
		<tr>
			<th>Customer Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>email Id</th>
			<th>Mobile Number</th>
			<th>City</th>
			<th>accountType</th>
			<th>Account registered date</th>

		</tr>
		</thead>
		<%
		for (int i = 0; i < customerList.size(); i++) {
			Customer customerTable = customerList.get(i);
		%>
		<tr>
			<td><%=customerTable.getCustomerId()%></td>
			<td><%=customerTable.getFirstName()%></td>
			<td><%=customerTable.getLastName()%></td>
			<td><%=customerTable.getEmailId()%></td>
			<td><%=customerTable.getMobileNumber()%></td>
			<td><%=customerTable.getCity()%></td>
			<td><%=customerTable.getAccountType()%></td>
			<td><%=customerTable.getRegisteredDate()%></td>

		</tr>
	</table>
	<br>
	<a href="DeleteCustomerServlet?customerId = "<%=customerTable.getCustomerId()%>">DELETE
		MY ACCOUNT</a>
	<a href="UpdateCustomerServlet?customerId = "<%=customerTable.getCustomerId()%>">UPDATE
		MY ACCOUNT</a>
	<%
	}
	%>


</body>
</html>