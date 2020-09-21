package com.javatechie.os.api.request;

import com.javatechie.os.api.dto.PaymentDto;
import com.javatechie.os.api.entity.Order;

public class TransactionRequest {
	
	private Order order;
	private PaymentDto payment;
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public PaymentDto getPayment() {
		return payment;
	}
	public void setPayment(PaymentDto payment) {
		this.payment = payment;
	}
	public TransactionRequest(Order order, PaymentDto payment) {
		super();
		this.order = order;
		this.payment = payment;
	}
	public TransactionRequest() {
		
	}
	

}
