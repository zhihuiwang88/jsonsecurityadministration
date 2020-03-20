package com.json.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.web.entity.Identity;
import com.json.web.entity.IdentityVerifyInfo;
import com.json.web.entity.IdentityVerifyListResponse;
import com.json.web.entity.IdentityVerifyProcessStatus;
import com.json.web.entity.ImageSource;
import com.json.web.util.ResutlUtil;

@Controller
@RequestMapping("/identity")
public class IdentityVerifiesController {

	/**
	 * 列出身份识别信息列表接口 
	 * localhost:8081/jsondemo/identity/verifies
	 */

	@PostMapping("/verifies")
	@ResponseBody
	public ResutlUtil verifiesCon(@RequestBody IdentityVerifyListResponse idenVerLis) {
		ResutlUtil resutlUtil = new ResutlUtil();
		Map<String, Object> mapReult = new HashMap<String, Object>();
		ObjectMapper objectMapper = new ObjectMapper();
		try {

			// 对象转json
			String json = objectMapper.writeValueAsString(idenVerLis);
			System.out.println("json:" + json);
			// 处理返回数据，转map
			Map<String, Object> map = objectMapper.readValue(json, Map.class);
			String nextMarker = (String) map.get("next_marker");
			mapReult.put("next_marker", map.get("next_marker"));
			// identity_verify_infos
			List<IdentityVerifyInfo> listVerify = new ArrayList<IdentityVerifyInfo>();
			
			ArrayList listInfos = (ArrayList) map.get("identity_verify_infos");
			if (listInfos.size() == 0) {
				resutlUtil.setCode(100);
				resutlUtil.setMsg("identity_verify_infos is null");
				return resutlUtil;
			} else {
				for (Object object : listInfos) {
					Map<String, Object> infoObj = (Map<String, Object>) object;
					IdentityVerifyInfo idVerInfo = new IdentityVerifyInfo();
					idVerInfo.setImageId((String)infoObj.get("image_id"));
					idVerInfo.setDeviceId((String)infoObj.get("device_id"));
					// image_source
					ImageSource imageSource = new ImageSource();
					Map<String, String> imgSouObj = (Map<String, String>) infoObj.get("imageSource");
					imageSource.setIMAGE_SOURCE_UNKNOWN(imgSouObj.get("IMAGE_SOURCE_UNKNOWN"));
					idVerInfo.setImageSource(imageSource);
					// identities
					Identity identity = new Identity();
					Map<String, String> tiesObj = (Map<String, String>) infoObj.get("identities");
					identity.setName(tiesObj.get("name"));
					identity.setBirthday(tiesObj.get("birthday"));
					idVerInfo.setIdentities(identity);
					// status
					IdentityVerifyProcessStatus ideVerProSta = new IdentityVerifyProcessStatus();
					Map<String, String> statusObj = (Map<String, String>) infoObj.get("status");
					String idenUnk = statusObj.get("IDENTITY_VERIFY_PROCESS_STATUS_UNKNOWN");
					ideVerProSta.setIDENTITY_VERIFY_PROCESS_STATUS_UNKNOWN(idenUnk);
					idVerInfo.setStatus(ideVerProSta);
					// IdentityVerifyInfo
					listVerify.add(idVerInfo);
				}
				
			}
			mapReult.put("identity_verify_infos", listVerify);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		resutlUtil.setCode(200);
		resutlUtil.setMsg("succeed");
		resutlUtil.setResultData(mapReult);
		return resutlUtil;

	}
}
