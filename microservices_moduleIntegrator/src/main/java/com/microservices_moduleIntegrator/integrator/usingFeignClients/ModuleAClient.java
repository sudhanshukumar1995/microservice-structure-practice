package com.microservices_moduleIntegrator.integrator.usingFeignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.microservices_moduleIntegrator.integrator.dataTransferObjects.ResponseFirstName;

@FeignClient(name = "moduleA", url = "http://localhost:8082/service_a")
public interface ModuleAClient {
	
	@GetMapping("/first_name")
	ResponseFirstName getFirstName();

}
