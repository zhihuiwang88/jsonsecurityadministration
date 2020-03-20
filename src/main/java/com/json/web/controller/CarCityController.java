package com.json.web.controller;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.json.web.dto.CarCityDTO;
import com.json.web.entity.CarCity;
import com.json.web.service.impl.CarCityService;
import com.json.web.util.JacksonFilterUtil;
import com.json.web.vo.CarCityVO;

@Controller
@RequestMapping("/json")
public class CarCityController {

	private static final Logger log = Logger.getLogger(CarCityController.class);
	
	@Autowired
	private  CarCityService carCityService;
	
	
	
	/**
	 * localhost:8081/jsondemo/json/insertCarCity
	 * @param telephoneNumberVO,对象
	 * @return
	 * 20200202
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	@PostMapping(value = "/insertCarCity",produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String  addCarCity(@RequestBody CarCityVO carCityVO) {
		// json对象转json串
		String json = JacksonFilterUtil.beanToJson(carCityVO);
		CarCityController carCityController = new CarCityController();
		try {
			// json串转map
			Map<String, Object> jsonMap = JacksonFilterUtil.jsonToMap(json);
			Map<String, Object> mapResult = (Map<String, Object>) jsonMap.get("result");
			// BJ
			Map<String, Object> mapBJ = (Map<String, Object>) mapResult.get("BJ");
			String province = (String) mapBJ.get("province");
			log.warn("BJProvince:" + province);
			List<Map<String, Object>>  lsitBJ = (List<Map<String, Object>>) mapBJ.get("citys");
			for (Map<String, Object>  mapBJCitys : lsitBJ) {
				CarCityDTO carCityDTO = new CarCityDTO();
				carCityDTO.setAbbr((String)mapBJCitys.get("abbr"));
				carCityDTO.setCityCode((String)mapBJCitys.get("city_code"));
				carCityDTO.setCityName((String)mapBJCitys.get("city_name"));
				carCityDTO.setClassnoNum((String)mapBJCitys.get("classno"));
				carCityDTO.setClassNum((String)mapBJCitys.get("class"));
				carCityDTO.setEnginenoNum((String)mapBJCitys.get("engineno"));
				carCityDTO.setEngineNum((String)mapBJCitys.get("engine"));
				carCityDTO.setRegistNum((String)mapBJCitys.get("regist"));
				carCityDTO.setRegistnoNum((Integer)mapBJCitys.get("registno"));
				CarCity record = new CarCity();
				BeanUtils.copyProperties(carCityDTO, record);
				carCityService.insert(record);
			}
			// SH
			Map<String, Object> mapSH = (Map<String, Object>) mapResult.get("SH");
			String shProvince = (String) mapSH.get("province");
			log.warn("shProvince:" + shProvince);
			List<Map<String, Object>> listCitys =  (List<Map<String, Object>>) mapSH.get("citys");
			for (Map<String, Object> mapSHCitys : listCitys) {
				CarCityDTO carCityDTO = new CarCityDTO();
				carCityDTO.setAbbr((String)mapSHCitys.get("abbr"));
				carCityDTO.setCityCode((String)mapSHCitys.get("city_code"));
				carCityDTO.setCityName((String)mapSHCitys.get("city_name"));
				carCityDTO.setClassnoNum((String)mapSHCitys.get("classno"));
				carCityDTO.setClassNum((String)mapSHCitys.get("class"));
				carCityDTO.setEnginenoNum((String)mapSHCitys.get("engineno"));
				carCityDTO.setEngineNum((String)mapSHCitys.get("engine"));
				carCityDTO.setRegistNum((String)mapSHCitys.get("regist"));
				carCityDTO.setRegistnoNum((Integer)mapSHCitys.get("registno"));
				CarCity record = new CarCity();
				BeanUtils.copyProperties(carCityDTO, record);
				carCityService.insert(record);
			}
			// LN 
			Map<String, Object> mapLN = (Map<String, Object>) mapResult.get("LN");
			List<Map<String, Object>> mapLNCitys = (List<Map<String, Object>>) mapLN.get("citys");
			for (Map<String, Object> map : mapLNCitys) {
				CarCityDTO carCityDTO = new CarCityDTO();
				carCityDTO.setAbbr((String)map.get("abbr"));
				carCityDTO.setCityCode((String)map.get("city_code"));
				carCityDTO.setCityName((String)map.get("city_name"));
				carCityDTO.setClassnoNum((String)map.get("classno"));
				carCityDTO.setClassNum((String)map.get("class"));
				carCityDTO.setEnginenoNum((String)map.get("engineno"));
				carCityDTO.setEngineNum((String)map.get("engine"));
				carCityDTO.setRegistNum((String)map.get("regist"));
				carCityDTO.setRegistnoNum((Integer)map.get("registno"));
				CarCity record = new CarCity();
				BeanUtils.copyProperties(carCityDTO, record);
				carCityService.insert(record);
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		
	    return json;
   }
	
}