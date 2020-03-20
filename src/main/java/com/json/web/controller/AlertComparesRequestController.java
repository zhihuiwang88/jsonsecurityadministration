package com.json.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.web.util.ResutlUtil;
import com.json.web.vo.AlertComparesVO;

@Controller
@RequestMapping("/alert")
public class AlertComparesRequestController {

	/**
	 * localhost:8081/jsondemo/alert/compares 测试请求参数
	 * 布控比对信息
	 * @throws Exception
	 * @throws IOException
	 */
	@PostMapping("/compares")
	@ResponseBody
	public ResutlUtil testAlert(@RequestBody AlertComparesVO alertComparesVO) throws Exception {
		ResutlUtil resutlUtil = new ResutlUtil();
		ObjectMapper objectMapper = new ObjectMapper();
		String vo = objectMapper.writeValueAsString(alertComparesVO);
		Map requestMap = objectMapper.readValue(vo, Map.class);
		// 对象转map
		if (StringUtils.isEmpty(requestMap.get("startTime"))) {
			resutlUtil.setCode(100);
			resutlUtil.setMsg("开始时间为空");
			return resutlUtil;
		}
		if (StringUtils.isEmpty(requestMap.get("endTime"))) {
			resutlUtil.setCode(100);
			resutlUtil.setMsg("结束时间为空");
			return resutlUtil;
		}
		// 处理List数据， personnelLevel
		ArrayList listPersonnelLevel = (ArrayList) requestMap.get("personnelLevel");
		if (listPersonnelLevel.size() == 0) {
			resutlUtil.setCode(100);
			resutlUtil.setMsg("personnelLevel is null");
			return resutlUtil;
		}
		// 处理List数据， deviceTagIds
		List deviceTagIdsList = (List) requestMap.get("deviceTagIds");

		if (deviceTagIdsList.size() == 0) {
			resutlUtil.setCode(100);
			resutlUtil.setMsg("deviceTagIdsList is null");
			return resutlUtil;
		}

		return null;
	}

}
