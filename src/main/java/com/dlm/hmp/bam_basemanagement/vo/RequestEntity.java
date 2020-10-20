package com.dlm.hmp.bam_basemanagement.vo;


import com.dlm.hmp.pojo.AreaInfo;
import com.dlm.hmp.pojo.HmGatheringCard;
import com.dlm.hmp.pojo.HouseholdGatheringCard;
import com.dlm.hmp.util.Page;


public class RequestEntity {
	private Page page;
	private AreaInfo areaInfo;
	private HouseholdGatheringCard householdGatheringCard;
	private HmGatheringCard hmGatheringCard;
	
	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}


	public AreaInfo getAreaInfo() {
		return areaInfo;
	}

	public void setAreaInfo(AreaInfo areaInfo) {
		this.areaInfo = areaInfo;
	}

	public HouseholdGatheringCard getHouseholdGatheringCard() {
		return householdGatheringCard;
	}

	public void setHouseholdGatheringCard(HouseholdGatheringCard householdGatheringCard) {
		this.householdGatheringCard = householdGatheringCard;
	}

	public HmGatheringCard getHmGatheringCard() {
		return hmGatheringCard;
	}

	public void setHmGatheringCard(HmGatheringCard hmGatheringCard) {
		this.hmGatheringCard = hmGatheringCard;
	}
}
