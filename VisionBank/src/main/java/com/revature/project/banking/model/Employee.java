package com.revature.project.banking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8031410768679003845L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	
	@Column
	private String employeeName;
	
	@Column
	private String jobDesignation;
	
	@Column
	private String emailId;
	
	@Column
	private String password;
	
	@Column
	private String mobileNumber;
	
	@Column
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, String jobDesignation, String emailId, String password,
			String mobileNumber, int salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.jobDesignation = jobDesignation;
		this.emailId = emailId;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getJobDesignation() {
		return jobDesignation;
	}

	public void setJobDesignation(String jobDesignation) {
		this.jobDesignation = jobDesignation;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	

}
