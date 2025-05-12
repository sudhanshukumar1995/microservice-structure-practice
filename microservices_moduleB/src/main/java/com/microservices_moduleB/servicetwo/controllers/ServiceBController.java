package com.microservices_moduleB.servicetwo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices_moduleB.servicetwo.dataTransferObjects.ResponseDAO;

@RestController
@RequestMapping("/service_b")
public class ServiceBController {

	@GetMapping("/last_name")
	public ResponseEntity<ResponseDAO> getLastName() {
		return ResponseEntity.ok(new ResponseDAO("Kumar"));
	}
}
