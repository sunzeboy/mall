package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class DmsBacteriaLiteratureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmsBacteriaLiteratureExample() {
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

        public Criteria andLiteratureTypeIsNull() {
            addCriterion("literature_type is null");
            return (Criteria) this;
        }

        public Criteria andLiteratureTypeIsNotNull() {
            addCriterion("literature_type is not null");
            return (Criteria) this;
        }

        public Criteria andLiteratureTypeEqualTo(Integer value) {
            addCriterion("literature_type =", value, "literatureType");
            return (Criteria) this;
        }

        public Criteria andLiteratureTypeNotEqualTo(Integer value) {
            addCriterion("literature_type <>", value, "literatureType");
            return (Criteria) this;
        }

        public Criteria andLiteratureTypeGreaterThan(Integer value) {
            addCriterion("literature_type >", value, "literatureType");
            return (Criteria) this;
        }

        public Criteria andLiteratureTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("literature_type >=", value, "literatureType");
            return (Criteria) this;
        }

        public Criteria andLiteratureTypeLessThan(Integer value) {
            addCriterion("literature_type <", value, "literatureType");
            return (Criteria) this;
        }

        public Criteria andLiteratureTypeLessThanOrEqualTo(Integer value) {
            addCriterion("literature_type <=", value, "literatureType");
            return (Criteria) this;
        }

        public Criteria andLiteratureTypeIn(List<Integer> values) {
            addCriterion("literature_type in", values, "literatureType");
            return (Criteria) this;
        }

        public Criteria andLiteratureTypeNotIn(List<Integer> values) {
            addCriterion("literature_type not in", values, "literatureType");
            return (Criteria) this;
        }

        public Criteria andLiteratureTypeBetween(Integer value1, Integer value2) {
            addCriterion("literature_type between", value1, value2, "literatureType");
            return (Criteria) this;
        }

        public Criteria andLiteratureTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("literature_type not between", value1, value2, "literatureType");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameIsNull() {
            addCriterion("literature_name is null");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameIsNotNull() {
            addCriterion("literature_name is not null");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameEqualTo(String value) {
            addCriterion("literature_name =", value, "literatureName");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameNotEqualTo(String value) {
            addCriterion("literature_name <>", value, "literatureName");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameGreaterThan(String value) {
            addCriterion("literature_name >", value, "literatureName");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameGreaterThanOrEqualTo(String value) {
            addCriterion("literature_name >=", value, "literatureName");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameLessThan(String value) {
            addCriterion("literature_name <", value, "literatureName");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameLessThanOrEqualTo(String value) {
            addCriterion("literature_name <=", value, "literatureName");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameLike(String value) {
            addCriterion("literature_name like", value, "literatureName");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameNotLike(String value) {
            addCriterion("literature_name not like", value, "literatureName");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameIn(List<String> values) {
            addCriterion("literature_name in", values, "literatureName");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameNotIn(List<String> values) {
            addCriterion("literature_name not in", values, "literatureName");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameBetween(String value1, String value2) {
            addCriterion("literature_name between", value1, value2, "literatureName");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameNotBetween(String value1, String value2) {
            addCriterion("literature_name not between", value1, value2, "literatureName");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameZhIsNull() {
            addCriterion("literature_name_zh is null");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameZhIsNotNull() {
            addCriterion("literature_name_zh is not null");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameZhEqualTo(String value) {
            addCriterion("literature_name_zh =", value, "literatureNameZh");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameZhNotEqualTo(String value) {
            addCriterion("literature_name_zh <>", value, "literatureNameZh");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameZhGreaterThan(String value) {
            addCriterion("literature_name_zh >", value, "literatureNameZh");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("literature_name_zh >=", value, "literatureNameZh");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameZhLessThan(String value) {
            addCriterion("literature_name_zh <", value, "literatureNameZh");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameZhLessThanOrEqualTo(String value) {
            addCriterion("literature_name_zh <=", value, "literatureNameZh");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameZhLike(String value) {
            addCriterion("literature_name_zh like", value, "literatureNameZh");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameZhNotLike(String value) {
            addCriterion("literature_name_zh not like", value, "literatureNameZh");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameZhIn(List<String> values) {
            addCriterion("literature_name_zh in", values, "literatureNameZh");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameZhNotIn(List<String> values) {
            addCriterion("literature_name_zh not in", values, "literatureNameZh");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameZhBetween(String value1, String value2) {
            addCriterion("literature_name_zh between", value1, value2, "literatureNameZh");
            return (Criteria) this;
        }

        public Criteria andLiteratureNameZhNotBetween(String value1, String value2) {
            addCriterion("literature_name_zh not between", value1, value2, "literatureNameZh");
            return (Criteria) this;
        }

        public Criteria andLiteraturePathIsNull() {
            addCriterion("literature_path is null");
            return (Criteria) this;
        }

        public Criteria andLiteraturePathIsNotNull() {
            addCriterion("literature_path is not null");
            return (Criteria) this;
        }

        public Criteria andLiteraturePathEqualTo(String value) {
            addCriterion("literature_path =", value, "literaturePath");
            return (Criteria) this;
        }

        public Criteria andLiteraturePathNotEqualTo(String value) {
            addCriterion("literature_path <>", value, "literaturePath");
            return (Criteria) this;
        }

        public Criteria andLiteraturePathGreaterThan(String value) {
            addCriterion("literature_path >", value, "literaturePath");
            return (Criteria) this;
        }

        public Criteria andLiteraturePathGreaterThanOrEqualTo(String value) {
            addCriterion("literature_path >=", value, "literaturePath");
            return (Criteria) this;
        }

        public Criteria andLiteraturePathLessThan(String value) {
            addCriterion("literature_path <", value, "literaturePath");
            return (Criteria) this;
        }

        public Criteria andLiteraturePathLessThanOrEqualTo(String value) {
            addCriterion("literature_path <=", value, "literaturePath");
            return (Criteria) this;
        }

        public Criteria andLiteraturePathLike(String value) {
            addCriterion("literature_path like", value, "literaturePath");
            return (Criteria) this;
        }

        public Criteria andLiteraturePathNotLike(String value) {
            addCriterion("literature_path not like", value, "literaturePath");
            return (Criteria) this;
        }

        public Criteria andLiteraturePathIn(List<String> values) {
            addCriterion("literature_path in", values, "literaturePath");
            return (Criteria) this;
        }

        public Criteria andLiteraturePathNotIn(List<String> values) {
            addCriterion("literature_path not in", values, "literaturePath");
            return (Criteria) this;
        }

        public Criteria andLiteraturePathBetween(String value1, String value2) {
            addCriterion("literature_path between", value1, value2, "literaturePath");
            return (Criteria) this;
        }

        public Criteria andLiteraturePathNotBetween(String value1, String value2) {
            addCriterion("literature_path not between", value1, value2, "literaturePath");
            return (Criteria) this;
        }

        public Criteria andSearchWordsIsNull() {
            addCriterion("search_words is null");
            return (Criteria) this;
        }

        public Criteria andSearchWordsIsNotNull() {
            addCriterion("search_words is not null");
            return (Criteria) this;
        }

        public Criteria andSearchWordsEqualTo(String value) {
            addCriterion("search_words =", value, "searchWords");
            return (Criteria) this;
        }

        public Criteria andSearchWordsNotEqualTo(String value) {
            addCriterion("search_words <>", value, "searchWords");
            return (Criteria) this;
        }

        public Criteria andSearchWordsGreaterThan(String value) {
            addCriterion("search_words >", value, "searchWords");
            return (Criteria) this;
        }

        public Criteria andSearchWordsGreaterThanOrEqualTo(String value) {
            addCriterion("search_words >=", value, "searchWords");
            return (Criteria) this;
        }

        public Criteria andSearchWordsLessThan(String value) {
            addCriterion("search_words <", value, "searchWords");
            return (Criteria) this;
        }

        public Criteria andSearchWordsLessThanOrEqualTo(String value) {
            addCriterion("search_words <=", value, "searchWords");
            return (Criteria) this;
        }

        public Criteria andSearchWordsLike(String value) {
            addCriterion("search_words like", value, "searchWords");
            return (Criteria) this;
        }

        public Criteria andSearchWordsNotLike(String value) {
            addCriterion("search_words not like", value, "searchWords");
            return (Criteria) this;
        }

        public Criteria andSearchWordsIn(List<String> values) {
            addCriterion("search_words in", values, "searchWords");
            return (Criteria) this;
        }

        public Criteria andSearchWordsNotIn(List<String> values) {
            addCriterion("search_words not in", values, "searchWords");
            return (Criteria) this;
        }

        public Criteria andSearchWordsBetween(String value1, String value2) {
            addCriterion("search_words between", value1, value2, "searchWords");
            return (Criteria) this;
        }

        public Criteria andSearchWordsNotBetween(String value1, String value2) {
            addCriterion("search_words not between", value1, value2, "searchWords");
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