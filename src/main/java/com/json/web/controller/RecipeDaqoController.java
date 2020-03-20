package com.json.web.controller;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.json.web.entity.RecipeDaqo;
import com.json.web.service.impl.RecipeDaqoService;
import com.json.web.util.JacksonFilterUtil;
import com.json.web.vo.RecipeDaqoVO;

@Controller
@RequestMapping("/json")
public class RecipeDaqoController {

	private static final Logger log = Logger.getLogger(RecipeDaqoController.class);	
	@Autowired
	private RecipeDaqoService  recipeDaqoService;
	/**
	 * localhost:8081/jsondemo/json/insertRecipeDaqo
	 * @param telephoneNumberVO,对象
	 * @return
	 * 20200202
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	@PostMapping(value = "/insertRecipeDaqo",produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String  addRecipeDaqo(@RequestBody RecipeDaqoVO recipeDaqoVO) {
		// json对象转json串
		String json = JacksonFilterUtil.beanToJson(recipeDaqoVO);
		// json串转map集合
		Map<String, Object> mapJson = JacksonFilterUtil.jsonToMap(json);
		Map<String, Object> mapResult = (Map<String, Object>) mapJson.get("result");
		log.warn("result_totalNum: " + mapResult.get("totalNum"));
		log.warn("result_rn: " + mapResult.get("rn"));
		// data
		 List<Map<String, Object>> listData = (List<Map<String, Object>>) mapResult.get("data");
		for (Map<String, Object> mapData : listData) {
			// albums
			List<String> listAlbums = (List<String>) mapData.get("albums");
			for (String mapAlbums : listAlbums) {
				log.warn("==albums:" + mapAlbums);
			}
			// steps
			List<Map<String, String>> lsitSteps = (List<Map<String, String>>)mapData.get("steps");
			for (Map<String, String> mapSteps : lsitSteps) {
				log.warn("==Steps_img:" + mapSteps.get("img"));
				log.warn("Steps_step:" + mapSteps.get("step"));
			}
			// 其他参数
			RecipeDaqo recipeDaqo = new RecipeDaqo();
			recipeDaqo.setBurden((String)mapData.get("burden"));
			recipeDaqo.setImtro((String)mapData.get("imtro"));
			recipeDaqo.setIngredients((String)mapData.get("ingredients"));
			recipeDaqo.setTitle((String)mapData.get("title"));
			recipeDaqo.setTags((String)mapData.get("tags"));
			recipeDaqoService.insert(recipeDaqo);
		}
		
		return json;
}
}
