package com.webike.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAPidIsNull() {
            addCriterion("a_pid is null");
            return (Criteria) this;
        }

        public Criteria andAPidIsNotNull() {
            addCriterion("a_pid is not null");
            return (Criteria) this;
        }

        public Criteria andAPidEqualTo(Integer value) {
            addCriterion("a_pid =", value, "aPid");
            return (Criteria) this;
        }

        public Criteria andAPidNotEqualTo(Integer value) {
            addCriterion("a_pid <>", value, "aPid");
            return (Criteria) this;
        }

        public Criteria andAPidGreaterThan(Integer value) {
            addCriterion("a_pid >", value, "aPid");
            return (Criteria) this;
        }

        public Criteria andAPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_pid >=", value, "aPid");
            return (Criteria) this;
        }

        public Criteria andAPidLessThan(Integer value) {
            addCriterion("a_pid <", value, "aPid");
            return (Criteria) this;
        }

        public Criteria andAPidLessThanOrEqualTo(Integer value) {
            addCriterion("a_pid <=", value, "aPid");
            return (Criteria) this;
        }

        public Criteria andAPidIn(List<Integer> values) {
            addCriterion("a_pid in", values, "aPid");
            return (Criteria) this;
        }

        public Criteria andAPidNotIn(List<Integer> values) {
            addCriterion("a_pid not in", values, "aPid");
            return (Criteria) this;
        }

        public Criteria andAPidBetween(Integer value1, Integer value2) {
            addCriterion("a_pid between", value1, value2, "aPid");
            return (Criteria) this;
        }

        public Criteria andAPidNotBetween(Integer value1, Integer value2) {
            addCriterion("a_pid not between", value1, value2, "aPid");
            return (Criteria) this;
        }

        public Criteria andAUsernameIsNull() {
            addCriterion("a_username is null");
            return (Criteria) this;
        }

        public Criteria andAUsernameIsNotNull() {
            addCriterion("a_username is not null");
            return (Criteria) this;
        }

        public Criteria andAUsernameEqualTo(String value) {
            addCriterion("a_username =", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameNotEqualTo(String value) {
            addCriterion("a_username <>", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameGreaterThan(String value) {
            addCriterion("a_username >", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("a_username >=", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameLessThan(String value) {
            addCriterion("a_username <", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameLessThanOrEqualTo(String value) {
            addCriterion("a_username <=", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameLike(String value) {
            addCriterion("a_username like", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameNotLike(String value) {
            addCriterion("a_username not like", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameIn(List<String> values) {
            addCriterion("a_username in", values, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameNotIn(List<String> values) {
            addCriterion("a_username not in", values, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameBetween(String value1, String value2) {
            addCriterion("a_username between", value1, value2, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameNotBetween(String value1, String value2) {
            addCriterion("a_username not between", value1, value2, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAPasswordIsNull() {
            addCriterion("a_password is null");
            return (Criteria) this;
        }

        public Criteria andAPasswordIsNotNull() {
            addCriterion("a_password is not null");
            return (Criteria) this;
        }

        public Criteria andAPasswordEqualTo(String value) {
            addCriterion("a_password =", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordNotEqualTo(String value) {
            addCriterion("a_password <>", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordGreaterThan(String value) {
            addCriterion("a_password >", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("a_password >=", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordLessThan(String value) {
            addCriterion("a_password <", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordLessThanOrEqualTo(String value) {
            addCriterion("a_password <=", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordLike(String value) {
            addCriterion("a_password like", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordNotLike(String value) {
            addCriterion("a_password not like", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordIn(List<String> values) {
            addCriterion("a_password in", values, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordNotIn(List<String> values) {
            addCriterion("a_password not in", values, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordBetween(String value1, String value2) {
            addCriterion("a_password between", value1, value2, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordNotBetween(String value1, String value2) {
            addCriterion("a_password not between", value1, value2, "aPassword");
            return (Criteria) this;
        }

        public Criteria andARealNameIsNull() {
            addCriterion("a_real_name is null");
            return (Criteria) this;
        }

        public Criteria andARealNameIsNotNull() {
            addCriterion("a_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andARealNameEqualTo(String value) {
            addCriterion("a_real_name =", value, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameNotEqualTo(String value) {
            addCriterion("a_real_name <>", value, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameGreaterThan(String value) {
            addCriterion("a_real_name >", value, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameGreaterThanOrEqualTo(String value) {
            addCriterion("a_real_name >=", value, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameLessThan(String value) {
            addCriterion("a_real_name <", value, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameLessThanOrEqualTo(String value) {
            addCriterion("a_real_name <=", value, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameLike(String value) {
            addCriterion("a_real_name like", value, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameNotLike(String value) {
            addCriterion("a_real_name not like", value, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameIn(List<String> values) {
            addCriterion("a_real_name in", values, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameNotIn(List<String> values) {
            addCriterion("a_real_name not in", values, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameBetween(String value1, String value2) {
            addCriterion("a_real_name between", value1, value2, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameNotBetween(String value1, String value2) {
            addCriterion("a_real_name not between", value1, value2, "aRealName");
            return (Criteria) this;
        }

        public Criteria andAPhoneIsNull() {
            addCriterion("a_phone is null");
            return (Criteria) this;
        }

        public Criteria andAPhoneIsNotNull() {
            addCriterion("a_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAPhoneEqualTo(String value) {
            addCriterion("a_phone =", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneNotEqualTo(String value) {
            addCriterion("a_phone <>", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneGreaterThan(String value) {
            addCriterion("a_phone >", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("a_phone >=", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneLessThan(String value) {
            addCriterion("a_phone <", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneLessThanOrEqualTo(String value) {
            addCriterion("a_phone <=", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneLike(String value) {
            addCriterion("a_phone like", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneNotLike(String value) {
            addCriterion("a_phone not like", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneIn(List<String> values) {
            addCriterion("a_phone in", values, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneNotIn(List<String> values) {
            addCriterion("a_phone not in", values, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneBetween(String value1, String value2) {
            addCriterion("a_phone between", value1, value2, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneNotBetween(String value1, String value2) {
            addCriterion("a_phone not between", value1, value2, "aPhone");
            return (Criteria) this;
        }

        public Criteria andARoleIsNull() {
            addCriterion("a_role is null");
            return (Criteria) this;
        }

        public Criteria andARoleIsNotNull() {
            addCriterion("a_role is not null");
            return (Criteria) this;
        }

        public Criteria andARoleEqualTo(String value) {
            addCriterion("a_role =", value, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleNotEqualTo(String value) {
            addCriterion("a_role <>", value, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleGreaterThan(String value) {
            addCriterion("a_role >", value, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleGreaterThanOrEqualTo(String value) {
            addCriterion("a_role >=", value, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleLessThan(String value) {
            addCriterion("a_role <", value, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleLessThanOrEqualTo(String value) {
            addCriterion("a_role <=", value, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleLike(String value) {
            addCriterion("a_role like", value, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleNotLike(String value) {
            addCriterion("a_role not like", value, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleIn(List<String> values) {
            addCriterion("a_role in", values, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleNotIn(List<String> values) {
            addCriterion("a_role not in", values, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleBetween(String value1, String value2) {
            addCriterion("a_role between", value1, value2, "aRole");
            return (Criteria) this;
        }

        public Criteria andARoleNotBetween(String value1, String value2) {
            addCriterion("a_role not between", value1, value2, "aRole");
            return (Criteria) this;
        }

        public Criteria andAIconIsNull() {
            addCriterion("a_icon is null");
            return (Criteria) this;
        }

        public Criteria andAIconIsNotNull() {
            addCriterion("a_icon is not null");
            return (Criteria) this;
        }

        public Criteria andAIconEqualTo(String value) {
            addCriterion("a_icon =", value, "aIcon");
            return (Criteria) this;
        }

        public Criteria andAIconNotEqualTo(String value) {
            addCriterion("a_icon <>", value, "aIcon");
            return (Criteria) this;
        }

        public Criteria andAIconGreaterThan(String value) {
            addCriterion("a_icon >", value, "aIcon");
            return (Criteria) this;
        }

        public Criteria andAIconGreaterThanOrEqualTo(String value) {
            addCriterion("a_icon >=", value, "aIcon");
            return (Criteria) this;
        }

        public Criteria andAIconLessThan(String value) {
            addCriterion("a_icon <", value, "aIcon");
            return (Criteria) this;
        }

        public Criteria andAIconLessThanOrEqualTo(String value) {
            addCriterion("a_icon <=", value, "aIcon");
            return (Criteria) this;
        }

        public Criteria andAIconLike(String value) {
            addCriterion("a_icon like", value, "aIcon");
            return (Criteria) this;
        }

        public Criteria andAIconNotLike(String value) {
            addCriterion("a_icon not like", value, "aIcon");
            return (Criteria) this;
        }

        public Criteria andAIconIn(List<String> values) {
            addCriterion("a_icon in", values, "aIcon");
            return (Criteria) this;
        }

        public Criteria andAIconNotIn(List<String> values) {
            addCriterion("a_icon not in", values, "aIcon");
            return (Criteria) this;
        }

        public Criteria andAIconBetween(String value1, String value2) {
            addCriterion("a_icon between", value1, value2, "aIcon");
            return (Criteria) this;
        }

        public Criteria andAIconNotBetween(String value1, String value2) {
            addCriterion("a_icon not between", value1, value2, "aIcon");
            return (Criteria) this;
        }

        public Criteria andALoginTimeIsNull() {
            addCriterion("a_login_time is null");
            return (Criteria) this;
        }

        public Criteria andALoginTimeIsNotNull() {
            addCriterion("a_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andALoginTimeEqualTo(Date value) {
            addCriterion("a_login_time =", value, "aLoginTime");
            return (Criteria) this;
        }

        public Criteria andALoginTimeNotEqualTo(Date value) {
            addCriterion("a_login_time <>", value, "aLoginTime");
            return (Criteria) this;
        }

        public Criteria andALoginTimeGreaterThan(Date value) {
            addCriterion("a_login_time >", value, "aLoginTime");
            return (Criteria) this;
        }

        public Criteria andALoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("a_login_time >=", value, "aLoginTime");
            return (Criteria) this;
        }

        public Criteria andALoginTimeLessThan(Date value) {
            addCriterion("a_login_time <", value, "aLoginTime");
            return (Criteria) this;
        }

        public Criteria andALoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("a_login_time <=", value, "aLoginTime");
            return (Criteria) this;
        }

        public Criteria andALoginTimeIn(List<Date> values) {
            addCriterion("a_login_time in", values, "aLoginTime");
            return (Criteria) this;
        }

        public Criteria andALoginTimeNotIn(List<Date> values) {
            addCriterion("a_login_time not in", values, "aLoginTime");
            return (Criteria) this;
        }

        public Criteria andALoginTimeBetween(Date value1, Date value2) {
            addCriterion("a_login_time between", value1, value2, "aLoginTime");
            return (Criteria) this;
        }

        public Criteria andALoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("a_login_time not between", value1, value2, "aLoginTime");
            return (Criteria) this;
        }

        public Criteria andACreateTimeIsNull() {
            addCriterion("a_create_time is null");
            return (Criteria) this;
        }

        public Criteria andACreateTimeIsNotNull() {
            addCriterion("a_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andACreateTimeEqualTo(Date value) {
            addCriterion("a_create_time =", value, "aCreateTime");
            return (Criteria) this;
        }

        public Criteria andACreateTimeNotEqualTo(Date value) {
            addCriterion("a_create_time <>", value, "aCreateTime");
            return (Criteria) this;
        }

        public Criteria andACreateTimeGreaterThan(Date value) {
            addCriterion("a_create_time >", value, "aCreateTime");
            return (Criteria) this;
        }

        public Criteria andACreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("a_create_time >=", value, "aCreateTime");
            return (Criteria) this;
        }

        public Criteria andACreateTimeLessThan(Date value) {
            addCriterion("a_create_time <", value, "aCreateTime");
            return (Criteria) this;
        }

        public Criteria andACreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("a_create_time <=", value, "aCreateTime");
            return (Criteria) this;
        }

        public Criteria andACreateTimeIn(List<Date> values) {
            addCriterion("a_create_time in", values, "aCreateTime");
            return (Criteria) this;
        }

        public Criteria andACreateTimeNotIn(List<Date> values) {
            addCriterion("a_create_time not in", values, "aCreateTime");
            return (Criteria) this;
        }

        public Criteria andACreateTimeBetween(Date value1, Date value2) {
            addCriterion("a_create_time between", value1, value2, "aCreateTime");
            return (Criteria) this;
        }

        public Criteria andACreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("a_create_time not between", value1, value2, "aCreateTime");
            return (Criteria) this;
        }

        public Criteria andAUpdateTimeIsNull() {
            addCriterion("a_update_time is null");
            return (Criteria) this;
        }

        public Criteria andAUpdateTimeIsNotNull() {
            addCriterion("a_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andAUpdateTimeEqualTo(Date value) {
            addCriterion("a_update_time =", value, "aUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAUpdateTimeNotEqualTo(Date value) {
            addCriterion("a_update_time <>", value, "aUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAUpdateTimeGreaterThan(Date value) {
            addCriterion("a_update_time >", value, "aUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("a_update_time >=", value, "aUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAUpdateTimeLessThan(Date value) {
            addCriterion("a_update_time <", value, "aUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("a_update_time <=", value, "aUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAUpdateTimeIn(List<Date> values) {
            addCriterion("a_update_time in", values, "aUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAUpdateTimeNotIn(List<Date> values) {
            addCriterion("a_update_time not in", values, "aUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("a_update_time between", value1, value2, "aUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("a_update_time not between", value1, value2, "aUpdateTime");
            return (Criteria) this;
        }

        public Criteria andACommentIsNull() {
            addCriterion("a_comment is null");
            return (Criteria) this;
        }

        public Criteria andACommentIsNotNull() {
            addCriterion("a_comment is not null");
            return (Criteria) this;
        }

        public Criteria andACommentEqualTo(String value) {
            addCriterion("a_comment =", value, "aComment");
            return (Criteria) this;
        }

        public Criteria andACommentNotEqualTo(String value) {
            addCriterion("a_comment <>", value, "aComment");
            return (Criteria) this;
        }

        public Criteria andACommentGreaterThan(String value) {
            addCriterion("a_comment >", value, "aComment");
            return (Criteria) this;
        }

        public Criteria andACommentGreaterThanOrEqualTo(String value) {
            addCriterion("a_comment >=", value, "aComment");
            return (Criteria) this;
        }

        public Criteria andACommentLessThan(String value) {
            addCriterion("a_comment <", value, "aComment");
            return (Criteria) this;
        }

        public Criteria andACommentLessThanOrEqualTo(String value) {
            addCriterion("a_comment <=", value, "aComment");
            return (Criteria) this;
        }

        public Criteria andACommentLike(String value) {
            addCriterion("a_comment like", value, "aComment");
            return (Criteria) this;
        }

        public Criteria andACommentNotLike(String value) {
            addCriterion("a_comment not like", value, "aComment");
            return (Criteria) this;
        }

        public Criteria andACommentIn(List<String> values) {
            addCriterion("a_comment in", values, "aComment");
            return (Criteria) this;
        }

        public Criteria andACommentNotIn(List<String> values) {
            addCriterion("a_comment not in", values, "aComment");
            return (Criteria) this;
        }

        public Criteria andACommentBetween(String value1, String value2) {
            addCriterion("a_comment between", value1, value2, "aComment");
            return (Criteria) this;
        }

        public Criteria andACommentNotBetween(String value1, String value2) {
            addCriterion("a_comment not between", value1, value2, "aComment");
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