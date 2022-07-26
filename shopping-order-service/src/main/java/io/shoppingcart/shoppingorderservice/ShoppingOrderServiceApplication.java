package io.shoppingcart.shoppingorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ShoppingOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingOrderServiceApplication.class, args);
	}

}
