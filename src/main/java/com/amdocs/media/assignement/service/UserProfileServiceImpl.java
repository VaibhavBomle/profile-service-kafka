package com.amdocs.media.assignement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.media.assignement.dao.UserProfileRepository;
import com.amdocs.media.assignement.model.UserProfile;

/**
 * 
 *User Profile Service
 *
 */
@Service
public class UserProfileServiceImpl implements UserProfileService {

	@Autowired
	private UserProfileRepository userProfileRepository;
	
	@Override
	public UserProfile createUserProfile(UserProfile userProfile) {
		return userProfileRepository.save(userProfile);
	}

	@Override
	public UserProfile getUserProfile(Long id, Long userCredId) {
		if(id != null) {
			return userProfileRepository.getById(id);
		} 
		return userProfileRepository.getByUserCredId(userCredId);
	}

}
