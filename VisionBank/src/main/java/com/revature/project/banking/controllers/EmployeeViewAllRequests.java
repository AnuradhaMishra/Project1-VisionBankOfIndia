package com.revature.project.banking.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project.banking.model.RequestTable;
import com.revature.project.banking.service.EmployeeService;
import com.revature.project.banking.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeViewAllRequests
 */
public class EmployeeViewAllRequests extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeViewAllRequests() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeService employeeService = new EmployeeServiceImpl();
		List<RequestTable> requestList = employeeService.getAllRequests();
		
		HttpSession session = request.getSession();
		session.setAttribute("requestList", requestList);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("ViewRequests.jsp");
		requestDispatcher.forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
}
