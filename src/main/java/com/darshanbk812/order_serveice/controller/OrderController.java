package com.darshanbk812.order_serveice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darshanbk812.order_serveice.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;

	@GetMapping("/health")
	public String health() {
		return orderService.health();
	}

	@GetMapping("/payment")
	public String payment() {
		return orderService.payment();
	}

}
