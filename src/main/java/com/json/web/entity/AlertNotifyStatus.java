package com.json.web.entity;

public class AlertNotifyStatus {

	/**
	 * 告警状态选项
	 */
/*	private static  final  String ALERT_STATUS_UNKNOWN = "未知状态";  
	private static  final  String  ALERT_STATUS_FALSE = "已处理"; 
	private static  final  String  ALERT_STATUS_TRUE = "未处理"; 
	private static  final  String ALERT_STATUS_ALL  = "所有处理状态" ;*/
	
	private   String ALERT_STATUS_UNKNOWN ;  
	private   String  ALERT_STATUS_FALSE ; 
	private   String  ALERT_STATUS_TRUE ; 
	private  String ALERT_STATUS_ALL  ;
	public String getALERT_STATUS_UNKNOWN() {
		return ALERT_STATUS_UNKNOWN;
	}
	public void setALERT_STATUS_UNKNOWN(String aLERT_STATUS_UNKNOWN) {
		ALERT_STATUS_UNKNOWN = aLERT_STATUS_UNKNOWN;
	}
	public String getALERT_STATUS_FALSE() {
		return ALERT_STATUS_FALSE;
	}
	public void setALERT_STATUS_FALSE(String aLERT_STATUS_FALSE) {
		ALERT_STATUS_FALSE = aLERT_STATUS_FALSE;
	}
	public String getALERT_STATUS_TRUE() {
		return ALERT_STATUS_TRUE;
	}
	public void setALERT_STATUS_TRUE(String aLERT_STATUS_TRUE) {
		ALERT_STATUS_TRUE = aLERT_STATUS_TRUE;
	}
	public String getALERT_STATUS_ALL() {
		return ALERT_STATUS_ALL;
	}
	public void setALERT_STATUS_ALL(String aLERT_STATUS_ALL) {
		ALERT_STATUS_ALL = aLERT_STATUS_ALL;
	}
	
	
	
	
	
}
