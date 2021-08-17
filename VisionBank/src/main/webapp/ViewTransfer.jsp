<%@page import="com.revature.project.banking.model.TransferAmount"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="shortcut icon" type="image/x-icon"
	href="images/logo-short.png" />
<title>View Transfers - Banking Project</title>
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
	<h2 align="center">View all Transfers</h2>
	<br />
	<br />
	<%
	List<TransferAmount> transferList = (List<TransferAmount>) session.getAttribute("transferList");
	%>

	<table class="table table-hover">
		<thead class="thead-dark">
			<tr class="userpassword">
				<th>SENDER</th>
				<th>RECEIVER</th>
				<th>AMOUNT</th>
			</tr>
		</thead>
		<%
		TransferAmount customerTransferList;
		for (int i = 0; i < transferList.size(); i++) {
			customerTransferList = transferList.get(i);
		%>
		<tr class="userpassword">
			<td><%=customerTransferList.getSenderCustomerId()%></td>
			<td><%=customerTransferList.getReceiverCustomerId()%></td>
			<td><%=customerTransferList.getAmount()%></td>
		</tr>
		<%
		}
		%>
	</table>

	<br>
	<a href="EmployeeHome.html" class="userpassword">HOME</a>
	<a href="LogOutEmployeeServlet" class="userpassword">LOGOUT</a>

</body>
<footer class="footcopy" align="center">&copy; 2021, Vision
	Bank of India | All Rights Reserved.</footer>
</html>