package com.amdocs.media.assignement.dao;

public class UserProfile {

	
	private String address;

	private String phoneNumber;
	

	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserProfile(String address, String phoneNumber) {
		super();
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
