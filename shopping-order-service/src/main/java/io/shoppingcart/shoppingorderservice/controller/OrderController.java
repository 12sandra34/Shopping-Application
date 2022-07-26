package io.shoppingcart.shoppingorderservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@RequestMapping("/orderId")
	public String getOrder() {
		
		return "HeloWorld";
	}

}
