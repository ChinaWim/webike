package com.webike.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BikeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BikeExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBNameIsNull() {
            addCriterion("b_name is null");
            return (Criteria) this;
        }

        public Criteria andBNameIsNotNull() {
            addCriterion("b_name is not null");
            return (Criteria) this;
        }

        public Criteria andBNameEqualTo(String value) {
            addCriterion("b_name =", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotEqualTo(String value) {
            addCriterion("b_name <>", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameGreaterThan(String value) {
            addCriterion("b_name >", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameGreaterThanOrEqualTo(String value) {
            addCriterion("b_name >=", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLessThan(String value) {
            addCriterion("b_name <", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLessThanOrEqualTo(String value) {
            addCriterion("b_name <=", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLike(String value) {
            addCriterion("b_name like", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotLike(String value) {
            addCriterion("b_name not like", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameIn(List<String> values) {
            addCriterion("b_name in", values, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotIn(List<String> values) {
            addCriterion("b_name not in", values, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameBetween(String value1, String value2) {
            addCriterion("b_name between", value1, value2, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotBetween(String value1, String value2) {
            addCriterion("b_name not between", value1, value2, "bName");
            return (Criteria) this;
        }

        public Criteria andBIconIsNull() {
            addCriterion("b_icon is null");
            return (Criteria) this;
        }

        public Criteria andBIconIsNotNull() {
            addCriterion("b_icon is not null");
            return (Criteria) this;
        }

        public Criteria andBIconEqualTo(String value) {
            addCriterion("b_icon =", value, "bIcon");
            return (Criteria) this;
        }

        public Criteria andBIconNotEqualTo(String value) {
            addCriterion("b_icon <>", value, "bIcon");
            return (Criteria) this;
        }

        public Criteria andBIconGreaterThan(String value) {
            addCriterion("b_icon >", value, "bIcon");
            return (Criteria) this;
        }

        public Criteria andBIconGreaterThanOrEqualTo(String value) {
            addCriterion("b_icon >=", value, "bIcon");
            return (Criteria) this;
        }

        public Criteria andBIconLessThan(String value) {
            addCriterion("b_icon <", value, "bIcon");
            return (Criteria) this;
        }

        public Criteria andBIconLessThanOrEqualTo(String value) {
            addCriterion("b_icon <=", value, "bIcon");
            return (Criteria) this;
        }

        public Criteria andBIconLike(String value) {
            addCriterion("b_icon like", value, "bIcon");
            return (Criteria) this;
        }

        public Criteria andBIconNotLike(String value) {
            addCriterion("b_icon not like", value, "bIcon");
            return (Criteria) this;
        }

        public Criteria andBIconIn(List<String> values) {
            addCriterion("b_icon in", values, "bIcon");
            return (Criteria) this;
        }

        public Criteria andBIconNotIn(List<String> values) {
            addCriterion("b_icon not in", values, "bIcon");
            return (Criteria) this;
        }

        public Criteria andBIconBetween(String value1, String value2) {
            addCriterion("b_icon between", value1, value2, "bIcon");
            return (Criteria) this;
        }

        public Criteria andBIconNotBetween(String value1, String value2) {
            addCriterion("b_icon not between", value1, value2, "bIcon");
            return (Criteria) this;
        }

        public Criteria andBCidIsNull() {
            addCriterion("b_cid is null");
            return (Criteria) this;
        }

        public Criteria andBCidIsNotNull() {
            addCriterion("b_cid is not null");
            return (Criteria) this;
        }

        public Criteria andBCidEqualTo(Integer value) {
            addCriterion("b_cid =", value, "bCid");
            return (Criteria) this;
        }

        public Criteria andBCidNotEqualTo(Integer value) {
            addCriterion("b_cid <>", value, "bCid");
            return (Criteria) this;
        }

        public Criteria andBCidGreaterThan(Integer value) {
            addCriterion("b_cid >", value, "bCid");
            return (Criteria) this;
        }

        public Criteria andBCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_cid >=", value, "bCid");
            return (Criteria) this;
        }

        public Criteria andBCidLessThan(Integer value) {
            addCriterion("b_cid <", value, "bCid");
            return (Criteria) this;
        }

        public Criteria andBCidLessThanOrEqualTo(Integer value) {
            addCriterion("b_cid <=", value, "bCid");
            return (Criteria) this;
        }

        public Criteria andBCidIn(List<Integer> values) {
            addCriterion("b_cid in", values, "bCid");
            return (Criteria) this;
        }

        public Criteria andBCidNotIn(List<Integer> values) {
            addCriterion("b_cid not in", values, "bCid");
            return (Criteria) this;
        }

        public Criteria andBCidBetween(Integer value1, Integer value2) {
            addCriterion("b_cid between", value1, value2, "bCid");
            return (Criteria) this;
        }

        public Criteria andBCidNotBetween(Integer value1, Integer value2) {
            addCriterion("b_cid not between", value1, value2, "bCid");
            return (Criteria) this;
        }

        public Criteria andBInTimeIsNull() {
            addCriterion("b_in_time is null");
            return (Criteria) this;
        }

        public Criteria andBInTimeIsNotNull() {
            addCriterion("b_in_time is not null");
            return (Criteria) this;
        }

        public Criteria andBInTimeEqualTo(String value) {
            addCriterion("b_in_time =", value, "bInTime");
            return (Criteria) this;
        }

        public Criteria andBInTimeNotEqualTo(String value) {
            addCriterion("b_in_time <>", value, "bInTime");
            return (Criteria) this;
        }

        public Criteria andBInTimeGreaterThan(String value) {
            addCriterion("b_in_time >", value, "bInTime");
            return (Criteria) this;
        }

        public Criteria andBInTimeGreaterThanOrEqualTo(String value) {
            addCriterion("b_in_time >=", value, "bInTime");
            return (Criteria) this;
        }

        public Criteria andBInTimeLessThan(String value) {
            addCriterion("b_in_time <", value, "bInTime");
            return (Criteria) this;
        }

        public Criteria andBInTimeLessThanOrEqualTo(String value) {
            addCriterion("b_in_time <=", value, "bInTime");
            return (Criteria) this;
        }

        public Criteria andBInTimeLike(String value) {
            addCriterion("b_in_time like", value, "bInTime");
            return (Criteria) this;
        }

        public Criteria andBInTimeNotLike(String value) {
            addCriterion("b_in_time not like", value, "bInTime");
            return (Criteria) this;
        }

        public Criteria andBInTimeIn(List<String> values) {
            addCriterion("b_in_time in", values, "bInTime");
            return (Criteria) this;
        }

        public Criteria andBInTimeNotIn(List<String> values) {
            addCriterion("b_in_time not in", values, "bInTime");
            return (Criteria) this;
        }

        public Criteria andBInTimeBetween(String value1, String value2) {
            addCriterion("b_in_time between", value1, value2, "bInTime");
            return (Criteria) this;
        }

        public Criteria andBInTimeNotBetween(String value1, String value2) {
            addCriterion("b_in_time not between", value1, value2, "bInTime");
            return (Criteria) this;
        }

        public Criteria andBStateIsNull() {
            addCriterion("b_state is null");
            return (Criteria) this;
        }

        public Criteria andBStateIsNotNull() {
            addCriterion("b_state is not null");
            return (Criteria) this;
        }

        public Criteria andBStateEqualTo(String value) {
            addCriterion("b_state =", value, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateNotEqualTo(String value) {
            addCriterion("b_state <>", value, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateGreaterThan(String value) {
            addCriterion("b_state >", value, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateGreaterThanOrEqualTo(String value) {
            addCriterion("b_state >=", value, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateLessThan(String value) {
            addCriterion("b_state <", value, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateLessThanOrEqualTo(String value) {
            addCriterion("b_state <=", value, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateLike(String value) {
            addCriterion("b_state like", value, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateNotLike(String value) {
            addCriterion("b_state not like", value, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateIn(List<String> values) {
            addCriterion("b_state in", values, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateNotIn(List<String> values) {
            addCriterion("b_state not in", values, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateBetween(String value1, String value2) {
            addCriterion("b_state between", value1, value2, "bState");
            return (Criteria) this;
        }

        public Criteria andBStateNotBetween(String value1, String value2) {
            addCriterion("b_state not between", value1, value2, "bState");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeIsNull() {
            addCriterion("b_create_time is null");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeIsNotNull() {
            addCriterion("b_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeEqualTo(Date value) {
            addCriterion("b_create_time =", value, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeNotEqualTo(Date value) {
            addCriterion("b_create_time <>", value, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeGreaterThan(Date value) {
            addCriterion("b_create_time >", value, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("b_create_time >=", value, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeLessThan(Date value) {
            addCriterion("b_create_time <", value, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("b_create_time <=", value, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeIn(List<Date> values) {
            addCriterion("b_create_time in", values, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeNotIn(List<Date> values) {
            addCriterion("b_create_time not in", values, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeBetween(Date value1, Date value2) {
            addCriterion("b_create_time between", value1, value2, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("b_create_time not between", value1, value2, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeIsNull() {
            addCriterion("b_update_time is null");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeIsNotNull() {
            addCriterion("b_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeEqualTo(Date value) {
            addCriterion("b_update_time =", value, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeNotEqualTo(Date value) {
            addCriterion("b_update_time <>", value, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeGreaterThan(Date value) {
            addCriterion("b_update_time >", value, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("b_update_time >=", value, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeLessThan(Date value) {
            addCriterion("b_update_time <", value, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("b_update_time <=", value, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeIn(List<Date> values) {
            addCriterion("b_update_time in", values, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeNotIn(List<Date> values) {
            addCriterion("b_update_time not in", values, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("b_update_time between", value1, value2, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("b_update_time not between", value1, value2, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBCommentIsNull() {
            addCriterion("b_comment is null");
            return (Criteria) this;
        }

        public Criteria andBCommentIsNotNull() {
            addCriterion("b_comment is not null");
            return (Criteria) this;
        }

        public Criteria andBCommentEqualTo(String value) {
            addCriterion("b_comment =", value, "bComment");
            return (Criteria) this;
        }

        public Criteria andBCommentNotEqualTo(String value) {
            addCriterion("b_comment <>", value, "bComment");
            return (Criteria) this;
        }

        public Criteria andBCommentGreaterThan(String value) {
            addCriterion("b_comment >", value, "bComment");
            return (Criteria) this;
        }

        public Criteria andBCommentGreaterThanOrEqualTo(String value) {
            addCriterion("b_comment >=", value, "bComment");
            return (Criteria) this;
        }

        public Criteria andBCommentLessThan(String value) {
            addCriterion("b_comment <", value, "bComment");
            return (Criteria) this;
        }

        public Criteria andBCommentLessThanOrEqualTo(String value) {
            addCriterion("b_comment <=", value, "bComment");
            return (Criteria) this;
        }

        public Criteria andBCommentLike(String value) {
            addCriterion("b_comment like", value, "bComment");
            return (Criteria) this;
        }

        public Criteria andBCommentNotLike(String value) {
            addCriterion("b_comment not like", value, "bComment");
            return (Criteria) this;
        }

        public Criteria andBCommentIn(List<String> values) {
            addCriterion("b_comment in", values, "bComment");
            return (Criteria) this;
        }

        public Criteria andBCommentNotIn(List<String> values) {
            addCriterion("b_comment not in", values, "bComment");
            return (Criteria) this;
        }

        public Criteria andBCommentBetween(String value1, String value2) {
            addCriterion("b_comment between", value1, value2, "bComment");
            return (Criteria) this;
        }

        public Criteria andBCommentNotBetween(String value1, String value2) {
            addCriterion("b_comment not between", value1, value2, "bComment");
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