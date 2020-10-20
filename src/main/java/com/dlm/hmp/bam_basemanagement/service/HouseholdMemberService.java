package com.dlm.hmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.hmp.bam_basemanagement.vo.WeixinUserInfoExtends;
import com.dlm.hmp.pojo.HouseholdMember;


public interface HouseholdMemberService {
	List<HouseholdMember> list();
	void add(HouseholdMember record);
	void update(HouseholdMember record);
	void delete(int id);
	HouseholdMember get(int id);
	
	//添加和更新内容的时候，重新生成每个人的词条内容
	void addHouseholdMember(HouseholdMember record);
	void updateHouseholdMember(HouseholdMember record);
	
	//根据家庭id查户主id  
	Integer findMainIdByHouseholdId(Integer householdId);
	
	List<HouseholdMember> findHouseholdMemberListByHouseholdId(Integer id);
	List<HouseholdMember> findHouseholdMemberListByHouseholdIdAndTopMemberId(Integer householdId, Integer memberId);
	
	void addMyselfBy(WeixinUserInfoExtends weixinUserInfoExtends);
}
