package com.javatechie.os.api.response;

import com.javatechie.os.api.dto.PaymentDto;
import com.javatechie.os.api.entity.Order;

public class TransactionResponse {

	private Order order;
	private String transactionId;
	private double amout;
	private String message;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public double getAmout() {
		return amout;
	}
	public void setAmout(double amout) {
		this.amout = amout;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public TransactionResponse(Order order, String transactionId, double amout, String message) {
		super();
		this.order = order;
		this.transactionId = transactionId;
		this.amout = amout;
		this.message = message;
	}
	
	public TransactionResponse() {
		
	}
	
	
	
}
