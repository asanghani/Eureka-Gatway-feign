package com.javatechie.os.api.dto;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;





public class Payment {
	
	@Id
	@GeneratedValue
	private int paymentId;
	
	private String paymentStatus;
	
	private String transactionId;
	
	private int amount;
	
	

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Payment(int paymentId, String paymentStatus, String transactionId, int amout) {
		super();
		this.paymentId = paymentId;
		this.paymentStatus = paymentStatus;
		this.transactionId = transactionId;
		this.amount = amout;
	}
	public Payment() {
		
	}
	
}
