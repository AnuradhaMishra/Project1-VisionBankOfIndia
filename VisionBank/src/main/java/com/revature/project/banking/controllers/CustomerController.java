package com.revature.project.banking.controllers;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project.banking.model.RequestTable;
import com.revature.project.banking.service.CustomerService;
import com.revature.project.banking.service.CustomerServiceImpl;

/**
 * Servlet implementation class CustomerController
 */
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	CustomerService customerService = new CustomerServiceImpl();

	public CustomerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String emailId = request.getParameter("emailId");
		String password = request.getParameter("password");
		String mobileNumber = request.getParameter("mobileNumber");
		String city = request.getParameter("city");
		int balance = Integer.parseInt(request.getParameter("balance"));
		String accountType = request.getParameter("accountType");

		RequestTable requestTable = new RequestTable(1, firstName, lastName, emailId, password, mobileNumber, city,
				balance, accountType, new Date());
		customerService.addCustomer(requestTable);

		String userName = firstName + " " + lastName;

		HttpSession session = request.getSession();

		session.setAttribute("userName", userName);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("RequestConfirmation.html");
		requestDispatcher.forward(request, response);

	}

}
