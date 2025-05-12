package com.microservices_moduleIntegrator.integrator.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices_moduleIntegrator.integrator.dataTransferObjects.ResponseFirstName;
import com.microservices_moduleIntegrator.integrator.dataTransferObjects.ResponseLastName;

@Service
public class FetchIntials {

	private RestTemplate restTemplate = new RestTemplate();

	public ResponseFirstName getFirstName() {
		return restTemplate.getForEntity("http://localhost:8082/service_a/first_name", ResponseFirstName.class)
				.getBody();
	}

	public ResponseLastName getLastName() {
		return restTemplate.getForEntity("http://localhost:8083/service_b/last_name", ResponseLastName.class).getBody();
	}

}
