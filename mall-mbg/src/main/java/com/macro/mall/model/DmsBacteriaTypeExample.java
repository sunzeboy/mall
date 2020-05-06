package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class DmsBacteriaTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmsBacteriaTypeExample() {
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

        public Criteria andBacteriaTypeIsNull() {
            addCriterion("bacteria_type is null");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeIsNotNull() {
            addCriterion("bacteria_type is not null");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeEqualTo(Integer value) {
            addCriterion("bacteria_type =", value, "bacteriaType");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNotEqualTo(Integer value) {
            addCriterion("bacteria_type <>", value, "bacteriaType");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeGreaterThan(Integer value) {
            addCriterion("bacteria_type >", value, "bacteriaType");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bacteria_type >=", value, "bacteriaType");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeLessThan(Integer value) {
            addCriterion("bacteria_type <", value, "bacteriaType");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeLessThanOrEqualTo(Integer value) {
            addCriterion("bacteria_type <=", value, "bacteriaType");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeIn(List<Integer> values) {
            addCriterion("bacteria_type in", values, "bacteriaType");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNotIn(List<Integer> values) {
            addCriterion("bacteria_type not in", values, "bacteriaType");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeBetween(Integer value1, Integer value2) {
            addCriterion("bacteria_type between", value1, value2, "bacteriaType");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("bacteria_type not between", value1, value2, "bacteriaType");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameIsNull() {
            addCriterion("bacteria_type_name is null");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameIsNotNull() {
            addCriterion("bacteria_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameEqualTo(String value) {
            addCriterion("bacteria_type_name =", value, "bacteriaTypeName");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameNotEqualTo(String value) {
            addCriterion("bacteria_type_name <>", value, "bacteriaTypeName");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameGreaterThan(String value) {
            addCriterion("bacteria_type_name >", value, "bacteriaTypeName");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("bacteria_type_name >=", value, "bacteriaTypeName");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameLessThan(String value) {
            addCriterion("bacteria_type_name <", value, "bacteriaTypeName");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameLessThanOrEqualTo(String value) {
            addCriterion("bacteria_type_name <=", value, "bacteriaTypeName");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameLike(String value) {
            addCriterion("bacteria_type_name like", value, "bacteriaTypeName");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameNotLike(String value) {
            addCriterion("bacteria_type_name not like", value, "bacteriaTypeName");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameIn(List<String> values) {
            addCriterion("bacteria_type_name in", values, "bacteriaTypeName");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameNotIn(List<String> values) {
            addCriterion("bacteria_type_name not in", values, "bacteriaTypeName");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameBetween(String value1, String value2) {
            addCriterion("bacteria_type_name between", value1, value2, "bacteriaTypeName");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameNotBetween(String value1, String value2) {
            addCriterion("bacteria_type_name not between", value1, value2, "bacteriaTypeName");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameZhIsNull() {
            addCriterion("bacteria_type_name_zh is null");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameZhIsNotNull() {
            addCriterion("bacteria_type_name_zh is not null");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameZhEqualTo(String value) {
            addCriterion("bacteria_type_name_zh =", value, "bacteriaTypeNameZh");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameZhNotEqualTo(String value) {
            addCriterion("bacteria_type_name_zh <>", value, "bacteriaTypeNameZh");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameZhGreaterThan(String value) {
            addCriterion("bacteria_type_name_zh >", value, "bacteriaTypeNameZh");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("bacteria_type_name_zh >=", value, "bacteriaTypeNameZh");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameZhLessThan(String value) {
            addCriterion("bacteria_type_name_zh <", value, "bacteriaTypeNameZh");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameZhLessThanOrEqualTo(String value) {
            addCriterion("bacteria_type_name_zh <=", value, "bacteriaTypeNameZh");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameZhLike(String value) {
            addCriterion("bacteria_type_name_zh like", value, "bacteriaTypeNameZh");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameZhNotLike(String value) {
            addCriterion("bacteria_type_name_zh not like", value, "bacteriaTypeNameZh");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameZhIn(List<String> values) {
            addCriterion("bacteria_type_name_zh in", values, "bacteriaTypeNameZh");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameZhNotIn(List<String> values) {
            addCriterion("bacteria_type_name_zh not in", values, "bacteriaTypeNameZh");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameZhBetween(String value1, String value2) {
            addCriterion("bacteria_type_name_zh between", value1, value2, "bacteriaTypeNameZh");
            return (Criteria) this;
        }

        public Criteria andBacteriaTypeNameZhNotBetween(String value1, String value2) {
            addCriterion("bacteria_type_name_zh not between", value1, value2, "bacteriaTypeNameZh");
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