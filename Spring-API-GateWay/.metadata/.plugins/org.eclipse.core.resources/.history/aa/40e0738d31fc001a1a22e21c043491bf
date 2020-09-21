package com.javatechie.os.api.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.javatechie.os.api.dto.PaymentDto;
import com.javatechie.os.api.entity.Order;
import com.javatechie.os.api.repo.OrderRepository;
import com.javatechie.os.api.request.TransactionRequest;
import com.javatechie.os.api.response.TransactionResponse;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private RestTemplate template;
	
	public TransactionResponse saveOrder(TransactionRequest request) {
		String response = "";
		Order order = request.getOrder();
		PaymentDto paymentDto = request.getPayment();
		paymentDto.setOrderId(order.getBid());
		paymentDto.setAmount(order.getPrice());
		
		//rest call
		PaymentDto paymentResponse = template.postForObject("http://PAYMENT-SERVICE/payment/doPayment", paymentDto, PaymentDto.class);
		
		response=paymentResponse.getPaymentStatus().equals("sucess") ? "payment processing succcesfull and order placesed" : "There is payment failure in payment api, order added to card";
		
		repository.save(order);
		return new TransactionResponse(order,paymentResponse.getTransactionId(),paymentResponse.getAmount(),response);
	}

}
