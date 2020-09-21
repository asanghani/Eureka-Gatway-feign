package com.javatechie.os.api.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javatechie.os.api.dto.PaymentDto;
import com.javatechie.os.api.entity.Order;
import com.javatechie.os.api.request.TransactionRequest;
import com.javatechie.os.api.response.TransactionResponse;
import com.javatechie.os.api.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping("/bookOrder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {
		return service.saveOrder(request);
		
	}

}
