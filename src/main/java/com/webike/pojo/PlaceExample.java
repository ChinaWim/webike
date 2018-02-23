package com.webike.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlaceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlaceExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPAddressIsNull() {
            addCriterion("p_address is null");
            return (Criteria) this;
        }

        public Criteria andPAddressIsNotNull() {
            addCriterion("p_address is not null");
            return (Criteria) this;
        }

        public Criteria andPAddressEqualTo(String value) {
            addCriterion("p_address =", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotEqualTo(String value) {
            addCriterion("p_address <>", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressGreaterThan(String value) {
            addCriterion("p_address >", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressGreaterThanOrEqualTo(String value) {
            addCriterion("p_address >=", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLessThan(String value) {
            addCriterion("p_address <", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLessThanOrEqualTo(String value) {
            addCriterion("p_address <=", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLike(String value) {
            addCriterion("p_address like", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotLike(String value) {
            addCriterion("p_address not like", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressIn(List<String> values) {
            addCriterion("p_address in", values, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotIn(List<String> values) {
            addCriterion("p_address not in", values, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressBetween(String value1, String value2) {
            addCriterion("p_address between", value1, value2, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotBetween(String value1, String value2) {
            addCriterion("p_address not between", value1, value2, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPPhoneIsNull() {
            addCriterion("p_phone is null");
            return (Criteria) this;
        }

        public Criteria andPPhoneIsNotNull() {
            addCriterion("p_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPPhoneEqualTo(String value) {
            addCriterion("p_phone =", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneNotEqualTo(String value) {
            addCriterion("p_phone <>", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneGreaterThan(String value) {
            addCriterion("p_phone >", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("p_phone >=", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneLessThan(String value) {
            addCriterion("p_phone <", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneLessThanOrEqualTo(String value) {
            addCriterion("p_phone <=", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneLike(String value) {
            addCriterion("p_phone like", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneNotLike(String value) {
            addCriterion("p_phone not like", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneIn(List<String> values) {
            addCriterion("p_phone in", values, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneNotIn(List<String> values) {
            addCriterion("p_phone not in", values, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneBetween(String value1, String value2) {
            addCriterion("p_phone between", value1, value2, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneNotBetween(String value1, String value2) {
            addCriterion("p_phone not between", value1, value2, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeIsNull() {
            addCriterion("p_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeIsNotNull() {
            addCriterion("p_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeEqualTo(Date value) {
            addCriterion("p_create_time =", value, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeNotEqualTo(Date value) {
            addCriterion("p_create_time <>", value, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeGreaterThan(Date value) {
            addCriterion("p_create_time >", value, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("p_create_time >=", value, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeLessThan(Date value) {
            addCriterion("p_create_time <", value, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("p_create_time <=", value, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeIn(List<Date> values) {
            addCriterion("p_create_time in", values, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeNotIn(List<Date> values) {
            addCriterion("p_create_time not in", values, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeBetween(Date value1, Date value2) {
            addCriterion("p_create_time between", value1, value2, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("p_create_time not between", value1, value2, "pCreateTime");
            return (Criteria) this;
        }

        public Criteria andPUpdateTimeIsNull() {
            addCriterion("p_update_time is null");
            return (Criteria) this;
        }

        public Criteria andPUpdateTimeIsNotNull() {
            addCriterion("p_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andPUpdateTimeEqualTo(Date value) {
            addCriterion("p_update_time =", value, "pUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPUpdateTimeNotEqualTo(Date value) {
            addCriterion("p_update_time <>", value, "pUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPUpdateTimeGreaterThan(Date value) {
            addCriterion("p_update_time >", value, "pUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("p_update_time >=", value, "pUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPUpdateTimeLessThan(Date value) {
            addCriterion("p_update_time <", value, "pUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("p_update_time <=", value, "pUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPUpdateTimeIn(List<Date> values) {
            addCriterion("p_update_time in", values, "pUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPUpdateTimeNotIn(List<Date> values) {
            addCriterion("p_update_time not in", values, "pUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("p_update_time between", value1, value2, "pUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("p_update_time not between", value1, value2, "pUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPCommentIsNull() {
            addCriterion("p_comment is null");
            return (Criteria) this;
        }

        public Criteria andPCommentIsNotNull() {
            addCriterion("p_comment is not null");
            return (Criteria) this;
        }

        public Criteria andPCommentEqualTo(String value) {
            addCriterion("p_comment =", value, "pComment");
            return (Criteria) this;
        }

        public Criteria andPCommentNotEqualTo(String value) {
            addCriterion("p_comment <>", value, "pComment");
            return (Criteria) this;
        }

        public Criteria andPCommentGreaterThan(String value) {
            addCriterion("p_comment >", value, "pComment");
            return (Criteria) this;
        }

        public Criteria andPCommentGreaterThanOrEqualTo(String value) {
            addCriterion("p_comment >=", value, "pComment");
            return (Criteria) this;
        }

        public Criteria andPCommentLessThan(String value) {
            addCriterion("p_comment <", value, "pComment");
            return (Criteria) this;
        }

        public Criteria andPCommentLessThanOrEqualTo(String value) {
            addCriterion("p_comment <=", value, "pComment");
            return (Criteria) this;
        }

        public Criteria andPCommentLike(String value) {
            addCriterion("p_comment like", value, "pComment");
            return (Criteria) this;
        }

        public Criteria andPCommentNotLike(String value) {
            addCriterion("p_comment not like", value, "pComment");
            return (Criteria) this;
        }

        public Criteria andPCommentIn(List<String> values) {
            addCriterion("p_comment in", values, "pComment");
            return (Criteria) this;
        }

        public Criteria andPCommentNotIn(List<String> values) {
            addCriterion("p_comment not in", values, "pComment");
            return (Criteria) this;
        }

        public Criteria andPCommentBetween(String value1, String value2) {
            addCriterion("p_comment between", value1, value2, "pComment");
            return (Criteria) this;
        }

        public Criteria andPCommentNotBetween(String value1, String value2) {
            addCriterion("p_comment not between", value1, value2, "pComment");
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