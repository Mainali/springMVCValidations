package com.pukarmainali.service;

import java.util.List;

import com.pukarmainali.domain.User;

public interface UserService {
	
	public void save(User user);
	
	public void saveFull(User user);
	
	public List<User> findAll();
	
	public User findOne(Long id);
	

}
