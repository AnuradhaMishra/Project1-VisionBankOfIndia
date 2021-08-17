package com.revature.project.banking.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project.banking.model.CustomerWithdraw;
import com.revature.project.banking.service.EmployeeService;
import com.revature.project.banking.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeViewALlCustomerWithdrawals
 */
public class EmployeeViewAllCustomerWithdrawals extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeViewAllCustomerWithdrawals() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeService employeeService = new EmployeeServiceImpl();
		List<CustomerWithdraw> withdrawList = employeeService.getAllWithdraws();
		
		HttpSession session = request.getSession();
		session.setAttribute("withdrawList", withdrawList);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("ViewWithdraw.jsp");
		requestDispatcher.forward(request, response);
	}


	}


