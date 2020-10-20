package com.dlm.hmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.hmp.bam_basemanagement.vo.InputPara;
import com.dlm.hmp.pojo.HouseholdGatheringCard;

public interface HouseholdGatheringCardService {
	List<HouseholdGatheringCard> list();
	void add(HouseholdGatheringCard record);
	void update(HouseholdGatheringCard record);
	void delete(int id);
	HouseholdGatheringCard get(int id);
	
	List<HouseholdGatheringCard> findByCondition(HouseholdGatheringCard condition);
	
	void addBatchHouseholdGatheringCard(InputPara para);
//	HouseholdGatheringCard findHouseholdInfoByOpenId(String openId);
}
