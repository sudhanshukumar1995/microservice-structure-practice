package com.microservices_moduleA.serviceone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerTutorial {

	private static final String TOPIC_NAME = "jdbl";

	private final KafkaTemplate<String, String> kafkaTemplate;
	
	@Autowired
	public KafkaProducerTutorial(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void pushMessage(String msg) {
		kafkaTemplate.send(TOPIC_NAME, msg);
	}
}
