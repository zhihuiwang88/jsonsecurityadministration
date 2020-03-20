package com.json.web.service.impl;

import java.util.Map;
import com.json.web.util.ResutlUtil;

//@Path("v1")
public interface AleComImageService {

	/**
	 * 获取布控比对详情接口
	 * 
	 */
//	@GET("alert_compares")
	public ResutlUtil verifyImageParam(Map<String, String> map);
		
	
}
