package com.naveen.jobs.service;

public interface SecurityService {
	
	public String findLoggedInUsername();

	public void autologin(String username, String password);
	
}
