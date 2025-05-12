package com.microservices_moduleIntegrator.integrator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices_moduleIntegrator.integrator.dataTransferObjects.ResponseFirstName;
import com.microservices_moduleIntegrator.integrator.dataTransferObjects.ResponseFullName;
import com.microservices_moduleIntegrator.integrator.dataTransferObjects.ResponseLastName;
import com.microservices_moduleIntegrator.integrator.services.FetchInitialsFromFeignClientWay;
import com.microservices_moduleIntegrator.integrator.services.FetchIntials;

@RestController
public class IntegrationController {

	private FetchIntials fi;
	private FetchInitialsFromFeignClientWay feign;

	@Autowired
	public IntegrationController(FetchIntials fi, FetchInitialsFromFeignClientWay feign) {
		this.fi = fi;
		this.feign = feign;
	}

	@GetMapping("/name")
	public ResponseEntity<ResponseFullName> getName() {
		ResponseFirstName fN = fi.getFirstName();
		ResponseLastName lN = fi.getLastName();

		return ResponseEntity.ok(new ResponseFullName(fN.getFirstName() + " " + lN.getLastName()));
	}

	@GetMapping("/feign")
	public ResponseEntity<ResponseFullName> getNameFeignWay() {
		return ResponseEntity.ok(new ResponseFullName(
				feign.fetchFirstName().getFirstName() + " " + feign.fetchLastName().getLastName()));
	}
}