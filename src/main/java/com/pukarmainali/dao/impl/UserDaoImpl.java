package com.pukarmainali.dao.impl;

import org.springframework.stereotype.Repository;

import com.pukarmainali.dao.UserDao;
import com.pukarmainali.domain.User;


@Repository
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {
	
	public UserDaoImpl(){
		super.setDaoType(User.class);
	}
}
