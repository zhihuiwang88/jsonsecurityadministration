package com.json.web.dto;

import java.util.List;

import com.json.web.entity.AlertCompareInfos;

public class AlertComparesDTO {

	/**
	 * 
	 * 处理响应数据
	 */
	private String nextMarker;
	private List<AlertCompareInfos> alertCompareInfos;
	
	
	public String getNextMarker() {
		return nextMarker;
	}
	public void setNextMarker(String nextMarker) {
		this.nextMarker = nextMarker;
	}
	public List<AlertCompareInfos> getAlertCompareInfos() {
		return alertCompareInfos;
	}
	public void setAlertCompareInfos(List<AlertCompareInfos> alertCompareInfos) {
		this.alertCompareInfos = alertCompareInfos;
	}

	
	
	
}
