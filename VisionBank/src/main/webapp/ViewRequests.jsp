<%@page import="com.revature.project.banking.model.RequestTable"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="shortcut icon" type="image/x-icon"
	href="images/logo-short.png" />
<title>Customer Requests - Banking Project</title>
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
	<h2 align="center">Customer Requests</h2>
	<br />
	<br />

	<%
	List<RequestTable> requestList = (List<RequestTable>) session.getAttribute("requestList");
	%>

	<table>
		<tr class="userpassword">
			<th>Request Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>email Id</th>
			<th>Mobile Number</th>
			<th>City</th>
			<th>accountType</th>
			<th>Account request date</th>
		</tr>
		<%
		for (int i = 0; i < requestList.size(); i++) {
			RequestTable requestTable = requestList.get(i);
		%>
		<tr class="userpassword">
			<td><%=requestTable.getRequestId()%></td>
			<td><%=requestTable.getFirstName()%></td>
			<td><%=requestTable.getLastName()%></td>
			<td><%=requestTable.getEmailId()%></td>
			<td><%=requestTable.getMobileNumber()%></td>
			<td><%=requestTable.getCity()%></td>
			<td><%=requestTable.getAccountType()%></td>
			<td><%=requestTable.getRegisteredDate()%></td>
		</tr>
		<%
		}
		%>


	</table>

	<a class="buttons" href="ApproveRequest.html" class="userpassword">APPROVE
		REQUEST</a>
	<a class="buttons" href="RejectRequest.html" class="userpassword">REJECT
		REQUEST</a>
</body>
<footer class="footcopy" align="center">&copy; 2021, Vision
	Bank of India | All Rights Reserved.</footer>
</html>