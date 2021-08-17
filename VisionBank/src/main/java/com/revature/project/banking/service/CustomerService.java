package com.revature.project.banking.service;

import java.util.List;

import com.revature.project.banking.model.Customer;
import com.revature.project.banking.model.CustomerDeposit;
import com.revature.project.banking.model.CustomerWithdraw;
import com.revature.project.banking.model.Feedback;
import com.revature.project.banking.model.RequestTable;
import com.revature.project.banking.model.TransferAmount;

public interface CustomerService {
	
	public boolean addCustomer(RequestTable requestTable);

	public boolean loginCustomer(Customer customer);

	public boolean deleteCustomer(int customerId);

	public boolean updateCustomer(Customer customer);

	public int getCustomerBalance(int customerId);

	public boolean transferAmount(TransferAmount transferAmount);

	public boolean withdrawAmount(CustomerWithdraw customerWithdraw);

	public boolean depositAmount(CustomerDeposit customerDeposit);

	public boolean addFeedback(Feedback feedback);

	public List<Customer> getAllCustomer();

	public boolean isCustomerExist(int customerId);

	public List<Customer> getCustomerById(int customerId);
	


}
