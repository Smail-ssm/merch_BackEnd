package com.xdev.merch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.xdev.merch.model") // Add this line to scan the com.xdev.merch.model package
public class MerchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerchApplication.class, args);
	}

}
