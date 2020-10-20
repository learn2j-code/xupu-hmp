package com.dlm.hmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HmGatheringCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HmGatheringCardExample() {
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

        public Criteria andHgcIdIsNull() {
            addCriterion("hgc_id is null");
            return (Criteria) this;
        }

        public Criteria andHgcIdIsNotNull() {
            addCriterion("hgc_id is not null");
            return (Criteria) this;
        }

        public Criteria andHgcIdEqualTo(Integer value) {
            addCriterion("hgc_id =", value, "hgcId");
            return (Criteria) this;
        }

        public Criteria andHgcIdNotEqualTo(Integer value) {
            addCriterion("hgc_id <>", value, "hgcId");
            return (Criteria) this;
        }

        public Criteria andHgcIdGreaterThan(Integer value) {
            addCriterion("hgc_id >", value, "hgcId");
            return (Criteria) this;
        }

        public Criteria andHgcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hgc_id >=", value, "hgcId");
            return (Criteria) this;
        }

        public Criteria andHgcIdLessThan(Integer value) {
            addCriterion("hgc_id <", value, "hgcId");
            return (Criteria) this;
        }

        public Criteria andHgcIdLessThanOrEqualTo(Integer value) {
            addCriterion("hgc_id <=", value, "hgcId");
            return (Criteria) this;
        }

        public Criteria andHgcIdIn(List<Integer> values) {
            addCriterion("hgc_id in", values, "hgcId");
            return (Criteria) this;
        }

        public Criteria andHgcIdNotIn(List<Integer> values) {
            addCriterion("hgc_id not in", values, "hgcId");
            return (Criteria) this;
        }

        public Criteria andHgcIdBetween(Integer value1, Integer value2) {
            addCriterion("hgc_id between", value1, value2, "hgcId");
            return (Criteria) this;
        }

        public Criteria andHgcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hgc_id not between", value1, value2, "hgcId");
            return (Criteria) this;
        }

        public Criteria andBloodyFlagIsNull() {
            addCriterion("bloody_flag is null");
            return (Criteria) this;
        }

        public Criteria andBloodyFlagIsNotNull() {
            addCriterion("bloody_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBloodyFlagEqualTo(Integer value) {
            addCriterion("bloody_flag =", value, "bloodyFlag");
            return (Criteria) this;
        }

        public Criteria andBloodyFlagNotEqualTo(Integer value) {
            addCriterion("bloody_flag <>", value, "bloodyFlag");
            return (Criteria) this;
        }

        public Criteria andBloodyFlagGreaterThan(Integer value) {
            addCriterion("bloody_flag >", value, "bloodyFlag");
            return (Criteria) this;
        }

        public Criteria andBloodyFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("bloody_flag >=", value, "bloodyFlag");
            return (Criteria) this;
        }

        public Criteria andBloodyFlagLessThan(Integer value) {
            addCriterion("bloody_flag <", value, "bloodyFlag");
            return (Criteria) this;
        }

        public Criteria andBloodyFlagLessThanOrEqualTo(Integer value) {
            addCriterion("bloody_flag <=", value, "bloodyFlag");
            return (Criteria) this;
        }

        public Criteria andBloodyFlagIn(List<Integer> values) {
            addCriterion("bloody_flag in", values, "bloodyFlag");
            return (Criteria) this;
        }

        public Criteria andBloodyFlagNotIn(List<Integer> values) {
            addCriterion("bloody_flag not in", values, "bloodyFlag");
            return (Criteria) this;
        }

        public Criteria andBloodyFlagBetween(Integer value1, Integer value2) {
            addCriterion("bloody_flag between", value1, value2, "bloodyFlag");
            return (Criteria) this;
        }

        public Criteria andBloodyFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("bloody_flag not between", value1, value2, "bloodyFlag");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeIsNull() {
            addCriterion("household_code is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeIsNotNull() {
            addCriterion("household_code is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeEqualTo(String value) {
            addCriterion("household_code =", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotEqualTo(String value) {
            addCriterion("household_code <>", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeGreaterThan(String value) {
            addCriterion("household_code >", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("household_code >=", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeLessThan(String value) {
            addCriterion("household_code <", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeLessThanOrEqualTo(String value) {
            addCriterion("household_code <=", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeLike(String value) {
            addCriterion("household_code like", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotLike(String value) {
            addCriterion("household_code not like", value, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeIn(List<String> values) {
            addCriterion("household_code in", values, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotIn(List<String> values) {
            addCriterion("household_code not in", values, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeBetween(String value1, String value2) {
            addCriterion("household_code between", value1, value2, "householdCode");
            return (Criteria) this;
        }

        public Criteria andHouseholdCodeNotBetween(String value1, String value2) {
            addCriterion("household_code not between", value1, value2, "householdCode");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andRankingIsNull() {
            addCriterion("ranking is null");
            return (Criteria) this;
        }

        public Criteria andRankingIsNotNull() {
            addCriterion("ranking is not null");
            return (Criteria) this;
        }

        public Criteria andRankingEqualTo(Integer value) {
            addCriterion("ranking =", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotEqualTo(Integer value) {
            addCriterion("ranking <>", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThan(Integer value) {
            addCriterion("ranking >", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ranking >=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThan(Integer value) {
            addCriterion("ranking <", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThanOrEqualTo(Integer value) {
            addCriterion("ranking <=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingIn(List<Integer> values) {
            addCriterion("ranking in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotIn(List<Integer> values) {
            addCriterion("ranking not in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingBetween(Integer value1, Integer value2) {
            addCriterion("ranking between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotBetween(Integer value1, Integer value2) {
            addCriterion("ranking not between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andPregnantIsNull() {
            addCriterion("pregnant is null");
            return (Criteria) this;
        }

        public Criteria andPregnantIsNotNull() {
            addCriterion("pregnant is not null");
            return (Criteria) this;
        }

        public Criteria andPregnantEqualTo(Integer value) {
            addCriterion("pregnant =", value, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantNotEqualTo(Integer value) {
            addCriterion("pregnant <>", value, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantGreaterThan(Integer value) {
            addCriterion("pregnant >", value, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantGreaterThanOrEqualTo(Integer value) {
            addCriterion("pregnant >=", value, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantLessThan(Integer value) {
            addCriterion("pregnant <", value, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantLessThanOrEqualTo(Integer value) {
            addCriterion("pregnant <=", value, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantIn(List<Integer> values) {
            addCriterion("pregnant in", values, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantNotIn(List<Integer> values) {
            addCriterion("pregnant not in", values, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantBetween(Integer value1, Integer value2) {
            addCriterion("pregnant between", value1, value2, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantNotBetween(Integer value1, Integer value2) {
            addCriterion("pregnant not between", value1, value2, "pregnant");
            return (Criteria) this;
        }

        public Criteria andSecNameIsNull() {
            addCriterion("sec_name is null");
            return (Criteria) this;
        }

        public Criteria andSecNameIsNotNull() {
            addCriterion("sec_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecNameEqualTo(String value) {
            addCriterion("sec_name =", value, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameNotEqualTo(String value) {
            addCriterion("sec_name <>", value, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameGreaterThan(String value) {
            addCriterion("sec_name >", value, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameGreaterThanOrEqualTo(String value) {
            addCriterion("sec_name >=", value, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameLessThan(String value) {
            addCriterion("sec_name <", value, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameLessThanOrEqualTo(String value) {
            addCriterion("sec_name <=", value, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameLike(String value) {
            addCriterion("sec_name like", value, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameNotLike(String value) {
            addCriterion("sec_name not like", value, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameIn(List<String> values) {
            addCriterion("sec_name in", values, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameNotIn(List<String> values) {
            addCriterion("sec_name not in", values, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameBetween(String value1, String value2) {
            addCriterion("sec_name between", value1, value2, "secName");
            return (Criteria) this;
        }

        public Criteria andSecNameNotBetween(String value1, String value2) {
            addCriterion("sec_name not between", value1, value2, "secName");
            return (Criteria) this;
        }

        public Criteria andMarkNameIsNull() {
            addCriterion("mark_name is null");
            return (Criteria) this;
        }

        public Criteria andMarkNameIsNotNull() {
            addCriterion("mark_name is not null");
            return (Criteria) this;
        }

        public Criteria andMarkNameEqualTo(String value) {
            addCriterion("mark_name =", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameNotEqualTo(String value) {
            addCriterion("mark_name <>", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameGreaterThan(String value) {
            addCriterion("mark_name >", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameGreaterThanOrEqualTo(String value) {
            addCriterion("mark_name >=", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameLessThan(String value) {
            addCriterion("mark_name <", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameLessThanOrEqualTo(String value) {
            addCriterion("mark_name <=", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameLike(String value) {
            addCriterion("mark_name like", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameNotLike(String value) {
            addCriterion("mark_name not like", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameIn(List<String> values) {
            addCriterion("mark_name in", values, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameNotIn(List<String> values) {
            addCriterion("mark_name not in", values, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameBetween(String value1, String value2) {
            addCriterion("mark_name between", value1, value2, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameNotBetween(String value1, String value2) {
            addCriterion("mark_name not between", value1, value2, "markName");
            return (Criteria) this;
        }

        public Criteria andFatherNameIsNull() {
            addCriterion("father_name is null");
            return (Criteria) this;
        }

        public Criteria andFatherNameIsNotNull() {
            addCriterion("father_name is not null");
            return (Criteria) this;
        }

        public Criteria andFatherNameEqualTo(String value) {
            addCriterion("father_name =", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameNotEqualTo(String value) {
            addCriterion("father_name <>", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameGreaterThan(String value) {
            addCriterion("father_name >", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameGreaterThanOrEqualTo(String value) {
            addCriterion("father_name >=", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameLessThan(String value) {
            addCriterion("father_name <", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameLessThanOrEqualTo(String value) {
            addCriterion("father_name <=", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameLike(String value) {
            addCriterion("father_name like", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameNotLike(String value) {
            addCriterion("father_name not like", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameIn(List<String> values) {
            addCriterion("father_name in", values, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameNotIn(List<String> values) {
            addCriterion("father_name not in", values, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameBetween(String value1, String value2) {
            addCriterion("father_name between", value1, value2, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameNotBetween(String value1, String value2) {
            addCriterion("father_name not between", value1, value2, "fatherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameIsNull() {
            addCriterion("mother_name is null");
            return (Criteria) this;
        }

        public Criteria andMotherNameIsNotNull() {
            addCriterion("mother_name is not null");
            return (Criteria) this;
        }

        public Criteria andMotherNameEqualTo(String value) {
            addCriterion("mother_name =", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameNotEqualTo(String value) {
            addCriterion("mother_name <>", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameGreaterThan(String value) {
            addCriterion("mother_name >", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameGreaterThanOrEqualTo(String value) {
            addCriterion("mother_name >=", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameLessThan(String value) {
            addCriterion("mother_name <", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameLessThanOrEqualTo(String value) {
            addCriterion("mother_name <=", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameLike(String value) {
            addCriterion("mother_name like", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameNotLike(String value) {
            addCriterion("mother_name not like", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameIn(List<String> values) {
            addCriterion("mother_name in", values, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameNotIn(List<String> values) {
            addCriterion("mother_name not in", values, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameBetween(String value1, String value2) {
            addCriterion("mother_name between", value1, value2, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameNotBetween(String value1, String value2) {
            addCriterion("mother_name not between", value1, value2, "motherName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameIsNull() {
            addCriterion("spouse_name is null");
            return (Criteria) this;
        }

        public Criteria andSpouseNameIsNotNull() {
            addCriterion("spouse_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseNameEqualTo(String value) {
            addCriterion("spouse_name =", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotEqualTo(String value) {
            addCriterion("spouse_name <>", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameGreaterThan(String value) {
            addCriterion("spouse_name >", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_name >=", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameLessThan(String value) {
            addCriterion("spouse_name <", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameLessThanOrEqualTo(String value) {
            addCriterion("spouse_name <=", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameLike(String value) {
            addCriterion("spouse_name like", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotLike(String value) {
            addCriterion("spouse_name not like", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameIn(List<String> values) {
            addCriterion("spouse_name in", values, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotIn(List<String> values) {
            addCriterion("spouse_name not in", values, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameBetween(String value1, String value2) {
            addCriterion("spouse_name between", value1, value2, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotBetween(String value1, String value2) {
            addCriterion("spouse_name not between", value1, value2, "spouseName");
            return (Criteria) this;
        }

        public Criteria andMarriedDateIsNull() {
            addCriterion("married_date is null");
            return (Criteria) this;
        }

        public Criteria andMarriedDateIsNotNull() {
            addCriterion("married_date is not null");
            return (Criteria) this;
        }

        public Criteria andMarriedDateEqualTo(String value) {
            addCriterion("married_date =", value, "marriedDate");
            return (Criteria) this;
        }

        public Criteria andMarriedDateNotEqualTo(String value) {
            addCriterion("married_date <>", value, "marriedDate");
            return (Criteria) this;
        }

        public Criteria andMarriedDateGreaterThan(String value) {
            addCriterion("married_date >", value, "marriedDate");
            return (Criteria) this;
        }

        public Criteria andMarriedDateGreaterThanOrEqualTo(String value) {
            addCriterion("married_date >=", value, "marriedDate");
            return (Criteria) this;
        }

        public Criteria andMarriedDateLessThan(String value) {
            addCriterion("married_date <", value, "marriedDate");
            return (Criteria) this;
        }

        public Criteria andMarriedDateLessThanOrEqualTo(String value) {
            addCriterion("married_date <=", value, "marriedDate");
            return (Criteria) this;
        }

        public Criteria andMarriedDateLike(String value) {
            addCriterion("married_date like", value, "marriedDate");
            return (Criteria) this;
        }

        public Criteria andMarriedDateNotLike(String value) {
            addCriterion("married_date not like", value, "marriedDate");
            return (Criteria) this;
        }

        public Criteria andMarriedDateIn(List<String> values) {
            addCriterion("married_date in", values, "marriedDate");
            return (Criteria) this;
        }

        public Criteria andMarriedDateNotIn(List<String> values) {
            addCriterion("married_date not in", values, "marriedDate");
            return (Criteria) this;
        }

        public Criteria andMarriedDateBetween(String value1, String value2) {
            addCriterion("married_date between", value1, value2, "marriedDate");
            return (Criteria) this;
        }

        public Criteria andMarriedDateNotBetween(String value1, String value2) {
            addCriterion("married_date not between", value1, value2, "marriedDate");
            return (Criteria) this;
        }

        public Criteria andBirthTypeIsNull() {
            addCriterion("birth_type is null");
            return (Criteria) this;
        }

        public Criteria andBirthTypeIsNotNull() {
            addCriterion("birth_type is not null");
            return (Criteria) this;
        }

        public Criteria andBirthTypeEqualTo(Integer value) {
            addCriterion("birth_type =", value, "birthType");
            return (Criteria) this;
        }

        public Criteria andBirthTypeNotEqualTo(Integer value) {
            addCriterion("birth_type <>", value, "birthType");
            return (Criteria) this;
        }

        public Criteria andBirthTypeGreaterThan(Integer value) {
            addCriterion("birth_type >", value, "birthType");
            return (Criteria) this;
        }

        public Criteria andBirthTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("birth_type >=", value, "birthType");
            return (Criteria) this;
        }

        public Criteria andBirthTypeLessThan(Integer value) {
            addCriterion("birth_type <", value, "birthType");
            return (Criteria) this;
        }

        public Criteria andBirthTypeLessThanOrEqualTo(Integer value) {
            addCriterion("birth_type <=", value, "birthType");
            return (Criteria) this;
        }

        public Criteria andBirthTypeIn(List<Integer> values) {
            addCriterion("birth_type in", values, "birthType");
            return (Criteria) this;
        }

        public Criteria andBirthTypeNotIn(List<Integer> values) {
            addCriterion("birth_type not in", values, "birthType");
            return (Criteria) this;
        }

        public Criteria andBirthTypeBetween(Integer value1, Integer value2) {
            addCriterion("birth_type between", value1, value2, "birthType");
            return (Criteria) this;
        }

        public Criteria andBirthTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("birth_type not between", value1, value2, "birthType");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNull() {
            addCriterion("birth_date is null");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNotNull() {
            addCriterion("birth_date is not null");
            return (Criteria) this;
        }

        public Criteria andBirthDateEqualTo(String value) {
            addCriterion("birth_date =", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotEqualTo(String value) {
            addCriterion("birth_date <>", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThan(String value) {
            addCriterion("birth_date >", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThanOrEqualTo(String value) {
            addCriterion("birth_date >=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThan(String value) {
            addCriterion("birth_date <", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThanOrEqualTo(String value) {
            addCriterion("birth_date <=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLike(String value) {
            addCriterion("birth_date like", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotLike(String value) {
            addCriterion("birth_date not like", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateIn(List<String> values) {
            addCriterion("birth_date in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotIn(List<String> values) {
            addCriterion("birth_date not in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateBetween(String value1, String value2) {
            addCriterion("birth_date between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotBetween(String value1, String value2) {
            addCriterion("birth_date not between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBeBirthLeapMonthIsNull() {
            addCriterion("be_birth_leap_month is null");
            return (Criteria) this;
        }

        public Criteria andBeBirthLeapMonthIsNotNull() {
            addCriterion("be_birth_leap_month is not null");
            return (Criteria) this;
        }

        public Criteria andBeBirthLeapMonthEqualTo(Integer value) {
            addCriterion("be_birth_leap_month =", value, "beBirthLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBeBirthLeapMonthNotEqualTo(Integer value) {
            addCriterion("be_birth_leap_month <>", value, "beBirthLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBeBirthLeapMonthGreaterThan(Integer value) {
            addCriterion("be_birth_leap_month >", value, "beBirthLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBeBirthLeapMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("be_birth_leap_month >=", value, "beBirthLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBeBirthLeapMonthLessThan(Integer value) {
            addCriterion("be_birth_leap_month <", value, "beBirthLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBeBirthLeapMonthLessThanOrEqualTo(Integer value) {
            addCriterion("be_birth_leap_month <=", value, "beBirthLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBeBirthLeapMonthIn(List<Integer> values) {
            addCriterion("be_birth_leap_month in", values, "beBirthLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBeBirthLeapMonthNotIn(List<Integer> values) {
            addCriterion("be_birth_leap_month not in", values, "beBirthLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBeBirthLeapMonthBetween(Integer value1, Integer value2) {
            addCriterion("be_birth_leap_month between", value1, value2, "beBirthLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBeBirthLeapMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("be_birth_leap_month not between", value1, value2, "beBirthLeapMonth");
            return (Criteria) this;
        }

        public Criteria andInheritIsNull() {
            addCriterion("inherit is null");
            return (Criteria) this;
        }

        public Criteria andInheritIsNotNull() {
            addCriterion("inherit is not null");
            return (Criteria) this;
        }

        public Criteria andInheritEqualTo(Integer value) {
            addCriterion("inherit =", value, "inherit");
            return (Criteria) this;
        }

        public Criteria andInheritNotEqualTo(Integer value) {
            addCriterion("inherit <>", value, "inherit");
            return (Criteria) this;
        }

        public Criteria andInheritGreaterThan(Integer value) {
            addCriterion("inherit >", value, "inherit");
            return (Criteria) this;
        }

        public Criteria andInheritGreaterThanOrEqualTo(Integer value) {
            addCriterion("inherit >=", value, "inherit");
            return (Criteria) this;
        }

        public Criteria andInheritLessThan(Integer value) {
            addCriterion("inherit <", value, "inherit");
            return (Criteria) this;
        }

        public Criteria andInheritLessThanOrEqualTo(Integer value) {
            addCriterion("inherit <=", value, "inherit");
            return (Criteria) this;
        }

        public Criteria andInheritIn(List<Integer> values) {
            addCriterion("inherit in", values, "inherit");
            return (Criteria) this;
        }

        public Criteria andInheritNotIn(List<Integer> values) {
            addCriterion("inherit not in", values, "inherit");
            return (Criteria) this;
        }

        public Criteria andInheritBetween(Integer value1, Integer value2) {
            addCriterion("inherit between", value1, value2, "inherit");
            return (Criteria) this;
        }

        public Criteria andInheritNotBetween(Integer value1, Integer value2) {
            addCriterion("inherit not between", value1, value2, "inherit");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNull() {
            addCriterion("marriage is null");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNotNull() {
            addCriterion("marriage is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageEqualTo(Integer value) {
            addCriterion("marriage =", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotEqualTo(Integer value) {
            addCriterion("marriage <>", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThan(Integer value) {
            addCriterion("marriage >", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThanOrEqualTo(Integer value) {
            addCriterion("marriage >=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThan(Integer value) {
            addCriterion("marriage <", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThanOrEqualTo(Integer value) {
            addCriterion("marriage <=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageIn(List<Integer> values) {
            addCriterion("marriage in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotIn(List<Integer> values) {
            addCriterion("marriage not in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageBetween(Integer value1, Integer value2) {
            addCriterion("marriage between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotBetween(Integer value1, Integer value2) {
            addCriterion("marriage not between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andInheritCommentIsNull() {
            addCriterion("inherit_comment is null");
            return (Criteria) this;
        }

        public Criteria andInheritCommentIsNotNull() {
            addCriterion("inherit_comment is not null");
            return (Criteria) this;
        }

        public Criteria andInheritCommentEqualTo(String value) {
            addCriterion("inherit_comment =", value, "inheritComment");
            return (Criteria) this;
        }

        public Criteria andInheritCommentNotEqualTo(String value) {
            addCriterion("inherit_comment <>", value, "inheritComment");
            return (Criteria) this;
        }

        public Criteria andInheritCommentGreaterThan(String value) {
            addCriterion("inherit_comment >", value, "inheritComment");
            return (Criteria) this;
        }

        public Criteria andInheritCommentGreaterThanOrEqualTo(String value) {
            addCriterion("inherit_comment >=", value, "inheritComment");
            return (Criteria) this;
        }

        public Criteria andInheritCommentLessThan(String value) {
            addCriterion("inherit_comment <", value, "inheritComment");
            return (Criteria) this;
        }

        public Criteria andInheritCommentLessThanOrEqualTo(String value) {
            addCriterion("inherit_comment <=", value, "inheritComment");
            return (Criteria) this;
        }

        public Criteria andInheritCommentLike(String value) {
            addCriterion("inherit_comment like", value, "inheritComment");
            return (Criteria) this;
        }

        public Criteria andInheritCommentNotLike(String value) {
            addCriterion("inherit_comment not like", value, "inheritComment");
            return (Criteria) this;
        }

        public Criteria andInheritCommentIn(List<String> values) {
            addCriterion("inherit_comment in", values, "inheritComment");
            return (Criteria) this;
        }

        public Criteria andInheritCommentNotIn(List<String> values) {
            addCriterion("inherit_comment not in", values, "inheritComment");
            return (Criteria) this;
        }

        public Criteria andInheritCommentBetween(String value1, String value2) {
            addCriterion("inherit_comment between", value1, value2, "inheritComment");
            return (Criteria) this;
        }

        public Criteria andInheritCommentNotBetween(String value1, String value2) {
            addCriterion("inherit_comment not between", value1, value2, "inheritComment");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andCareerIsNull() {
            addCriterion("career is null");
            return (Criteria) this;
        }

        public Criteria andCareerIsNotNull() {
            addCriterion("career is not null");
            return (Criteria) this;
        }

        public Criteria andCareerEqualTo(String value) {
            addCriterion("career =", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotEqualTo(String value) {
            addCriterion("career <>", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerGreaterThan(String value) {
            addCriterion("career >", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerGreaterThanOrEqualTo(String value) {
            addCriterion("career >=", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerLessThan(String value) {
            addCriterion("career <", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerLessThanOrEqualTo(String value) {
            addCriterion("career <=", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerLike(String value) {
            addCriterion("career like", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotLike(String value) {
            addCriterion("career not like", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerIn(List<String> values) {
            addCriterion("career in", values, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotIn(List<String> values) {
            addCriterion("career not in", values, "career");
            return (Criteria) this;
        }

        public Criteria andCareerBetween(String value1, String value2) {
            addCriterion("career between", value1, value2, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotBetween(String value1, String value2) {
            addCriterion("career not between", value1, value2, "career");
            return (Criteria) this;
        }

        public Criteria andChuJiIsNull() {
            addCriterion("chu_ji is null");
            return (Criteria) this;
        }

        public Criteria andChuJiIsNotNull() {
            addCriterion("chu_ji is not null");
            return (Criteria) this;
        }

        public Criteria andChuJiEqualTo(String value) {
            addCriterion("chu_ji =", value, "chuJi");
            return (Criteria) this;
        }

        public Criteria andChuJiNotEqualTo(String value) {
            addCriterion("chu_ji <>", value, "chuJi");
            return (Criteria) this;
        }

        public Criteria andChuJiGreaterThan(String value) {
            addCriterion("chu_ji >", value, "chuJi");
            return (Criteria) this;
        }

        public Criteria andChuJiGreaterThanOrEqualTo(String value) {
            addCriterion("chu_ji >=", value, "chuJi");
            return (Criteria) this;
        }

        public Criteria andChuJiLessThan(String value) {
            addCriterion("chu_ji <", value, "chuJi");
            return (Criteria) this;
        }

        public Criteria andChuJiLessThanOrEqualTo(String value) {
            addCriterion("chu_ji <=", value, "chuJi");
            return (Criteria) this;
        }

        public Criteria andChuJiLike(String value) {
            addCriterion("chu_ji like", value, "chuJi");
            return (Criteria) this;
        }

        public Criteria andChuJiNotLike(String value) {
            addCriterion("chu_ji not like", value, "chuJi");
            return (Criteria) this;
        }

        public Criteria andChuJiIn(List<String> values) {
            addCriterion("chu_ji in", values, "chuJi");
            return (Criteria) this;
        }

        public Criteria andChuJiNotIn(List<String> values) {
            addCriterion("chu_ji not in", values, "chuJi");
            return (Criteria) this;
        }

        public Criteria andChuJiBetween(String value1, String value2) {
            addCriterion("chu_ji between", value1, value2, "chuJi");
            return (Criteria) this;
        }

        public Criteria andChuJiNotBetween(String value1, String value2) {
            addCriterion("chu_ji not between", value1, value2, "chuJi");
            return (Criteria) this;
        }

        public Criteria andChuZhuiIsNull() {
            addCriterion("chu_zhui is null");
            return (Criteria) this;
        }

        public Criteria andChuZhuiIsNotNull() {
            addCriterion("chu_zhui is not null");
            return (Criteria) this;
        }

        public Criteria andChuZhuiEqualTo(String value) {
            addCriterion("chu_zhui =", value, "chuZhui");
            return (Criteria) this;
        }

        public Criteria andChuZhuiNotEqualTo(String value) {
            addCriterion("chu_zhui <>", value, "chuZhui");
            return (Criteria) this;
        }

        public Criteria andChuZhuiGreaterThan(String value) {
            addCriterion("chu_zhui >", value, "chuZhui");
            return (Criteria) this;
        }

        public Criteria andChuZhuiGreaterThanOrEqualTo(String value) {
            addCriterion("chu_zhui >=", value, "chuZhui");
            return (Criteria) this;
        }

        public Criteria andChuZhuiLessThan(String value) {
            addCriterion("chu_zhui <", value, "chuZhui");
            return (Criteria) this;
        }

        public Criteria andChuZhuiLessThanOrEqualTo(String value) {
            addCriterion("chu_zhui <=", value, "chuZhui");
            return (Criteria) this;
        }

        public Criteria andChuZhuiLike(String value) {
            addCriterion("chu_zhui like", value, "chuZhui");
            return (Criteria) this;
        }

        public Criteria andChuZhuiNotLike(String value) {
            addCriterion("chu_zhui not like", value, "chuZhui");
            return (Criteria) this;
        }

        public Criteria andChuZhuiIn(List<String> values) {
            addCriterion("chu_zhui in", values, "chuZhui");
            return (Criteria) this;
        }

        public Criteria andChuZhuiNotIn(List<String> values) {
            addCriterion("chu_zhui not in", values, "chuZhui");
            return (Criteria) this;
        }

        public Criteria andChuZhuiBetween(String value1, String value2) {
            addCriterion("chu_zhui between", value1, value2, "chuZhui");
            return (Criteria) this;
        }

        public Criteria andChuZhuiNotBetween(String value1, String value2) {
            addCriterion("chu_zhui not between", value1, value2, "chuZhui");
            return (Criteria) this;
        }

        public Criteria andRecruitAdmittedIsNull() {
            addCriterion("recruit_admitted is null");
            return (Criteria) this;
        }

        public Criteria andRecruitAdmittedIsNotNull() {
            addCriterion("recruit_admitted is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitAdmittedEqualTo(Integer value) {
            addCriterion("recruit_admitted =", value, "recruitAdmitted");
            return (Criteria) this;
        }

        public Criteria andRecruitAdmittedNotEqualTo(Integer value) {
            addCriterion("recruit_admitted <>", value, "recruitAdmitted");
            return (Criteria) this;
        }

        public Criteria andRecruitAdmittedGreaterThan(Integer value) {
            addCriterion("recruit_admitted >", value, "recruitAdmitted");
            return (Criteria) this;
        }

        public Criteria andRecruitAdmittedGreaterThanOrEqualTo(Integer value) {
            addCriterion("recruit_admitted >=", value, "recruitAdmitted");
            return (Criteria) this;
        }

        public Criteria andRecruitAdmittedLessThan(Integer value) {
            addCriterion("recruit_admitted <", value, "recruitAdmitted");
            return (Criteria) this;
        }

        public Criteria andRecruitAdmittedLessThanOrEqualTo(Integer value) {
            addCriterion("recruit_admitted <=", value, "recruitAdmitted");
            return (Criteria) this;
        }

        public Criteria andRecruitAdmittedIn(List<Integer> values) {
            addCriterion("recruit_admitted in", values, "recruitAdmitted");
            return (Criteria) this;
        }

        public Criteria andRecruitAdmittedNotIn(List<Integer> values) {
            addCriterion("recruit_admitted not in", values, "recruitAdmitted");
            return (Criteria) this;
        }

        public Criteria andRecruitAdmittedBetween(Integer value1, Integer value2) {
            addCriterion("recruit_admitted between", value1, value2, "recruitAdmitted");
            return (Criteria) this;
        }

        public Criteria andRecruitAdmittedNotBetween(Integer value1, Integer value2) {
            addCriterion("recruit_admitted not between", value1, value2, "recruitAdmitted");
            return (Criteria) this;
        }

        public Criteria andExternalMigrationIsNull() {
            addCriterion("external_migration is null");
            return (Criteria) this;
        }

        public Criteria andExternalMigrationIsNotNull() {
            addCriterion("external_migration is not null");
            return (Criteria) this;
        }

        public Criteria andExternalMigrationEqualTo(String value) {
            addCriterion("external_migration =", value, "externalMigration");
            return (Criteria) this;
        }

        public Criteria andExternalMigrationNotEqualTo(String value) {
            addCriterion("external_migration <>", value, "externalMigration");
            return (Criteria) this;
        }

        public Criteria andExternalMigrationGreaterThan(String value) {
            addCriterion("external_migration >", value, "externalMigration");
            return (Criteria) this;
        }

        public Criteria andExternalMigrationGreaterThanOrEqualTo(String value) {
            addCriterion("external_migration >=", value, "externalMigration");
            return (Criteria) this;
        }

        public Criteria andExternalMigrationLessThan(String value) {
            addCriterion("external_migration <", value, "externalMigration");
            return (Criteria) this;
        }

        public Criteria andExternalMigrationLessThanOrEqualTo(String value) {
            addCriterion("external_migration <=", value, "externalMigration");
            return (Criteria) this;
        }

        public Criteria andExternalMigrationLike(String value) {
            addCriterion("external_migration like", value, "externalMigration");
            return (Criteria) this;
        }

        public Criteria andExternalMigrationNotLike(String value) {
            addCriterion("external_migration not like", value, "externalMigration");
            return (Criteria) this;
        }

        public Criteria andExternalMigrationIn(List<String> values) {
            addCriterion("external_migration in", values, "externalMigration");
            return (Criteria) this;
        }

        public Criteria andExternalMigrationNotIn(List<String> values) {
            addCriterion("external_migration not in", values, "externalMigration");
            return (Criteria) this;
        }

        public Criteria andExternalMigrationBetween(String value1, String value2) {
            addCriterion("external_migration between", value1, value2, "externalMigration");
            return (Criteria) this;
        }

        public Criteria andExternalMigrationNotBetween(String value1, String value2) {
            addCriterion("external_migration not between", value1, value2, "externalMigration");
            return (Criteria) this;
        }

        public Criteria andLineGuideNoteIsNull() {
            addCriterion("line_guide_note is null");
            return (Criteria) this;
        }

        public Criteria andLineGuideNoteIsNotNull() {
            addCriterion("line_guide_note is not null");
            return (Criteria) this;
        }

        public Criteria andLineGuideNoteEqualTo(String value) {
            addCriterion("line_guide_note =", value, "lineGuideNote");
            return (Criteria) this;
        }

        public Criteria andLineGuideNoteNotEqualTo(String value) {
            addCriterion("line_guide_note <>", value, "lineGuideNote");
            return (Criteria) this;
        }

        public Criteria andLineGuideNoteGreaterThan(String value) {
            addCriterion("line_guide_note >", value, "lineGuideNote");
            return (Criteria) this;
        }

        public Criteria andLineGuideNoteGreaterThanOrEqualTo(String value) {
            addCriterion("line_guide_note >=", value, "lineGuideNote");
            return (Criteria) this;
        }

        public Criteria andLineGuideNoteLessThan(String value) {
            addCriterion("line_guide_note <", value, "lineGuideNote");
            return (Criteria) this;
        }

        public Criteria andLineGuideNoteLessThanOrEqualTo(String value) {
            addCriterion("line_guide_note <=", value, "lineGuideNote");
            return (Criteria) this;
        }

        public Criteria andLineGuideNoteLike(String value) {
            addCriterion("line_guide_note like", value, "lineGuideNote");
            return (Criteria) this;
        }

        public Criteria andLineGuideNoteNotLike(String value) {
            addCriterion("line_guide_note not like", value, "lineGuideNote");
            return (Criteria) this;
        }

        public Criteria andLineGuideNoteIn(List<String> values) {
            addCriterion("line_guide_note in", values, "lineGuideNote");
            return (Criteria) this;
        }

        public Criteria andLineGuideNoteNotIn(List<String> values) {
            addCriterion("line_guide_note not in", values, "lineGuideNote");
            return (Criteria) this;
        }

        public Criteria andLineGuideNoteBetween(String value1, String value2) {
            addCriterion("line_guide_note between", value1, value2, "lineGuideNote");
            return (Criteria) this;
        }

        public Criteria andLineGuideNoteNotBetween(String value1, String value2) {
            addCriterion("line_guide_note not between", value1, value2, "lineGuideNote");
            return (Criteria) this;
        }

        public Criteria andMaAreaIsNull() {
            addCriterion("ma_area is null");
            return (Criteria) this;
        }

        public Criteria andMaAreaIsNotNull() {
            addCriterion("ma_area is not null");
            return (Criteria) this;
        }

        public Criteria andMaAreaEqualTo(String value) {
            addCriterion("ma_area =", value, "maArea");
            return (Criteria) this;
        }

        public Criteria andMaAreaNotEqualTo(String value) {
            addCriterion("ma_area <>", value, "maArea");
            return (Criteria) this;
        }

        public Criteria andMaAreaGreaterThan(String value) {
            addCriterion("ma_area >", value, "maArea");
            return (Criteria) this;
        }

        public Criteria andMaAreaGreaterThanOrEqualTo(String value) {
            addCriterion("ma_area >=", value, "maArea");
            return (Criteria) this;
        }

        public Criteria andMaAreaLessThan(String value) {
            addCriterion("ma_area <", value, "maArea");
            return (Criteria) this;
        }

        public Criteria andMaAreaLessThanOrEqualTo(String value) {
            addCriterion("ma_area <=", value, "maArea");
            return (Criteria) this;
        }

        public Criteria andMaAreaLike(String value) {
            addCriterion("ma_area like", value, "maArea");
            return (Criteria) this;
        }

        public Criteria andMaAreaNotLike(String value) {
            addCriterion("ma_area not like", value, "maArea");
            return (Criteria) this;
        }

        public Criteria andMaAreaIn(List<String> values) {
            addCriterion("ma_area in", values, "maArea");
            return (Criteria) this;
        }

        public Criteria andMaAreaNotIn(List<String> values) {
            addCriterion("ma_area not in", values, "maArea");
            return (Criteria) this;
        }

        public Criteria andMaAreaBetween(String value1, String value2) {
            addCriterion("ma_area between", value1, value2, "maArea");
            return (Criteria) this;
        }

        public Criteria andMaAreaNotBetween(String value1, String value2) {
            addCriterion("ma_area not between", value1, value2, "maArea");
            return (Criteria) this;
        }

        public Criteria andMaAddressDetailIsNull() {
            addCriterion("ma_address_detail is null");
            return (Criteria) this;
        }

        public Criteria andMaAddressDetailIsNotNull() {
            addCriterion("ma_address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andMaAddressDetailEqualTo(String value) {
            addCriterion("ma_address_detail =", value, "maAddressDetail");
            return (Criteria) this;
        }

        public Criteria andMaAddressDetailNotEqualTo(String value) {
            addCriterion("ma_address_detail <>", value, "maAddressDetail");
            return (Criteria) this;
        }

        public Criteria andMaAddressDetailGreaterThan(String value) {
            addCriterion("ma_address_detail >", value, "maAddressDetail");
            return (Criteria) this;
        }

        public Criteria andMaAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("ma_address_detail >=", value, "maAddressDetail");
            return (Criteria) this;
        }

        public Criteria andMaAddressDetailLessThan(String value) {
            addCriterion("ma_address_detail <", value, "maAddressDetail");
            return (Criteria) this;
        }

        public Criteria andMaAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("ma_address_detail <=", value, "maAddressDetail");
            return (Criteria) this;
        }

        public Criteria andMaAddressDetailLike(String value) {
            addCriterion("ma_address_detail like", value, "maAddressDetail");
            return (Criteria) this;
        }

        public Criteria andMaAddressDetailNotLike(String value) {
            addCriterion("ma_address_detail not like", value, "maAddressDetail");
            return (Criteria) this;
        }

        public Criteria andMaAddressDetailIn(List<String> values) {
            addCriterion("ma_address_detail in", values, "maAddressDetail");
            return (Criteria) this;
        }

        public Criteria andMaAddressDetailNotIn(List<String> values) {
            addCriterion("ma_address_detail not in", values, "maAddressDetail");
            return (Criteria) this;
        }

        public Criteria andMaAddressDetailBetween(String value1, String value2) {
            addCriterion("ma_address_detail between", value1, value2, "maAddressDetail");
            return (Criteria) this;
        }

        public Criteria andMaAddressDetailNotBetween(String value1, String value2) {
            addCriterion("ma_address_detail not between", value1, value2, "maAddressDetail");
            return (Criteria) this;
        }

        public Criteria andBeDevoiceIsNull() {
            addCriterion("be_devoice is null");
            return (Criteria) this;
        }

        public Criteria andBeDevoiceIsNotNull() {
            addCriterion("be_devoice is not null");
            return (Criteria) this;
        }

        public Criteria andBeDevoiceEqualTo(Integer value) {
            addCriterion("be_devoice =", value, "beDevoice");
            return (Criteria) this;
        }

        public Criteria andBeDevoiceNotEqualTo(Integer value) {
            addCriterion("be_devoice <>", value, "beDevoice");
            return (Criteria) this;
        }

        public Criteria andBeDevoiceGreaterThan(Integer value) {
            addCriterion("be_devoice >", value, "beDevoice");
            return (Criteria) this;
        }

        public Criteria andBeDevoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("be_devoice >=", value, "beDevoice");
            return (Criteria) this;
        }

        public Criteria andBeDevoiceLessThan(Integer value) {
            addCriterion("be_devoice <", value, "beDevoice");
            return (Criteria) this;
        }

        public Criteria andBeDevoiceLessThanOrEqualTo(Integer value) {
            addCriterion("be_devoice <=", value, "beDevoice");
            return (Criteria) this;
        }

        public Criteria andBeDevoiceIn(List<Integer> values) {
            addCriterion("be_devoice in", values, "beDevoice");
            return (Criteria) this;
        }

        public Criteria andBeDevoiceNotIn(List<Integer> values) {
            addCriterion("be_devoice not in", values, "beDevoice");
            return (Criteria) this;
        }

        public Criteria andBeDevoiceBetween(Integer value1, Integer value2) {
            addCriterion("be_devoice between", value1, value2, "beDevoice");
            return (Criteria) this;
        }

        public Criteria andBeDevoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("be_devoice not between", value1, value2, "beDevoice");
            return (Criteria) this;
        }

        public Criteria andDeathTypeIsNull() {
            addCriterion("death_type is null");
            return (Criteria) this;
        }

        public Criteria andDeathTypeIsNotNull() {
            addCriterion("death_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeathTypeEqualTo(Integer value) {
            addCriterion("death_type =", value, "deathType");
            return (Criteria) this;
        }

        public Criteria andDeathTypeNotEqualTo(Integer value) {
            addCriterion("death_type <>", value, "deathType");
            return (Criteria) this;
        }

        public Criteria andDeathTypeGreaterThan(Integer value) {
            addCriterion("death_type >", value, "deathType");
            return (Criteria) this;
        }

        public Criteria andDeathTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("death_type >=", value, "deathType");
            return (Criteria) this;
        }

        public Criteria andDeathTypeLessThan(Integer value) {
            addCriterion("death_type <", value, "deathType");
            return (Criteria) this;
        }

        public Criteria andDeathTypeLessThanOrEqualTo(Integer value) {
            addCriterion("death_type <=", value, "deathType");
            return (Criteria) this;
        }

        public Criteria andDeathTypeIn(List<Integer> values) {
            addCriterion("death_type in", values, "deathType");
            return (Criteria) this;
        }

        public Criteria andDeathTypeNotIn(List<Integer> values) {
            addCriterion("death_type not in", values, "deathType");
            return (Criteria) this;
        }

        public Criteria andDeathTypeBetween(Integer value1, Integer value2) {
            addCriterion("death_type between", value1, value2, "deathType");
            return (Criteria) this;
        }

        public Criteria andDeathTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("death_type not between", value1, value2, "deathType");
            return (Criteria) this;
        }

        public Criteria andDeathDateIsNull() {
            addCriterion("death_date is null");
            return (Criteria) this;
        }

        public Criteria andDeathDateIsNotNull() {
            addCriterion("death_date is not null");
            return (Criteria) this;
        }

        public Criteria andDeathDateEqualTo(String value) {
            addCriterion("death_date =", value, "deathDate");
            return (Criteria) this;
        }

        public Criteria andDeathDateNotEqualTo(String value) {
            addCriterion("death_date <>", value, "deathDate");
            return (Criteria) this;
        }

        public Criteria andDeathDateGreaterThan(String value) {
            addCriterion("death_date >", value, "deathDate");
            return (Criteria) this;
        }

        public Criteria andDeathDateGreaterThanOrEqualTo(String value) {
            addCriterion("death_date >=", value, "deathDate");
            return (Criteria) this;
        }

        public Criteria andDeathDateLessThan(String value) {
            addCriterion("death_date <", value, "deathDate");
            return (Criteria) this;
        }

        public Criteria andDeathDateLessThanOrEqualTo(String value) {
            addCriterion("death_date <=", value, "deathDate");
            return (Criteria) this;
        }

        public Criteria andDeathDateLike(String value) {
            addCriterion("death_date like", value, "deathDate");
            return (Criteria) this;
        }

        public Criteria andDeathDateNotLike(String value) {
            addCriterion("death_date not like", value, "deathDate");
            return (Criteria) this;
        }

        public Criteria andDeathDateIn(List<String> values) {
            addCriterion("death_date in", values, "deathDate");
            return (Criteria) this;
        }

        public Criteria andDeathDateNotIn(List<String> values) {
            addCriterion("death_date not in", values, "deathDate");
            return (Criteria) this;
        }

        public Criteria andDeathDateBetween(String value1, String value2) {
            addCriterion("death_date between", value1, value2, "deathDate");
            return (Criteria) this;
        }

        public Criteria andDeathDateNotBetween(String value1, String value2) {
            addCriterion("death_date not between", value1, value2, "deathDate");
            return (Criteria) this;
        }

        public Criteria andBeDeathLeapMonthIsNull() {
            addCriterion("be_death_leap_month is null");
            return (Criteria) this;
        }

        public Criteria andBeDeathLeapMonthIsNotNull() {
            addCriterion("be_death_leap_month is not null");
            return (Criteria) this;
        }

        public Criteria andBeDeathLeapMonthEqualTo(Integer value) {
            addCriterion("be_death_leap_month =", value, "beDeathLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBeDeathLeapMonthNotEqualTo(Integer value) {
            addCriterion("be_death_leap_month <>", value, "beDeathLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBeDeathLeapMonthGreaterThan(Integer value) {
            addCriterion("be_death_leap_month >", value, "beDeathLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBeDeathLeapMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("be_death_leap_month >=", value, "beDeathLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBeDeathLeapMonthLessThan(Integer value) {
            addCriterion("be_death_leap_month <", value, "beDeathLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBeDeathLeapMonthLessThanOrEqualTo(Integer value) {
            addCriterion("be_death_leap_month <=", value, "beDeathLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBeDeathLeapMonthIn(List<Integer> values) {
            addCriterion("be_death_leap_month in", values, "beDeathLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBeDeathLeapMonthNotIn(List<Integer> values) {
            addCriterion("be_death_leap_month not in", values, "beDeathLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBeDeathLeapMonthBetween(Integer value1, Integer value2) {
            addCriterion("be_death_leap_month between", value1, value2, "beDeathLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBeDeathLeapMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("be_death_leap_month not between", value1, value2, "beDeathLeapMonth");
            return (Criteria) this;
        }

        public Criteria andBuriedPlaceIsNull() {
            addCriterion("buried_place is null");
            return (Criteria) this;
        }

        public Criteria andBuriedPlaceIsNotNull() {
            addCriterion("buried_place is not null");
            return (Criteria) this;
        }

        public Criteria andBuriedPlaceEqualTo(String value) {
            addCriterion("buried_place =", value, "buriedPlace");
            return (Criteria) this;
        }

        public Criteria andBuriedPlaceNotEqualTo(String value) {
            addCriterion("buried_place <>", value, "buriedPlace");
            return (Criteria) this;
        }

        public Criteria andBuriedPlaceGreaterThan(String value) {
            addCriterion("buried_place >", value, "buriedPlace");
            return (Criteria) this;
        }

        public Criteria andBuriedPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("buried_place >=", value, "buriedPlace");
            return (Criteria) this;
        }

        public Criteria andBuriedPlaceLessThan(String value) {
            addCriterion("buried_place <", value, "buriedPlace");
            return (Criteria) this;
        }

        public Criteria andBuriedPlaceLessThanOrEqualTo(String value) {
            addCriterion("buried_place <=", value, "buriedPlace");
            return (Criteria) this;
        }

        public Criteria andBuriedPlaceLike(String value) {
            addCriterion("buried_place like", value, "buriedPlace");
            return (Criteria) this;
        }

        public Criteria andBuriedPlaceNotLike(String value) {
            addCriterion("buried_place not like", value, "buriedPlace");
            return (Criteria) this;
        }

        public Criteria andBuriedPlaceIn(List<String> values) {
            addCriterion("buried_place in", values, "buriedPlace");
            return (Criteria) this;
        }

        public Criteria andBuriedPlaceNotIn(List<String> values) {
            addCriterion("buried_place not in", values, "buriedPlace");
            return (Criteria) this;
        }

        public Criteria andBuriedPlaceBetween(String value1, String value2) {
            addCriterion("buried_place between", value1, value2, "buriedPlace");
            return (Criteria) this;
        }

        public Criteria andBuriedPlaceNotBetween(String value1, String value2) {
            addCriterion("buried_place not between", value1, value2, "buriedPlace");
            return (Criteria) this;
        }

        public Criteria andStoryIsNull() {
            addCriterion("story is null");
            return (Criteria) this;
        }

        public Criteria andStoryIsNotNull() {
            addCriterion("story is not null");
            return (Criteria) this;
        }

        public Criteria andStoryEqualTo(String value) {
            addCriterion("story =", value, "story");
            return (Criteria) this;
        }

        public Criteria andStoryNotEqualTo(String value) {
            addCriterion("story <>", value, "story");
            return (Criteria) this;
        }

        public Criteria andStoryGreaterThan(String value) {
            addCriterion("story >", value, "story");
            return (Criteria) this;
        }

        public Criteria andStoryGreaterThanOrEqualTo(String value) {
            addCriterion("story >=", value, "story");
            return (Criteria) this;
        }

        public Criteria andStoryLessThan(String value) {
            addCriterion("story <", value, "story");
            return (Criteria) this;
        }

        public Criteria andStoryLessThanOrEqualTo(String value) {
            addCriterion("story <=", value, "story");
            return (Criteria) this;
        }

        public Criteria andStoryLike(String value) {
            addCriterion("story like", value, "story");
            return (Criteria) this;
        }

        public Criteria andStoryNotLike(String value) {
            addCriterion("story not like", value, "story");
            return (Criteria) this;
        }

        public Criteria andStoryIn(List<String> values) {
            addCriterion("story in", values, "story");
            return (Criteria) this;
        }

        public Criteria andStoryNotIn(List<String> values) {
            addCriterion("story not in", values, "story");
            return (Criteria) this;
        }

        public Criteria andStoryBetween(String value1, String value2) {
            addCriterion("story between", value1, value2, "story");
            return (Criteria) this;
        }

        public Criteria andStoryNotBetween(String value1, String value2) {
            addCriterion("story not between", value1, value2, "story");
            return (Criteria) this;
        }

        public Criteria andOtherContentIsNull() {
            addCriterion("other_content is null");
            return (Criteria) this;
        }

        public Criteria andOtherContentIsNotNull() {
            addCriterion("other_content is not null");
            return (Criteria) this;
        }

        public Criteria andOtherContentEqualTo(String value) {
            addCriterion("other_content =", value, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentNotEqualTo(String value) {
            addCriterion("other_content <>", value, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentGreaterThan(String value) {
            addCriterion("other_content >", value, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentGreaterThanOrEqualTo(String value) {
            addCriterion("other_content >=", value, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentLessThan(String value) {
            addCriterion("other_content <", value, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentLessThanOrEqualTo(String value) {
            addCriterion("other_content <=", value, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentLike(String value) {
            addCriterion("other_content like", value, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentNotLike(String value) {
            addCriterion("other_content not like", value, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentIn(List<String> values) {
            addCriterion("other_content in", values, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentNotIn(List<String> values) {
            addCriterion("other_content not in", values, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentBetween(String value1, String value2) {
            addCriterion("other_content between", value1, value2, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentNotBetween(String value1, String value2) {
            addCriterion("other_content not between", value1, value2, "otherContent");
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