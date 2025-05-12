package com.microservices_moduleB.servicetwo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerTutorial {

	@KafkaListener(topics = "jdbl", groupId = "service-two-group")
	public void pollMessage(String msg) {
		System.out.print("Received message in Module 2: " + msg);
	}
	
}
