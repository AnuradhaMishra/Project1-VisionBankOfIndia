package com.revature.project.banking.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.project.banking.model.Feedback;
import com.revature.project.banking.service.EmployeeService;
import com.revature.project.banking.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeViewALLFeedbackServlet
 */
public class EmployeeViewAllFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeViewAllFeedbackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeService employeeService = new EmployeeServiceImpl();
		List<Feedback> feedBackList = employeeService.getCustomerFeedBack();
		
		HttpSession session = request.getSession();
		session.setAttribute("feedBackList", feedBackList);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("ViewFeedback.jsp");
		requestDispatcher.forward(request, response);
	}

	

}
