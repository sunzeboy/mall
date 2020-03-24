package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class DmsBacteriaPhylumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmsBacteriaPhylumExample() {
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

        public Criteria andPhylumNameIsNull() {
            addCriterion("phylum_name is null");
            return (Criteria) this;
        }

        public Criteria andPhylumNameIsNotNull() {
            addCriterion("phylum_name is not null");
            return (Criteria) this;
        }

        public Criteria andPhylumNameEqualTo(String value) {
            addCriterion("phylum_name =", value, "phylumName");
            return (Criteria) this;
        }

        public Criteria andPhylumNameNotEqualTo(String value) {
            addCriterion("phylum_name <>", value, "phylumName");
            return (Criteria) this;
        }

        public Criteria andPhylumNameGreaterThan(String value) {
            addCriterion("phylum_name >", value, "phylumName");
            return (Criteria) this;
        }

        public Criteria andPhylumNameGreaterThanOrEqualTo(String value) {
            addCriterion("phylum_name >=", value, "phylumName");
            return (Criteria) this;
        }

        public Criteria andPhylumNameLessThan(String value) {
            addCriterion("phylum_name <", value, "phylumName");
            return (Criteria) this;
        }

        public Criteria andPhylumNameLessThanOrEqualTo(String value) {
            addCriterion("phylum_name <=", value, "phylumName");
            return (Criteria) this;
        }

        public Criteria andPhylumNameLike(String value) {
            addCriterion("phylum_name like", value, "phylumName");
            return (Criteria) this;
        }

        public Criteria andPhylumNameNotLike(String value) {
            addCriterion("phylum_name not like", value, "phylumName");
            return (Criteria) this;
        }

        public Criteria andPhylumNameIn(List<String> values) {
            addCriterion("phylum_name in", values, "phylumName");
            return (Criteria) this;
        }

        public Criteria andPhylumNameNotIn(List<String> values) {
            addCriterion("phylum_name not in", values, "phylumName");
            return (Criteria) this;
        }

        public Criteria andPhylumNameBetween(String value1, String value2) {
            addCriterion("phylum_name between", value1, value2, "phylumName");
            return (Criteria) this;
        }

        public Criteria andPhylumNameNotBetween(String value1, String value2) {
            addCriterion("phylum_name not between", value1, value2, "phylumName");
            return (Criteria) this;
        }

        public Criteria andPhylumNameZhIsNull() {
            addCriterion("phylum_name_zh is null");
            return (Criteria) this;
        }

        public Criteria andPhylumNameZhIsNotNull() {
            addCriterion("phylum_name_zh is not null");
            return (Criteria) this;
        }

        public Criteria andPhylumNameZhEqualTo(String value) {
            addCriterion("phylum_name_zh =", value, "phylumNameZh");
            return (Criteria) this;
        }

        public Criteria andPhylumNameZhNotEqualTo(String value) {
            addCriterion("phylum_name_zh <>", value, "phylumNameZh");
            return (Criteria) this;
        }

        public Criteria andPhylumNameZhGreaterThan(String value) {
            addCriterion("phylum_name_zh >", value, "phylumNameZh");
            return (Criteria) this;
        }

        public Criteria andPhylumNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("phylum_name_zh >=", value, "phylumNameZh");
            return (Criteria) this;
        }

        public Criteria andPhylumNameZhLessThan(String value) {
            addCriterion("phylum_name_zh <", value, "phylumNameZh");
            return (Criteria) this;
        }

        public Criteria andPhylumNameZhLessThanOrEqualTo(String value) {
            addCriterion("phylum_name_zh <=", value, "phylumNameZh");
            return (Criteria) this;
        }

        public Criteria andPhylumNameZhLike(String value) {
            addCriterion("phylum_name_zh like", value, "phylumNameZh");
            return (Criteria) this;
        }

        public Criteria andPhylumNameZhNotLike(String value) {
            addCriterion("phylum_name_zh not like", value, "phylumNameZh");
            return (Criteria) this;
        }

        public Criteria andPhylumNameZhIn(List<String> values) {
            addCriterion("phylum_name_zh in", values, "phylumNameZh");
            return (Criteria) this;
        }

        public Criteria andPhylumNameZhNotIn(List<String> values) {
            addCriterion("phylum_name_zh not in", values, "phylumNameZh");
            return (Criteria) this;
        }

        public Criteria andPhylumNameZhBetween(String value1, String value2) {
            addCriterion("phylum_name_zh between", value1, value2, "phylumNameZh");
            return (Criteria) this;
        }

        public Criteria andPhylumNameZhNotBetween(String value1, String value2) {
            addCriterion("phylum_name_zh not between", value1, value2, "phylumNameZh");
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