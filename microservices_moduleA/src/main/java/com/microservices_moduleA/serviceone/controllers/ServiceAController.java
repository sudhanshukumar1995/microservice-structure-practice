package com.microservices_moduleA.serviceone.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices_moduleA.serviceone.dataTransferObjects.ResponseDAO;
import com.microservices_moduleA.serviceone.service.KafkaProducerTutorial;

@RestController
@RequestMapping("/service_a")
public class ServiceAController {
	
	private final KafkaProducerTutorial producer;
	
	@Autowired
	public ServiceAController(KafkaProducerTutorial producer) {
		this.producer = producer;
	}

	@GetMapping("/first_name")
	public ResponseEntity<ResponseDAO> getFirstName() {
		producer.pushMessage("The message is sent from: "+this.getClass().getSimpleName());
		return ResponseEntity.ok(new ResponseDAO("Sudhanshu"));
	}
	
}
