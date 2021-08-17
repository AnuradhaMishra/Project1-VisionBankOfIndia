package com.revature.project.banking.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.project.banking.model.Employee;
import com.revature.project.banking.service.EmployeeService;
import com.revature.project.banking.service.EmployeeServiceImpl;

/**
 * Servlet implementation class LoginEmployeeServlet
 */
public class LoginEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginEmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int employeeId = Integer.parseInt((String) request.getParameter("username"));
		String password = request.getParameter("password");

		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		employee.setPassword(password);

		EmployeeService employeeService = new EmployeeServiceImpl();
		boolean result = employeeService.employeeLogin(employee);

		if (result) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("EmployeeHome.html");
			requestDispatcher.forward(request, response);
		}
	}

}
