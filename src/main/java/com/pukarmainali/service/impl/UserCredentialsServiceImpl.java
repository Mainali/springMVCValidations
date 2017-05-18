package com.pukarmainali.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pukarmainali.dao.UserCredentialsDao;
import com.pukarmainali.domain.UserCredentials;
import com.pukarmainali.service.UserCredentialsService;

@Service
@Transactional
public class UserCredentialsServiceImpl implements UserCredentialsService {

	@Autowired
	private UserCredentialsDao userCredentialsDao;

	@Override
    public void save( UserCredentials userCredentials) {  		
 		userCredentialsDao.save(userCredentials);
	}
 	
    @Override
    public void update( UserCredentials userCredentials) {  		
 		userCredentialsDao.update(userCredentials);
	}
 	
    @Override
	public List<UserCredentials> findAll() {
		return (List<UserCredentials>)userCredentialsDao.findAll();
	}
	
	@Override
	public UserCredentials findOne(Long id){
		return userCredentialsDao.findOne(id);
	}

	@Override
	public UserCredentials findByUserName(String userName) {
		return userCredentialsDao.findByUserName(userName);
	}


	
}
