package com.pukarmainali.dao.impl;

import com.pukarmainali.dao.ItemsDao;
import com.pukarmainali.domain.Items;

public class ItemsDaoImpl extends GenericDaoImpl<Items> implements ItemsDao {
	
	public ItemsDaoImpl(){
		super.setDaoType(Items.class);
	}

}
