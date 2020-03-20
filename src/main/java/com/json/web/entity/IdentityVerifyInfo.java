package com.json.web.entity;

public class IdentityVerifyInfo {

	/**
	 * 身份识别信息
	 */
	
	private String imageId;
	private String deviceId;
	private ImageSource imageSource;
	private IdentityVerifyProcessStatus status;
	private Identity identities;
	
	
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
	public ImageSource getImageSource() {
		return imageSource;
	}
	public void setImageSource(ImageSource imageSource) {
		this.imageSource = imageSource;
	}
	public IdentityVerifyProcessStatus getStatus() {
		return status;
	}
	public void setStatus(IdentityVerifyProcessStatus status) {
		this.status = status;
	}
	public Identity getIdentities() {
		return identities;
	}
	public void setIdentities(Identity identities) {
		this.identities = identities;
	}

	
	
}
