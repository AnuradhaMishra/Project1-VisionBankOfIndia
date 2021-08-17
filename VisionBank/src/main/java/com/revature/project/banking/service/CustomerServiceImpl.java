package com.revature.project.banking.service;

import java.util.List;

import com.revature.project.banking.dao.CustomerDao;
import com.revature.project.banking.dao.CustomerDaoImpl;
import com.revature.project.banking.model.Customer;
import com.revature.project.banking.model.CustomerDeposit;
import com.revature.project.banking.model.CustomerWithdraw;
import com.revature.project.banking.model.Feedback;
import com.revature.project.banking.model.RequestTable;
import com.revature.project.banking.model.TransferAmount;

public class CustomerServiceImpl implements CustomerService{
	
	CustomerDao customerDao = new CustomerDaoImpl();

	public boolean addCustomer(RequestTable requestTable) {
		// TODO Auto-generated method stub
		return customerDao.addCustomer(requestTable);
	}

	public boolean loginCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.loginCustomer(customer);
	}

	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomer(customerId);
	}

	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(customer);
	}

	public int getCustomerBalance(int customerId) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerBalance(customerId);
	}

	public boolean transferAmount(TransferAmount transferAmount) {
		// TODO Auto-generated method stub
		return customerDao.transferAmount(transferAmount);
	}

	public boolean withdrawAmount(CustomerWithdraw customerWithdraw) {
		// TODO Auto-generated method stub
		return customerDao.withdrawAmount(customerWithdraw);
	}

	public boolean depositAmount(CustomerDeposit customerDeposit) {
		// TODO Auto-generated method stub
		return customerDao.depositAmount(customerDeposit);
	}

	public boolean addFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return customerDao.addFeedback(feedback);
	}

	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomer();
	}

	public boolean isCustomerExist(int customerId) {
		// TODO Auto-generated method stub
		return customerDao.isCustomerExist(customerId);
	}

	public List<Customer> getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerById(customerId);
	}

	

}
