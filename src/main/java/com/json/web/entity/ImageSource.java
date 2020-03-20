package com.json.web.entity;

public class ImageSource {

	/**
	 * 图片来源
	 */
/*	private static final String  IMAGE_SOURCE_UNKNOWN = "未知图片来源";
	private static final  String  IMAGE_SOURCE_CAPTURE = "抓拍";
	private static final String  IMAGE_SOURCE_LIVENESS = "活检";
	private static final String  IMAGE_SOURCE_UPLOAD = "上传";*/
	
	private  String  IMAGE_SOURCE_UNKNOWN ;
	private   String  IMAGE_SOURCE_CAPTURE ;
	private  String  IMAGE_SOURCE_LIVENESS ;
	private  String  IMAGE_SOURCE_UPLOAD;
	public String getIMAGE_SOURCE_UNKNOWN() {
		return IMAGE_SOURCE_UNKNOWN;
	}
	public void setIMAGE_SOURCE_UNKNOWN(String iMAGE_SOURCE_UNKNOWN) {
		IMAGE_SOURCE_UNKNOWN = iMAGE_SOURCE_UNKNOWN;
	}
	public String getIMAGE_SOURCE_CAPTURE() {
		return IMAGE_SOURCE_CAPTURE;
	}
	public void setIMAGE_SOURCE_CAPTURE(String iMAGE_SOURCE_CAPTURE) {
		IMAGE_SOURCE_CAPTURE = iMAGE_SOURCE_CAPTURE;
	}
	public String getIMAGE_SOURCE_LIVENESS() {
		return IMAGE_SOURCE_LIVENESS;
	}
	public void setIMAGE_SOURCE_LIVENESS(String iMAGE_SOURCE_LIVENESS) {
		IMAGE_SOURCE_LIVENESS = iMAGE_SOURCE_LIVENESS;
	}
	public String getIMAGE_SOURCE_UPLOAD() {
		return IMAGE_SOURCE_UPLOAD;
	}
	public void setIMAGE_SOURCE_UPLOAD(String iMAGE_SOURCE_UPLOAD) {
		IMAGE_SOURCE_UPLOAD = iMAGE_SOURCE_UPLOAD;
	}
	
	
	
}
