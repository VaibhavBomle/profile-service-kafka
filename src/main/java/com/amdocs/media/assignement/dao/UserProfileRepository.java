package com.amdocs.media.assignement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.media.assignement.model.UserProfile;

/**
 * 
 * UserProfile repository to communicate with data base
 *
 */
@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
	
	UserProfile getById(Long id);
	
	UserProfile getByUserCredId(Long id);

}
