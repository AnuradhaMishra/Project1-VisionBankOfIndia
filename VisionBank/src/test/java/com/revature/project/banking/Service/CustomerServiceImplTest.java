
package com.revature.project.banking.Service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.project.banking.model.Customer;
import com.revature.project.banking.model.CustomerDeposit;
import com.revature.project.banking.model.CustomerWithdraw;
import com.revature.project.banking.model.Feedback;
import com.revature.project.banking.model.RequestTable;
import com.revature.project.banking.model.TransferAmount;
import com.revature.project.banking.service.CustomerService;
import com.revature.project.banking.service.CustomerServiceImpl;
import com.revature.project.banking.service.EmployeeService;
import com.revature.project.banking.service.EmployeeServiceImpl;

//All test cases are getting passed 

public class CustomerServiceImplTest {

	CustomerService customerService;
	EmployeeService employeeService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		customerService = new CustomerServiceImpl();
		employeeService = new EmployeeServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
		customerService = null;
	}

	@Test
	public void testAddCustomer() {
		int customerId = 1;

		List<RequestTable> list1 = employeeService.getAllRequests();
		RequestTable requestTable = new RequestTable(customerId, "Anuradha", "Mishra", "anuradha@gmail.com", "123", "9876543210",
				"Uttar Pradesh", 20000, "Savings", new Date());
		customerService.addCustomer(requestTable);
		List<RequestTable> list2 = employeeService.getAllRequests();
		assertEquals(list1.size() + 1, list2.size());

	}

	@Test
	public void testLoginCustomer() {
		int customerId = 1;
		String password = "123456";
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		customer.setPassword(password);
		assertEquals(true, customerService.loginCustomer(customer));
	}

//	@Test
//	public void testDeleteCustomer() {
//		int customerId = 1;
//		assertEquals(true, customerService.deleteCustomer(customerId));
//
//	}
//
	

	@Test
	public void testGetCustomerBalance() {
		int customerId = 1;
		assertEquals(10000, customerService.getCustomerBalance(customerId));

	}

//	@Test
//	public void testTransferAmount() {
//		TransferAmount transferAmount = new TransferAmount(0, 2, 3, 16000);
//
//		assertEquals(true, customerService.transferAmount(transferAmount));
//	}
//
//	@Test
//	public void testWithdrawAmount() {
//
//		CustomerWithdraw customerWithdraw = new CustomerWithdraw(0, 3, 6000);
//
//		assertEquals(true, customerService.withdrawAmount(customerWithdraw));
//	}
//
//	@Test
//	public void testDepositAmount() {
//
//		CustomerDeposit customerDeposit = new CustomerDeposit();
//		customerDeposit.setDepositNumber(3);
//		customerDeposit.setDepositCustomerId(2);
//		customerDeposit.setAmount(21000);
//
//		assertEquals(true, customerService.depositAmount(customerDeposit));
//	}
//
//	@Test
//	public void testAddFeedback() {
//
//		int customerId = 1;
//		Feedback feedback = new Feedback(0, customerId, "Excellent");
//		assertEquals(true, customerService.addFeedback(feedback));
//
//	}
//
//	@Test
//	public void testGetAllCustomer() {
//		List<Customer> customerList = customerService.getAllCustomer();
//		assertEquals(0, customerList.size());
//	}
//
//	@Test
//	public void testIsCustomerExist() {
//		int customerId = 2;
//		boolean isExist = customerService.isCustomerExist(customerId);
//		assertEquals(true, isExist);
//	}
//
//	@Test
//	public void testGetCustomerById() {
//		int customerId = 1;
//		List<Customer> customer = customerService.getCustomerById(customerId);
//		assertNotNull(customer);
//	}

}
