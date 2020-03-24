package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class DmsBacteriaClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmsBacteriaClassExample() {
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

        public Criteria andPhylumIdIsNull() {
            addCriterion("phylum_id is null");
            return (Criteria) this;
        }

        public Criteria andPhylumIdIsNotNull() {
            addCriterion("phylum_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhylumIdEqualTo(Integer value) {
            addCriterion("phylum_id =", value, "phylumId");
            return (Criteria) this;
        }

        public Criteria andPhylumIdNotEqualTo(Integer value) {
            addCriterion("phylum_id <>", value, "phylumId");
            return (Criteria) this;
        }

        public Criteria andPhylumIdGreaterThan(Integer value) {
            addCriterion("phylum_id >", value, "phylumId");
            return (Criteria) this;
        }

        public Criteria andPhylumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("phylum_id >=", value, "phylumId");
            return (Criteria) this;
        }

        public Criteria andPhylumIdLessThan(Integer value) {
            addCriterion("phylum_id <", value, "phylumId");
            return (Criteria) this;
        }

        public Criteria andPhylumIdLessThanOrEqualTo(Integer value) {
            addCriterion("phylum_id <=", value, "phylumId");
            return (Criteria) this;
        }

        public Criteria andPhylumIdIn(List<Integer> values) {
            addCriterion("phylum_id in", values, "phylumId");
            return (Criteria) this;
        }

        public Criteria andPhylumIdNotIn(List<Integer> values) {
            addCriterion("phylum_id not in", values, "phylumId");
            return (Criteria) this;
        }

        public Criteria andPhylumIdBetween(Integer value1, Integer value2) {
            addCriterion("phylum_id between", value1, value2, "phylumId");
            return (Criteria) this;
        }

        public Criteria andPhylumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("phylum_id not between", value1, value2, "phylumId");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameZhIsNull() {
            addCriterion("class_name_zh is null");
            return (Criteria) this;
        }

        public Criteria andClassNameZhIsNotNull() {
            addCriterion("class_name_zh is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameZhEqualTo(String value) {
            addCriterion("class_name_zh =", value, "classNameZh");
            return (Criteria) this;
        }

        public Criteria andClassNameZhNotEqualTo(String value) {
            addCriterion("class_name_zh <>", value, "classNameZh");
            return (Criteria) this;
        }

        public Criteria andClassNameZhGreaterThan(String value) {
            addCriterion("class_name_zh >", value, "classNameZh");
            return (Criteria) this;
        }

        public Criteria andClassNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("class_name_zh >=", value, "classNameZh");
            return (Criteria) this;
        }

        public Criteria andClassNameZhLessThan(String value) {
            addCriterion("class_name_zh <", value, "classNameZh");
            return (Criteria) this;
        }

        public Criteria andClassNameZhLessThanOrEqualTo(String value) {
            addCriterion("class_name_zh <=", value, "classNameZh");
            return (Criteria) this;
        }

        public Criteria andClassNameZhLike(String value) {
            addCriterion("class_name_zh like", value, "classNameZh");
            return (Criteria) this;
        }

        public Criteria andClassNameZhNotLike(String value) {
            addCriterion("class_name_zh not like", value, "classNameZh");
            return (Criteria) this;
        }

        public Criteria andClassNameZhIn(List<String> values) {
            addCriterion("class_name_zh in", values, "classNameZh");
            return (Criteria) this;
        }

        public Criteria andClassNameZhNotIn(List<String> values) {
            addCriterion("class_name_zh not in", values, "classNameZh");
            return (Criteria) this;
        }

        public Criteria andClassNameZhBetween(String value1, String value2) {
            addCriterion("class_name_zh between", value1, value2, "classNameZh");
            return (Criteria) this;
        }

        public Criteria andClassNameZhNotBetween(String value1, String value2) {
            addCriterion("class_name_zh not between", value1, value2, "classNameZh");
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