package com.naveen.jobs.service;

import com.naveen.jobs.model.User;

public interface UserService {
	
	public void save(User user);

	public User findByUsername(String username);

}
