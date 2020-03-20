package com.json.web.service.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.web.dto.AlertComparesDTO;
import com.json.web.entity.AlertCompareInfos;
import com.json.web.entity.AlertCompareProcessStatus;
import com.json.web.entity.AlertNotifyStatus;
import com.json.web.entity.HitIdentityInfo;
import com.json.web.entity.HitResult;
import com.json.web.entity.Identity;
import com.json.web.entity.IdentityVerifyInfo;
import com.json.web.entity.IdentityVerifyProcessStatus;
import com.json.web.entity.ImageSource;
import com.json.web.entity.PersonnelLevel;
import com.json.web.util.HttpClientNewUtil;
import com.json.web.util.ResutlUtil;

public class AlertComparesServiceImpl implements AlertComparesService {

	private static final ObjectMapper objectMapper = new ObjectMapper();
	private static final Logger logger = LoggerFactory.getLogger(AlertComparesServiceImpl.class);
    private static Properties properties = new Properties();
    private static String apiServerUrl;
    static{
        try {
            properties.load(new FileInputStream(
            		AlertComparesServiceImpl.class.getResource("/com/zhihui/ws/coronavirus/httpUrls.properties").getPath()));
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        apiServerUrl = properties.getProperty("apiServerUrl","http://127.0.0.1/v1/alert_compares");
    }
	
	/**
	 * 成功返回为null
	 * @param requestMap
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static  ResutlUtil verifyRequestParam(Map<String, Object>  requestMap) {
		// 判断请求参数非空
		ResutlUtil resutlUtil = new ResutlUtil();
		if (StringUtils.isEmpty(requestMap.get("start_time"))) {
			resutlUtil.setCode(100);
			resutlUtil.setMsg("开始时间为空");
			return resutlUtil;
		}
		if (StringUtils.isEmpty(requestMap.get("end_time"))) {
			resutlUtil.setCode(100);
			resutlUtil.setMsg("结束时间为空");
			return resutlUtil;
		}
		// 处理List数据，	personnelLevel
		ArrayList listPersonnelLevel = (ArrayList) requestMap.get("personnel_level");	
		if (listPersonnelLevel.size() == 0) {
			resutlUtil.setCode(100);
			resutlUtil.setMsg("personnelLevel is null");
			return resutlUtil;
		} 
		// 处理List数据，	deviceTagIds
		ArrayList deviceTagIdsList = (ArrayList) requestMap.get("device_tag_ids");
		if (deviceTagIdsList.size() == 0) {
			resutlUtil.setCode(100);
			resutlUtil.setMsg("deviceTagIdsList is null");
			return resutlUtil;
		}
		return null;
	}
	
	/**
	 * 布控比对信息
	 * 
	 */
	@SuppressWarnings("unchecked")
	public static AlertCompareInfos  aleComInf(AlertCompareInfos alertCompareInfos,Map<String, Object>  alertCompareInfosObj) {
		float tex = (Float) alertCompareInfosObj.get("device_coordinate_x");
		alertCompareInfos.setDeviceCoordinateX(tex);
		alertCompareInfos.setImageId((String)alertCompareInfosObj.get("image_id"));
		// ImageSource
		ImageSource imageSource = new ImageSource();
		Map<String, String> imageSourceObj = (Map<String, String>) alertCompareInfosObj.get("image_source");
		imageSource.setIMAGE_SOURCE_UNKNOWN(imageSourceObj.get("IMAGE_SOURCE_UNKNOWN"));
		alertCompareInfos.setImageSource(imageSource);
		// process_status
		AlertCompareProcessStatus alertCompareProcessStatus = new AlertCompareProcessStatus();
		Map<String, String> processStatusObj = (Map<String, String>) alertCompareInfosObj.get("process_status");
		String tusALL = processStatusObj.get("ALERT_COMPARE_PROCESS_STATUS_ALL");
		alertCompareProcessStatus.setALERT_COMPARE_PROCESS_STATUS_ALL(tusALL);
		alertCompareInfos.setProcessStatus(alertCompareProcessStatus);
		// alertStatus
		AlertNotifyStatus alertNotifyStatus = new AlertNotifyStatus();
		Map<String, String> alertStatusObj = (Map<String, String>) alertCompareInfosObj.get("alert_status");
		String sta = alertStatusObj.get("ALERT_STATUS_ALL");
		alertNotifyStatus.setALERT_STATUS_ALL(sta);
		alertCompareInfos.setAlertStatus(alertNotifyStatus);
		// hitIdentityInfo
		HitIdentityInfo hitIdentityInfo = new HitIdentityInfo();
		Map<String, Object> info = (Map<String, Object>) alertCompareInfosObj.get("hit_identity_info");
		hitIdentityInfo.setFeatureKey((String)info.get("featureKey"));
		Map<String, Object> levObj = (Map<String, Object>) info.get("personnel_level");
		PersonnelLevel personnelLevel = new PersonnelLevel();
		String red = (String) levObj.get("PERSONNEL_LEVEL_RED");
		personnelLevel.setPERSONNEL_LEVEL_RED(red);
		hitIdentityInfo.setPersonnelLevel(personnelLevel);
		alertCompareInfos.setHitIdentityInfo(hitIdentityInfo);
		// hit_result
		Map<String, Object> hitResultObj = (Map<String, Object>) alertCompareInfosObj.get("hit_result");
		HitResult hitResult = new HitResult();
		float score = (Float) hitResultObj.get("score");
		hitResult.setScore(score);
		PersonnelLevel perLeHitResult = new PersonnelLevel();
		Map<String, String> peleObj = (Map<String, String>) hitResultObj.get("personnel_level");
		String redHuli = peleObj.get("PERSONNEL_LEVEL_RED");
		perLeHitResult.setPERSONNEL_LEVEL_RED(redHuli);;
		hitResult.setPersonnelLevel(perLeHitResult);
		alertCompareInfos.setHitResult(hitResult);
		// similar_identity_info
		IdentityVerifyInfo identityVerifyInfo = new  IdentityVerifyInfo();
		Map<String, Object> simInfo = (Map<String, Object>) alertCompareInfosObj.get("similar_identity_info");
		Identity identity = new  Identity();
		Map<String, String> ideObj = (Map<String, String>) simInfo.get("identities");
		identity.setIdcard(ideObj.get("idcard"));
		identityVerifyInfo.setIdentities(identity);
		alertCompareInfos.setHitIdentityInfo(hitIdentityInfo);
		// identityVerifyStatus
		IdentityVerifyProcessStatus ideVePrSta  =new IdentityVerifyProcessStatus();
		Map<String, String> verObj = (Map<String, String>) alertCompareInfosObj.get("identity_verify_status");
		String nown = (String) verObj.get("IDENTITY_VERIFY_PROCESS_STATUS_UNKNOWN");
		ideVePrSta.setIDENTITY_VERIFY_PROCESS_STATUS_UNKNOWN(nown);
		alertCompareInfos.setIdentityVerifyStatus(ideVePrSta);
		return alertCompareInfos;
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ResutlUtil getAlertCompares(Map<String, Object> alertComparesVO) {
		
		// 定义返回数据处理
		AlertComparesDTO alertComparesDTO = new AlertComparesDTO();
		ResutlUtil resutlUtil = new ResutlUtil();
		try {
			// 接收处理请求参数
			String requestParam = objectMapper.writeValueAsString("alertComparesVO");
			// string转map
			Map requestMap = objectMapper.readValue(requestParam, Map.class);
			// 请求参数非空判断
			ResutlUtil  resultRequest = AlertComparesServiceImpl.verifyRequestParam(requestMap);
			logger.warn("请求参数非空判断:" + resultRequest);
			// 处理返回数据
			String  responseResult = HttpClientNewUtil.get(apiServerUrl, requestMap);
			
			// 返回数据转map
			Map<String, Object> mapResult = objectMapper.readValue(responseResult, Map.class);
			alertComparesDTO.setNextMarker((String)mapResult.get("next_marker"));
			// 处理List数据，alertCompareInfos
			List<AlertCompareInfos> aleComInfList = new ArrayList<AlertCompareInfos>();
			ArrayList alertCompareInfosList = (ArrayList) mapResult.get("alert_compare_infos");
			for (Object object : alertCompareInfosList) {
				Map<String, Object> alertCompareInfosObj = (Map<String, Object>) object;
			// 布控比对信息
			AlertCompareInfos alertCompareInfos = new AlertCompareInfos();
			alertCompareInfos = AlertComparesServiceImpl.aleComInf(alertCompareInfos,alertCompareInfosObj);
			// 添加遍历中的数据
			aleComInfList.add(alertCompareInfos);
			}
			
			alertComparesDTO.setAlertCompareInfos(aleComInfList);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			resutlUtil.setCode(101);
			resutlUtil.setMsg("系统异常");
			return resutlUtil;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resutlUtil.setCode(200);
		resutlUtil.setResultData(alertComparesDTO);
		return resutlUtil;
	}

}
