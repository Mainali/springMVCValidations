package com.pukarmainali.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pukarmainali.dao.UserDao;
import com.pukarmainali.domain.User;
import com.pukarmainali.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDoa;

	@Override
	public void save(User user) {
		userDoa.save(user);
	}

	@Override
	public void saveFull(User user) {
		
	}

	@Override
	public List<User> findAll() {
		return (List<User>)userDoa.findAll();
	}

	@Override
	public User findOne(Long id) {
		return userDoa.findOne(id);
	}

}
