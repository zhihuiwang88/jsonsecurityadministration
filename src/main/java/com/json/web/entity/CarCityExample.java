package com.json.web.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CarCityExample  {
    /**
     * car_city
     */
    protected String orderByClause;

    /**
     * car_city
     */
    protected boolean distinct;

    /**
     * car_city
     */
    protected List<Criteria> oredCriteria;

    /**
     * CarCityExample
     */
    public CarCityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * setOrderByClause
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * getOrderByClause
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * setDistinct
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * isDistinct
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * getOredCriteria
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * or
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * or
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * createCriteria
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * createCriteriaInternal
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * clear
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 内部类
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                return;
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                return;
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                return;
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andAbbrIsNull() {
            addCriterion("abbr is null");
            return (Criteria) this;
        }

        public Criteria andAbbrIsNotNull() {
            addCriterion("abbr is not null");
            return (Criteria) this;
        }

        public Criteria andAbbrEqualTo(String value) {
            addCriterion("abbr =", value, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrNotEqualTo(String value) {
            addCriterion("abbr <>", value, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrGreaterThan(String value) {
            addCriterion("abbr >", value, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrGreaterThanOrEqualTo(String value) {
            addCriterion("abbr >=", value, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrLessThan(String value) {
            addCriterion("abbr <", value, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrLessThanOrEqualTo(String value) {
            addCriterion("abbr <=", value, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrLike(String value) {
            addCriterion("abbr like", value, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrNotLike(String value) {
            addCriterion("abbr not like", value, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrIn(List<String> values) {
            addCriterion("abbr in", values, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrNotIn(List<String> values) {
            addCriterion("abbr not in", values, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrBetween(String value1, String value2) {
            addCriterion("abbr between", value1, value2, "abbr");
            return (Criteria) this;
        }

        public Criteria andAbbrNotBetween(String value1, String value2) {
            addCriterion("abbr not between", value1, value2, "abbr");
            return (Criteria) this;
        }

        public Criteria andEngineNumIsNull() {
            addCriterion("engine_num is null");
            return (Criteria) this;
        }

        public Criteria andEngineNumIsNotNull() {
            addCriterion("engine_num is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNumEqualTo(String value) {
            addCriterion("engine_num =", value, "engineNum");
            return (Criteria) this;
        }

        public Criteria andEngineNumNotEqualTo(String value) {
            addCriterion("engine_num <>", value, "engineNum");
            return (Criteria) this;
        }

        public Criteria andEngineNumGreaterThan(String value) {
            addCriterion("engine_num >", value, "engineNum");
            return (Criteria) this;
        }

        public Criteria andEngineNumGreaterThanOrEqualTo(String value) {
            addCriterion("engine_num >=", value, "engineNum");
            return (Criteria) this;
        }

        public Criteria andEngineNumLessThan(String value) {
            addCriterion("engine_num <", value, "engineNum");
            return (Criteria) this;
        }

        public Criteria andEngineNumLessThanOrEqualTo(String value) {
            addCriterion("engine_num <=", value, "engineNum");
            return (Criteria) this;
        }

        public Criteria andEngineNumLike(String value) {
            addCriterion("engine_num like", value, "engineNum");
            return (Criteria) this;
        }

        public Criteria andEngineNumNotLike(String value) {
            addCriterion("engine_num not like", value, "engineNum");
            return (Criteria) this;
        }

        public Criteria andEngineNumIn(List<String> values) {
            addCriterion("engine_num in", values, "engineNum");
            return (Criteria) this;
        }

        public Criteria andEngineNumNotIn(List<String> values) {
            addCriterion("engine_num not in", values, "engineNum");
            return (Criteria) this;
        }

        public Criteria andEngineNumBetween(String value1, String value2) {
            addCriterion("engine_num between", value1, value2, "engineNum");
            return (Criteria) this;
        }

        public Criteria andEngineNumNotBetween(String value1, String value2) {
            addCriterion("engine_num not between", value1, value2, "engineNum");
            return (Criteria) this;
        }

        public Criteria andEnginenoNumIsNull() {
            addCriterion("engineno_num is null");
            return (Criteria) this;
        }

        public Criteria andEnginenoNumIsNotNull() {
            addCriterion("engineno_num is not null");
            return (Criteria) this;
        }

        public Criteria andEnginenoNumEqualTo(String value) {
            addCriterion("engineno_num =", value, "enginenoNum");
            return (Criteria) this;
        }

        public Criteria andEnginenoNumNotEqualTo(String value) {
            addCriterion("engineno_num <>", value, "enginenoNum");
            return (Criteria) this;
        }

        public Criteria andEnginenoNumGreaterThan(String value) {
            addCriterion("engineno_num >", value, "enginenoNum");
            return (Criteria) this;
        }

        public Criteria andEnginenoNumGreaterThanOrEqualTo(String value) {
            addCriterion("engineno_num >=", value, "enginenoNum");
            return (Criteria) this;
        }

        public Criteria andEnginenoNumLessThan(String value) {
            addCriterion("engineno_num <", value, "enginenoNum");
            return (Criteria) this;
        }

        public Criteria andEnginenoNumLessThanOrEqualTo(String value) {
            addCriterion("engineno_num <=", value, "enginenoNum");
            return (Criteria) this;
        }

        public Criteria andEnginenoNumLike(String value) {
            addCriterion("engineno_num like", value, "enginenoNum");
            return (Criteria) this;
        }

        public Criteria andEnginenoNumNotLike(String value) {
            addCriterion("engineno_num not like", value, "enginenoNum");
            return (Criteria) this;
        }

        public Criteria andEnginenoNumIn(List<String> values) {
            addCriterion("engineno_num in", values, "enginenoNum");
            return (Criteria) this;
        }

        public Criteria andEnginenoNumNotIn(List<String> values) {
            addCriterion("engineno_num not in", values, "enginenoNum");
            return (Criteria) this;
        }

        public Criteria andEnginenoNumBetween(String value1, String value2) {
            addCriterion("engineno_num between", value1, value2, "enginenoNum");
            return (Criteria) this;
        }

        public Criteria andEnginenoNumNotBetween(String value1, String value2) {
            addCriterion("engineno_num not between", value1, value2, "enginenoNum");
            return (Criteria) this;
        }

        public Criteria andClassNumIsNull() {
            addCriterion("class_num is null");
            return (Criteria) this;
        }

        public Criteria andClassNumIsNotNull() {
            addCriterion("class_num is not null");
            return (Criteria) this;
        }

        public Criteria andClassNumEqualTo(String value) {
            addCriterion("class_num =", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotEqualTo(String value) {
            addCriterion("class_num <>", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumGreaterThan(String value) {
            addCriterion("class_num >", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumGreaterThanOrEqualTo(String value) {
            addCriterion("class_num >=", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLessThan(String value) {
            addCriterion("class_num <", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLessThanOrEqualTo(String value) {
            addCriterion("class_num <=", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLike(String value) {
            addCriterion("class_num like", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotLike(String value) {
            addCriterion("class_num not like", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumIn(List<String> values) {
            addCriterion("class_num in", values, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotIn(List<String> values) {
            addCriterion("class_num not in", values, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumBetween(String value1, String value2) {
            addCriterion("class_num between", value1, value2, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotBetween(String value1, String value2) {
            addCriterion("class_num not between", value1, value2, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassnoNumIsNull() {
            addCriterion("classno_num is null");
            return (Criteria) this;
        }

        public Criteria andClassnoNumIsNotNull() {
            addCriterion("classno_num is not null");
            return (Criteria) this;
        }

        public Criteria andClassnoNumEqualTo(String value) {
            addCriterion("classno_num =", value, "classnoNum");
            return (Criteria) this;
        }

        public Criteria andClassnoNumNotEqualTo(String value) {
            addCriterion("classno_num <>", value, "classnoNum");
            return (Criteria) this;
        }

        public Criteria andClassnoNumGreaterThan(String value) {
            addCriterion("classno_num >", value, "classnoNum");
            return (Criteria) this;
        }

        public Criteria andClassnoNumGreaterThanOrEqualTo(String value) {
            addCriterion("classno_num >=", value, "classnoNum");
            return (Criteria) this;
        }

        public Criteria andClassnoNumLessThan(String value) {
            addCriterion("classno_num <", value, "classnoNum");
            return (Criteria) this;
        }

        public Criteria andClassnoNumLessThanOrEqualTo(String value) {
            addCriterion("classno_num <=", value, "classnoNum");
            return (Criteria) this;
        }

        public Criteria andClassnoNumLike(String value) {
            addCriterion("classno_num like", value, "classnoNum");
            return (Criteria) this;
        }

        public Criteria andClassnoNumNotLike(String value) {
            addCriterion("classno_num not like", value, "classnoNum");
            return (Criteria) this;
        }

        public Criteria andClassnoNumIn(List<String> values) {
            addCriterion("classno_num in", values, "classnoNum");
            return (Criteria) this;
        }

        public Criteria andClassnoNumNotIn(List<String> values) {
            addCriterion("classno_num not in", values, "classnoNum");
            return (Criteria) this;
        }

        public Criteria andClassnoNumBetween(String value1, String value2) {
            addCriterion("classno_num between", value1, value2, "classnoNum");
            return (Criteria) this;
        }

        public Criteria andClassnoNumNotBetween(String value1, String value2) {
            addCriterion("classno_num not between", value1, value2, "classnoNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumIsNull() {
            addCriterion("regist_num is null");
            return (Criteria) this;
        }

        public Criteria andRegistNumIsNotNull() {
            addCriterion("regist_num is not null");
            return (Criteria) this;
        }

        public Criteria andRegistNumEqualTo(String value) {
            addCriterion("regist_num =", value, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumNotEqualTo(String value) {
            addCriterion("regist_num <>", value, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumGreaterThan(String value) {
            addCriterion("regist_num >", value, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumGreaterThanOrEqualTo(String value) {
            addCriterion("regist_num >=", value, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumLessThan(String value) {
            addCriterion("regist_num <", value, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumLessThanOrEqualTo(String value) {
            addCriterion("regist_num <=", value, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumLike(String value) {
            addCriterion("regist_num like", value, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumNotLike(String value) {
            addCriterion("regist_num not like", value, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumIn(List<String> values) {
            addCriterion("regist_num in", values, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumNotIn(List<String> values) {
            addCriterion("regist_num not in", values, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumBetween(String value1, String value2) {
            addCriterion("regist_num between", value1, value2, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumNotBetween(String value1, String value2) {
            addCriterion("regist_num not between", value1, value2, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistnoNumIsNull() {
            addCriterion("registno_num is null");
            return (Criteria) this;
        }

        public Criteria andRegistnoNumIsNotNull() {
            addCriterion("registno_num is not null");
            return (Criteria) this;
        }

        public Criteria andRegistnoNumEqualTo(Integer value) {
            addCriterion("registno_num =", value, "registnoNum");
            return (Criteria) this;
        }

        public Criteria andRegistnoNumNotEqualTo(Integer value) {
            addCriterion("registno_num <>", value, "registnoNum");
            return (Criteria) this;
        }

        public Criteria andRegistnoNumGreaterThan(Integer value) {
            addCriterion("registno_num >", value, "registnoNum");
            return (Criteria) this;
        }

        public Criteria andRegistnoNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("registno_num >=", value, "registnoNum");
            return (Criteria) this;
        }

        public Criteria andRegistnoNumLessThan(Integer value) {
            addCriterion("registno_num <", value, "registnoNum");
            return (Criteria) this;
        }

        public Criteria andRegistnoNumLessThanOrEqualTo(Integer value) {
            addCriterion("registno_num <=", value, "registnoNum");
            return (Criteria) this;
        }

        public Criteria andRegistnoNumIn(List<Integer> values) {
            addCriterion("registno_num in", values, "registnoNum");
            return (Criteria) this;
        }

        public Criteria andRegistnoNumNotIn(List<Integer> values) {
            addCriterion("registno_num not in", values, "registnoNum");
            return (Criteria) this;
        }

        public Criteria andRegistnoNumBetween(Integer value1, Integer value2) {
            addCriterion("registno_num between", value1, value2, "registnoNum");
            return (Criteria) this;
        }

        public Criteria andRegistnoNumNotBetween(Integer value1, Integer value2) {
            addCriterion("registno_num not between", value1, value2, "registnoNum");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Timestamp value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Timestamp value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Timestamp value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Timestamp value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Timestamp> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Timestamp> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * 
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 内部类
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}