package com.dlm.hmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.hmp.pojo.HmRelation;


public interface HmRelationService {
	List<HmRelation> list();
	void add(HmRelation record);
	void update(HmRelation record);
	void delete(int id);
	HmRelation get(int id);
	
	List<HmRelation> findMaIdlistByHouseholdIdRelTypeAndMbId(Integer householdId, Integer relType, Integer mbId);
	//根据家庭id生成家庭成员之间的关系
	void createHmRelationByHouseholdId(Integer householdId);
	
	List<HmRelation> findHmRelationListByHouseholdId(Integer householdId);
	
	void deleteHmRelationListByHouseholdId(Integer householdId);
}
