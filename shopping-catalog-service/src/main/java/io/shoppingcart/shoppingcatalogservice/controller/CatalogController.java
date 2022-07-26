package io.shoppingcart.shoppingcatalogservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
	
	@RequestMapping("/catalogId")
	public String getCatalog() {
		
		return "HelloWorld";
	}

}
