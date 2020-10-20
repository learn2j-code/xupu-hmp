package com.dlm.hmp.pojo;

import java.util.Date;

public class HouseholdGatheringCard {
    private Integer id;

    private Integer familyId;

    private Integer subFamilyId;

    private Integer familyMemberId;

    private String householdCode;

    private String householder;

    private String phone;

    private String clanbookName;

    private String subclanName;

    private String relation;

    private String gatheringNumberMain;

    private String gatheringNumberMinor;

    private String gatheringDate;

    private String area;

    private String addressDetail;

    private String householderSignature;

    private String gatheringSignature;

    private String areaLeaderSignature;

    private String contenterSignature;

    private String checkupSignature;

    private String finalEditerSignature;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }

    public Integer getSubFamilyId() {
        return subFamilyId;
    }

    public void setSubFamilyId(Integer subFamilyId) {
        this.subFamilyId = subFamilyId;
    }

    public Integer getFamilyMemberId() {
        return familyMemberId;
    }

    public void setFamilyMemberId(Integer familyMemberId) {
        this.familyMemberId = familyMemberId;
    }

    public String getHouseholdCode() {
        return householdCode;
    }

    public void setHouseholdCode(String householdCode) {
        this.householdCode = householdCode == null ? null : householdCode.trim();
    }

    public String getHouseholder() {
        return householder;
    }

    public void setHouseholder(String householder) {
        this.householder = householder == null ? null : householder.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getClanbookName() {
        return clanbookName;
    }

    public void setClanbookName(String clanbookName) {
        this.clanbookName = clanbookName == null ? null : clanbookName.trim();
    }

    public String getSubclanName() {
        return subclanName;
    }

    public void setSubclanName(String subclanName) {
        this.subclanName = subclanName == null ? null : subclanName.trim();
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getGatheringNumberMain() {
        return gatheringNumberMain;
    }

    public void setGatheringNumberMain(String gatheringNumberMain) {
        this.gatheringNumberMain = gatheringNumberMain == null ? null : gatheringNumberMain.trim();
    }

    public String getGatheringNumberMinor() {
        return gatheringNumberMinor;
    }

    public void setGatheringNumberMinor(String gatheringNumberMinor) {
        this.gatheringNumberMinor = gatheringNumberMinor == null ? null : gatheringNumberMinor.trim();
    }

    public String getGatheringDate() {
        return gatheringDate;
    }

    public void setGatheringDate(String gatheringDate) {
        this.gatheringDate = gatheringDate == null ? null : gatheringDate.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    public String getHouseholderSignature() {
        return householderSignature;
    }

    public void setHouseholderSignature(String householderSignature) {
        this.householderSignature = householderSignature == null ? null : householderSignature.trim();
    }

    public String getGatheringSignature() {
        return gatheringSignature;
    }

    public void setGatheringSignature(String gatheringSignature) {
        this.gatheringSignature = gatheringSignature == null ? null : gatheringSignature.trim();
    }

    public String getAreaLeaderSignature() {
        return areaLeaderSignature;
    }

    public void setAreaLeaderSignature(String areaLeaderSignature) {
        this.areaLeaderSignature = areaLeaderSignature == null ? null : areaLeaderSignature.trim();
    }

    public String getContenterSignature() {
        return contenterSignature;
    }

    public void setContenterSignature(String contenterSignature) {
        this.contenterSignature = contenterSignature == null ? null : contenterSignature.trim();
    }

    public String getCheckupSignature() {
        return checkupSignature;
    }

    public void setCheckupSignature(String checkupSignature) {
        this.checkupSignature = checkupSignature == null ? null : checkupSignature.trim();
    }

    public String getFinalEditerSignature() {
        return finalEditerSignature;
    }

    public void setFinalEditerSignature(String finalEditerSignature) {
        this.finalEditerSignature = finalEditerSignature == null ? null : finalEditerSignature.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}