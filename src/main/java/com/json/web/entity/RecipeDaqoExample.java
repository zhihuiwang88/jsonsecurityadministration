package com.json.web.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class RecipeDaqoExample {
    /**
     * recipe_daqo
     */
    protected String orderByClause;

    /**
     * recipe_daqo
     */
    protected boolean distinct;

    /**
     * recipe_daqo
     */
    protected List<Criteria> oredCriteria;

    /**
     * RecipeDaqoExample
     */
    public RecipeDaqoExample() {
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

        public Criteria andGreensIdIsNull() {
            addCriterion("greens_id is null");
            return (Criteria) this;
        }

        public Criteria andGreensIdIsNotNull() {
            addCriterion("greens_id is not null");
            return (Criteria) this;
        }

        public Criteria andGreensIdEqualTo(Integer value) {
            addCriterion("greens_id =", value, "greensId");
            return (Criteria) this;
        }

        public Criteria andGreensIdNotEqualTo(Integer value) {
            addCriterion("greens_id <>", value, "greensId");
            return (Criteria) this;
        }

        public Criteria andGreensIdGreaterThan(Integer value) {
            addCriterion("greens_id >", value, "greensId");
            return (Criteria) this;
        }

        public Criteria andGreensIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("greens_id >=", value, "greensId");
            return (Criteria) this;
        }

        public Criteria andGreensIdLessThan(Integer value) {
            addCriterion("greens_id <", value, "greensId");
            return (Criteria) this;
        }

        public Criteria andGreensIdLessThanOrEqualTo(Integer value) {
            addCriterion("greens_id <=", value, "greensId");
            return (Criteria) this;
        }

        public Criteria andGreensIdIn(List<Integer> values) {
            addCriterion("greens_id in", values, "greensId");
            return (Criteria) this;
        }

        public Criteria andGreensIdNotIn(List<Integer> values) {
            addCriterion("greens_id not in", values, "greensId");
            return (Criteria) this;
        }

        public Criteria andGreensIdBetween(Integer value1, Integer value2) {
            addCriterion("greens_id between", value1, value2, "greensId");
            return (Criteria) this;
        }

        public Criteria andGreensIdNotBetween(Integer value1, Integer value2) {
            addCriterion("greens_id not between", value1, value2, "greensId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andImtroIsNull() {
            addCriterion("imtro is null");
            return (Criteria) this;
        }

        public Criteria andImtroIsNotNull() {
            addCriterion("imtro is not null");
            return (Criteria) this;
        }

        public Criteria andImtroEqualTo(String value) {
            addCriterion("imtro =", value, "imtro");
            return (Criteria) this;
        }

        public Criteria andImtroNotEqualTo(String value) {
            addCriterion("imtro <>", value, "imtro");
            return (Criteria) this;
        }

        public Criteria andImtroGreaterThan(String value) {
            addCriterion("imtro >", value, "imtro");
            return (Criteria) this;
        }

        public Criteria andImtroGreaterThanOrEqualTo(String value) {
            addCriterion("imtro >=", value, "imtro");
            return (Criteria) this;
        }

        public Criteria andImtroLessThan(String value) {
            addCriterion("imtro <", value, "imtro");
            return (Criteria) this;
        }

        public Criteria andImtroLessThanOrEqualTo(String value) {
            addCriterion("imtro <=", value, "imtro");
            return (Criteria) this;
        }

        public Criteria andImtroLike(String value) {
            addCriterion("imtro like", value, "imtro");
            return (Criteria) this;
        }

        public Criteria andImtroNotLike(String value) {
            addCriterion("imtro not like", value, "imtro");
            return (Criteria) this;
        }

        public Criteria andImtroIn(List<String> values) {
            addCriterion("imtro in", values, "imtro");
            return (Criteria) this;
        }

        public Criteria andImtroNotIn(List<String> values) {
            addCriterion("imtro not in", values, "imtro");
            return (Criteria) this;
        }

        public Criteria andImtroBetween(String value1, String value2) {
            addCriterion("imtro between", value1, value2, "imtro");
            return (Criteria) this;
        }

        public Criteria andImtroNotBetween(String value1, String value2) {
            addCriterion("imtro not between", value1, value2, "imtro");
            return (Criteria) this;
        }

        public Criteria andIngredientsIsNull() {
            addCriterion("ingredients is null");
            return (Criteria) this;
        }

        public Criteria andIngredientsIsNotNull() {
            addCriterion("ingredients is not null");
            return (Criteria) this;
        }

        public Criteria andIngredientsEqualTo(String value) {
            addCriterion("ingredients =", value, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsNotEqualTo(String value) {
            addCriterion("ingredients <>", value, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsGreaterThan(String value) {
            addCriterion("ingredients >", value, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsGreaterThanOrEqualTo(String value) {
            addCriterion("ingredients >=", value, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsLessThan(String value) {
            addCriterion("ingredients <", value, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsLessThanOrEqualTo(String value) {
            addCriterion("ingredients <=", value, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsLike(String value) {
            addCriterion("ingredients like", value, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsNotLike(String value) {
            addCriterion("ingredients not like", value, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsIn(List<String> values) {
            addCriterion("ingredients in", values, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsNotIn(List<String> values) {
            addCriterion("ingredients not in", values, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsBetween(String value1, String value2) {
            addCriterion("ingredients between", value1, value2, "ingredients");
            return (Criteria) this;
        }

        public Criteria andIngredientsNotBetween(String value1, String value2) {
            addCriterion("ingredients not between", value1, value2, "ingredients");
            return (Criteria) this;
        }

        public Criteria andBurdenIsNull() {
            addCriterion("burden is null");
            return (Criteria) this;
        }

        public Criteria andBurdenIsNotNull() {
            addCriterion("burden is not null");
            return (Criteria) this;
        }

        public Criteria andBurdenEqualTo(String value) {
            addCriterion("burden =", value, "burden");
            return (Criteria) this;
        }

        public Criteria andBurdenNotEqualTo(String value) {
            addCriterion("burden <>", value, "burden");
            return (Criteria) this;
        }

        public Criteria andBurdenGreaterThan(String value) {
            addCriterion("burden >", value, "burden");
            return (Criteria) this;
        }

        public Criteria andBurdenGreaterThanOrEqualTo(String value) {
            addCriterion("burden >=", value, "burden");
            return (Criteria) this;
        }

        public Criteria andBurdenLessThan(String value) {
            addCriterion("burden <", value, "burden");
            return (Criteria) this;
        }

        public Criteria andBurdenLessThanOrEqualTo(String value) {
            addCriterion("burden <=", value, "burden");
            return (Criteria) this;
        }

        public Criteria andBurdenLike(String value) {
            addCriterion("burden like", value, "burden");
            return (Criteria) this;
        }

        public Criteria andBurdenNotLike(String value) {
            addCriterion("burden not like", value, "burden");
            return (Criteria) this;
        }

        public Criteria andBurdenIn(List<String> values) {
            addCriterion("burden in", values, "burden");
            return (Criteria) this;
        }

        public Criteria andBurdenNotIn(List<String> values) {
            addCriterion("burden not in", values, "burden");
            return (Criteria) this;
        }

        public Criteria andBurdenBetween(String value1, String value2) {
            addCriterion("burden between", value1, value2, "burden");
            return (Criteria) this;
        }

        public Criteria andBurdenNotBetween(String value1, String value2) {
            addCriterion("burden not between", value1, value2, "burden");
            return (Criteria) this;
        }

        public Criteria andAlbumsIsNull() {
            addCriterion("albums is null");
            return (Criteria) this;
        }

        public Criteria andAlbumsIsNotNull() {
            addCriterion("albums is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumsEqualTo(String value) {
            addCriterion("albums =", value, "albums");
            return (Criteria) this;
        }

        public Criteria andAlbumsNotEqualTo(String value) {
            addCriterion("albums <>", value, "albums");
            return (Criteria) this;
        }

        public Criteria andAlbumsGreaterThan(String value) {
            addCriterion("albums >", value, "albums");
            return (Criteria) this;
        }

        public Criteria andAlbumsGreaterThanOrEqualTo(String value) {
            addCriterion("albums >=", value, "albums");
            return (Criteria) this;
        }

        public Criteria andAlbumsLessThan(String value) {
            addCriterion("albums <", value, "albums");
            return (Criteria) this;
        }

        public Criteria andAlbumsLessThanOrEqualTo(String value) {
            addCriterion("albums <=", value, "albums");
            return (Criteria) this;
        }

        public Criteria andAlbumsLike(String value) {
            addCriterion("albums like", value, "albums");
            return (Criteria) this;
        }

        public Criteria andAlbumsNotLike(String value) {
            addCriterion("albums not like", value, "albums");
            return (Criteria) this;
        }

        public Criteria andAlbumsIn(List<String> values) {
            addCriterion("albums in", values, "albums");
            return (Criteria) this;
        }

        public Criteria andAlbumsNotIn(List<String> values) {
            addCriterion("albums not in", values, "albums");
            return (Criteria) this;
        }

        public Criteria andAlbumsBetween(String value1, String value2) {
            addCriterion("albums between", value1, value2, "albums");
            return (Criteria) this;
        }

        public Criteria andAlbumsNotBetween(String value1, String value2) {
            addCriterion("albums not between", value1, value2, "albums");
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