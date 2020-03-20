package com.json.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.json.web.dao.RecipeDaqoMapper;
import com.json.web.entity.RecipeDaqo;
@Service
public class RecipeDaqoServiceImpl implements RecipeDaqoService {

	@Autowired
	private  RecipeDaqoMapper recipeDaqoMapper;
	
	public int insert(RecipeDaqo record) {
		int num = 0;
		Integer greensId = record.getGreensId();
		RecipeDaqo recipeDaqo = recipeDaqoMapper.selectByPrimaryKey(greensId);
		if (recipeDaqo == null) {
			num = recipeDaqoMapper.insert(record);
		}
		return num;
	}

}
