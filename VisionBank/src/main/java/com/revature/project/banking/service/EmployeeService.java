package com.revature.project.banking.service;

import java.util.List;

import com.revature.project.banking.model.Customer;
import com.revature.project.banking.model.CustomerDeposit;
import com.revature.project.banking.model.CustomerWithdraw;
import com.revature.project.banking.model.Employee;
import com.revature.project.banking.model.Feedback;
import com.revature.project.banking.model.RequestTable;
import com.revature.project.banking.model.TransferAmount;

public interface EmployeeService {

	public List<Customer> getAllCustomer();
	 
	public Customer getCustomerById(int customerId);
	
	public boolean deleteAnCustomerById(int customerId); 
	
	public List<CustomerWithdraw> getAllWithdraws();
	
	public List<CustomerWithdraw> getWithdrawOfCustomerById(int customerId);
	
	public List<CustomerDeposit> getAllDeposits();
	
	public List<CustomerDeposit> getDepositOfCustomerById(int customerId);
	
	public List<TransferAmount> getCustomerTransferHistory();
	
	public List<Feedback> getCustomerFeedBack();
	
	public List<RequestTable> getAllRequests();
	
	public boolean approveCustomerRequest(int requestId);	
	
	public boolean rejectCustomerRequest(int customerId);
	
	public boolean employeeLogin(Employee employee);
	
	public boolean addEmployee(Employee employee);
	
}
