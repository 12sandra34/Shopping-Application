package io.shoppingcart.shoppingcartservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@RequestMapping("/cartId")
	public String getCart() {
		
		return "HelloWorld";
	}

}
