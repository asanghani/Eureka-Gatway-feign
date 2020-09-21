package com.javatechie.os.api.request;
import com.javatechie.os.api.dto.Payment;
import com.javatechie.os.api.dto.PaymentDto;
import com.javatechie.os.api.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {
	
	private Order order;
	private PaymentDto payment;
	
	
	

}
