package com.webike.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOSnoIsNull() {
            addCriterion("o_sno is null");
            return (Criteria) this;
        }

        public Criteria andOSnoIsNotNull() {
            addCriterion("o_sno is not null");
            return (Criteria) this;
        }

        public Criteria andOSnoEqualTo(String value) {
            addCriterion("o_sno =", value, "oSno");
            return (Criteria) this;
        }

        public Criteria andOSnoNotEqualTo(String value) {
            addCriterion("o_sno <>", value, "oSno");
            return (Criteria) this;
        }

        public Criteria andOSnoGreaterThan(String value) {
            addCriterion("o_sno >", value, "oSno");
            return (Criteria) this;
        }

        public Criteria andOSnoGreaterThanOrEqualTo(String value) {
            addCriterion("o_sno >=", value, "oSno");
            return (Criteria) this;
        }

        public Criteria andOSnoLessThan(String value) {
            addCriterion("o_sno <", value, "oSno");
            return (Criteria) this;
        }

        public Criteria andOSnoLessThanOrEqualTo(String value) {
            addCriterion("o_sno <=", value, "oSno");
            return (Criteria) this;
        }

        public Criteria andOSnoLike(String value) {
            addCriterion("o_sno like", value, "oSno");
            return (Criteria) this;
        }

        public Criteria andOSnoNotLike(String value) {
            addCriterion("o_sno not like", value, "oSno");
            return (Criteria) this;
        }

        public Criteria andOSnoIn(List<String> values) {
            addCriterion("o_sno in", values, "oSno");
            return (Criteria) this;
        }

        public Criteria andOSnoNotIn(List<String> values) {
            addCriterion("o_sno not in", values, "oSno");
            return (Criteria) this;
        }

        public Criteria andOSnoBetween(String value1, String value2) {
            addCriterion("o_sno between", value1, value2, "oSno");
            return (Criteria) this;
        }

        public Criteria andOSnoNotBetween(String value1, String value2) {
            addCriterion("o_sno not between", value1, value2, "oSno");
            return (Criteria) this;
        }

        public Criteria andOBidIsNull() {
            addCriterion("o_bid is null");
            return (Criteria) this;
        }

        public Criteria andOBidIsNotNull() {
            addCriterion("o_bid is not null");
            return (Criteria) this;
        }

        public Criteria andOBidEqualTo(Integer value) {
            addCriterion("o_bid =", value, "oBid");
            return (Criteria) this;
        }

        public Criteria andOBidNotEqualTo(Integer value) {
            addCriterion("o_bid <>", value, "oBid");
            return (Criteria) this;
        }

        public Criteria andOBidGreaterThan(Integer value) {
            addCriterion("o_bid >", value, "oBid");
            return (Criteria) this;
        }

        public Criteria andOBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_bid >=", value, "oBid");
            return (Criteria) this;
        }

        public Criteria andOBidLessThan(Integer value) {
            addCriterion("o_bid <", value, "oBid");
            return (Criteria) this;
        }

        public Criteria andOBidLessThanOrEqualTo(Integer value) {
            addCriterion("o_bid <=", value, "oBid");
            return (Criteria) this;
        }

        public Criteria andOBidIn(List<Integer> values) {
            addCriterion("o_bid in", values, "oBid");
            return (Criteria) this;
        }

        public Criteria andOBidNotIn(List<Integer> values) {
            addCriterion("o_bid not in", values, "oBid");
            return (Criteria) this;
        }

        public Criteria andOBidBetween(Integer value1, Integer value2) {
            addCriterion("o_bid between", value1, value2, "oBid");
            return (Criteria) this;
        }

        public Criteria andOBidNotBetween(Integer value1, Integer value2) {
            addCriterion("o_bid not between", value1, value2, "oBid");
            return (Criteria) this;
        }

        public Criteria andOBorrowTimeIsNull() {
            addCriterion("o_borrow_time is null");
            return (Criteria) this;
        }

        public Criteria andOBorrowTimeIsNotNull() {
            addCriterion("o_borrow_time is not null");
            return (Criteria) this;
        }

        public Criteria andOBorrowTimeEqualTo(String value) {
            addCriterion("o_borrow_time =", value, "oBorrowTime");
            return (Criteria) this;
        }

        public Criteria andOBorrowTimeNotEqualTo(String value) {
            addCriterion("o_borrow_time <>", value, "oBorrowTime");
            return (Criteria) this;
        }

        public Criteria andOBorrowTimeGreaterThan(String value) {
            addCriterion("o_borrow_time >", value, "oBorrowTime");
            return (Criteria) this;
        }

        public Criteria andOBorrowTimeGreaterThanOrEqualTo(String value) {
            addCriterion("o_borrow_time >=", value, "oBorrowTime");
            return (Criteria) this;
        }

        public Criteria andOBorrowTimeLessThan(String value) {
            addCriterion("o_borrow_time <", value, "oBorrowTime");
            return (Criteria) this;
        }

        public Criteria andOBorrowTimeLessThanOrEqualTo(String value) {
            addCriterion("o_borrow_time <=", value, "oBorrowTime");
            return (Criteria) this;
        }

        public Criteria andOBorrowTimeLike(String value) {
            addCriterion("o_borrow_time like", value, "oBorrowTime");
            return (Criteria) this;
        }

        public Criteria andOBorrowTimeNotLike(String value) {
            addCriterion("o_borrow_time not like", value, "oBorrowTime");
            return (Criteria) this;
        }

        public Criteria andOBorrowTimeIn(List<String> values) {
            addCriterion("o_borrow_time in", values, "oBorrowTime");
            return (Criteria) this;
        }

        public Criteria andOBorrowTimeNotIn(List<String> values) {
            addCriterion("o_borrow_time not in", values, "oBorrowTime");
            return (Criteria) this;
        }

        public Criteria andOBorrowTimeBetween(String value1, String value2) {
            addCriterion("o_borrow_time between", value1, value2, "oBorrowTime");
            return (Criteria) this;
        }

        public Criteria andOBorrowTimeNotBetween(String value1, String value2) {
            addCriterion("o_borrow_time not between", value1, value2, "oBorrowTime");
            return (Criteria) this;
        }

        public Criteria andOReturnTimeIsNull() {
            addCriterion("o_return_time is null");
            return (Criteria) this;
        }

        public Criteria andOReturnTimeIsNotNull() {
            addCriterion("o_return_time is not null");
            return (Criteria) this;
        }

        public Criteria andOReturnTimeEqualTo(String value) {
            addCriterion("o_return_time =", value, "oReturnTime");
            return (Criteria) this;
        }

        public Criteria andOReturnTimeNotEqualTo(String value) {
            addCriterion("o_return_time <>", value, "oReturnTime");
            return (Criteria) this;
        }

        public Criteria andOReturnTimeGreaterThan(String value) {
            addCriterion("o_return_time >", value, "oReturnTime");
            return (Criteria) this;
        }

        public Criteria andOReturnTimeGreaterThanOrEqualTo(String value) {
            addCriterion("o_return_time >=", value, "oReturnTime");
            return (Criteria) this;
        }

        public Criteria andOReturnTimeLessThan(String value) {
            addCriterion("o_return_time <", value, "oReturnTime");
            return (Criteria) this;
        }

        public Criteria andOReturnTimeLessThanOrEqualTo(String value) {
            addCriterion("o_return_time <=", value, "oReturnTime");
            return (Criteria) this;
        }

        public Criteria andOReturnTimeLike(String value) {
            addCriterion("o_return_time like", value, "oReturnTime");
            return (Criteria) this;
        }

        public Criteria andOReturnTimeNotLike(String value) {
            addCriterion("o_return_time not like", value, "oReturnTime");
            return (Criteria) this;
        }

        public Criteria andOReturnTimeIn(List<String> values) {
            addCriterion("o_return_time in", values, "oReturnTime");
            return (Criteria) this;
        }

        public Criteria andOReturnTimeNotIn(List<String> values) {
            addCriterion("o_return_time not in", values, "oReturnTime");
            return (Criteria) this;
        }

        public Criteria andOReturnTimeBetween(String value1, String value2) {
            addCriterion("o_return_time between", value1, value2, "oReturnTime");
            return (Criteria) this;
        }

        public Criteria andOReturnTimeNotBetween(String value1, String value2) {
            addCriterion("o_return_time not between", value1, value2, "oReturnTime");
            return (Criteria) this;
        }

        public Criteria andORealRentIsNull() {
            addCriterion("o_real_rent is null");
            return (Criteria) this;
        }

        public Criteria andORealRentIsNotNull() {
            addCriterion("o_real_rent is not null");
            return (Criteria) this;
        }

        public Criteria andORealRentEqualTo(Float value) {
            addCriterion("o_real_rent =", value, "oRealRent");
            return (Criteria) this;
        }

        public Criteria andORealRentNotEqualTo(Float value) {
            addCriterion("o_real_rent <>", value, "oRealRent");
            return (Criteria) this;
        }

        public Criteria andORealRentGreaterThan(Float value) {
            addCriterion("o_real_rent >", value, "oRealRent");
            return (Criteria) this;
        }

        public Criteria andORealRentGreaterThanOrEqualTo(Float value) {
            addCriterion("o_real_rent >=", value, "oRealRent");
            return (Criteria) this;
        }

        public Criteria andORealRentLessThan(Float value) {
            addCriterion("o_real_rent <", value, "oRealRent");
            return (Criteria) this;
        }

        public Criteria andORealRentLessThanOrEqualTo(Float value) {
            addCriterion("o_real_rent <=", value, "oRealRent");
            return (Criteria) this;
        }

        public Criteria andORealRentIn(List<Float> values) {
            addCriterion("o_real_rent in", values, "oRealRent");
            return (Criteria) this;
        }

        public Criteria andORealRentNotIn(List<Float> values) {
            addCriterion("o_real_rent not in", values, "oRealRent");
            return (Criteria) this;
        }

        public Criteria andORealRentBetween(Float value1, Float value2) {
            addCriterion("o_real_rent between", value1, value2, "oRealRent");
            return (Criteria) this;
        }

        public Criteria andORealRentNotBetween(Float value1, Float value2) {
            addCriterion("o_real_rent not between", value1, value2, "oRealRent");
            return (Criteria) this;
        }

        public Criteria andOCashIsNull() {
            addCriterion("o_cash is null");
            return (Criteria) this;
        }

        public Criteria andOCashIsNotNull() {
            addCriterion("o_cash is not null");
            return (Criteria) this;
        }

        public Criteria andOCashEqualTo(Float value) {
            addCriterion("o_cash =", value, "oCash");
            return (Criteria) this;
        }

        public Criteria andOCashNotEqualTo(Float value) {
            addCriterion("o_cash <>", value, "oCash");
            return (Criteria) this;
        }

        public Criteria andOCashGreaterThan(Float value) {
            addCriterion("o_cash >", value, "oCash");
            return (Criteria) this;
        }

        public Criteria andOCashGreaterThanOrEqualTo(Float value) {
            addCriterion("o_cash >=", value, "oCash");
            return (Criteria) this;
        }

        public Criteria andOCashLessThan(Float value) {
            addCriterion("o_cash <", value, "oCash");
            return (Criteria) this;
        }

        public Criteria andOCashLessThanOrEqualTo(Float value) {
            addCriterion("o_cash <=", value, "oCash");
            return (Criteria) this;
        }

        public Criteria andOCashIn(List<Float> values) {
            addCriterion("o_cash in", values, "oCash");
            return (Criteria) this;
        }

        public Criteria andOCashNotIn(List<Float> values) {
            addCriterion("o_cash not in", values, "oCash");
            return (Criteria) this;
        }

        public Criteria andOCashBetween(Float value1, Float value2) {
            addCriterion("o_cash between", value1, value2, "oCash");
            return (Criteria) this;
        }

        public Criteria andOCashNotBetween(Float value1, Float value2) {
            addCriterion("o_cash not between", value1, value2, "oCash");
            return (Criteria) this;
        }

        public Criteria andOStateIsNull() {
            addCriterion("o_state is null");
            return (Criteria) this;
        }

        public Criteria andOStateIsNotNull() {
            addCriterion("o_state is not null");
            return (Criteria) this;
        }

        public Criteria andOStateEqualTo(String value) {
            addCriterion("o_state =", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotEqualTo(String value) {
            addCriterion("o_state <>", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateGreaterThan(String value) {
            addCriterion("o_state >", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateGreaterThanOrEqualTo(String value) {
            addCriterion("o_state >=", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateLessThan(String value) {
            addCriterion("o_state <", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateLessThanOrEqualTo(String value) {
            addCriterion("o_state <=", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateLike(String value) {
            addCriterion("o_state like", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotLike(String value) {
            addCriterion("o_state not like", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateIn(List<String> values) {
            addCriterion("o_state in", values, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotIn(List<String> values) {
            addCriterion("o_state not in", values, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateBetween(String value1, String value2) {
            addCriterion("o_state between", value1, value2, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotBetween(String value1, String value2) {
            addCriterion("o_state not between", value1, value2, "oState");
            return (Criteria) this;
        }

        public Criteria andOCreateTimeIsNull() {
            addCriterion("o_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOCreateTimeIsNotNull() {
            addCriterion("o_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOCreateTimeEqualTo(Date value) {
            addCriterion("o_create_time =", value, "oCreateTime");
            return (Criteria) this;
        }

        public Criteria andOCreateTimeNotEqualTo(Date value) {
            addCriterion("o_create_time <>", value, "oCreateTime");
            return (Criteria) this;
        }

        public Criteria andOCreateTimeGreaterThan(Date value) {
            addCriterion("o_create_time >", value, "oCreateTime");
            return (Criteria) this;
        }

        public Criteria andOCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("o_create_time >=", value, "oCreateTime");
            return (Criteria) this;
        }

        public Criteria andOCreateTimeLessThan(Date value) {
            addCriterion("o_create_time <", value, "oCreateTime");
            return (Criteria) this;
        }

        public Criteria andOCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("o_create_time <=", value, "oCreateTime");
            return (Criteria) this;
        }

        public Criteria andOCreateTimeIn(List<Date> values) {
            addCriterion("o_create_time in", values, "oCreateTime");
            return (Criteria) this;
        }

        public Criteria andOCreateTimeNotIn(List<Date> values) {
            addCriterion("o_create_time not in", values, "oCreateTime");
            return (Criteria) this;
        }

        public Criteria andOCreateTimeBetween(Date value1, Date value2) {
            addCriterion("o_create_time between", value1, value2, "oCreateTime");
            return (Criteria) this;
        }

        public Criteria andOCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("o_create_time not between", value1, value2, "oCreateTime");
            return (Criteria) this;
        }

        public Criteria andOUpdateTimeIsNull() {
            addCriterion("o_update_time is null");
            return (Criteria) this;
        }

        public Criteria andOUpdateTimeIsNotNull() {
            addCriterion("o_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andOUpdateTimeEqualTo(Date value) {
            addCriterion("o_update_time =", value, "oUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOUpdateTimeNotEqualTo(Date value) {
            addCriterion("o_update_time <>", value, "oUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOUpdateTimeGreaterThan(Date value) {
            addCriterion("o_update_time >", value, "oUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("o_update_time >=", value, "oUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOUpdateTimeLessThan(Date value) {
            addCriterion("o_update_time <", value, "oUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("o_update_time <=", value, "oUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOUpdateTimeIn(List<Date> values) {
            addCriterion("o_update_time in", values, "oUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOUpdateTimeNotIn(List<Date> values) {
            addCriterion("o_update_time not in", values, "oUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("o_update_time between", value1, value2, "oUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("o_update_time not between", value1, value2, "oUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOCommentIsNull() {
            addCriterion("o_comment is null");
            return (Criteria) this;
        }

        public Criteria andOCommentIsNotNull() {
            addCriterion("o_comment is not null");
            return (Criteria) this;
        }

        public Criteria andOCommentEqualTo(String value) {
            addCriterion("o_comment =", value, "oComment");
            return (Criteria) this;
        }

        public Criteria andOCommentNotEqualTo(String value) {
            addCriterion("o_comment <>", value, "oComment");
            return (Criteria) this;
        }

        public Criteria andOCommentGreaterThan(String value) {
            addCriterion("o_comment >", value, "oComment");
            return (Criteria) this;
        }

        public Criteria andOCommentGreaterThanOrEqualTo(String value) {
            addCriterion("o_comment >=", value, "oComment");
            return (Criteria) this;
        }

        public Criteria andOCommentLessThan(String value) {
            addCriterion("o_comment <", value, "oComment");
            return (Criteria) this;
        }

        public Criteria andOCommentLessThanOrEqualTo(String value) {
            addCriterion("o_comment <=", value, "oComment");
            return (Criteria) this;
        }

        public Criteria andOCommentLike(String value) {
            addCriterion("o_comment like", value, "oComment");
            return (Criteria) this;
        }

        public Criteria andOCommentNotLike(String value) {
            addCriterion("o_comment not like", value, "oComment");
            return (Criteria) this;
        }

        public Criteria andOCommentIn(List<String> values) {
            addCriterion("o_comment in", values, "oComment");
            return (Criteria) this;
        }

        public Criteria andOCommentNotIn(List<String> values) {
            addCriterion("o_comment not in", values, "oComment");
            return (Criteria) this;
        }

        public Criteria andOCommentBetween(String value1, String value2) {
            addCriterion("o_comment between", value1, value2, "oComment");
            return (Criteria) this;
        }

        public Criteria andOCommentNotBetween(String value1, String value2) {
            addCriterion("o_comment not between", value1, value2, "oComment");
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