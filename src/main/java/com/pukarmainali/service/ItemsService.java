package com.pukarmainali.service;

import java.util.List;

import com.pukarmainali.domain.Items;

public interface ItemsService {
	
	List<Items> getAllItems();
	void save(Items items);
	
	Items findOne(Long id);
}
