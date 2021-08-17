package com.revature.project.banking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CustomerWithdraw implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 299427670900256592L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int withdrawNumber;
	
	@Column
	private int withdrawCustomerId;
	
	@Column
	private int amount;
	
	public CustomerWithdraw() {
		// TODO Auto-generated constructor stub
	}

	public CustomerWithdraw(int withdrawNumber, int withdrawCustomerId, int amount) {
		super();
		this.withdrawNumber = withdrawNumber;
		this.withdrawCustomerId = withdrawCustomerId;
		this.amount = amount;
	}

	public int getWithdrawNumber() {
		return withdrawNumber;
	}

	public void setWithdrawNumber(int withdrawNumber) {
		this.withdrawNumber = withdrawNumber;
	}

	public int getWithdrawCustomerId() {
		return withdrawCustomerId;
	}

	public void setWithdrawCustomerId(int withdrawCustomerId) {
		this.withdrawCustomerId = withdrawCustomerId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
