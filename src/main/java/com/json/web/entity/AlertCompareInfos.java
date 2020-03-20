package com.json.web.entity;

public class AlertCompareInfos {

	/**
	 * 
	 * 布控对比信息
	 */
	private String imageId;
	private String  deviceId;
	private String  deviceName;
	private float deviceCoordinateX;
	private float deviceCoordinateY;
	private ImageSource imageSource;
	private AlertCompareProcessStatus processStatus;
	private  AlertNotifyStatus   alertStatus;
	private HitIdentityInfo hitIdentityInfo;
	private  HitResult hitResult;
	private IdentityVerifyInfo similarIdentityInfo;
	private IdentityVerifyProcessStatus  identityVerifyStatus;
	
	
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public float getDeviceCoordinateX() {
		return deviceCoordinateX;
	}
	public void setDeviceCoordinateX(float deviceCoordinateX) {
		this.deviceCoordinateX = deviceCoordinateX;
	}
	public float getDeviceCoordinateY() {
		return deviceCoordinateY;
	}
	public void setDeviceCoordinateY(float deviceCoordinateY) {
		this.deviceCoordinateY = deviceCoordinateY;
	}
	public ImageSource getImageSource() {
		return imageSource;
	}
	public void setImageSource(ImageSource imageSource) {
		this.imageSource = imageSource;
	}
	public AlertCompareProcessStatus getProcessStatus() {
		return processStatus;
	}
	public void setProcessStatus(AlertCompareProcessStatus processStatus) {
		this.processStatus = processStatus;
	}
	public AlertNotifyStatus getAlertStatus() {
		return alertStatus;
	}
	public void setAlertStatus(AlertNotifyStatus alertStatus) {
		this.alertStatus = alertStatus;
	}
	public HitIdentityInfo getHitIdentityInfo() {
		return hitIdentityInfo;
	}
	public void setHitIdentityInfo(HitIdentityInfo hitIdentityInfo) {
		this.hitIdentityInfo = hitIdentityInfo;
	}
	public HitResult getHitResult() {
		return hitResult;
	}
	public void setHitResult(HitResult hitResult) {
		this.hitResult = hitResult;
	}
	public IdentityVerifyInfo getSimilarIdentityInfo() {
		return similarIdentityInfo;
	}
	public void setSimilarIdentityInfo(IdentityVerifyInfo similarIdentityInfo) {
		this.similarIdentityInfo = similarIdentityInfo;
	}
	public IdentityVerifyProcessStatus getIdentityVerifyStatus() {
		return identityVerifyStatus;
	}
	public void setIdentityVerifyStatus(IdentityVerifyProcessStatus identityVerifyStatus) {
		this.identityVerifyStatus = identityVerifyStatus;
	}

	
	
	
	
	
	
	
	
	
	
}
