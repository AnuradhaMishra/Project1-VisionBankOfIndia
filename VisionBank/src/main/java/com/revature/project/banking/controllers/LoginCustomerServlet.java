package com.revature.project.banking.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project.banking.model.Customer;
import com.revature.project.banking.service.CustomerService;
import com.revature.project.banking.service.CustomerServiceImpl;

/**
 * Servlet implementation class LoginCustomerServlet
 */
public class LoginCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginCustomerServlet() {
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

		HttpSession session = request.getSession();

		int customerId = Integer.parseInt((String) request.getParameter("username"));
		String password = request.getParameter("password");

		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		customer.setPassword(password);
		session.setAttribute("customerId", customerId);
		CustomerService customerService = new CustomerServiceImpl();
		boolean result = customerService.isCustomerExist(customerId);

		if (result) {

			boolean resultLogin = customerService.loginCustomer(customer);

			if (resultLogin) {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("Home.html");
				requestDispatcher.forward(request, response);
			} else {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("LoginError.html");
				requestDispatcher.forward(request, response);
			}

		} else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("CustomerNotExist.html");
			requestDispatcher.forward(request, response);

		}

	}

}
