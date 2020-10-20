package com.dlm.hmp.bam_basemanagement.vo;

import com.dlm.hmp.pojo.WeixinUserInfo;

public class WeixinUserInfoExtends extends WeixinUserInfo {
	private Integer householdId;
	private Integer ranking;
	
	public Integer getHouseholdId() {
		return householdId;
	}

	public void setHouseholdId(Integer householdId) {
		this.householdId = householdId;
	}

	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}
}
