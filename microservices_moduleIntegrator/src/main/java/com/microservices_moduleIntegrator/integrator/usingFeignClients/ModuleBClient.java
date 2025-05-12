package com.microservices_moduleIntegrator.integrator.usingFeignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.microservices_moduleIntegrator.integrator.dataTransferObjects.ResponseLastName;

@FeignClient(name = "moduleB", url = "http://localhost:8083/service_b")
public interface ModuleBClient {
	
	@GetMapping("/last_name")
	ResponseLastName getLastName();

}
