package io.shoppingcart.shoppingcatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ShoppingCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCatalogServiceApplication.class, args);
	}

}
