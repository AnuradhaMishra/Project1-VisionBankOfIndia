<%@page import="com.revature.project.banking.model.Customer"%>
<%@page import="com.revature.project.banking.model.CustomerDeposit"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="shortcut icon" type="image/x-icon"
	href="images/logo-short.png" />
<title>View Customer - Banking Project</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/loginvalidator.js"></script>


</head>
<body>
	<h1>
		<center>
			Vision Bank of India <img alt="Vision Bank Of India"
				src="images/logo-long.png" style="float: left;" width="300" />
	</h1>
	<nav class="navigation-bar">
		&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<a
			href="Home.html" class="navtext">Home</a>&emsp;&emsp;<a
			href="login.html" class="navtext">Login</a>&emsp;&emsp;<a
			href="apply.html" class="navtext">Apply</a>&emsp;&emsp;<a
			href="aboutApp.html" class="navtext">AboutApp</a>&emsp;&emsp;<a
			href="aboutdev.html" class="navtext">AboutMe</a>


	</nav>
	<h2 align="center">Customer Details</h2>
	<br />
	<br />

	<%
	List<Customer> customerList = (List<Customer>) session.getAttribute("customerList");
	%>

	<table class="table table-hover">
		<thead class="thead-dark">
			<tr class="userpassword">
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
		<tr class="userpassword">
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
	<a href="DeleteCustomerServlet?customerId = "
		<%=customerTable.getCustomerId()%>" class="userpassword">DELETE MY
		ACCOUNT</a>
	<a href="UpdateCustomerServlet?customerId = "
		<%=customerTable.getCustomerId()%>" class="userpassword">UPDATE MY
		ACCOUNT</a>
	<%
	}
	%>

</body>
<footer class="footcopy" align="center">&copy; 2021, Vision
	Bank of India | All Rights Reserved.</footer>
</html>