package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class DmsBacteriaSpeciesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmsBacteriaSpeciesExample() {
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

        public Criteria andGenusidIsNull() {
            addCriterion("genusId is null");
            return (Criteria) this;
        }

        public Criteria andGenusidIsNotNull() {
            addCriterion("genusId is not null");
            return (Criteria) this;
        }

        public Criteria andGenusidEqualTo(Integer value) {
            addCriterion("genusId =", value, "genusid");
            return (Criteria) this;
        }

        public Criteria andGenusidNotEqualTo(Integer value) {
            addCriterion("genusId <>", value, "genusid");
            return (Criteria) this;
        }

        public Criteria andGenusidGreaterThan(Integer value) {
            addCriterion("genusId >", value, "genusid");
            return (Criteria) this;
        }

        public Criteria andGenusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("genusId >=", value, "genusid");
            return (Criteria) this;
        }

        public Criteria andGenusidLessThan(Integer value) {
            addCriterion("genusId <", value, "genusid");
            return (Criteria) this;
        }

        public Criteria andGenusidLessThanOrEqualTo(Integer value) {
            addCriterion("genusId <=", value, "genusid");
            return (Criteria) this;
        }

        public Criteria andGenusidIn(List<Integer> values) {
            addCriterion("genusId in", values, "genusid");
            return (Criteria) this;
        }

        public Criteria andGenusidNotIn(List<Integer> values) {
            addCriterion("genusId not in", values, "genusid");
            return (Criteria) this;
        }

        public Criteria andGenusidBetween(Integer value1, Integer value2) {
            addCriterion("genusId between", value1, value2, "genusid");
            return (Criteria) this;
        }

        public Criteria andGenusidNotBetween(Integer value1, Integer value2) {
            addCriterion("genusId not between", value1, value2, "genusid");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameIsNull() {
            addCriterion("species_name is null");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameIsNotNull() {
            addCriterion("species_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameEqualTo(String value) {
            addCriterion("species_name =", value, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameNotEqualTo(String value) {
            addCriterion("species_name <>", value, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameGreaterThan(String value) {
            addCriterion("species_name >", value, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameGreaterThanOrEqualTo(String value) {
            addCriterion("species_name >=", value, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameLessThan(String value) {
            addCriterion("species_name <", value, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameLessThanOrEqualTo(String value) {
            addCriterion("species_name <=", value, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameLike(String value) {
            addCriterion("species_name like", value, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameNotLike(String value) {
            addCriterion("species_name not like", value, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameIn(List<String> values) {
            addCriterion("species_name in", values, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameNotIn(List<String> values) {
            addCriterion("species_name not in", values, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameBetween(String value1, String value2) {
            addCriterion("species_name between", value1, value2, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameNotBetween(String value1, String value2) {
            addCriterion("species_name not between", value1, value2, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameZhIsNull() {
            addCriterion("species_name_zh is null");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameZhIsNotNull() {
            addCriterion("species_name_zh is not null");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameZhEqualTo(String value) {
            addCriterion("species_name_zh =", value, "speciesNameZh");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameZhNotEqualTo(String value) {
            addCriterion("species_name_zh <>", value, "speciesNameZh");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameZhGreaterThan(String value) {
            addCriterion("species_name_zh >", value, "speciesNameZh");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("species_name_zh >=", value, "speciesNameZh");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameZhLessThan(String value) {
            addCriterion("species_name_zh <", value, "speciesNameZh");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameZhLessThanOrEqualTo(String value) {
            addCriterion("species_name_zh <=", value, "speciesNameZh");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameZhLike(String value) {
            addCriterion("species_name_zh like", value, "speciesNameZh");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameZhNotLike(String value) {
            addCriterion("species_name_zh not like", value, "speciesNameZh");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameZhIn(List<String> values) {
            addCriterion("species_name_zh in", values, "speciesNameZh");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameZhNotIn(List<String> values) {
            addCriterion("species_name_zh not in", values, "speciesNameZh");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameZhBetween(String value1, String value2) {
            addCriterion("species_name_zh between", value1, value2, "speciesNameZh");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameZhNotBetween(String value1, String value2) {
            addCriterion("species_name_zh not between", value1, value2, "speciesNameZh");
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