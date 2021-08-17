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
public class CustomerDeposit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7502105543639152837L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int depositNumber;
	
	@Column
	private int depositCustomerId;
	
	@Column
	private int amount;
	
	public CustomerDeposit() {
		// TODO Auto-generated constructor stub
	}

	public CustomerDeposit(int depositNumber, int depositCustomerId, int amount) {
		super();
		this.depositNumber = depositNumber;
		this.depositCustomerId = depositCustomerId;
		this.amount = amount;
	}

	public int getDepositNumber() {
		return depositNumber;
	}

	public void setDepositNumber(int depositNumber) {
		this.depositNumber = depositNumber;
	}

	public int getDepositCustomerId() {
		return depositCustomerId;
	}

	public void setDepositCustomerId(int depositCustomerId) {
		this.depositCustomerId = depositCustomerId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	
}
