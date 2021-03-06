package com.javatechie.os.api.dto;

import com.javatechie.os.api.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {
	
	

	private int paymentId;
	
	private String paymentStatus;
	
	private String transactionId;
	
	private int orderId;

	private double amount;	
}
