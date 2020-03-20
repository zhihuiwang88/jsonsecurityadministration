package com.json.web.entity;

public class HitIdentityInfo {

	/**
	 * 比中身份信息
	 */
	
	private String featureKey;
	private String personnelKind;
	private  PersonnelLevel personnelLevel;
	private String name;
	
	
	public String getFeatureKey() {
		return featureKey;
	}
	public void setFeatureKey(String featureKey) {
		this.featureKey = featureKey;
	}
	public String getPersonnelKind() {
		return personnelKind;
	}
	public void setPersonnelKind(String personnelKind) {
		this.personnelKind = personnelKind;
	}
	public PersonnelLevel getPersonnelLevel() {
		return personnelLevel;
	}
	public void setPersonnelLevel(PersonnelLevel personnelLevel) {
		this.personnelLevel = personnelLevel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
