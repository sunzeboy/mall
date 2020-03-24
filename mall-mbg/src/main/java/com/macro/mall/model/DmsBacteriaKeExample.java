package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class DmsBacteriaKeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmsBacteriaKeExample() {
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

        public Criteria andMuIdIsNull() {
            addCriterion("mu_id is null");
            return (Criteria) this;
        }

        public Criteria andMuIdIsNotNull() {
            addCriterion("mu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMuIdEqualTo(Integer value) {
            addCriterion("mu_id =", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdNotEqualTo(Integer value) {
            addCriterion("mu_id <>", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdGreaterThan(Integer value) {
            addCriterion("mu_id >", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mu_id >=", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdLessThan(Integer value) {
            addCriterion("mu_id <", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdLessThanOrEqualTo(Integer value) {
            addCriterion("mu_id <=", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdIn(List<Integer> values) {
            addCriterion("mu_id in", values, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdNotIn(List<Integer> values) {
            addCriterion("mu_id not in", values, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdBetween(Integer value1, Integer value2) {
            addCriterion("mu_id between", value1, value2, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mu_id not between", value1, value2, "muId");
            return (Criteria) this;
        }

        public Criteria andKeNameIsNull() {
            addCriterion("ke_name is null");
            return (Criteria) this;
        }

        public Criteria andKeNameIsNotNull() {
            addCriterion("ke_name is not null");
            return (Criteria) this;
        }

        public Criteria andKeNameEqualTo(String value) {
            addCriterion("ke_name =", value, "keName");
            return (Criteria) this;
        }

        public Criteria andKeNameNotEqualTo(String value) {
            addCriterion("ke_name <>", value, "keName");
            return (Criteria) this;
        }

        public Criteria andKeNameGreaterThan(String value) {
            addCriterion("ke_name >", value, "keName");
            return (Criteria) this;
        }

        public Criteria andKeNameGreaterThanOrEqualTo(String value) {
            addCriterion("ke_name >=", value, "keName");
            return (Criteria) this;
        }

        public Criteria andKeNameLessThan(String value) {
            addCriterion("ke_name <", value, "keName");
            return (Criteria) this;
        }

        public Criteria andKeNameLessThanOrEqualTo(String value) {
            addCriterion("ke_name <=", value, "keName");
            return (Criteria) this;
        }

        public Criteria andKeNameLike(String value) {
            addCriterion("ke_name like", value, "keName");
            return (Criteria) this;
        }

        public Criteria andKeNameNotLike(String value) {
            addCriterion("ke_name not like", value, "keName");
            return (Criteria) this;
        }

        public Criteria andKeNameIn(List<String> values) {
            addCriterion("ke_name in", values, "keName");
            return (Criteria) this;
        }

        public Criteria andKeNameNotIn(List<String> values) {
            addCriterion("ke_name not in", values, "keName");
            return (Criteria) this;
        }

        public Criteria andKeNameBetween(String value1, String value2) {
            addCriterion("ke_name between", value1, value2, "keName");
            return (Criteria) this;
        }

        public Criteria andKeNameNotBetween(String value1, String value2) {
            addCriterion("ke_name not between", value1, value2, "keName");
            return (Criteria) this;
        }

        public Criteria andKeNameZhIsNull() {
            addCriterion("ke_name_zh is null");
            return (Criteria) this;
        }

        public Criteria andKeNameZhIsNotNull() {
            addCriterion("ke_name_zh is not null");
            return (Criteria) this;
        }

        public Criteria andKeNameZhEqualTo(String value) {
            addCriterion("ke_name_zh =", value, "keNameZh");
            return (Criteria) this;
        }

        public Criteria andKeNameZhNotEqualTo(String value) {
            addCriterion("ke_name_zh <>", value, "keNameZh");
            return (Criteria) this;
        }

        public Criteria andKeNameZhGreaterThan(String value) {
            addCriterion("ke_name_zh >", value, "keNameZh");
            return (Criteria) this;
        }

        public Criteria andKeNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("ke_name_zh >=", value, "keNameZh");
            return (Criteria) this;
        }

        public Criteria andKeNameZhLessThan(String value) {
            addCriterion("ke_name_zh <", value, "keNameZh");
            return (Criteria) this;
        }

        public Criteria andKeNameZhLessThanOrEqualTo(String value) {
            addCriterion("ke_name_zh <=", value, "keNameZh");
            return (Criteria) this;
        }

        public Criteria andKeNameZhLike(String value) {
            addCriterion("ke_name_zh like", value, "keNameZh");
            return (Criteria) this;
        }

        public Criteria andKeNameZhNotLike(String value) {
            addCriterion("ke_name_zh not like", value, "keNameZh");
            return (Criteria) this;
        }

        public Criteria andKeNameZhIn(List<String> values) {
            addCriterion("ke_name_zh in", values, "keNameZh");
            return (Criteria) this;
        }

        public Criteria andKeNameZhNotIn(List<String> values) {
            addCriterion("ke_name_zh not in", values, "keNameZh");
            return (Criteria) this;
        }

        public Criteria andKeNameZhBetween(String value1, String value2) {
            addCriterion("ke_name_zh between", value1, value2, "keNameZh");
            return (Criteria) this;
        }

        public Criteria andKeNameZhNotBetween(String value1, String value2) {
            addCriterion("ke_name_zh not between", value1, value2, "keNameZh");
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