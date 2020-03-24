package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class DmsBacteriaProductsRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmsBacteriaProductsRelationExample() {
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

        public Criteria andResearchTypeIsNull() {
            addCriterion("research_type is null");
            return (Criteria) this;
        }

        public Criteria andResearchTypeIsNotNull() {
            addCriterion("research_type is not null");
            return (Criteria) this;
        }

        public Criteria andResearchTypeEqualTo(Integer value) {
            addCriterion("research_type =", value, "researchType");
            return (Criteria) this;
        }

        public Criteria andResearchTypeNotEqualTo(Integer value) {
            addCriterion("research_type <>", value, "researchType");
            return (Criteria) this;
        }

        public Criteria andResearchTypeGreaterThan(Integer value) {
            addCriterion("research_type >", value, "researchType");
            return (Criteria) this;
        }

        public Criteria andResearchTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("research_type >=", value, "researchType");
            return (Criteria) this;
        }

        public Criteria andResearchTypeLessThan(Integer value) {
            addCriterion("research_type <", value, "researchType");
            return (Criteria) this;
        }

        public Criteria andResearchTypeLessThanOrEqualTo(Integer value) {
            addCriterion("research_type <=", value, "researchType");
            return (Criteria) this;
        }

        public Criteria andResearchTypeIn(List<Integer> values) {
            addCriterion("research_type in", values, "researchType");
            return (Criteria) this;
        }

        public Criteria andResearchTypeNotIn(List<Integer> values) {
            addCriterion("research_type not in", values, "researchType");
            return (Criteria) this;
        }

        public Criteria andResearchTypeBetween(Integer value1, Integer value2) {
            addCriterion("research_type between", value1, value2, "researchType");
            return (Criteria) this;
        }

        public Criteria andResearchTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("research_type not between", value1, value2, "researchType");
            return (Criteria) this;
        }

        public Criteria andProductsIdIsNull() {
            addCriterion("products_id is null");
            return (Criteria) this;
        }

        public Criteria andProductsIdIsNotNull() {
            addCriterion("products_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductsIdEqualTo(String value) {
            addCriterion("products_id =", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdNotEqualTo(String value) {
            addCriterion("products_id <>", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdGreaterThan(String value) {
            addCriterion("products_id >", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdGreaterThanOrEqualTo(String value) {
            addCriterion("products_id >=", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdLessThan(String value) {
            addCriterion("products_id <", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdLessThanOrEqualTo(String value) {
            addCriterion("products_id <=", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdLike(String value) {
            addCriterion("products_id like", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdNotLike(String value) {
            addCriterion("products_id not like", value, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdIn(List<String> values) {
            addCriterion("products_id in", values, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdNotIn(List<String> values) {
            addCriterion("products_id not in", values, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdBetween(String value1, String value2) {
            addCriterion("products_id between", value1, value2, "productsId");
            return (Criteria) this;
        }

        public Criteria andProductsIdNotBetween(String value1, String value2) {
            addCriterion("products_id not between", value1, value2, "productsId");
            return (Criteria) this;
        }

        public Criteria andAffectProductsIdIsNull() {
            addCriterion("affect_products_id is null");
            return (Criteria) this;
        }

        public Criteria andAffectProductsIdIsNotNull() {
            addCriterion("affect_products_id is not null");
            return (Criteria) this;
        }

        public Criteria andAffectProductsIdEqualTo(String value) {
            addCriterion("affect_products_id =", value, "affectProductsId");
            return (Criteria) this;
        }

        public Criteria andAffectProductsIdNotEqualTo(String value) {
            addCriterion("affect_products_id <>", value, "affectProductsId");
            return (Criteria) this;
        }

        public Criteria andAffectProductsIdGreaterThan(String value) {
            addCriterion("affect_products_id >", value, "affectProductsId");
            return (Criteria) this;
        }

        public Criteria andAffectProductsIdGreaterThanOrEqualTo(String value) {
            addCriterion("affect_products_id >=", value, "affectProductsId");
            return (Criteria) this;
        }

        public Criteria andAffectProductsIdLessThan(String value) {
            addCriterion("affect_products_id <", value, "affectProductsId");
            return (Criteria) this;
        }

        public Criteria andAffectProductsIdLessThanOrEqualTo(String value) {
            addCriterion("affect_products_id <=", value, "affectProductsId");
            return (Criteria) this;
        }

        public Criteria andAffectProductsIdLike(String value) {
            addCriterion("affect_products_id like", value, "affectProductsId");
            return (Criteria) this;
        }

        public Criteria andAffectProductsIdNotLike(String value) {
            addCriterion("affect_products_id not like", value, "affectProductsId");
            return (Criteria) this;
        }

        public Criteria andAffectProductsIdIn(List<String> values) {
            addCriterion("affect_products_id in", values, "affectProductsId");
            return (Criteria) this;
        }

        public Criteria andAffectProductsIdNotIn(List<String> values) {
            addCriterion("affect_products_id not in", values, "affectProductsId");
            return (Criteria) this;
        }

        public Criteria andAffectProductsIdBetween(String value1, String value2) {
            addCriterion("affect_products_id between", value1, value2, "affectProductsId");
            return (Criteria) this;
        }

        public Criteria andAffectProductsIdNotBetween(String value1, String value2) {
            addCriterion("affect_products_id not between", value1, value2, "affectProductsId");
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