package com.webike.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCRemainIsNull() {
            addCriterion("c_remain is null");
            return (Criteria) this;
        }

        public Criteria andCRemainIsNotNull() {
            addCriterion("c_remain is not null");
            return (Criteria) this;
        }

        public Criteria andCRemainEqualTo(Integer value) {
            addCriterion("c_remain =", value, "cRemain");
            return (Criteria) this;
        }

        public Criteria andCRemainNotEqualTo(Integer value) {
            addCriterion("c_remain <>", value, "cRemain");
            return (Criteria) this;
        }

        public Criteria andCRemainGreaterThan(Integer value) {
            addCriterion("c_remain >", value, "cRemain");
            return (Criteria) this;
        }

        public Criteria andCRemainGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_remain >=", value, "cRemain");
            return (Criteria) this;
        }

        public Criteria andCRemainLessThan(Integer value) {
            addCriterion("c_remain <", value, "cRemain");
            return (Criteria) this;
        }

        public Criteria andCRemainLessThanOrEqualTo(Integer value) {
            addCriterion("c_remain <=", value, "cRemain");
            return (Criteria) this;
        }

        public Criteria andCRemainIn(List<Integer> values) {
            addCriterion("c_remain in", values, "cRemain");
            return (Criteria) this;
        }

        public Criteria andCRemainNotIn(List<Integer> values) {
            addCriterion("c_remain not in", values, "cRemain");
            return (Criteria) this;
        }

        public Criteria andCRemainBetween(Integer value1, Integer value2) {
            addCriterion("c_remain between", value1, value2, "cRemain");
            return (Criteria) this;
        }

        public Criteria andCRemainNotBetween(Integer value1, Integer value2) {
            addCriterion("c_remain not between", value1, value2, "cRemain");
            return (Criteria) this;
        }

        public Criteria andCRentIsNull() {
            addCriterion("c_rent is null");
            return (Criteria) this;
        }

        public Criteria andCRentIsNotNull() {
            addCriterion("c_rent is not null");
            return (Criteria) this;
        }

        public Criteria andCRentEqualTo(Float value) {
            addCriterion("c_rent =", value, "cRent");
            return (Criteria) this;
        }

        public Criteria andCRentNotEqualTo(Float value) {
            addCriterion("c_rent <>", value, "cRent");
            return (Criteria) this;
        }

        public Criteria andCRentGreaterThan(Float value) {
            addCriterion("c_rent >", value, "cRent");
            return (Criteria) this;
        }

        public Criteria andCRentGreaterThanOrEqualTo(Float value) {
            addCriterion("c_rent >=", value, "cRent");
            return (Criteria) this;
        }

        public Criteria andCRentLessThan(Float value) {
            addCriterion("c_rent <", value, "cRent");
            return (Criteria) this;
        }

        public Criteria andCRentLessThanOrEqualTo(Float value) {
            addCriterion("c_rent <=", value, "cRent");
            return (Criteria) this;
        }

        public Criteria andCRentIn(List<Float> values) {
            addCriterion("c_rent in", values, "cRent");
            return (Criteria) this;
        }

        public Criteria andCRentNotIn(List<Float> values) {
            addCriterion("c_rent not in", values, "cRent");
            return (Criteria) this;
        }

        public Criteria andCRentBetween(Float value1, Float value2) {
            addCriterion("c_rent between", value1, value2, "cRent");
            return (Criteria) this;
        }

        public Criteria andCRentNotBetween(Float value1, Float value2) {
            addCriterion("c_rent not between", value1, value2, "cRent");
            return (Criteria) this;
        }

        public Criteria andCCashIsNull() {
            addCriterion("c_cash is null");
            return (Criteria) this;
        }

        public Criteria andCCashIsNotNull() {
            addCriterion("c_cash is not null");
            return (Criteria) this;
        }

        public Criteria andCCashEqualTo(Float value) {
            addCriterion("c_cash =", value, "cCash");
            return (Criteria) this;
        }

        public Criteria andCCashNotEqualTo(Float value) {
            addCriterion("c_cash <>", value, "cCash");
            return (Criteria) this;
        }

        public Criteria andCCashGreaterThan(Float value) {
            addCriterion("c_cash >", value, "cCash");
            return (Criteria) this;
        }

        public Criteria andCCashGreaterThanOrEqualTo(Float value) {
            addCriterion("c_cash >=", value, "cCash");
            return (Criteria) this;
        }

        public Criteria andCCashLessThan(Float value) {
            addCriterion("c_cash <", value, "cCash");
            return (Criteria) this;
        }

        public Criteria andCCashLessThanOrEqualTo(Float value) {
            addCriterion("c_cash <=", value, "cCash");
            return (Criteria) this;
        }

        public Criteria andCCashIn(List<Float> values) {
            addCriterion("c_cash in", values, "cCash");
            return (Criteria) this;
        }

        public Criteria andCCashNotIn(List<Float> values) {
            addCriterion("c_cash not in", values, "cCash");
            return (Criteria) this;
        }

        public Criteria andCCashBetween(Float value1, Float value2) {
            addCriterion("c_cash between", value1, value2, "cCash");
            return (Criteria) this;
        }

        public Criteria andCCashNotBetween(Float value1, Float value2) {
            addCriterion("c_cash not between", value1, value2, "cCash");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIsNull() {
            addCriterion("c_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIsNotNull() {
            addCriterion("c_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeEqualTo(Date value) {
            addCriterion("c_create_time =", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotEqualTo(Date value) {
            addCriterion("c_create_time <>", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeGreaterThan(Date value) {
            addCriterion("c_create_time >", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_create_time >=", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeLessThan(Date value) {
            addCriterion("c_create_time <", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("c_create_time <=", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIn(List<Date> values) {
            addCriterion("c_create_time in", values, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotIn(List<Date> values) {
            addCriterion("c_create_time not in", values, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeBetween(Date value1, Date value2) {
            addCriterion("c_create_time between", value1, value2, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("c_create_time not between", value1, value2, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeIsNull() {
            addCriterion("c_update_time is null");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeIsNotNull() {
            addCriterion("c_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeEqualTo(Date value) {
            addCriterion("c_update_time =", value, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeNotEqualTo(Date value) {
            addCriterion("c_update_time <>", value, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeGreaterThan(Date value) {
            addCriterion("c_update_time >", value, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_update_time >=", value, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeLessThan(Date value) {
            addCriterion("c_update_time <", value, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("c_update_time <=", value, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeIn(List<Date> values) {
            addCriterion("c_update_time in", values, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeNotIn(List<Date> values) {
            addCriterion("c_update_time not in", values, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("c_update_time between", value1, value2, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("c_update_time not between", value1, value2, "cUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCCommentIsNull() {
            addCriterion("c_comment is null");
            return (Criteria) this;
        }

        public Criteria andCCommentIsNotNull() {
            addCriterion("c_comment is not null");
            return (Criteria) this;
        }

        public Criteria andCCommentEqualTo(String value) {
            addCriterion("c_comment =", value, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentNotEqualTo(String value) {
            addCriterion("c_comment <>", value, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentGreaterThan(String value) {
            addCriterion("c_comment >", value, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentGreaterThanOrEqualTo(String value) {
            addCriterion("c_comment >=", value, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentLessThan(String value) {
            addCriterion("c_comment <", value, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentLessThanOrEqualTo(String value) {
            addCriterion("c_comment <=", value, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentLike(String value) {
            addCriterion("c_comment like", value, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentNotLike(String value) {
            addCriterion("c_comment not like", value, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentIn(List<String> values) {
            addCriterion("c_comment in", values, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentNotIn(List<String> values) {
            addCriterion("c_comment not in", values, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentBetween(String value1, String value2) {
            addCriterion("c_comment between", value1, value2, "cComment");
            return (Criteria) this;
        }

        public Criteria andCCommentNotBetween(String value1, String value2) {
            addCriterion("c_comment not between", value1, value2, "cComment");
            return (Criteria) this;
        }

        public Criteria andCPriceIsNull() {
            addCriterion("c_price is null");
            return (Criteria) this;
        }

        public Criteria andCPriceIsNotNull() {
            addCriterion("c_price is not null");
            return (Criteria) this;
        }

        public Criteria andCPriceEqualTo(Float value) {
            addCriterion("c_price =", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotEqualTo(Float value) {
            addCriterion("c_price <>", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceGreaterThan(Float value) {
            addCriterion("c_price >", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("c_price >=", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceLessThan(Float value) {
            addCriterion("c_price <", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceLessThanOrEqualTo(Float value) {
            addCriterion("c_price <=", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceIn(List<Float> values) {
            addCriterion("c_price in", values, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotIn(List<Float> values) {
            addCriterion("c_price not in", values, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceBetween(Float value1, Float value2) {
            addCriterion("c_price between", value1, value2, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotBetween(Float value1, Float value2) {
            addCriterion("c_price not between", value1, value2, "cPrice");
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