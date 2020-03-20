package com.json.web.service.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.web.entity.DeviceTagIds;
import com.json.web.entity.Identity;
import com.json.web.entity.IdentityVerifyInfo;
import com.json.web.entity.IdentityVerifyProcessStatus;
import com.json.web.entity.ImageSource;
import com.json.web.util.HttpClientNewUtil;
import com.json.web.util.ResutlUtil;

/**
 * 列出身份识别信息列表接口
 * @author Dell
 *20200320
 */
public class IdentityVerifiesServiceImpl implements IdentityVerifiesService {
	
	private static final ObjectMapper objectMapper = new ObjectMapper();
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(IdentityVerifiesServiceImpl.class);
    private static Properties properties = new Properties();
    private static String apiServerUrl;
    static{
        try {
            properties.load(new FileInputStream(
            		IdentityVerifiesServiceImpl.class.getResource("/com/zhihui/ws/coronavirus/httpUrls.properties").getPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        apiServerUrl = properties.getProperty("apiServerUrl","http://127.0.0.1/v1/identity_verifies");
    }
	
	
	
	/**
	 * 
	 * @param mapData , 请求参数
	 * @param mapParam,封装请求参数
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static ResutlUtil verifyRequestParam(Map<String, Object> mapData,Map<String, Object> mapParam) {
		ResutlUtil resutlUtil = new ResutlUtil();
		// 请求参数非空判断
		if (StringUtils.isEmpty(mapData.get("start_time"))) {
			resutlUtil.setCode(100);
			resutlUtil.setMsg("start_time is null");
			return resutlUtil;
		}
       if (StringUtils.isEmpty(mapData.get("end_time"))) {
			resutlUtil.setCode(100);
			resutlUtil.setMsg("end_time is null");
			return resutlUtil;
		}
       mapParam.put("start_time", mapData.get("start_time"));
       mapParam.put("end_time", mapData.get("end_time"));
       
		// device_tag_ids
       ArrayList listIds = (ArrayList) mapData.get("device_tag_ids");
       if (listIds.size() == 0) {
        resutlUtil.setCode(100);
		resutlUtil.setMsg("device_tag_ids is null");
		return resutlUtil;
       } else {
    	List<DeviceTagIds> listTag = new ArrayList<DeviceTagIds>();   
    	DeviceTagIds deviceTagIds = new DeviceTagIds();
       for (Object object : listIds) {
		JSONObject idsObj = (JSONObject) object;
		deviceTagIds.setIda(idsObj.getString("ida"));
		deviceTagIds.setIdb(idsObj.getString("idb"));
		listTag.add(deviceTagIds);  
	  }
       mapParam.put("device_tag_ids", listTag);
       }
		return null;
	}
	
	
	
	
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public ResutlUtil verifyParam(Map<String, Object> mapData) {
		ResutlUtil resutlUtil = new ResutlUtil();
		Map<String, Object> mapReult = new HashMap<String, Object>();
		try {
			// 接收请求参数，参数非空判断
			Map<String, Object> mapParam = new HashMap<String, Object>();
			resutlUtil = IdentityVerifiesServiceImpl.verifyRequestParam(mapData, mapParam);
			// 根据URL和请求参数得到返回数据
			String json = HttpClientNewUtil.get(apiServerUrl, mapParam);
			// 处理返回数据，转map
			Map<String, Object> map = objectMapper.readValue(json, Map.class);
			String nextMarker = (String) map.get("next_marker");
			mapReult.put("next_marker", map.get("next_marker"));	
			// identity_verify_infos
			List<IdentityVerifyInfo> listVerify = new ArrayList<IdentityVerifyInfo>();
			IdentityVerifyInfo idVerInfo = new IdentityVerifyInfo();
			ArrayList listInfos = (ArrayList) map.get("identity_verify_infos");
			if (listInfos.size() == 0) {
				resutlUtil.setCode(100);
				resutlUtil.setMsg("identity_verify_infos is null");
				return resutlUtil;
			} else {
				for (Object object : listInfos) {
					Map<String, Object> infoObj = (Map<String, Object>) object;
					idVerInfo.setImageId((String)infoObj.get("image_id"));
					idVerInfo.setDeviceId((String)infoObj.get("device_id"));
					// image_source
					ImageSource imageSource = new ImageSource();
					Map<String, String>  imgSouObj = (Map<String, String>) infoObj.get("image_source");
					String imUnwn =  imgSouObj.get("IMAGE_SOURCE_UNKNOWN");
					imageSource.setIMAGE_SOURCE_UNKNOWN(imUnwn);
					idVerInfo.setImageSource(imageSource);
					// identities
					Identity identity = new Identity();
					Map<String, String> tiesObj = (Map<String, String>) infoObj.get("identities");
					identity.setName(tiesObj.get("name"));
					identity.setBirthday(tiesObj.get("birthday"));
					idVerInfo.setIdentities(identity);
					// status
					IdentityVerifyProcessStatus ideVerProSta = new IdentityVerifyProcessStatus();
					Map<String, String>  statusObj = (Map<String, String>) infoObj.get("status");
					String idenUnk = statusObj.get("IDENTITY_VERIFY_PROCESS_STATUS_UNKNOWN");
					ideVerProSta.setIDENTITY_VERIFY_PROCESS_STATUS_UNKNOWN(idenUnk);
					idVerInfo.setStatus(ideVerProSta);
					// IdentityVerifyInfo
					listVerify.add(idVerInfo);
				}
			}
			mapReult.put("identity_verify_infos",listVerify);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 返回结果
		resutlUtil.setCode(200);
		resutlUtil.setMsg("succeed");
		resutlUtil.setResultData(mapReult);
		return resutlUtil;
	}

}
