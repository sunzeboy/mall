package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class DmsDiseaseComplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmsDiseaseComplicationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andComplicationTypeIsNull() {
            addCriterion("complication_type is null");
            return (Criteria) this;
        }

        public Criteria andComplicationTypeIsNotNull() {
            addCriterion("complication_type is not null");
            return (Criteria) this;
        }

        public Criteria andComplicationTypeEqualTo(Integer value) {
            addCriterion("complication_type =", value, "complicationType");
            return (Criteria) this;
        }

        public Criteria andComplicationTypeNotEqualTo(Integer value) {
            addCriterion("complication_type <>", value, "complicationType");
            return (Criteria) this;
        }

        public Criteria andComplicationTypeGreaterThan(Integer value) {
            addCriterion("complication_type >", value, "complicationType");
            return (Criteria) this;
        }

        public Criteria andComplicationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("complication_type >=", value, "complicationType");
            return (Criteria) this;
        }

        public Criteria andComplicationTypeLessThan(Integer value) {
            addCriterion("complication_type <", value, "complicationType");
            return (Criteria) this;
        }

        public Criteria andComplicationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("complication_type <=", value, "complicationType");
            return (Criteria) this;
        }

        public Criteria andComplicationTypeIn(List<Integer> values) {
            addCriterion("complication_type in", values, "complicationType");
            return (Criteria) this;
        }

        public Criteria andComplicationTypeNotIn(List<Integer> values) {
            addCriterion("complication_type not in", values, "complicationType");
            return (Criteria) this;
        }

        public Criteria andComplicationTypeBetween(Integer value1, Integer value2) {
            addCriterion("complication_type between", value1, value2, "complicationType");
            return (Criteria) this;
        }

        public Criteria andComplicationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("complication_type not between", value1, value2, "complicationType");
            return (Criteria) this;
        }

        public Criteria andComplicationNameIsNull() {
            addCriterion("complication_name is null");
            return (Criteria) this;
        }

        public Criteria andComplicationNameIsNotNull() {
            addCriterion("complication_name is not null");
            return (Criteria) this;
        }

        public Criteria andComplicationNameEqualTo(String value) {
            addCriterion("complication_name =", value, "complicationName");
            return (Criteria) this;
        }

        public Criteria andComplicationNameNotEqualTo(String value) {
            addCriterion("complication_name <>", value, "complicationName");
            return (Criteria) this;
        }

        public Criteria andComplicationNameGreaterThan(String value) {
            addCriterion("complication_name >", value, "complicationName");
            return (Criteria) this;
        }

        public Criteria andComplicationNameGreaterThanOrEqualTo(String value) {
            addCriterion("complication_name >=", value, "complicationName");
            return (Criteria) this;
        }

        public Criteria andComplicationNameLessThan(String value) {
            addCriterion("complication_name <", value, "complicationName");
            return (Criteria) this;
        }

        public Criteria andComplicationNameLessThanOrEqualTo(String value) {
            addCriterion("complication_name <=", value, "complicationName");
            return (Criteria) this;
        }

        public Criteria andComplicationNameLike(String value) {
            addCriterion("complication_name like", value, "complicationName");
            return (Criteria) this;
        }

        public Criteria andComplicationNameNotLike(String value) {
            addCriterion("complication_name not like", value, "complicationName");
            return (Criteria) this;
        }

        public Criteria andComplicationNameIn(List<String> values) {
            addCriterion("complication_name in", values, "complicationName");
            return (Criteria) this;
        }

        public Criteria andComplicationNameNotIn(List<String> values) {
            addCriterion("complication_name not in", values, "complicationName");
            return (Criteria) this;
        }

        public Criteria andComplicationNameBetween(String value1, String value2) {
            addCriterion("complication_name between", value1, value2, "complicationName");
            return (Criteria) this;
        }

        public Criteria andComplicationNameNotBetween(String value1, String value2) {
            addCriterion("complication_name not between", value1, value2, "complicationName");
            return (Criteria) this;
        }

        public Criteria andComplicationNameZhIsNull() {
            addCriterion("complication_name_zh is null");
            return (Criteria) this;
        }

        public Criteria andComplicationNameZhIsNotNull() {
            addCriterion("complication_name_zh is not null");
            return (Criteria) this;
        }

        public Criteria andComplicationNameZhEqualTo(String value) {
            addCriterion("complication_name_zh =", value, "complicationNameZh");
            return (Criteria) this;
        }

        public Criteria andComplicationNameZhNotEqualTo(String value) {
            addCriterion("complication_name_zh <>", value, "complicationNameZh");
            return (Criteria) this;
        }

        public Criteria andComplicationNameZhGreaterThan(String value) {
            addCriterion("complication_name_zh >", value, "complicationNameZh");
            return (Criteria) this;
        }

        public Criteria andComplicationNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("complication_name_zh >=", value, "complicationNameZh");
            return (Criteria) this;
        }

        public Criteria andComplicationNameZhLessThan(String value) {
            addCriterion("complication_name_zh <", value, "complicationNameZh");
            return (Criteria) this;
        }

        public Criteria andComplicationNameZhLessThanOrEqualTo(String value) {
            addCriterion("complication_name_zh <=", value, "complicationNameZh");
            return (Criteria) this;
        }

        public Criteria andComplicationNameZhLike(String value) {
            addCriterion("complication_name_zh like", value, "complicationNameZh");
            return (Criteria) this;
        }

        public Criteria andComplicationNameZhNotLike(String value) {
            addCriterion("complication_name_zh not like", value, "complicationNameZh");
            return (Criteria) this;
        }

        public Criteria andComplicationNameZhIn(List<String> values) {
            addCriterion("complication_name_zh in", values, "complicationNameZh");
            return (Criteria) this;
        }

        public Criteria andComplicationNameZhNotIn(List<String> values) {
            addCriterion("complication_name_zh not in", values, "complicationNameZh");
            return (Criteria) this;
        }

        public Criteria andComplicationNameZhBetween(String value1, String value2) {
            addCriterion("complication_name_zh between", value1, value2, "complicationNameZh");
            return (Criteria) this;
        }

        public Criteria andComplicationNameZhNotBetween(String value1, String value2) {
            addCriterion("complication_name_zh not between", value1, value2, "complicationNameZh");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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