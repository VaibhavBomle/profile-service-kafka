package com.amdocs.media.assignement.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkConsumerService {

	@KafkaListener(topics = "createUserProfile",groupId = "group_id")
	public void consume(String userProfile) {
		System.out.println("userProfile  : "+userProfile);
	}
}
