package io.shoppingcart.shoppingdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShoppingDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingDiscoveryServiceApplication.class, args);
	}

}
