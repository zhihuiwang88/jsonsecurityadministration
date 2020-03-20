package com.json.web.entity;

import java.sql.Timestamp;

public class CarCity {
    /**
     * 
     */
    protected Integer cityId;

    /**
     * 
     */
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

    /**
     * 
     */
    protected Timestamp createTime;

    /**
     * 
     */
    protected Timestamp updateTime;

    /**
     * car_city.city_id
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * car_city.city_id
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * car_city.city_name
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * car_city.city_name
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * car_city.city_code
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * car_city.city_code
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * car_city.abbr
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * car_city.abbr
     */
    public void setAbbr(String abbr) {
        this.abbr = abbr == null ? null : abbr.trim();
    }

    /**
     * car_city.engine_num
     */
    public String getEngineNum() {
        return engineNum;
    }

    /**
     * car_city.engine_num
     */
    public void setEngineNum(String engineNum) {
        this.engineNum = engineNum == null ? null : engineNum.trim();
    }

    /**
     * car_city.engineno_num
     */
    public String getEnginenoNum() {
        return enginenoNum;
    }

    /**
     * car_city.engineno_num
     */
    public void setEnginenoNum(String enginenoNum) {
        this.enginenoNum = enginenoNum == null ? null : enginenoNum.trim();
    }

    /**
     * car_city.class_num
     */
    public String getClassNum() {
        return classNum;
    }

    /**
     * car_city.class_num
     */
    public void setClassNum(String classNum) {
        this.classNum = classNum == null ? null : classNum.trim();
    }

    /**
     * car_city.classno_num
     */
    public String getClassnoNum() {
        return classnoNum;
    }

    /**
     * car_city.classno_num
     */
    public void setClassnoNum(String classnoNum) {
        this.classnoNum = classnoNum == null ? null : classnoNum.trim();
    }

    /**
     * car_city.regist_num
     */
    public String getRegistNum() {
        return registNum;
    }

    /**
     * car_city.regist_num
     */
    public void setRegistNum(String registNum) {
        this.registNum = registNum == null ? null : registNum.trim();
    }

    /**
     * car_city.registno_num
     */
    public Integer getRegistnoNum() {
        return registnoNum;
    }

    /**
     * car_city.registno_num
     */
    public void setRegistnoNum(Integer registnoNum) {
        this.registnoNum = registnoNum;
    }

    /**
     * car_city.create_time
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * car_city.create_time
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * car_city.update_time
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * car_city.update_time
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}