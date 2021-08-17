package com.revature.project.banking.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project.banking.model.CustomerDeposit;
import com.revature.project.banking.service.EmployeeService;
import com.revature.project.banking.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeViewAllCustomerDeposits
 */
public class EmployeeViewAllCustomerDeposits extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeViewAllCustomerDeposits() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		List<CustomerDeposit> depositList = employeeService.getAllDeposits();
		
		HttpSession session = request.getSession();
		session.setAttribute("depositList", depositList);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("ViewDeposits.jsp");
		requestDispatcher.forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
