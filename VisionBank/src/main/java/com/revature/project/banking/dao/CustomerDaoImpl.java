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
import com.revature.project.banking.model.Feedback;
import com.revature.project.banking.model.RequestTable;
import com.revature.project.banking.model.TransferAmount;
import com.revature.project.banking.util.HibernateUtil;

public class CustomerDaoImpl implements CustomerDao {

	// Initializing Logger class for Banking.log file
	
	// CRUD Operations for Data Base

	Logger logger = Logger.getLogger(CustomerDaoImpl.class);
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();

	public boolean addCustomer(RequestTable requestTable) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		//logger.info("Adding a request to the request table");
		session.save(requestTable);
		transaction.commit();
		return true;
	}

	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		logger.info("Deleting an customer from customer table");
		session.delete(customer);
		transaction.commit();
		return true;

	}

	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		logger.info("Updating customer details in customer table");
		session.update(customer);
		transaction.commit();
		return true;
	}

	public int getCustomerBalance(int customerId) {
		// TODO Auto-generated method stub
		Query query = session.createQuery(
				"select balance from com.revature.project.banking.model.Customer where customerId = " + customerId);
		logger.info("Fetching customer balance from the customer table");
		int balance = (Integer) query.list().get(0);
		return balance;
	}

	public boolean addFeedback(Feedback feedback) {
		Transaction transaction = session.beginTransaction();
		logger.info("Adding feedback to feedback table");
		session.save(feedback);
		transaction.commit();
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<Customer> getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		List<Customer> customer = (List<Customer>) session.get(Customer.class, customerId);
		logger.info("Fetching customer Details from Customer Table");
		return customer;
	}

	public boolean isCustomerExist(int customerId) {
		// TODO Auto-generated method stub
		Query query = session
				.createQuery("from com.revature.project.banking.model.Customer where customerid = " + customerId);
		logger.info("Checking if customer exist in the database");

		if (query.list().size() != 0) {
			return true;
		} else {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		Query query = session.createQuery("from com.revature.project.banking.model.Customer");
		logger.info("Fetching all customer from the database");
		return query.list();
	}

	// Other Function for the website

	@SuppressWarnings("unchecked")
	public boolean loginCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Query query = session.createQuery("from com.revature.project.banking.model.Customer where customerId = "
				+ customer.getCustomerId() + "and password = '" + customer.getPassword() + "'");
		logger.info("Validating customer for login with customer id " + customer.getCustomerId());
		List<Customer> customerList = query.list();
		if (customerList.size() != 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean depositAmount(CustomerDeposit customerDeposit) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		logger.info("Depositing amount for the customer Id " + customerDeposit.getDepositCustomerId());
		session.save(customerDeposit);
		Query query = session.createQuery("update com.revature.project.banking.model.Customer set balance = balance + "
				+ customerDeposit.getAmount() + " where customerid = " + customerDeposit.getDepositCustomerId());
		query.executeUpdate();
		transaction.commit();
		return true;
	}

	public boolean transferAmount(TransferAmount transferAmount) {
		Transaction transaction = session.beginTransaction();
		logger.info("Transferring amount for the customer id " + transferAmount.getSenderCustomerId() + " to " + transferAmount.getReceiverCustomerId());
		session.save(transferAmount);
		Query updateSenderId = session
				.createQuery("update com.revature.project.banking.model.Customer set balance = balance - "
						+ transferAmount.getAmount() + " where customerid = " + transferAmount.getSenderCustomerId());
		Query updateReceiverId = session
				.createQuery("update com.revature.project.banking.model.Customer set balance = balance + "
						+ transferAmount.getAmount() + " where customerid = " + transferAmount.getReceiverCustomerId());
		updateSenderId.executeUpdate();
		updateReceiverId.executeUpdate();
		transaction.commit();
		return true;
	}

	public boolean withdrawAmount(CustomerWithdraw customerWithdraw) {
		Transaction transaction = session.beginTransaction();
		logger.info("Withdraw amount for the customer id " + customerWithdraw.getWithdrawCustomerId());
		session.save(customerWithdraw);
		Query query = session.createQuery("update com.revature.project.banking.model.Customer set balance = balance - "
				+ customerWithdraw.getAmount() + " where customerid = " + customerWithdraw.getWithdrawCustomerId());
		query.executeUpdate();
		transaction.commit();
		return true;
	}

}
