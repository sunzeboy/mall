package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class DmsBacteriaGenusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmsBacteriaGenusExample() {
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

        public Criteria andKeIdIsNull() {
            addCriterion("ke_id is null");
            return (Criteria) this;
        }

        public Criteria andKeIdIsNotNull() {
            addCriterion("ke_id is not null");
            return (Criteria) this;
        }

        public Criteria andKeIdEqualTo(Integer value) {
            addCriterion("ke_id =", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdNotEqualTo(Integer value) {
            addCriterion("ke_id <>", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdGreaterThan(Integer value) {
            addCriterion("ke_id >", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ke_id >=", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdLessThan(Integer value) {
            addCriterion("ke_id <", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdLessThanOrEqualTo(Integer value) {
            addCriterion("ke_id <=", value, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdIn(List<Integer> values) {
            addCriterion("ke_id in", values, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdNotIn(List<Integer> values) {
            addCriterion("ke_id not in", values, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdBetween(Integer value1, Integer value2) {
            addCriterion("ke_id between", value1, value2, "keId");
            return (Criteria) this;
        }

        public Criteria andKeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ke_id not between", value1, value2, "keId");
            return (Criteria) this;
        }

        public Criteria andGenusNameIsNull() {
            addCriterion("genus_name is null");
            return (Criteria) this;
        }

        public Criteria andGenusNameIsNotNull() {
            addCriterion("genus_name is not null");
            return (Criteria) this;
        }

        public Criteria andGenusNameEqualTo(String value) {
            addCriterion("genus_name =", value, "genusName");
            return (Criteria) this;
        }

        public Criteria andGenusNameNotEqualTo(String value) {
            addCriterion("genus_name <>", value, "genusName");
            return (Criteria) this;
        }

        public Criteria andGenusNameGreaterThan(String value) {
            addCriterion("genus_name >", value, "genusName");
            return (Criteria) this;
        }

        public Criteria andGenusNameGreaterThanOrEqualTo(String value) {
            addCriterion("genus_name >=", value, "genusName");
            return (Criteria) this;
        }

        public Criteria andGenusNameLessThan(String value) {
            addCriterion("genus_name <", value, "genusName");
            return (Criteria) this;
        }

        public Criteria andGenusNameLessThanOrEqualTo(String value) {
            addCriterion("genus_name <=", value, "genusName");
            return (Criteria) this;
        }

        public Criteria andGenusNameLike(String value) {
            addCriterion("genus_name like", value, "genusName");
            return (Criteria) this;
        }

        public Criteria andGenusNameNotLike(String value) {
            addCriterion("genus_name not like", value, "genusName");
            return (Criteria) this;
        }

        public Criteria andGenusNameIn(List<String> values) {
            addCriterion("genus_name in", values, "genusName");
            return (Criteria) this;
        }

        public Criteria andGenusNameNotIn(List<String> values) {
            addCriterion("genus_name not in", values, "genusName");
            return (Criteria) this;
        }

        public Criteria andGenusNameBetween(String value1, String value2) {
            addCriterion("genus_name between", value1, value2, "genusName");
            return (Criteria) this;
        }

        public Criteria andGenusNameNotBetween(String value1, String value2) {
            addCriterion("genus_name not between", value1, value2, "genusName");
            return (Criteria) this;
        }

        public Criteria andGenusNameZhIsNull() {
            addCriterion("genus_name_zh is null");
            return (Criteria) this;
        }

        public Criteria andGenusNameZhIsNotNull() {
            addCriterion("genus_name_zh is not null");
            return (Criteria) this;
        }

        public Criteria andGenusNameZhEqualTo(String value) {
            addCriterion("genus_name_zh =", value, "genusNameZh");
            return (Criteria) this;
        }

        public Criteria andGenusNameZhNotEqualTo(String value) {
            addCriterion("genus_name_zh <>", value, "genusNameZh");
            return (Criteria) this;
        }

        public Criteria andGenusNameZhGreaterThan(String value) {
            addCriterion("genus_name_zh >", value, "genusNameZh");
            return (Criteria) this;
        }

        public Criteria andGenusNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("genus_name_zh >=", value, "genusNameZh");
            return (Criteria) this;
        }

        public Criteria andGenusNameZhLessThan(String value) {
            addCriterion("genus_name_zh <", value, "genusNameZh");
            return (Criteria) this;
        }

        public Criteria andGenusNameZhLessThanOrEqualTo(String value) {
            addCriterion("genus_name_zh <=", value, "genusNameZh");
            return (Criteria) this;
        }

        public Criteria andGenusNameZhLike(String value) {
            addCriterion("genus_name_zh like", value, "genusNameZh");
            return (Criteria) this;
        }

        public Criteria andGenusNameZhNotLike(String value) {
            addCriterion("genus_name_zh not like", value, "genusNameZh");
            return (Criteria) this;
        }

        public Criteria andGenusNameZhIn(List<String> values) {
            addCriterion("genus_name_zh in", values, "genusNameZh");
            return (Criteria) this;
        }

        public Criteria andGenusNameZhNotIn(List<String> values) {
            addCriterion("genus_name_zh not in", values, "genusNameZh");
            return (Criteria) this;
        }

        public Criteria andGenusNameZhBetween(String value1, String value2) {
            addCriterion("genus_name_zh between", value1, value2, "genusNameZh");
            return (Criteria) this;
        }

        public Criteria andGenusNameZhNotBetween(String value1, String value2) {
            addCriterion("genus_name_zh not between", value1, value2, "genusNameZh");
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