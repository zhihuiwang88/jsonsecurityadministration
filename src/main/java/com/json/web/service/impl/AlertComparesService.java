package com.json.web.service.impl;

import java.util.Map;

import com.json.web.util.ResutlUtil;
import com.json.web.vo.AlertComparesVO;

//@Path("v1")
public interface AlertComparesService {

	
//	@GET("alert_compares")
	public ResutlUtil getAlertCompares(Map<String, Object> alertComparesVO);
	
	
	
}
