package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class DmsComplicationTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmsComplicationTypeExample() {
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

        public Criteria andComplicationDescIsNull() {
            addCriterion("complication_desc is null");
            return (Criteria) this;
        }

        public Criteria andComplicationDescIsNotNull() {
            addCriterion("complication_desc is not null");
            return (Criteria) this;
        }

        public Criteria andComplicationDescEqualTo(String value) {
            addCriterion("complication_desc =", value, "complicationDesc");
            return (Criteria) this;
        }

        public Criteria andComplicationDescNotEqualTo(String value) {
            addCriterion("complication_desc <>", value, "complicationDesc");
            return (Criteria) this;
        }

        public Criteria andComplicationDescGreaterThan(String value) {
            addCriterion("complication_desc >", value, "complicationDesc");
            return (Criteria) this;
        }

        public Criteria andComplicationDescGreaterThanOrEqualTo(String value) {
            addCriterion("complication_desc >=", value, "complicationDesc");
            return (Criteria) this;
        }

        public Criteria andComplicationDescLessThan(String value) {
            addCriterion("complication_desc <", value, "complicationDesc");
            return (Criteria) this;
        }

        public Criteria andComplicationDescLessThanOrEqualTo(String value) {
            addCriterion("complication_desc <=", value, "complicationDesc");
            return (Criteria) this;
        }

        public Criteria andComplicationDescLike(String value) {
            addCriterion("complication_desc like", value, "complicationDesc");
            return (Criteria) this;
        }

        public Criteria andComplicationDescNotLike(String value) {
            addCriterion("complication_desc not like", value, "complicationDesc");
            return (Criteria) this;
        }

        public Criteria andComplicationDescIn(List<String> values) {
            addCriterion("complication_desc in", values, "complicationDesc");
            return (Criteria) this;
        }

        public Criteria andComplicationDescNotIn(List<String> values) {
            addCriterion("complication_desc not in", values, "complicationDesc");
            return (Criteria) this;
        }

        public Criteria andComplicationDescBetween(String value1, String value2) {
            addCriterion("complication_desc between", value1, value2, "complicationDesc");
            return (Criteria) this;
        }

        public Criteria andComplicationDescNotBetween(String value1, String value2) {
            addCriterion("complication_desc not between", value1, value2, "complicationDesc");
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