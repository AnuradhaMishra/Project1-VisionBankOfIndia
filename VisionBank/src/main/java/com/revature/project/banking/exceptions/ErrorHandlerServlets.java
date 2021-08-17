package com.revature.project.banking.exceptions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorHandlingServlet
 */
public class ErrorHandlerServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ErrorHandlerServlets() {
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
		errorHandler(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		errorHandler(request, response);
	}

	public void errorHandler(HttpServletRequest request, HttpServletResponse response) throws IOException {

		Throwable throwable = (Throwable) request.getAttribute("javax.servlet.error.exception");
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		String servletName = (String) request.getAttribute("javax.servlet.error.servlet_name");
		if (servletName == null) {
			servletName = "Unknown";
		}
		String requestUri = (String) request.getAttribute("javax.servlet.error.request_uri");
		if (requestUri == null) {
			requestUri = "Unknown";
		}

		// Set response content type
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		if (statusCode != 500) {
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
			out.write("<h2 align=\"center\">Error Details</h2>");
			out.write("<br><br>");
			out.write("<br>");
			out.write("<ul>");
			out.write("<li class=\"userpassword\"><strong>Error occured with status code: </strong>:" + statusCode + "</li>");
			out.write("<li class=\"userpassword\"><strong>Your requested URI is</strong>: </strong>" + requestUri + "</li>");
			out.write("</ul><br>");
			out.write("<p class=\"userpassword\">Sorry, An Error occured, Please try again later.<br/>");
			out.write("Thank you for your Patience </p>");
		} else {
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
			out.write("<h2 align=\"center\">Error Details</h2><br>");
			out.write("<br><br>");
			out.write("<ul><li class=\"userpassword\">Servlet Name:" + servletName + "</li>");
			out.write("<li class=\"userpassword\">Exception Name:" + throwable.getClass().getName() + "</li>");
			out.write("<li class=\"userpassword\">Requested URI:" + requestUri + "</li>");
			out.write("<li class=\"userpassword\">Exception Message:" + throwable.getMessage() + "</li>");
			out.write("</ul>");
			out.write("<p class=\"userpassword\">An bad request or action occured, Please try again later...");
			out.write("Thank you for your Patience </p>");
		}

		out.write("<br><br>");
		out.write("<p class=\"userpassword\">Please go to our ");
		out.write("<span class=\"signoutfeedback\"><a href=\"Home.html\">Home Page</a></span>");
		out.write("<br><br><br><br><br><br><br><br><br><br><br>");
		out.write("</body>\r\n"
				+ "<footer class=\"footcopy\" align=\"center\">&copy; 2021, Vision Bank of India | All Rights Reserved.</footer>\r\n"
				+ "\r\n"
				+ "</html>");

	}
}
