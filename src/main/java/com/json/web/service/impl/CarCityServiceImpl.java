package com.json.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.json.web.dao.CarCityMapper;
import com.json.web.entity.CarCity;
import com.json.web.enums.ResultEnum;
import com.json.web.exception.JsonException;

@Service
public class CarCityServiceImpl implements CarCityService {

	@Autowired
	private CarCityMapper carCityMapper;
	
	public int insert(CarCity record) {
		Integer cityId = record.getCityId();
		CarCity carCity = carCityMapper.selectByPrimaryKey(cityId);
		int num = 0;
		if(StringUtils.isEmpty(record.getEnginenoNum())) {
			throw new JsonException(ResultEnum.ENGINENO_IS_NULL);
		}
		if (carCity == null) {
		 num = carCityMapper.insert(record);
		} 
		
		return num;
	}

}
