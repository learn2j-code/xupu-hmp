package com.dlm.hmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.hmp.pojo.HmGatheringCard;

public interface HmGatheringCardService {
	List<HmGatheringCard> list();
	void add(HmGatheringCard record);
	void update(HmGatheringCard record);
	void delete(int id);
	HmGatheringCard get(int id);
	
	List<HmGatheringCard> findByCondition(HmGatheringCard condition);
//	HouseholdGatheringCard findHouseholdInfoByOpenId(String openId);
}
