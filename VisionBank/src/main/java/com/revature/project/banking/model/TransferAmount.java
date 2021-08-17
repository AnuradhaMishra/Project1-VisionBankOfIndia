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
public class TransferAmount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7530887238296105178L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transferNumber;
	
	@Column
	private int senderCustomerId;
	
	@Column
	private int receiverCustomerId;
	
	@Column
	private int amount;
	
	public TransferAmount() {
		// TODO Auto-generated constructor stub
	}

	public TransferAmount(int transferNumber, int senderCustomerId, int receiverCustomerId, int amount) {
		super();
		this.transferNumber = transferNumber;
		this.senderCustomerId = senderCustomerId;
		this.receiverCustomerId = receiverCustomerId;
		this.amount = amount;
	}

	public int getTransferNumber() {
		return transferNumber;
	}

	public void setTransferNumber(int transferNumber) {
		this.transferNumber = transferNumber;
	}

	public int getSenderCustomerId() {
		return senderCustomerId;
	}

	public void setSenderCustomerId(int senderCustomerId) {
		this.senderCustomerId = senderCustomerId;
	}

	public int getReceiverCustomerId() {
		return receiverCustomerId;
	}

	public void setReceiverCustomerId(int receiverCustomerId) {
		this.receiverCustomerId = receiverCustomerId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
