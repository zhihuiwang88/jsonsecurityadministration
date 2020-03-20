package com.json.web.service.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.web.entity.AlertCompareInfos;
import com.json.web.util.HttpClientNewUtil;
import com.json.web.util.ResutlUtil;

/**
 * 获取布控比对详情接口
 * 20200320
 */
public class AleComImageServiceImpl implements AleComImageService {

	
	private static final ObjectMapper objectMapper = new ObjectMapper();
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(AleComImageServiceImpl.class);
    private static Properties properties = new Properties();
    private static String apiServerUrl;
    static{
        try {
            properties.load(new FileInputStream(
            		AleComImageServiceImpl.class.getResource("/com/zhihui/ws/coronavirus/httpUrls.properties").getPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        apiServerUrl = properties.getProperty("apiServerUrl","http://127.0.0.1/v1/alert_compares/");
    }
	
	
	
	/**
	 * 接受请求参数并处理返回数据
	 * 
	 */
	@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
	public ResutlUtil verifyImageParam(Map<String, String> map) {
		ResutlUtil resutlUtil = new ResutlUtil();
		Map<String, Object> resultData = new HashMap<String, Object>();
		try {
			// 请求参数处理转string
			String json = objectMapper.writeValueAsString(map);
			// 请求参数转map
			Map<String, String> mapResponse = objectMapper.readValue(json, Map.class);
			// 请求参数非空判断 
			String imageId = map.get("image_id");
			if (StringUtils.isEmpty(imageId)) {
				resutlUtil.setCode(100);
				resutlUtil.setMsg("imageId is null");
				return resutlUtil;
			}
			apiServerUrl += imageId;
			// 处理返回数据
			String jsonResponse = HttpClientNewUtil.get(apiServerUrl);
			// 数据转map
			Map<String, Object> map2 = objectMapper.readValue(jsonResponse, Map.class);
			Map<String, Object>  aleComInfoObj = (Map<String, Object> ) map2.get("alert_compare_info");
			// 布控比对信息
			AlertCompareInfos alertCompareInfos = new AlertCompareInfos();
			alertCompareInfos = AlertComparesServiceImpl.aleComInf(alertCompareInfos,aleComInfoObj);
			resultData.put("alert_compare_info", alertCompareInfos);
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resutlUtil.setCode(200);
		resutlUtil.setMsg("succeed");
		resutlUtil.setResultData(resultData);
		return resutlUtil;
	}
	
}
