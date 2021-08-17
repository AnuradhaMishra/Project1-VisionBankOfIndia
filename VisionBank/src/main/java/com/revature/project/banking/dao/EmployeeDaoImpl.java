package com.revature.project.banking.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.project.banking.model.Customer;
import com.revature.project.banking.model.CustomerDeposit;
import com.revature.project.banking.model.CustomerWithdraw;
import com.revature.project.banking.model.Employee;
import com.revature.project.banking.model.Feedback;
import com.revature.project.banking.model.RequestTable;
import com.revature.project.banking.model.TransferAmount;
import com.revature.project.banking.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	Logger logger = Logger.getLogger(EmployeeDaoImpl.class);
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();

	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		Query query = session.createQuery("from com.revature.project.banking.model.Customer");
		//logger.info("Fetching all customers from customer table");
		@SuppressWarnings("unchecked")
		List<Customer> customerList = query.list();
		return customerList;
	}

	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		Customer customer = (Customer) session.get(Customer.class, customerId);
		logger.info("Fetching customer details using customer id " + customerId);
		return customer;
	}

	public boolean deleteAnCustomerById(int customerId) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		logger.info("Deleting customer details using customer id " + customerId);
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		return true;
	}

	public List<CustomerWithdraw> getAllWithdraws() {
		// TODO Auto-generated method stub
		Query query = session.createQuery("from com.revature.project.banking.model.CustomerWithdraw");
		logger.info("Fetching withdraw table");
		@SuppressWarnings("unchecked")
		List<CustomerWithdraw> customerList = query.list();
		return customerList;

	}

	public List<CustomerWithdraw> getWithdrawOfCustomerById(int customerId) {
		// TODO Auto-generated method stub
		Query query = session.createQuery(
				"from com.revature.project.banking.model.CustomerWithdraw where WithdrawCustomerId = " + customerId);
		logger.info("Fetching Withdraw details for customer id " + customerId);
		@SuppressWarnings("unchecked")
		List<CustomerWithdraw> customerList = query.list();
		return customerList;
	}

	public List<CustomerDeposit> getAllDeposits() {
		Query query = session.createQuery("from com.revature.project.banking.model.CustomerDeposit");
		logger.info("Fetching Deposit table");
		@SuppressWarnings("unchecked")
		List<CustomerDeposit> customerList = query.list();
		return customerList;
	}

	public List<CustomerDeposit> getDepositOfCustomerById(int customerId) {
		Query query = session.createQuery(
				"from com.revature.project.banking.model.CustomerDeposit where DepositCustomerId = " + customerId);
		logger.info("Fetching Deposit details for customer id " + customerId);
		@SuppressWarnings("unchecked")
		List<CustomerDeposit> customerList = query.list();
		return customerList;
	}

	public List<TransferAmount> getCustomerTransferHistory() {
		Query query = session.createQuery("from com.revature.project.banking.model.TransferAmount");
		logger.info("Fetching Transfer details");
		@SuppressWarnings("unchecked")
		List<TransferAmount> transferList = query.list();
		return transferList;
	}

	public List<Feedback> getCustomerFeedBack() {
		Query query = session.createQuery("from com.revature.project.banking.model.Feedback");
		//logger.info("Fetching all customer Feedbacks");
		@SuppressWarnings("unchecked")
		List<Feedback> feedbackList = query.list();
		return feedbackList;
	}

	public List<RequestTable> getAllRequests() {
		Query query = session.createQuery("from com.revature.project.banking.model.RequestTable");
		//logger.info("Fetching all customer requests");
		@SuppressWarnings("unchecked")
		List<RequestTable> requestList = query.list();
		return requestList;
	}

	public boolean rejectCustomerRequest(int customerId) {
		Transaction transaction = session.beginTransaction();
		//logger.info("Deleting an request in request table");
		RequestTable requestTable = new RequestTable();
		requestTable.setRequestId(customerId);
		session.delete(requestTable);
		transaction.commit();
		return true;

	}

	public boolean approveCustomerRequest(int requestId) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		Query query = session.createSQLQuery("CALL requestApproval(:requestId)").addEntity(RequestTable.class)
				.addEntity(Customer.class).setParameter("requestId", requestId);
		//logger.info("Accepting an request from request table");
		query.executeUpdate();
		transaction.commit();

		return true;
	}

	public boolean employeeLogin(Employee employee) {
		Query query = session.createQuery("from com.revature.project.banking.model.Employee where employeeId= "
				+ employee.getEmployeeId() + " and password = " + "'" + employee.getPassword() + "'");
//		Query query = session.createQuery(
//				"select employeeid, employeename, emailid, jobdesignation, mobilenumber, password, salary from com.revature.project.banking.model.Employee where employeeId="
//						+ employee.getEmployeeId() + " and password = '" + employee.getPassword() + "'");
		//logger.info("Validating employee login");
		@SuppressWarnings("unchecked")
		List<Employee> employeeList = query.list();
		if (employeeList.size() != 0) {
			return true;
		}
		return false;
	}

	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		logger.info("Adding employee to the employee table");
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
		return true;
	}

}
