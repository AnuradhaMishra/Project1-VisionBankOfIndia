package com.revature.project.banking.service;

import java.util.List;

import com.revature.project.banking.dao.EmployeeDao;
import com.revature.project.banking.dao.EmployeeDaoImpl;
import com.revature.project.banking.model.Customer;
import com.revature.project.banking.model.CustomerDeposit;
import com.revature.project.banking.model.CustomerWithdraw;
import com.revature.project.banking.model.Employee;
import com.revature.project.banking.model.Feedback;
import com.revature.project.banking.model.RequestTable;
import com.revature.project.banking.model.TransferAmount;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao employeeDao = new EmployeeDaoImpl();

	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return employeeDao.getAllCustomer();
	}

	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return employeeDao.getCustomerById(customerId);
	}

	public boolean deleteAnCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return employeeDao.deleteAnCustomerById(customerId);
	}

	public List<CustomerWithdraw> getAllWithdraws() {
		// TODO Auto-generated method stub
		return employeeDao.getAllWithdraws();
	}

	public List<CustomerWithdraw> getWithdrawOfCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return employeeDao.getWithdrawOfCustomerById(customerId);
	}

	public List<CustomerDeposit> getAllDeposits() {
		// TODO Auto-generated method stub
		return employeeDao.getAllDeposits();
	}

	public List<CustomerDeposit> getDepositOfCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return employeeDao.getDepositOfCustomerById(customerId);
	}

	public List<TransferAmount> getCustomerTransferHistory() {
		// TODO Auto-generated method stub
		return employeeDao.getCustomerTransferHistory();
	}

	public List<Feedback> getCustomerFeedBack() {
		// TODO Auto-generated method stub
		return employeeDao.getCustomerFeedBack();
	}

	public List<RequestTable> getAllRequests() {
		// TODO Auto-generated method stub
		return employeeDao.getAllRequests();
	}

	public boolean approveCustomerRequest(int requestId) {
		// TODO Auto-generated method stub
		return employeeDao.approveCustomerRequest(requestId);
	}

	public boolean rejectCustomerRequest(int customerId) {
		// TODO Auto-generated method stub
		return employeeDao.rejectCustomerRequest(customerId);
	}

	public boolean employeeLogin(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.employeeLogin(employee);
	}

	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.addEmployee(employee);
	}

}
