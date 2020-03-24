package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class DmsExperimentalResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmsExperimentalResourceExample() {
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

        public Criteria andResourceTypeIsNull() {
            addCriterion("resource_type is null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNotNull() {
            addCriterion("resource_type is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeEqualTo(Integer value) {
            addCriterion("resource_type =", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotEqualTo(Integer value) {
            addCriterion("resource_type <>", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThan(Integer value) {
            addCriterion("resource_type >", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_type >=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThan(Integer value) {
            addCriterion("resource_type <", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("resource_type <=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIn(List<Integer> values) {
            addCriterion("resource_type in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotIn(List<Integer> values) {
            addCriterion("resource_type not in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("resource_type between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_type not between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceNoIsNull() {
            addCriterion("resource_no is null");
            return (Criteria) this;
        }

        public Criteria andResourceNoIsNotNull() {
            addCriterion("resource_no is not null");
            return (Criteria) this;
        }

        public Criteria andResourceNoEqualTo(String value) {
            addCriterion("resource_no =", value, "resourceNo");
            return (Criteria) this;
        }

        public Criteria andResourceNoNotEqualTo(String value) {
            addCriterion("resource_no <>", value, "resourceNo");
            return (Criteria) this;
        }

        public Criteria andResourceNoGreaterThan(String value) {
            addCriterion("resource_no >", value, "resourceNo");
            return (Criteria) this;
        }

        public Criteria andResourceNoGreaterThanOrEqualTo(String value) {
            addCriterion("resource_no >=", value, "resourceNo");
            return (Criteria) this;
        }

        public Criteria andResourceNoLessThan(String value) {
            addCriterion("resource_no <", value, "resourceNo");
            return (Criteria) this;
        }

        public Criteria andResourceNoLessThanOrEqualTo(String value) {
            addCriterion("resource_no <=", value, "resourceNo");
            return (Criteria) this;
        }

        public Criteria andResourceNoLike(String value) {
            addCriterion("resource_no like", value, "resourceNo");
            return (Criteria) this;
        }

        public Criteria andResourceNoNotLike(String value) {
            addCriterion("resource_no not like", value, "resourceNo");
            return (Criteria) this;
        }

        public Criteria andResourceNoIn(List<String> values) {
            addCriterion("resource_no in", values, "resourceNo");
            return (Criteria) this;
        }

        public Criteria andResourceNoNotIn(List<String> values) {
            addCriterion("resource_no not in", values, "resourceNo");
            return (Criteria) this;
        }

        public Criteria andResourceNoBetween(String value1, String value2) {
            addCriterion("resource_no between", value1, value2, "resourceNo");
            return (Criteria) this;
        }

        public Criteria andResourceNoNotBetween(String value1, String value2) {
            addCriterion("resource_no not between", value1, value2, "resourceNo");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Float value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Float value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Float value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Float value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Float value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Float value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Float> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Float> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Float value1, Float value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Float value1, Float value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andIsDiseaseIsNull() {
            addCriterion("is_disease is null");
            return (Criteria) this;
        }

        public Criteria andIsDiseaseIsNotNull() {
            addCriterion("is_disease is not null");
            return (Criteria) this;
        }

        public Criteria andIsDiseaseEqualTo(Integer value) {
            addCriterion("is_disease =", value, "isDisease");
            return (Criteria) this;
        }

        public Criteria andIsDiseaseNotEqualTo(Integer value) {
            addCriterion("is_disease <>", value, "isDisease");
            return (Criteria) this;
        }

        public Criteria andIsDiseaseGreaterThan(Integer value) {
            addCriterion("is_disease >", value, "isDisease");
            return (Criteria) this;
        }

        public Criteria andIsDiseaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_disease >=", value, "isDisease");
            return (Criteria) this;
        }

        public Criteria andIsDiseaseLessThan(Integer value) {
            addCriterion("is_disease <", value, "isDisease");
            return (Criteria) this;
        }

        public Criteria andIsDiseaseLessThanOrEqualTo(Integer value) {
            addCriterion("is_disease <=", value, "isDisease");
            return (Criteria) this;
        }

        public Criteria andIsDiseaseIn(List<Integer> values) {
            addCriterion("is_disease in", values, "isDisease");
            return (Criteria) this;
        }

        public Criteria andIsDiseaseNotIn(List<Integer> values) {
            addCriterion("is_disease not in", values, "isDisease");
            return (Criteria) this;
        }

        public Criteria andIsDiseaseBetween(Integer value1, Integer value2) {
            addCriterion("is_disease between", value1, value2, "isDisease");
            return (Criteria) this;
        }

        public Criteria andIsDiseaseNotBetween(Integer value1, Integer value2) {
            addCriterion("is_disease not between", value1, value2, "isDisease");
            return (Criteria) this;
        }

        public Criteria andDiseaseJsonIsNull() {
            addCriterion("disease_json is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseJsonIsNotNull() {
            addCriterion("disease_json is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseJsonEqualTo(String value) {
            addCriterion("disease_json =", value, "diseaseJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseJsonNotEqualTo(String value) {
            addCriterion("disease_json <>", value, "diseaseJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseJsonGreaterThan(String value) {
            addCriterion("disease_json >", value, "diseaseJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseJsonGreaterThanOrEqualTo(String value) {
            addCriterion("disease_json >=", value, "diseaseJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseJsonLessThan(String value) {
            addCriterion("disease_json <", value, "diseaseJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseJsonLessThanOrEqualTo(String value) {
            addCriterion("disease_json <=", value, "diseaseJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseJsonLike(String value) {
            addCriterion("disease_json like", value, "diseaseJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseJsonNotLike(String value) {
            addCriterion("disease_json not like", value, "diseaseJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseJsonIn(List<String> values) {
            addCriterion("disease_json in", values, "diseaseJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseJsonNotIn(List<String> values) {
            addCriterion("disease_json not in", values, "diseaseJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseJsonBetween(String value1, String value2) {
            addCriterion("disease_json between", value1, value2, "diseaseJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseJsonNotBetween(String value1, String value2) {
            addCriterion("disease_json not between", value1, value2, "diseaseJson");
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