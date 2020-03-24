package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DmsDiseaseResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmsDiseaseResultExample() {
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

        public Criteria andDiseaseIdJsonIsNull() {
            addCriterion("disease_id_json is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdJsonIsNotNull() {
            addCriterion("disease_id_json is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdJsonEqualTo(String value) {
            addCriterion("disease_id_json =", value, "diseaseIdJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdJsonNotEqualTo(String value) {
            addCriterion("disease_id_json <>", value, "diseaseIdJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdJsonGreaterThan(String value) {
            addCriterion("disease_id_json >", value, "diseaseIdJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdJsonGreaterThanOrEqualTo(String value) {
            addCriterion("disease_id_json >=", value, "diseaseIdJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdJsonLessThan(String value) {
            addCriterion("disease_id_json <", value, "diseaseIdJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdJsonLessThanOrEqualTo(String value) {
            addCriterion("disease_id_json <=", value, "diseaseIdJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdJsonLike(String value) {
            addCriterion("disease_id_json like", value, "diseaseIdJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdJsonNotLike(String value) {
            addCriterion("disease_id_json not like", value, "diseaseIdJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdJsonIn(List<String> values) {
            addCriterion("disease_id_json in", values, "diseaseIdJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdJsonNotIn(List<String> values) {
            addCriterion("disease_id_json not in", values, "diseaseIdJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdJsonBetween(String value1, String value2) {
            addCriterion("disease_id_json between", value1, value2, "diseaseIdJson");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdJsonNotBetween(String value1, String value2) {
            addCriterion("disease_id_json not between", value1, value2, "diseaseIdJson");
            return (Criteria) this;
        }

        public Criteria andComplicationIdJsonIsNull() {
            addCriterion("complication_id_json is null");
            return (Criteria) this;
        }

        public Criteria andComplicationIdJsonIsNotNull() {
            addCriterion("complication_id_json is not null");
            return (Criteria) this;
        }

        public Criteria andComplicationIdJsonEqualTo(String value) {
            addCriterion("complication_id_json =", value, "complicationIdJson");
            return (Criteria) this;
        }

        public Criteria andComplicationIdJsonNotEqualTo(String value) {
            addCriterion("complication_id_json <>", value, "complicationIdJson");
            return (Criteria) this;
        }

        public Criteria andComplicationIdJsonGreaterThan(String value) {
            addCriterion("complication_id_json >", value, "complicationIdJson");
            return (Criteria) this;
        }

        public Criteria andComplicationIdJsonGreaterThanOrEqualTo(String value) {
            addCriterion("complication_id_json >=", value, "complicationIdJson");
            return (Criteria) this;
        }

        public Criteria andComplicationIdJsonLessThan(String value) {
            addCriterion("complication_id_json <", value, "complicationIdJson");
            return (Criteria) this;
        }

        public Criteria andComplicationIdJsonLessThanOrEqualTo(String value) {
            addCriterion("complication_id_json <=", value, "complicationIdJson");
            return (Criteria) this;
        }

        public Criteria andComplicationIdJsonLike(String value) {
            addCriterion("complication_id_json like", value, "complicationIdJson");
            return (Criteria) this;
        }

        public Criteria andComplicationIdJsonNotLike(String value) {
            addCriterion("complication_id_json not like", value, "complicationIdJson");
            return (Criteria) this;
        }

        public Criteria andComplicationIdJsonIn(List<String> values) {
            addCriterion("complication_id_json in", values, "complicationIdJson");
            return (Criteria) this;
        }

        public Criteria andComplicationIdJsonNotIn(List<String> values) {
            addCriterion("complication_id_json not in", values, "complicationIdJson");
            return (Criteria) this;
        }

        public Criteria andComplicationIdJsonBetween(String value1, String value2) {
            addCriterion("complication_id_json between", value1, value2, "complicationIdJson");
            return (Criteria) this;
        }

        public Criteria andComplicationIdJsonNotBetween(String value1, String value2) {
            addCriterion("complication_id_json not between", value1, value2, "complicationIdJson");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdJsonIsNull() {
            addCriterion("literature_id_json is null");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdJsonIsNotNull() {
            addCriterion("literature_id_json is not null");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdJsonEqualTo(String value) {
            addCriterion("literature_id_json =", value, "literatureIdJson");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdJsonNotEqualTo(String value) {
            addCriterion("literature_id_json <>", value, "literatureIdJson");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdJsonGreaterThan(String value) {
            addCriterion("literature_id_json >", value, "literatureIdJson");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdJsonGreaterThanOrEqualTo(String value) {
            addCriterion("literature_id_json >=", value, "literatureIdJson");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdJsonLessThan(String value) {
            addCriterion("literature_id_json <", value, "literatureIdJson");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdJsonLessThanOrEqualTo(String value) {
            addCriterion("literature_id_json <=", value, "literatureIdJson");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdJsonLike(String value) {
            addCriterion("literature_id_json like", value, "literatureIdJson");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdJsonNotLike(String value) {
            addCriterion("literature_id_json not like", value, "literatureIdJson");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdJsonIn(List<String> values) {
            addCriterion("literature_id_json in", values, "literatureIdJson");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdJsonNotIn(List<String> values) {
            addCriterion("literature_id_json not in", values, "literatureIdJson");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdJsonBetween(String value1, String value2) {
            addCriterion("literature_id_json between", value1, value2, "literatureIdJson");
            return (Criteria) this;
        }

        public Criteria andLiteratureIdJsonNotBetween(String value1, String value2) {
            addCriterion("literature_id_json not between", value1, value2, "literatureIdJson");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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