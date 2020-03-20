package com.json.web.vo;

import java.io.Serializable;

public class RecipeDaqoVO implements Serializable{

	/**
	 * 菜谱大全
	 */
	private static final long serialVersionUID = -5059073653206735324L;

	private Integer errorCode;
	private String resultcode;
	private String reason;
	private Object result;
	
	@Override
	public String toString() {
		return "CarCityVO [errorCode=" + errorCode + ", resultcode=" + resultcode + ", reason=" + reason + ", result="
				+ result + "]";
	}
	public Integer getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	public String getResultcode() {
		return resultcode;
	}
	public void setResultcode(String resultcode) {
		this.resultcode = resultcode;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	
	
	
}
