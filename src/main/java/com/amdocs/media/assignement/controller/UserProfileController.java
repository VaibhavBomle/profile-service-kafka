package com.amdocs.media.assignement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.media.assignement.model.UserProfile;
import com.amdocs.media.assignement.service.UserProfileService;

@RestController
@RequestMapping("/api/v1")
public class UserProfileController {

	@Autowired
	private UserProfileService userProfileService;
	
	@PostMapping("/userProfile")
	public ResponseEntity<?> getUserProfile(@RequestBody UserProfile userProfile){
		
		System.out.println("userProfile profile service "+userProfile);
		return ResponseEntity.ok(userProfileService.createUserProfile(userProfile));
	}
	@GetMapping("/userProfile")
	public ResponseEntity<?> getUserProfile(@RequestParam(value = "id",required = false) Long id,@RequestParam(value = "userCredId",required = false) Long userCredId){
		return null;
	}
	
	
}
