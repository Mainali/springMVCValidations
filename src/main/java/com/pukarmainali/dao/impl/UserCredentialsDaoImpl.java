package com.pukarmainali.dao.impl;

import com.pukarmainali.dao.UserCredentialsDao;
import com.pukarmainali.domain.UserCredentials;

public class UserCredentialsDaoImpl extends GenericDaoImpl<UserCredentials> implements UserCredentialsDao {
	
	public UserCredentialsDaoImpl(){
		super.setDaoType(UserCredentials.class);
	}

}
