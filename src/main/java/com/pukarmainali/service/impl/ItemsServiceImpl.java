package com.pukarmainali.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pukarmainali.dao.ItemsDao;
import com.pukarmainali.domain.Items;
import com.pukarmainali.service.ItemsService;

@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {
	
	@Autowired
	ItemsDao itemsDao;

	@Override
	public List<Items> getAllItems() {
		return itemsDao.findAll();
	}

	@Override
	public void save(Items items) {
		itemsDao.save(items);
	}

	@Override
	public Items findOne(Long id) {
		return itemsDao.findOne(id);
	}

}
