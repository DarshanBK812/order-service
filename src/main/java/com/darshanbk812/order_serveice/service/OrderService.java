package com.darshanbk812.order_serveice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darshanbk812.order_serveice.client.Payment;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class OrderService {

	@Autowired
	Payment payment;

	public String health() {
		return "order up and running";
	}

	@CircuitBreaker(name = "paymentClient", fallbackMethod = "fallBackPayment")
	public String payment() {

		return "Order service calling  payment" + payment.health();

	}

	public String fallBackPayment(Throwable t) {
		return "order service calling payment but payment service is down"+ t.getMessage();
	}

}
