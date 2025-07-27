package com.darshanbk812.order_serveice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "PAYMENT-SERVICE" , path = "/payment")
public interface Payment {
	
	@GetMapping("/health")
	public String health();

}
