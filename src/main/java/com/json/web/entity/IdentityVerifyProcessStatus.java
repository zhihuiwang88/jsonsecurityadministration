package com.json.web.entity;

public class IdentityVerifyProcessStatus {

	/**
	 * 身份识别处理状态
	 */

/*	private static final String IDENTITY_VERIFY_PROCESS_STATUS_UNKNOWN = "未知状态";
	private static final String IDENTITY_VERIFY_PROCESS_STATUS_REQUEST_SAVE = "请求已接受入库";
	private static final String IDENTITY_VERIFY_PROCESS_STATUS_REQUEST_SEND = "请求已发送给部级";
	*/
	
	private  String IDENTITY_VERIFY_PROCESS_STATUS_UNKNOWN ;
	private  String IDENTITY_VERIFY_PROCESS_STATUS_REQUEST_SAVE ;
	private  String IDENTITY_VERIFY_PROCESS_STATUS_REQUEST_SEND ;
	
	public String getIDENTITY_VERIFY_PROCESS_STATUS_UNKNOWN() {
		return IDENTITY_VERIFY_PROCESS_STATUS_UNKNOWN;
	}
	public void setIDENTITY_VERIFY_PROCESS_STATUS_UNKNOWN(String iDENTITY_VERIFY_PROCESS_STATUS_UNKNOWN) {
		IDENTITY_VERIFY_PROCESS_STATUS_UNKNOWN = iDENTITY_VERIFY_PROCESS_STATUS_UNKNOWN;
	}
	public String getIDENTITY_VERIFY_PROCESS_STATUS_REQUEST_SAVE() {
		return IDENTITY_VERIFY_PROCESS_STATUS_REQUEST_SAVE;
	}
	public void setIDENTITY_VERIFY_PROCESS_STATUS_REQUEST_SAVE(String iDENTITY_VERIFY_PROCESS_STATUS_REQUEST_SAVE) {
		IDENTITY_VERIFY_PROCESS_STATUS_REQUEST_SAVE = iDENTITY_VERIFY_PROCESS_STATUS_REQUEST_SAVE;
	}
	public String getIDENTITY_VERIFY_PROCESS_STATUS_REQUEST_SEND() {
		return IDENTITY_VERIFY_PROCESS_STATUS_REQUEST_SEND;
	}
	public void setIDENTITY_VERIFY_PROCESS_STATUS_REQUEST_SEND(String iDENTITY_VERIFY_PROCESS_STATUS_REQUEST_SEND) {
		IDENTITY_VERIFY_PROCESS_STATUS_REQUEST_SEND = iDENTITY_VERIFY_PROCESS_STATUS_REQUEST_SEND;
	}
	
	
}
