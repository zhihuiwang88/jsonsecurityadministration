package com.json.web.entity;

public class HitResult {

	/**
	 * 比中结果
	 */
	
	private String featureKey;
	private float score;
	private PersonnelLevel personnelLevel;
	
	
	public String getFeatureKey() {
		return featureKey;
	}
	public void setFeatureKey(String featureKey) {
		this.featureKey = featureKey;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public PersonnelLevel getPersonnelLevel() {
		return personnelLevel;
	}
	public void setPersonnelLevel(PersonnelLevel personnelLevel) {
		this.personnelLevel = personnelLevel;
	}


	
}
