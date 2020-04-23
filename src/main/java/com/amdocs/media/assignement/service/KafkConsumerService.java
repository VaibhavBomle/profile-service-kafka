package com.amdocs.media.assignement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.amdocs.media.assignement.dao.UserProfileRepository;
import com.amdocs.media.assignement.model.UserProfile;
import com.google.gson.Gson;

/**
 * 
 * kafkaConsumeService to consume data from kafka server via topic
 *
 */
@Service
public class KafkConsumerService {

	@Autowired
	private UserProfileRepository userProfileRepository;
	
	@KafkaListener(topics = "updateUserProfile",groupId = "group_id")
	public void createUserProfile(String userProfile) {
		userProfileRepository.save(new Gson().fromJson(userProfile, UserProfile.class));
		System.out.println("Consume userProfile  : "+userProfile);
	}
	
	@KafkaListener(topics = "deleteUserProfile",groupId = "group_id")
	public void delteUserProfile(String userProfileId) {
		userProfileRepository.deleteById(Long.valueOf(userProfileId));
	}
}
