package com.pukarmainali.dao.impl;

import com.pukarmainali.dao.UserDao;
import com.pukarmainali.domain.User;

public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {
	
	public UserDaoImpl(){
		super.setDaoType(User.class);
	}
}
