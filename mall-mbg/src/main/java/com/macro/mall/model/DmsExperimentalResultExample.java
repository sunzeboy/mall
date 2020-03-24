package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DmsExperimentalResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmsExperimentalResultExample() {
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

        public Criteria andProbioticsIdIsNull() {
            addCriterion("probiotics_id is null");
            return (Criteria) this;
        }

        public Criteria andProbioticsIdIsNotNull() {
            addCriterion("probiotics_id is not null");
            return (Criteria) this;
        }

        public Criteria andProbioticsIdEqualTo(Integer value) {
            addCriterion("probiotics_id =", value, "probioticsId");
            return (Criteria) this;
        }

        public Criteria andProbioticsIdNotEqualTo(Integer value) {
            addCriterion("probiotics_id <>", value, "probioticsId");
            return (Criteria) this;
        }

        public Criteria andProbioticsIdGreaterThan(Integer value) {
            addCriterion("probiotics_id >", value, "probioticsId");
            return (Criteria) this;
        }

        public Criteria andProbioticsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("probiotics_id >=", value, "probioticsId");
            return (Criteria) this;
        }

        public Criteria andProbioticsIdLessThan(Integer value) {
            addCriterion("probiotics_id <", value, "probioticsId");
            return (Criteria) this;
        }

        public Criteria andProbioticsIdLessThanOrEqualTo(Integer value) {
            addCriterion("probiotics_id <=", value, "probioticsId");
            return (Criteria) this;
        }

        public Criteria andProbioticsIdIn(List<Integer> values) {
            addCriterion("probiotics_id in", values, "probioticsId");
            return (Criteria) this;
        }

        public Criteria andProbioticsIdNotIn(List<Integer> values) {
            addCriterion("probiotics_id not in", values, "probioticsId");
            return (Criteria) this;
        }

        public Criteria andProbioticsIdBetween(Integer value1, Integer value2) {
            addCriterion("probiotics_id between", value1, value2, "probioticsId");
            return (Criteria) this;
        }

        public Criteria andProbioticsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("probiotics_id not between", value1, value2, "probioticsId");
            return (Criteria) this;
        }

        public Criteria andProbioticsTypeIsNull() {
            addCriterion("probiotics_type is null");
            return (Criteria) this;
        }

        public Criteria andProbioticsTypeIsNotNull() {
            addCriterion("probiotics_type is not null");
            return (Criteria) this;
        }

        public Criteria andProbioticsTypeEqualTo(Integer value) {
            addCriterion("probiotics_type =", value, "probioticsType");
            return (Criteria) this;
        }

        public Criteria andProbioticsTypeNotEqualTo(Integer value) {
            addCriterion("probiotics_type <>", value, "probioticsType");
            return (Criteria) this;
        }

        public Criteria andProbioticsTypeGreaterThan(Integer value) {
            addCriterion("probiotics_type >", value, "probioticsType");
            return (Criteria) this;
        }

        public Criteria andProbioticsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("probiotics_type >=", value, "probioticsType");
            return (Criteria) this;
        }

        public Criteria andProbioticsTypeLessThan(Integer value) {
            addCriterion("probiotics_type <", value, "probioticsType");
            return (Criteria) this;
        }

        public Criteria andProbioticsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("probiotics_type <=", value, "probioticsType");
            return (Criteria) this;
        }

        public Criteria andProbioticsTypeIn(List<Integer> values) {
            addCriterion("probiotics_type in", values, "probioticsType");
            return (Criteria) this;
        }

        public Criteria andProbioticsTypeNotIn(List<Integer> values) {
            addCriterion("probiotics_type not in", values, "probioticsType");
            return (Criteria) this;
        }

        public Criteria andProbioticsTypeBetween(Integer value1, Integer value2) {
            addCriterion("probiotics_type between", value1, value2, "probioticsType");
            return (Criteria) this;
        }

        public Criteria andProbioticsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("probiotics_type not between", value1, value2, "probioticsType");
            return (Criteria) this;
        }

        public Criteria andContentWeightIsNull() {
            addCriterion("content_weight is null");
            return (Criteria) this;
        }

        public Criteria andContentWeightIsNotNull() {
            addCriterion("content_weight is not null");
            return (Criteria) this;
        }

        public Criteria andContentWeightEqualTo(Float value) {
            addCriterion("content_weight =", value, "contentWeight");
            return (Criteria) this;
        }

        public Criteria andContentWeightNotEqualTo(Float value) {
            addCriterion("content_weight <>", value, "contentWeight");
            return (Criteria) this;
        }

        public Criteria andContentWeightGreaterThan(Float value) {
            addCriterion("content_weight >", value, "contentWeight");
            return (Criteria) this;
        }

        public Criteria andContentWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("content_weight >=", value, "contentWeight");
            return (Criteria) this;
        }

        public Criteria andContentWeightLessThan(Float value) {
            addCriterion("content_weight <", value, "contentWeight");
            return (Criteria) this;
        }

        public Criteria andContentWeightLessThanOrEqualTo(Float value) {
            addCriterion("content_weight <=", value, "contentWeight");
            return (Criteria) this;
        }

        public Criteria andContentWeightIn(List<Float> values) {
            addCriterion("content_weight in", values, "contentWeight");
            return (Criteria) this;
        }

        public Criteria andContentWeightNotIn(List<Float> values) {
            addCriterion("content_weight not in", values, "contentWeight");
            return (Criteria) this;
        }

        public Criteria andContentWeightBetween(Float value1, Float value2) {
            addCriterion("content_weight between", value1, value2, "contentWeight");
            return (Criteria) this;
        }

        public Criteria andContentWeightNotBetween(Float value1, Float value2) {
            addCriterion("content_weight not between", value1, value2, "contentWeight");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNull() {
            addCriterion("resource_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(Integer value) {
            addCriterion("resource_id =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(Integer value) {
            addCriterion("resource_id <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(Integer value) {
            addCriterion("resource_id >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_id >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(Integer value) {
            addCriterion("resource_id <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("resource_id <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<Integer> values) {
            addCriterion("resource_id in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<Integer> values) {
            addCriterion("resource_id not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("resource_id between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_id not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andTestTimeIsNull() {
            addCriterion("test_time is null");
            return (Criteria) this;
        }

        public Criteria andTestTimeIsNotNull() {
            addCriterion("test_time is not null");
            return (Criteria) this;
        }

        public Criteria andTestTimeEqualTo(Date value) {
            addCriterion("test_time =", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeNotEqualTo(Date value) {
            addCriterion("test_time <>", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeGreaterThan(Date value) {
            addCriterion("test_time >", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("test_time >=", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeLessThan(Date value) {
            addCriterion("test_time <", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeLessThanOrEqualTo(Date value) {
            addCriterion("test_time <=", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeIn(List<Date> values) {
            addCriterion("test_time in", values, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeNotIn(List<Date> values) {
            addCriterion("test_time not in", values, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeBetween(Date value1, Date value2) {
            addCriterion("test_time between", value1, value2, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeNotBetween(Date value1, Date value2) {
            addCriterion("test_time not between", value1, value2, "testTime");
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