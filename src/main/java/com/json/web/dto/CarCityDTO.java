package com.json.web.dto;

import java.io.Serializable;

public class CarCityDTO implements Serializable{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 670102421329208766L;

	protected String cityName;

	    /**
	     * 
	     */
	    protected String cityCode;

	    /**
	     * 
	     */
	    protected String abbr;

	    /**
	     * 
	     */
	    protected String engineNum;

	    /**
	     * 
	     */
	    protected String enginenoNum;

	    /**
	     * 
	     */
	    protected String classNum;

	    /**
	     * 
	     */
	    protected String classnoNum;

	    /**
	     * 
	     */
	    protected String registNum;

	    /**
	     * 
	     */
	    protected Integer registnoNum;

		@Override
		public String toString() {
			return "CarCityDTO [cityName=" + cityName + ", cityCode=" + cityCode + ", abbr=" + abbr + ", engineNum="
					+ engineNum + ", enginenoNum=" + enginenoNum + ", classNum=" + classNum + ", classnoNum="
					+ classnoNum + ", registNum=" + registNum + ", registnoNum=" + registnoNum + "]";
		}

		public String getCityName() {
			return cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		public String getCityCode() {
			return cityCode;
		}

		public void setCityCode(String cityCode) {
			this.cityCode = cityCode;
		}

		public String getAbbr() {
			return abbr;
		}

		public void setAbbr(String abbr) {
			this.abbr = abbr;
		}

		public String getEngineNum() {
			return engineNum;
		}

		public void setEngineNum(String engineNum) {
			this.engineNum = engineNum;
		}

		public String getEnginenoNum() {
			return enginenoNum;
		}

		public void setEnginenoNum(String enginenoNum) {
			this.enginenoNum = enginenoNum;
		}

		public String getClassNum() {
			return classNum;
		}

		public void setClassNum(String classNum) {
			this.classNum = classNum;
		}

		public String getClassnoNum() {
			return classnoNum;
		}

		public void setClassnoNum(String classnoNum) {
			this.classnoNum = classnoNum;
		}

		public String getRegistNum() {
			return registNum;
		}

		public void setRegistNum(String registNum) {
			this.registNum = registNum;
		}

		public Integer getRegistnoNum() {
			return registnoNum;
		}

		public void setRegistnoNum(Integer registnoNum) {
			this.registnoNum = registnoNum;
		}

	
}
