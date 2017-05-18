package com.pukarmainali.dao.impl;

import org.springframework.stereotype.Repository;

import com.pukarmainali.dao.ItemsDao;
import com.pukarmainali.domain.Items;


@Repository
public class ItemsDaoImpl extends GenericDaoImpl<Items> implements ItemsDao {
	
	public ItemsDaoImpl(){
		super.setDaoType(Items.class);
	}

}
