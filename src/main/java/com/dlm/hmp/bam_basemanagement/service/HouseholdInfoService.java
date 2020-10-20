package com.dlm.hmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.hmp.pojo.HouseholdInfo;


public interface HouseholdInfoService {
	List<HouseholdInfo> list();
	void add(HouseholdInfo record);
	void update(HouseholdInfo record);
	void delete(int id);
	HouseholdInfo get(int id);
	
	HouseholdInfo findHouseholdInfoByOpenId(String openId);
}
