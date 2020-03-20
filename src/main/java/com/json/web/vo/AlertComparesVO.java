package com.json.web.vo;

import java.util.List;

import com.json.web.entity.DeviceTagIds;
import com.json.web.entity.PersonnelLevel;

public class AlertComparesVO {

	/**
	 * 列出布控对比信息接口
	 * 请求参数封装
	 */
	
	private String startTime;
	private String endTime;
	private Integer limit;
	private String marker;
	private List<DeviceTagIds> deviceTagIds;
	private List<PersonnelLevel> personnelLevel;
	private String imageSource;
	private  boolean isHitOnly;
	private String alertStatus;
	private String processStatus;
	private boolean isReturnHitIdentity;
	private boolean isReturnAutoIdentityVerifyDevicesOnly;
	
	
	
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public String getMarker() {
		return marker;
	}
	public void setMarker(String marker) {
		this.marker = marker;
	}
	public List<DeviceTagIds> getDeviceTagIds() {
		return deviceTagIds;
	}
	public void setDeviceTagIds(List<DeviceTagIds> deviceTagIds) {
		this.deviceTagIds = deviceTagIds;
	}
	public List<PersonnelLevel> getPersonnelLevel() {
		return personnelLevel;
	}
	public void setPersonnelLevel(List<PersonnelLevel> personnelLevel) {
		this.personnelLevel = personnelLevel;
	}
	public String getImageSource() {
		return imageSource;
	}
	public void setImageSource(String imageSource) {
		this.imageSource = imageSource;
	}
	public boolean isHitOnly() {
		return isHitOnly;
	}
	public void setHitOnly(boolean isHitOnly) {
		this.isHitOnly = isHitOnly;
	}
	public String getAlertStatus() {
		return alertStatus;
	}
	public void setAlertStatus(String alertStatus) {
		this.alertStatus = alertStatus;
	}
	public String getProcessStatus() {
		return processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}
	public boolean isReturnHitIdentity() {
		return isReturnHitIdentity;
	}
	public void setReturnHitIdentity(boolean isReturnHitIdentity) {
		this.isReturnHitIdentity = isReturnHitIdentity;
	}
	public boolean isReturnAutoIdentityVerifyDevicesOnly() {
		return isReturnAutoIdentityVerifyDevicesOnly;
	}
	public void setReturnAutoIdentityVerifyDevicesOnly(boolean isReturnAutoIdentityVerifyDevicesOnly) {
		this.isReturnAutoIdentityVerifyDevicesOnly = isReturnAutoIdentityVerifyDevicesOnly;
	}

	
	
}
