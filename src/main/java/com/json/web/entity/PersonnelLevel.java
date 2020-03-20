package com.json.web.entity;

import java.io.Serializable;

public class PersonnelLevel implements Serializable {

	private static final long serialVersionUID = -5009968757128020185L;

	/**
	 * 人员级别
	 */
	/*private static final String PERSONNEL_LEVEL_UNKNOWN = "未知";
	private static final String PERSONNEL_LEVEL_RED = "红色，在逃人员，布控人员";
	private static final String PERSONNEL_LEVEL_ORANGE = "橙色，治安重点人员";*/

	private String PERSONNEL_LEVEL_UNKNOWN;
	private  String PERSONNEL_LEVEL_RED ;
	private  String PERSONNEL_LEVEL_ORANGE;
	
	public String getPERSONNEL_LEVEL_UNKNOWN() {
		return PERSONNEL_LEVEL_UNKNOWN;
	}
	public void setPERSONNEL_LEVEL_UNKNOWN(String pERSONNEL_LEVEL_UNKNOWN) {
		PERSONNEL_LEVEL_UNKNOWN = pERSONNEL_LEVEL_UNKNOWN;
	}
	public String getPERSONNEL_LEVEL_RED() {
		return PERSONNEL_LEVEL_RED;
	}
	public void setPERSONNEL_LEVEL_RED(String pERSONNEL_LEVEL_RED) {
		PERSONNEL_LEVEL_RED = pERSONNEL_LEVEL_RED;
	}
	public String getPERSONNEL_LEVEL_ORANGE() {
		return PERSONNEL_LEVEL_ORANGE;
	}
	public void setPERSONNEL_LEVEL_ORANGE(String pERSONNEL_LEVEL_ORANGE) {
		PERSONNEL_LEVEL_ORANGE = pERSONNEL_LEVEL_ORANGE;
	}
	
	
}
