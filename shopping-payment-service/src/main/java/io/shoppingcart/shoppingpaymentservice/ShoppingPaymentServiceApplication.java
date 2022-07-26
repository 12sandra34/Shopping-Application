package io.shoppingcart.shoppingpaymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ShoppingPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingPaymentServiceApplication.class, args);
	}

}
