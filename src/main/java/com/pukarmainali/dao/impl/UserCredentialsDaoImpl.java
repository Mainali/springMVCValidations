package com.pukarmainali.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.pukarmainali.dao.UserCredentialsDao;
import com.pukarmainali.domain.UserCredentials;


@Repository
public class UserCredentialsDaoImpl extends GenericDaoImpl<UserCredentials> implements UserCredentialsDao {
	
	public UserCredentialsDaoImpl(){
		super.setDaoType(UserCredentials.class);
	}

	@Override
	public UserCredentials findByUserName(String userName) {
		Query query = entityManager.createQuery("select u from UserCredentials u where u.username=:uname");
		return (UserCredentials) query.setParameter("uname", userName).getSingleResult();
		
	}

}
