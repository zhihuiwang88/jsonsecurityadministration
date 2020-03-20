package com.json.web.service.impl;

import java.util.Map;

import com.json.web.util.ResutlUtil;

/**
 * 列出身份识别信息列表接口
 * @author Dell
 *20200320
 */
public interface IdentityVerifiesService {

	public ResutlUtil verifyParam(Map<String, Object> mapData) ;
	
}
