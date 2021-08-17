package com.revature.project.banking.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.project.banking.service.EmployeeService;
import com.revature.project.banking.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeDeleteCustomerServlet
 */
public class EmployeeDeleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeDeleteCustomerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int customerId = Integer.parseInt((String) request.getParameter("customerId"));
		EmployeeService employeeService = new EmployeeServiceImpl();
		boolean result = employeeService.deleteAnCustomerById(customerId);
		
		if(result) {
			out.write("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"ISO-8859-1\">\r\n"
					+ "<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"images/logo-short.png\" />\r\n"
					+ "<title>Error - Banking Project</title>\r\n"
					+ "<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\" />\r\n"
					+ "<script type=\"text/javascript\" src=\"js/loginvalidator.js\"></script>\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "	<h1>\r\n"
					+ "		<center>Vision Bank of India\r\n"
					+ "		<img  alt=\"Vision Bank Of India\" src=\"images/logo-long.png\" style = \"float:left;\"  width=\"300\"/>\r\n"
					+ "	</h1>\r\n"
					+ "	<nav class=\"navigation-bar\">\r\n"
					+ "		&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<a href=\"Home.html\" class=\"navtext\">Home</a>&emsp;&emsp;<a href=\"login.html\" class=\"navtext\">Login</a>&emsp;&emsp;<a href=\"apply.html\" class=\"navtext\">Apply</a>&emsp;&emsp;<a href=\"aboutApp.html\" class=\"navtext\">AboutApp</a>&emsp;&emsp;<a href=\"aboutdev.html\" class=\"navtext\">AboutMe</a>\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "	</nav>\r\n");
			out.write("<h2 align=\"center\">Deleter a Customer</h2>");
			out.write("<br><br>");
			out.write("<h4 class=\"userpassword\">Account Deleted Customer with the customer Id: " + customerId + " Successfully</h4>");
			out.write("<br><br>");
			out.write("<span class=\"signoutfeedback\"><a href = \"EmployeeViewAllCustomerServlet\">BACK</a> ");
			out.write("<a href = \"EmployeeHome.html\">HOME</a></span>");
			out.write("<br><br><br><br><br><br><br>");
			out.write("</body>\r\n"
					+ "<footer class=\"footcopy\" align=\"center\">&copy; 2021, Vision Bank of India | All Rights Reserved.</footer>\r\n"
					+ "\r\n"
					+ "</html>");
		}
			else {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("ErrorHandlerServlets");
				requestDispatcher.forward(request, response);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

}
