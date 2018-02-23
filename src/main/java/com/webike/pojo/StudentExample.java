package com.webike.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnoIsNull() {
            addCriterion("sno is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("sno is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(String value) {
            addCriterion("sno =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(String value) {
            addCriterion("sno <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(String value) {
            addCriterion("sno >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(String value) {
            addCriterion("sno >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(String value) {
            addCriterion("sno <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(String value) {
            addCriterion("sno <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLike(String value) {
            addCriterion("sno like", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotLike(String value) {
            addCriterion("sno not like", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<String> values) {
            addCriterion("sno in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<String> values) {
            addCriterion("sno not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(String value1, String value2) {
            addCriterion("sno between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(String value1, String value2) {
            addCriterion("sno not between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSSexIsNull() {
            addCriterion("s_sex is null");
            return (Criteria) this;
        }

        public Criteria andSSexIsNotNull() {
            addCriterion("s_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSSexEqualTo(String value) {
            addCriterion("s_sex =", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotEqualTo(String value) {
            addCriterion("s_sex <>", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThan(String value) {
            addCriterion("s_sex >", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThanOrEqualTo(String value) {
            addCriterion("s_sex >=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThan(String value) {
            addCriterion("s_sex <", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThanOrEqualTo(String value) {
            addCriterion("s_sex <=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLike(String value) {
            addCriterion("s_sex like", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotLike(String value) {
            addCriterion("s_sex not like", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexIn(List<String> values) {
            addCriterion("s_sex in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotIn(List<String> values) {
            addCriterion("s_sex not in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexBetween(String value1, String value2) {
            addCriterion("s_sex between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotBetween(String value1, String value2) {
            addCriterion("s_sex not between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSIdCardIsNull() {
            addCriterion("s_id_card is null");
            return (Criteria) this;
        }

        public Criteria andSIdCardIsNotNull() {
            addCriterion("s_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andSIdCardEqualTo(String value) {
            addCriterion("s_id_card =", value, "sIdCard");
            return (Criteria) this;
        }

        public Criteria andSIdCardNotEqualTo(String value) {
            addCriterion("s_id_card <>", value, "sIdCard");
            return (Criteria) this;
        }

        public Criteria andSIdCardGreaterThan(String value) {
            addCriterion("s_id_card >", value, "sIdCard");
            return (Criteria) this;
        }

        public Criteria andSIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("s_id_card >=", value, "sIdCard");
            return (Criteria) this;
        }

        public Criteria andSIdCardLessThan(String value) {
            addCriterion("s_id_card <", value, "sIdCard");
            return (Criteria) this;
        }

        public Criteria andSIdCardLessThanOrEqualTo(String value) {
            addCriterion("s_id_card <=", value, "sIdCard");
            return (Criteria) this;
        }

        public Criteria andSIdCardLike(String value) {
            addCriterion("s_id_card like", value, "sIdCard");
            return (Criteria) this;
        }

        public Criteria andSIdCardNotLike(String value) {
            addCriterion("s_id_card not like", value, "sIdCard");
            return (Criteria) this;
        }

        public Criteria andSIdCardIn(List<String> values) {
            addCriterion("s_id_card in", values, "sIdCard");
            return (Criteria) this;
        }

        public Criteria andSIdCardNotIn(List<String> values) {
            addCriterion("s_id_card not in", values, "sIdCard");
            return (Criteria) this;
        }

        public Criteria andSIdCardBetween(String value1, String value2) {
            addCriterion("s_id_card between", value1, value2, "sIdCard");
            return (Criteria) this;
        }

        public Criteria andSIdCardNotBetween(String value1, String value2) {
            addCriterion("s_id_card not between", value1, value2, "sIdCard");
            return (Criteria) this;
        }

        public Criteria andSEmailIsNull() {
            addCriterion("s_email is null");
            return (Criteria) this;
        }

        public Criteria andSEmailIsNotNull() {
            addCriterion("s_email is not null");
            return (Criteria) this;
        }

        public Criteria andSEmailEqualTo(String value) {
            addCriterion("s_email =", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotEqualTo(String value) {
            addCriterion("s_email <>", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailGreaterThan(String value) {
            addCriterion("s_email >", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailGreaterThanOrEqualTo(String value) {
            addCriterion("s_email >=", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailLessThan(String value) {
            addCriterion("s_email <", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailLessThanOrEqualTo(String value) {
            addCriterion("s_email <=", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailLike(String value) {
            addCriterion("s_email like", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotLike(String value) {
            addCriterion("s_email not like", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailIn(List<String> values) {
            addCriterion("s_email in", values, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotIn(List<String> values) {
            addCriterion("s_email not in", values, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailBetween(String value1, String value2) {
            addCriterion("s_email between", value1, value2, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotBetween(String value1, String value2) {
            addCriterion("s_email not between", value1, value2, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSPhoneIsNull() {
            addCriterion("s_phone is null");
            return (Criteria) this;
        }

        public Criteria andSPhoneIsNotNull() {
            addCriterion("s_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSPhoneEqualTo(String value) {
            addCriterion("s_phone =", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotEqualTo(String value) {
            addCriterion("s_phone <>", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneGreaterThan(String value) {
            addCriterion("s_phone >", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("s_phone >=", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLessThan(String value) {
            addCriterion("s_phone <", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLessThanOrEqualTo(String value) {
            addCriterion("s_phone <=", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLike(String value) {
            addCriterion("s_phone like", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotLike(String value) {
            addCriterion("s_phone not like", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneIn(List<String> values) {
            addCriterion("s_phone in", values, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotIn(List<String> values) {
            addCriterion("s_phone not in", values, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneBetween(String value1, String value2) {
            addCriterion("s_phone between", value1, value2, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotBetween(String value1, String value2) {
            addCriterion("s_phone not between", value1, value2, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSIconIsNull() {
            addCriterion("s_icon is null");
            return (Criteria) this;
        }

        public Criteria andSIconIsNotNull() {
            addCriterion("s_icon is not null");
            return (Criteria) this;
        }

        public Criteria andSIconEqualTo(String value) {
            addCriterion("s_icon =", value, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconNotEqualTo(String value) {
            addCriterion("s_icon <>", value, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconGreaterThan(String value) {
            addCriterion("s_icon >", value, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconGreaterThanOrEqualTo(String value) {
            addCriterion("s_icon >=", value, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconLessThan(String value) {
            addCriterion("s_icon <", value, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconLessThanOrEqualTo(String value) {
            addCriterion("s_icon <=", value, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconLike(String value) {
            addCriterion("s_icon like", value, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconNotLike(String value) {
            addCriterion("s_icon not like", value, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconIn(List<String> values) {
            addCriterion("s_icon in", values, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconNotIn(List<String> values) {
            addCriterion("s_icon not in", values, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconBetween(String value1, String value2) {
            addCriterion("s_icon between", value1, value2, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSIconNotBetween(String value1, String value2) {
            addCriterion("s_icon not between", value1, value2, "sIcon");
            return (Criteria) this;
        }

        public Criteria andSDepartmentIsNull() {
            addCriterion("s_department is null");
            return (Criteria) this;
        }

        public Criteria andSDepartmentIsNotNull() {
            addCriterion("s_department is not null");
            return (Criteria) this;
        }

        public Criteria andSDepartmentEqualTo(String value) {
            addCriterion("s_department =", value, "sDepartment");
            return (Criteria) this;
        }

        public Criteria andSDepartmentNotEqualTo(String value) {
            addCriterion("s_department <>", value, "sDepartment");
            return (Criteria) this;
        }

        public Criteria andSDepartmentGreaterThan(String value) {
            addCriterion("s_department >", value, "sDepartment");
            return (Criteria) this;
        }

        public Criteria andSDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("s_department >=", value, "sDepartment");
            return (Criteria) this;
        }

        public Criteria andSDepartmentLessThan(String value) {
            addCriterion("s_department <", value, "sDepartment");
            return (Criteria) this;
        }

        public Criteria andSDepartmentLessThanOrEqualTo(String value) {
            addCriterion("s_department <=", value, "sDepartment");
            return (Criteria) this;
        }

        public Criteria andSDepartmentLike(String value) {
            addCriterion("s_department like", value, "sDepartment");
            return (Criteria) this;
        }

        public Criteria andSDepartmentNotLike(String value) {
            addCriterion("s_department not like", value, "sDepartment");
            return (Criteria) this;
        }

        public Criteria andSDepartmentIn(List<String> values) {
            addCriterion("s_department in", values, "sDepartment");
            return (Criteria) this;
        }

        public Criteria andSDepartmentNotIn(List<String> values) {
            addCriterion("s_department not in", values, "sDepartment");
            return (Criteria) this;
        }

        public Criteria andSDepartmentBetween(String value1, String value2) {
            addCriterion("s_department between", value1, value2, "sDepartment");
            return (Criteria) this;
        }

        public Criteria andSDepartmentNotBetween(String value1, String value2) {
            addCriterion("s_department not between", value1, value2, "sDepartment");
            return (Criteria) this;
        }

        public Criteria andSMajorIsNull() {
            addCriterion("s_major is null");
            return (Criteria) this;
        }

        public Criteria andSMajorIsNotNull() {
            addCriterion("s_major is not null");
            return (Criteria) this;
        }

        public Criteria andSMajorEqualTo(String value) {
            addCriterion("s_major =", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorNotEqualTo(String value) {
            addCriterion("s_major <>", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorGreaterThan(String value) {
            addCriterion("s_major >", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorGreaterThanOrEqualTo(String value) {
            addCriterion("s_major >=", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorLessThan(String value) {
            addCriterion("s_major <", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorLessThanOrEqualTo(String value) {
            addCriterion("s_major <=", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorLike(String value) {
            addCriterion("s_major like", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorNotLike(String value) {
            addCriterion("s_major not like", value, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorIn(List<String> values) {
            addCriterion("s_major in", values, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorNotIn(List<String> values) {
            addCriterion("s_major not in", values, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorBetween(String value1, String value2) {
            addCriterion("s_major between", value1, value2, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSMajorNotBetween(String value1, String value2) {
            addCriterion("s_major not between", value1, value2, "sMajor");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeIsNull() {
            addCriterion("s_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeIsNotNull() {
            addCriterion("s_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeEqualTo(Date value) {
            addCriterion("s_create_time =", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeNotEqualTo(Date value) {
            addCriterion("s_create_time <>", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeGreaterThan(Date value) {
            addCriterion("s_create_time >", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("s_create_time >=", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeLessThan(Date value) {
            addCriterion("s_create_time <", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("s_create_time <=", value, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeIn(List<Date> values) {
            addCriterion("s_create_time in", values, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeNotIn(List<Date> values) {
            addCriterion("s_create_time not in", values, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeBetween(Date value1, Date value2) {
            addCriterion("s_create_time between", value1, value2, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("s_create_time not between", value1, value2, "sCreateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeIsNull() {
            addCriterion("s_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeIsNotNull() {
            addCriterion("s_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeEqualTo(Date value) {
            addCriterion("s_update_time =", value, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeNotEqualTo(Date value) {
            addCriterion("s_update_time <>", value, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeGreaterThan(Date value) {
            addCriterion("s_update_time >", value, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("s_update_time >=", value, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeLessThan(Date value) {
            addCriterion("s_update_time <", value, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("s_update_time <=", value, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeIn(List<Date> values) {
            addCriterion("s_update_time in", values, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeNotIn(List<Date> values) {
            addCriterion("s_update_time not in", values, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("s_update_time between", value1, value2, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("s_update_time not between", value1, value2, "sUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSCommentIsNull() {
            addCriterion("s_comment is null");
            return (Criteria) this;
        }

        public Criteria andSCommentIsNotNull() {
            addCriterion("s_comment is not null");
            return (Criteria) this;
        }

        public Criteria andSCommentEqualTo(String value) {
            addCriterion("s_comment =", value, "sComment");
            return (Criteria) this;
        }

        public Criteria andSCommentNotEqualTo(String value) {
            addCriterion("s_comment <>", value, "sComment");
            return (Criteria) this;
        }

        public Criteria andSCommentGreaterThan(String value) {
            addCriterion("s_comment >", value, "sComment");
            return (Criteria) this;
        }

        public Criteria andSCommentGreaterThanOrEqualTo(String value) {
            addCriterion("s_comment >=", value, "sComment");
            return (Criteria) this;
        }

        public Criteria andSCommentLessThan(String value) {
            addCriterion("s_comment <", value, "sComment");
            return (Criteria) this;
        }

        public Criteria andSCommentLessThanOrEqualTo(String value) {
            addCriterion("s_comment <=", value, "sComment");
            return (Criteria) this;
        }

        public Criteria andSCommentLike(String value) {
            addCriterion("s_comment like", value, "sComment");
            return (Criteria) this;
        }

        public Criteria andSCommentNotLike(String value) {
            addCriterion("s_comment not like", value, "sComment");
            return (Criteria) this;
        }

        public Criteria andSCommentIn(List<String> values) {
            addCriterion("s_comment in", values, "sComment");
            return (Criteria) this;
        }

        public Criteria andSCommentNotIn(List<String> values) {
            addCriterion("s_comment not in", values, "sComment");
            return (Criteria) this;
        }

        public Criteria andSCommentBetween(String value1, String value2) {
            addCriterion("s_comment between", value1, value2, "sComment");
            return (Criteria) this;
        }

        public Criteria andSCommentNotBetween(String value1, String value2) {
            addCriterion("s_comment not between", value1, value2, "sComment");
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