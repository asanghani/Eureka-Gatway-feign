package com.javatechie.os.api.response;


import com.javatechie.os.api.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {

	private Order order;
	private String transactionId;
	private double amout;
	private String message;
	
	
	
}
