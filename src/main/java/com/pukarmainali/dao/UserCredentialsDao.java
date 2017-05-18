package com.pukarmainali.dao;

import com.pukarmainali.domain.UserCredentials;

public interface UserCredentialsDao extends GenericDao<UserCredentials> {
	public UserCredentials findByUserName(String userName);
}
