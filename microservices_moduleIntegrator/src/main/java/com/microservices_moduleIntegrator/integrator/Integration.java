package com.microservices_moduleIntegrator.integrator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Integration {

	public static void main(String[] args) {
		SpringApplication.run(Integration.class, args);
	}

}
