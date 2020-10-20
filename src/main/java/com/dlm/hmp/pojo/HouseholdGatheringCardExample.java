package com.dlm.hmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HouseholdGatheringCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseholdGatheringCardExample() {
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

        public Criteria andFamilyIdIsNull() {
            addCriterion("family_id is null");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIsNotNull() {
            addCriterion("family_id is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyIdEqualTo(Integer value) {
            addCriterion("family_id =", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotEqualTo(Integer value) {
            addCriterion("family_id <>", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdGreaterThan(Integer value) {
            addCriterion("family_id >", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("family_id >=", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdLessThan(Integer value) {
            addCriterion("family_id <", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdLessThanOrEqualTo(Integer value) {
            addCriterion("family_id <=", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIn(List<Integer> values) {
            addCriterion("family_id in", values, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotIn(List<Integer> values) {
            addCriterion("family_id not in", values, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdBetween(Integer value1, Integer value2) {
            addCriterion("family_id between", value1, value2, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("family_id not between", value1, value2, "familyId");
            return (Criteria) this;
        }

        public Criteria andSubFamilyIdIsNull() {
            addCriterion("sub_family_id is null");
            return (Criteria) this;
        }

        public Criteria andSubFamilyIdIsNotNull() {
            addCriterion("sub_family_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubFamilyIdEqualTo(Integer value) {
            addCriterion("sub_family_id =", value, "subFamilyId");
            return (Criteria) this;
        }

        public Criteria andSubFamilyIdNotEqualTo(Integer value) {
            addCriterion("sub_family_id <>", value, "subFamilyId");
            return (Criteria) this;
        }

        public Criteria andSubFamilyIdGreaterThan(Integer value) {
            addCriterion("sub_family_id >", value, "subFamilyId");
            return (Criteria) this;
        }

        public Criteria andSubFamilyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_family_id >=", value, "subFamilyId");
            return (Criteria) this;
        }

        public Criteria andSubFamilyIdLessThan(Integer value) {
            addCriterion("sub_family_id <", value, "subFamilyId");
            return (Criteria) this;
        }

        public Criteria andSubFamilyIdLessThanOrEqualTo(Integer value) {
            addCriterion("sub_family_id <=", value, "subFamilyId");
            return (Criteria) this;
        }

        public Criteria andSubFamilyIdIn(List<Integer> values) {
            addCriterion("sub_family_id in", values, "subFamilyId");
            return (Criteria) this;
        }

        public Criteria andSubFamilyIdNotIn(List<Integer> values) {
            addCriterion("sub_family_id not in", values, "subFamilyId");
            return (Criteria) this;
        }

        public Criteria andSubFamilyIdBetween(Integer value1, Integer value2) {
            addCriterion("sub_family_id between", value1, value2, "subFamilyId");
            return (Criteria) this;
        }

        public Criteria andSubFamilyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_family_id not between", value1, value2, "subFamilyId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdIsNull() {
            addCriterion("family_member_id is null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdIsNotNull() {
            addCriterion("family_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdEqualTo(Integer value) {
            addCriterion("family_member_id =", value, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdNotEqualTo(Integer value) {
            addCriterion("family_member_id <>", value, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdGreaterThan(Integer value) {
            addCriterion("family_member_id >", value, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("family_member_id >=", value, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdLessThan(Integer value) {
            addCriterion("family_member_id <", value, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("family_member_id <=", value, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdIn(List<Integer> values) {
            addCriterion("family_member_id in", values, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdNotIn(List<Integer> values) {
            addCriterion("family_member_id not in", values, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("family_member_id between", value1, value2, "familyMemberId");
            return (Criteria) this;
        }

        public Criteria andFamilyMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("family_member_id not between", value1, value2, "familyMemberId");
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

        public Criteria andHouseholderIsNull() {
            addCriterion("householder is null");
            return (Criteria) this;
        }

        public Criteria andHouseholderIsNotNull() {
            addCriterion("householder is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholderEqualTo(String value) {
            addCriterion("householder =", value, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderNotEqualTo(String value) {
            addCriterion("householder <>", value, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderGreaterThan(String value) {
            addCriterion("householder >", value, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderGreaterThanOrEqualTo(String value) {
            addCriterion("householder >=", value, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderLessThan(String value) {
            addCriterion("householder <", value, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderLessThanOrEqualTo(String value) {
            addCriterion("householder <=", value, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderLike(String value) {
            addCriterion("householder like", value, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderNotLike(String value) {
            addCriterion("householder not like", value, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderIn(List<String> values) {
            addCriterion("householder in", values, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderNotIn(List<String> values) {
            addCriterion("householder not in", values, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderBetween(String value1, String value2) {
            addCriterion("householder between", value1, value2, "householder");
            return (Criteria) this;
        }

        public Criteria andHouseholderNotBetween(String value1, String value2) {
            addCriterion("householder not between", value1, value2, "householder");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andClanbookNameIsNull() {
            addCriterion("clanbook_name is null");
            return (Criteria) this;
        }

        public Criteria andClanbookNameIsNotNull() {
            addCriterion("clanbook_name is not null");
            return (Criteria) this;
        }

        public Criteria andClanbookNameEqualTo(String value) {
            addCriterion("clanbook_name =", value, "clanbookName");
            return (Criteria) this;
        }

        public Criteria andClanbookNameNotEqualTo(String value) {
            addCriterion("clanbook_name <>", value, "clanbookName");
            return (Criteria) this;
        }

        public Criteria andClanbookNameGreaterThan(String value) {
            addCriterion("clanbook_name >", value, "clanbookName");
            return (Criteria) this;
        }

        public Criteria andClanbookNameGreaterThanOrEqualTo(String value) {
            addCriterion("clanbook_name >=", value, "clanbookName");
            return (Criteria) this;
        }

        public Criteria andClanbookNameLessThan(String value) {
            addCriterion("clanbook_name <", value, "clanbookName");
            return (Criteria) this;
        }

        public Criteria andClanbookNameLessThanOrEqualTo(String value) {
            addCriterion("clanbook_name <=", value, "clanbookName");
            return (Criteria) this;
        }

        public Criteria andClanbookNameLike(String value) {
            addCriterion("clanbook_name like", value, "clanbookName");
            return (Criteria) this;
        }

        public Criteria andClanbookNameNotLike(String value) {
            addCriterion("clanbook_name not like", value, "clanbookName");
            return (Criteria) this;
        }

        public Criteria andClanbookNameIn(List<String> values) {
            addCriterion("clanbook_name in", values, "clanbookName");
            return (Criteria) this;
        }

        public Criteria andClanbookNameNotIn(List<String> values) {
            addCriterion("clanbook_name not in", values, "clanbookName");
            return (Criteria) this;
        }

        public Criteria andClanbookNameBetween(String value1, String value2) {
            addCriterion("clanbook_name between", value1, value2, "clanbookName");
            return (Criteria) this;
        }

        public Criteria andClanbookNameNotBetween(String value1, String value2) {
            addCriterion("clanbook_name not between", value1, value2, "clanbookName");
            return (Criteria) this;
        }

        public Criteria andSubclanNameIsNull() {
            addCriterion("subclan_name is null");
            return (Criteria) this;
        }

        public Criteria andSubclanNameIsNotNull() {
            addCriterion("subclan_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubclanNameEqualTo(String value) {
            addCriterion("subclan_name =", value, "subclanName");
            return (Criteria) this;
        }

        public Criteria andSubclanNameNotEqualTo(String value) {
            addCriterion("subclan_name <>", value, "subclanName");
            return (Criteria) this;
        }

        public Criteria andSubclanNameGreaterThan(String value) {
            addCriterion("subclan_name >", value, "subclanName");
            return (Criteria) this;
        }

        public Criteria andSubclanNameGreaterThanOrEqualTo(String value) {
            addCriterion("subclan_name >=", value, "subclanName");
            return (Criteria) this;
        }

        public Criteria andSubclanNameLessThan(String value) {
            addCriterion("subclan_name <", value, "subclanName");
            return (Criteria) this;
        }

        public Criteria andSubclanNameLessThanOrEqualTo(String value) {
            addCriterion("subclan_name <=", value, "subclanName");
            return (Criteria) this;
        }

        public Criteria andSubclanNameLike(String value) {
            addCriterion("subclan_name like", value, "subclanName");
            return (Criteria) this;
        }

        public Criteria andSubclanNameNotLike(String value) {
            addCriterion("subclan_name not like", value, "subclanName");
            return (Criteria) this;
        }

        public Criteria andSubclanNameIn(List<String> values) {
            addCriterion("subclan_name in", values, "subclanName");
            return (Criteria) this;
        }

        public Criteria andSubclanNameNotIn(List<String> values) {
            addCriterion("subclan_name not in", values, "subclanName");
            return (Criteria) this;
        }

        public Criteria andSubclanNameBetween(String value1, String value2) {
            addCriterion("subclan_name between", value1, value2, "subclanName");
            return (Criteria) this;
        }

        public Criteria andSubclanNameNotBetween(String value1, String value2) {
            addCriterion("subclan_name not between", value1, value2, "subclanName");
            return (Criteria) this;
        }

        public Criteria andRelationIsNull() {
            addCriterion("relation is null");
            return (Criteria) this;
        }

        public Criteria andRelationIsNotNull() {
            addCriterion("relation is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEqualTo(String value) {
            addCriterion("relation =", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotEqualTo(String value) {
            addCriterion("relation <>", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThan(String value) {
            addCriterion("relation >", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThanOrEqualTo(String value) {
            addCriterion("relation >=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThan(String value) {
            addCriterion("relation <", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThanOrEqualTo(String value) {
            addCriterion("relation <=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLike(String value) {
            addCriterion("relation like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotLike(String value) {
            addCriterion("relation not like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationIn(List<String> values) {
            addCriterion("relation in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotIn(List<String> values) {
            addCriterion("relation not in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationBetween(String value1, String value2) {
            addCriterion("relation between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotBetween(String value1, String value2) {
            addCriterion("relation not between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMainIsNull() {
            addCriterion("gathering_number_main is null");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMainIsNotNull() {
            addCriterion("gathering_number_main is not null");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMainEqualTo(String value) {
            addCriterion("gathering_number_main =", value, "gatheringNumberMain");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMainNotEqualTo(String value) {
            addCriterion("gathering_number_main <>", value, "gatheringNumberMain");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMainGreaterThan(String value) {
            addCriterion("gathering_number_main >", value, "gatheringNumberMain");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMainGreaterThanOrEqualTo(String value) {
            addCriterion("gathering_number_main >=", value, "gatheringNumberMain");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMainLessThan(String value) {
            addCriterion("gathering_number_main <", value, "gatheringNumberMain");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMainLessThanOrEqualTo(String value) {
            addCriterion("gathering_number_main <=", value, "gatheringNumberMain");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMainLike(String value) {
            addCriterion("gathering_number_main like", value, "gatheringNumberMain");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMainNotLike(String value) {
            addCriterion("gathering_number_main not like", value, "gatheringNumberMain");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMainIn(List<String> values) {
            addCriterion("gathering_number_main in", values, "gatheringNumberMain");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMainNotIn(List<String> values) {
            addCriterion("gathering_number_main not in", values, "gatheringNumberMain");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMainBetween(String value1, String value2) {
            addCriterion("gathering_number_main between", value1, value2, "gatheringNumberMain");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMainNotBetween(String value1, String value2) {
            addCriterion("gathering_number_main not between", value1, value2, "gatheringNumberMain");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMinorIsNull() {
            addCriterion("gathering_number_minor is null");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMinorIsNotNull() {
            addCriterion("gathering_number_minor is not null");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMinorEqualTo(String value) {
            addCriterion("gathering_number_minor =", value, "gatheringNumberMinor");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMinorNotEqualTo(String value) {
            addCriterion("gathering_number_minor <>", value, "gatheringNumberMinor");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMinorGreaterThan(String value) {
            addCriterion("gathering_number_minor >", value, "gatheringNumberMinor");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMinorGreaterThanOrEqualTo(String value) {
            addCriterion("gathering_number_minor >=", value, "gatheringNumberMinor");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMinorLessThan(String value) {
            addCriterion("gathering_number_minor <", value, "gatheringNumberMinor");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMinorLessThanOrEqualTo(String value) {
            addCriterion("gathering_number_minor <=", value, "gatheringNumberMinor");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMinorLike(String value) {
            addCriterion("gathering_number_minor like", value, "gatheringNumberMinor");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMinorNotLike(String value) {
            addCriterion("gathering_number_minor not like", value, "gatheringNumberMinor");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMinorIn(List<String> values) {
            addCriterion("gathering_number_minor in", values, "gatheringNumberMinor");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMinorNotIn(List<String> values) {
            addCriterion("gathering_number_minor not in", values, "gatheringNumberMinor");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMinorBetween(String value1, String value2) {
            addCriterion("gathering_number_minor between", value1, value2, "gatheringNumberMinor");
            return (Criteria) this;
        }

        public Criteria andGatheringNumberMinorNotBetween(String value1, String value2) {
            addCriterion("gathering_number_minor not between", value1, value2, "gatheringNumberMinor");
            return (Criteria) this;
        }

        public Criteria andGatheringDateIsNull() {
            addCriterion("gathering_date is null");
            return (Criteria) this;
        }

        public Criteria andGatheringDateIsNotNull() {
            addCriterion("gathering_date is not null");
            return (Criteria) this;
        }

        public Criteria andGatheringDateEqualTo(String value) {
            addCriterion("gathering_date =", value, "gatheringDate");
            return (Criteria) this;
        }

        public Criteria andGatheringDateNotEqualTo(String value) {
            addCriterion("gathering_date <>", value, "gatheringDate");
            return (Criteria) this;
        }

        public Criteria andGatheringDateGreaterThan(String value) {
            addCriterion("gathering_date >", value, "gatheringDate");
            return (Criteria) this;
        }

        public Criteria andGatheringDateGreaterThanOrEqualTo(String value) {
            addCriterion("gathering_date >=", value, "gatheringDate");
            return (Criteria) this;
        }

        public Criteria andGatheringDateLessThan(String value) {
            addCriterion("gathering_date <", value, "gatheringDate");
            return (Criteria) this;
        }

        public Criteria andGatheringDateLessThanOrEqualTo(String value) {
            addCriterion("gathering_date <=", value, "gatheringDate");
            return (Criteria) this;
        }

        public Criteria andGatheringDateLike(String value) {
            addCriterion("gathering_date like", value, "gatheringDate");
            return (Criteria) this;
        }

        public Criteria andGatheringDateNotLike(String value) {
            addCriterion("gathering_date not like", value, "gatheringDate");
            return (Criteria) this;
        }

        public Criteria andGatheringDateIn(List<String> values) {
            addCriterion("gathering_date in", values, "gatheringDate");
            return (Criteria) this;
        }

        public Criteria andGatheringDateNotIn(List<String> values) {
            addCriterion("gathering_date not in", values, "gatheringDate");
            return (Criteria) this;
        }

        public Criteria andGatheringDateBetween(String value1, String value2) {
            addCriterion("gathering_date between", value1, value2, "gatheringDate");
            return (Criteria) this;
        }

        public Criteria andGatheringDateNotBetween(String value1, String value2) {
            addCriterion("gathering_date not between", value1, value2, "gatheringDate");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIsNull() {
            addCriterion("address_detail is null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIsNotNull() {
            addCriterion("address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailEqualTo(String value) {
            addCriterion("address_detail =", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotEqualTo(String value) {
            addCriterion("address_detail <>", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThan(String value) {
            addCriterion("address_detail >", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("address_detail >=", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLessThan(String value) {
            addCriterion("address_detail <", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("address_detail <=", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLike(String value) {
            addCriterion("address_detail like", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotLike(String value) {
            addCriterion("address_detail not like", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIn(List<String> values) {
            addCriterion("address_detail in", values, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotIn(List<String> values) {
            addCriterion("address_detail not in", values, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailBetween(String value1, String value2) {
            addCriterion("address_detail between", value1, value2, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotBetween(String value1, String value2) {
            addCriterion("address_detail not between", value1, value2, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andHouseholderSignatureIsNull() {
            addCriterion("householder_signature is null");
            return (Criteria) this;
        }

        public Criteria andHouseholderSignatureIsNotNull() {
            addCriterion("householder_signature is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholderSignatureEqualTo(String value) {
            addCriterion("householder_signature =", value, "householderSignature");
            return (Criteria) this;
        }

        public Criteria andHouseholderSignatureNotEqualTo(String value) {
            addCriterion("householder_signature <>", value, "householderSignature");
            return (Criteria) this;
        }

        public Criteria andHouseholderSignatureGreaterThan(String value) {
            addCriterion("householder_signature >", value, "householderSignature");
            return (Criteria) this;
        }

        public Criteria andHouseholderSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("householder_signature >=", value, "householderSignature");
            return (Criteria) this;
        }

        public Criteria andHouseholderSignatureLessThan(String value) {
            addCriterion("householder_signature <", value, "householderSignature");
            return (Criteria) this;
        }

        public Criteria andHouseholderSignatureLessThanOrEqualTo(String value) {
            addCriterion("householder_signature <=", value, "householderSignature");
            return (Criteria) this;
        }

        public Criteria andHouseholderSignatureLike(String value) {
            addCriterion("householder_signature like", value, "householderSignature");
            return (Criteria) this;
        }

        public Criteria andHouseholderSignatureNotLike(String value) {
            addCriterion("householder_signature not like", value, "householderSignature");
            return (Criteria) this;
        }

        public Criteria andHouseholderSignatureIn(List<String> values) {
            addCriterion("householder_signature in", values, "householderSignature");
            return (Criteria) this;
        }

        public Criteria andHouseholderSignatureNotIn(List<String> values) {
            addCriterion("householder_signature not in", values, "householderSignature");
            return (Criteria) this;
        }

        public Criteria andHouseholderSignatureBetween(String value1, String value2) {
            addCriterion("householder_signature between", value1, value2, "householderSignature");
            return (Criteria) this;
        }

        public Criteria andHouseholderSignatureNotBetween(String value1, String value2) {
            addCriterion("householder_signature not between", value1, value2, "householderSignature");
            return (Criteria) this;
        }

        public Criteria andGatheringSignatureIsNull() {
            addCriterion("gathering_signature is null");
            return (Criteria) this;
        }

        public Criteria andGatheringSignatureIsNotNull() {
            addCriterion("gathering_signature is not null");
            return (Criteria) this;
        }

        public Criteria andGatheringSignatureEqualTo(String value) {
            addCriterion("gathering_signature =", value, "gatheringSignature");
            return (Criteria) this;
        }

        public Criteria andGatheringSignatureNotEqualTo(String value) {
            addCriterion("gathering_signature <>", value, "gatheringSignature");
            return (Criteria) this;
        }

        public Criteria andGatheringSignatureGreaterThan(String value) {
            addCriterion("gathering_signature >", value, "gatheringSignature");
            return (Criteria) this;
        }

        public Criteria andGatheringSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("gathering_signature >=", value, "gatheringSignature");
            return (Criteria) this;
        }

        public Criteria andGatheringSignatureLessThan(String value) {
            addCriterion("gathering_signature <", value, "gatheringSignature");
            return (Criteria) this;
        }

        public Criteria andGatheringSignatureLessThanOrEqualTo(String value) {
            addCriterion("gathering_signature <=", value, "gatheringSignature");
            return (Criteria) this;
        }

        public Criteria andGatheringSignatureLike(String value) {
            addCriterion("gathering_signature like", value, "gatheringSignature");
            return (Criteria) this;
        }

        public Criteria andGatheringSignatureNotLike(String value) {
            addCriterion("gathering_signature not like", value, "gatheringSignature");
            return (Criteria) this;
        }

        public Criteria andGatheringSignatureIn(List<String> values) {
            addCriterion("gathering_signature in", values, "gatheringSignature");
            return (Criteria) this;
        }

        public Criteria andGatheringSignatureNotIn(List<String> values) {
            addCriterion("gathering_signature not in", values, "gatheringSignature");
            return (Criteria) this;
        }

        public Criteria andGatheringSignatureBetween(String value1, String value2) {
            addCriterion("gathering_signature between", value1, value2, "gatheringSignature");
            return (Criteria) this;
        }

        public Criteria andGatheringSignatureNotBetween(String value1, String value2) {
            addCriterion("gathering_signature not between", value1, value2, "gatheringSignature");
            return (Criteria) this;
        }

        public Criteria andAreaLeaderSignatureIsNull() {
            addCriterion("area_leader_signature is null");
            return (Criteria) this;
        }

        public Criteria andAreaLeaderSignatureIsNotNull() {
            addCriterion("area_leader_signature is not null");
            return (Criteria) this;
        }

        public Criteria andAreaLeaderSignatureEqualTo(String value) {
            addCriterion("area_leader_signature =", value, "areaLeaderSignature");
            return (Criteria) this;
        }

        public Criteria andAreaLeaderSignatureNotEqualTo(String value) {
            addCriterion("area_leader_signature <>", value, "areaLeaderSignature");
            return (Criteria) this;
        }

        public Criteria andAreaLeaderSignatureGreaterThan(String value) {
            addCriterion("area_leader_signature >", value, "areaLeaderSignature");
            return (Criteria) this;
        }

        public Criteria andAreaLeaderSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("area_leader_signature >=", value, "areaLeaderSignature");
            return (Criteria) this;
        }

        public Criteria andAreaLeaderSignatureLessThan(String value) {
            addCriterion("area_leader_signature <", value, "areaLeaderSignature");
            return (Criteria) this;
        }

        public Criteria andAreaLeaderSignatureLessThanOrEqualTo(String value) {
            addCriterion("area_leader_signature <=", value, "areaLeaderSignature");
            return (Criteria) this;
        }

        public Criteria andAreaLeaderSignatureLike(String value) {
            addCriterion("area_leader_signature like", value, "areaLeaderSignature");
            return (Criteria) this;
        }

        public Criteria andAreaLeaderSignatureNotLike(String value) {
            addCriterion("area_leader_signature not like", value, "areaLeaderSignature");
            return (Criteria) this;
        }

        public Criteria andAreaLeaderSignatureIn(List<String> values) {
            addCriterion("area_leader_signature in", values, "areaLeaderSignature");
            return (Criteria) this;
        }

        public Criteria andAreaLeaderSignatureNotIn(List<String> values) {
            addCriterion("area_leader_signature not in", values, "areaLeaderSignature");
            return (Criteria) this;
        }

        public Criteria andAreaLeaderSignatureBetween(String value1, String value2) {
            addCriterion("area_leader_signature between", value1, value2, "areaLeaderSignature");
            return (Criteria) this;
        }

        public Criteria andAreaLeaderSignatureNotBetween(String value1, String value2) {
            addCriterion("area_leader_signature not between", value1, value2, "areaLeaderSignature");
            return (Criteria) this;
        }

        public Criteria andContenterSignatureIsNull() {
            addCriterion("contenter_signature is null");
            return (Criteria) this;
        }

        public Criteria andContenterSignatureIsNotNull() {
            addCriterion("contenter_signature is not null");
            return (Criteria) this;
        }

        public Criteria andContenterSignatureEqualTo(String value) {
            addCriterion("contenter_signature =", value, "contenterSignature");
            return (Criteria) this;
        }

        public Criteria andContenterSignatureNotEqualTo(String value) {
            addCriterion("contenter_signature <>", value, "contenterSignature");
            return (Criteria) this;
        }

        public Criteria andContenterSignatureGreaterThan(String value) {
            addCriterion("contenter_signature >", value, "contenterSignature");
            return (Criteria) this;
        }

        public Criteria andContenterSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("contenter_signature >=", value, "contenterSignature");
            return (Criteria) this;
        }

        public Criteria andContenterSignatureLessThan(String value) {
            addCriterion("contenter_signature <", value, "contenterSignature");
            return (Criteria) this;
        }

        public Criteria andContenterSignatureLessThanOrEqualTo(String value) {
            addCriterion("contenter_signature <=", value, "contenterSignature");
            return (Criteria) this;
        }

        public Criteria andContenterSignatureLike(String value) {
            addCriterion("contenter_signature like", value, "contenterSignature");
            return (Criteria) this;
        }

        public Criteria andContenterSignatureNotLike(String value) {
            addCriterion("contenter_signature not like", value, "contenterSignature");
            return (Criteria) this;
        }

        public Criteria andContenterSignatureIn(List<String> values) {
            addCriterion("contenter_signature in", values, "contenterSignature");
            return (Criteria) this;
        }

        public Criteria andContenterSignatureNotIn(List<String> values) {
            addCriterion("contenter_signature not in", values, "contenterSignature");
            return (Criteria) this;
        }

        public Criteria andContenterSignatureBetween(String value1, String value2) {
            addCriterion("contenter_signature between", value1, value2, "contenterSignature");
            return (Criteria) this;
        }

        public Criteria andContenterSignatureNotBetween(String value1, String value2) {
            addCriterion("contenter_signature not between", value1, value2, "contenterSignature");
            return (Criteria) this;
        }

        public Criteria andCheckupSignatureIsNull() {
            addCriterion("checkup_signature is null");
            return (Criteria) this;
        }

        public Criteria andCheckupSignatureIsNotNull() {
            addCriterion("checkup_signature is not null");
            return (Criteria) this;
        }

        public Criteria andCheckupSignatureEqualTo(String value) {
            addCriterion("checkup_signature =", value, "checkupSignature");
            return (Criteria) this;
        }

        public Criteria andCheckupSignatureNotEqualTo(String value) {
            addCriterion("checkup_signature <>", value, "checkupSignature");
            return (Criteria) this;
        }

        public Criteria andCheckupSignatureGreaterThan(String value) {
            addCriterion("checkup_signature >", value, "checkupSignature");
            return (Criteria) this;
        }

        public Criteria andCheckupSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("checkup_signature >=", value, "checkupSignature");
            return (Criteria) this;
        }

        public Criteria andCheckupSignatureLessThan(String value) {
            addCriterion("checkup_signature <", value, "checkupSignature");
            return (Criteria) this;
        }

        public Criteria andCheckupSignatureLessThanOrEqualTo(String value) {
            addCriterion("checkup_signature <=", value, "checkupSignature");
            return (Criteria) this;
        }

        public Criteria andCheckupSignatureLike(String value) {
            addCriterion("checkup_signature like", value, "checkupSignature");
            return (Criteria) this;
        }

        public Criteria andCheckupSignatureNotLike(String value) {
            addCriterion("checkup_signature not like", value, "checkupSignature");
            return (Criteria) this;
        }

        public Criteria andCheckupSignatureIn(List<String> values) {
            addCriterion("checkup_signature in", values, "checkupSignature");
            return (Criteria) this;
        }

        public Criteria andCheckupSignatureNotIn(List<String> values) {
            addCriterion("checkup_signature not in", values, "checkupSignature");
            return (Criteria) this;
        }

        public Criteria andCheckupSignatureBetween(String value1, String value2) {
            addCriterion("checkup_signature between", value1, value2, "checkupSignature");
            return (Criteria) this;
        }

        public Criteria andCheckupSignatureNotBetween(String value1, String value2) {
            addCriterion("checkup_signature not between", value1, value2, "checkupSignature");
            return (Criteria) this;
        }

        public Criteria andFinalEditerSignatureIsNull() {
            addCriterion("final_editer_signature is null");
            return (Criteria) this;
        }

        public Criteria andFinalEditerSignatureIsNotNull() {
            addCriterion("final_editer_signature is not null");
            return (Criteria) this;
        }

        public Criteria andFinalEditerSignatureEqualTo(String value) {
            addCriterion("final_editer_signature =", value, "finalEditerSignature");
            return (Criteria) this;
        }

        public Criteria andFinalEditerSignatureNotEqualTo(String value) {
            addCriterion("final_editer_signature <>", value, "finalEditerSignature");
            return (Criteria) this;
        }

        public Criteria andFinalEditerSignatureGreaterThan(String value) {
            addCriterion("final_editer_signature >", value, "finalEditerSignature");
            return (Criteria) this;
        }

        public Criteria andFinalEditerSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("final_editer_signature >=", value, "finalEditerSignature");
            return (Criteria) this;
        }

        public Criteria andFinalEditerSignatureLessThan(String value) {
            addCriterion("final_editer_signature <", value, "finalEditerSignature");
            return (Criteria) this;
        }

        public Criteria andFinalEditerSignatureLessThanOrEqualTo(String value) {
            addCriterion("final_editer_signature <=", value, "finalEditerSignature");
            return (Criteria) this;
        }

        public Criteria andFinalEditerSignatureLike(String value) {
            addCriterion("final_editer_signature like", value, "finalEditerSignature");
            return (Criteria) this;
        }

        public Criteria andFinalEditerSignatureNotLike(String value) {
            addCriterion("final_editer_signature not like", value, "finalEditerSignature");
            return (Criteria) this;
        }

        public Criteria andFinalEditerSignatureIn(List<String> values) {
            addCriterion("final_editer_signature in", values, "finalEditerSignature");
            return (Criteria) this;
        }

        public Criteria andFinalEditerSignatureNotIn(List<String> values) {
            addCriterion("final_editer_signature not in", values, "finalEditerSignature");
            return (Criteria) this;
        }

        public Criteria andFinalEditerSignatureBetween(String value1, String value2) {
            addCriterion("final_editer_signature between", value1, value2, "finalEditerSignature");
            return (Criteria) this;
        }

        public Criteria andFinalEditerSignatureNotBetween(String value1, String value2) {
            addCriterion("final_editer_signature not between", value1, value2, "finalEditerSignature");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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