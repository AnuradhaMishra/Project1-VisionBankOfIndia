package com.revature.project.banking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Feedback implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -52363942318946282L;

	@Id
	@GeneratedValue
	private int feedbackNumber;

	@Column
	private int customerId;

	@Column
	private String feedback;

	public Feedback() {
		// TODO Auto-generated constructor stub
	}

	public Feedback(int feedbackNumber, int customerId, String feedback) {
		super();
		this.feedbackNumber = feedbackNumber;
		this.customerId = customerId;
		this.feedback = feedback;
	}

	public int getFeedbackNumber() {
		return feedbackNumber;
	}

	public void setFeedbackNumber(int feedbackNumber) {
		this.feedbackNumber = feedbackNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

}
