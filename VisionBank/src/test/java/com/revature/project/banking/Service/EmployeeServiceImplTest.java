/*
 * package com.revature.project.banking.Service;
 * 
 * import static org.junit.Assert.*;
 * 
 * import java.util.List;
 * 
 * import org.junit.After; import org.junit.AfterClass; import org.junit.Before;
 * import org.junit.BeforeClass; import org.junit.Test;
 * 
 * import com.revature.project.banking.model.Customer; import
 * com.revature.project.banking.model.CustomerDeposit; import
 * com.revature.project.banking.model.CustomerWithdraw; import
 * com.revature.project.banking.model.Employee; import
 * com.revature.project.banking.model.Feedback; import
 * com.revature.project.banking.model.RequestTable; import
 * com.revature.project.banking.model.TransferAmount; import
 * com.revature.project.banking.service.EmployeeService; import
 * com.revature.project.banking.service.EmployeeServiceImpl;
 * 
 * //All test cases passes public class EmployeeServiceImplTest {
 * 
 * EmployeeService employeeService;
 * 
 * @BeforeClass public static void setUpBeforeClass() throws Exception { }
 * 
 * @AfterClass public static void tearDownAfterClass() throws Exception { }
 * 
 * @Before public void setUp() throws Exception { employeeService = new
 * EmployeeServiceImpl(); }
 * 
 * @After public void tearDown() throws Exception { employeeService = null; }
 * 
 * 
 * @Test public void testGetAllCustomer() { List<Customer> customerList =
 * employeeService.getAllCustomer(); assertEquals(3, customerList.size()); }
 * 
 * 
 * 
 * @Test public void testGetCustomerById() { int customerId = 1; Customer
 * customer = employeeService.getCustomerById(customerId);
 * assertNotNull(customer); }
 * 
 * 
 * 
 * @Test public void testDeleteAnCustomerById() { int customerId = 1;
 * assertEquals(true, employeeService.deleteAnCustomerById(customerId)); }
 * 
 * 
 * 
 * @Test public void testGetAllWithdraws() { List<CustomerWithdraw>
 * customerWithdrawList = employeeService.getAllWithdraws(); assertEquals(1,
 * customerWithdrawList.size()); }
 * 
 * 
 * 
 * @Test public void testGetWithdrawOfCustomerById() { List<CustomerWithdraw>
 * customerWithdrawList = employeeService.getWithdrawOfCustomerById(3);
 * assertEquals(1, customerWithdrawList.size()); }
 * 
 * 
 * 
 * @Test public void testGetAllDeposits() { List<CustomerDeposit>
 * customerDepositList = employeeService.getAllDeposits(); assertEquals(2,
 * customerDepositList.size()); }
 * 
 * 
 * 
 * @Test public void testGetDepositOfCustomerById() { int depositCustomerId = 1;
 * List<CustomerDeposit> customerDepositList =
 * employeeService.getDepositOfCustomerById(depositCustomerId); assertEquals(1,
 * customerDepositList.size());
 * 
 * }
 * 
 * 
 * 
 * @Test public void testGetCustomerTransferHistory() { List<TransferAmount>
 * transferList = employeeService.getCustomerTransferHistory(); assertEquals(1,
 * transferList.size());
 * 
 * }
 * 
 * 
 * 
 * @Test public void testGetCustomerFeedBack() { List<Feedback> feedbackList =
 * employeeService.getCustomerFeedBack(); assertEquals(1, feedbackList.size());
 * }
 * 
 * 
 * 
 * 
 * @Test public void testGetAllRequests() { List<RequestTable> requestList =
 * employeeService.getAllRequests(); assertEquals(1, requestList.size()); }
 * 
 * 
 * 
 * @Test public void testApproveCustomerRequest() { int requestId = 5;
 * assertEquals(true, employeeService.approveCustomerRequest(requestId)); }
 * 
 * 
 * 
 * @Test public void testRejectCustomerRequest() { int requestId = 5;
 * assertEquals(true, employeeService.rejectCustomerRequest(requestId)); }
 * 
 * 
 * 
 * @Test public void testAddEmployee() { Employee employee = new Employee(1,
 * "Angela", "Accountant", "angela@gmail.com", "sprinkles", "7894561235",
 * 40000); assertEquals(true, employeeService.addEmployee(employee)); }
 * 
 * }
 */
