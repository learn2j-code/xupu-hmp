package com.dlm.hmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.hmp.pojo.FamilyMember;

public interface FamilyMemberService {
	List<FamilyMember> list();
	void add(FamilyMember record);
	void update(FamilyMember record);
	void delete(int id);
	FamilyMember get(int id);
	
	List<FamilyMember> findFamilyMemberListByBaseInfo(FamilyMember record);
	
	//根据名称模糊查询主成员列表
	List<FamilyMember> findMainMemberListByFuzzyName(FamilyMember record);
	
	//根据家族id查询家族成员列表
	List<FamilyMember> findFamilyMemberListByFamilyId(Integer familyId);
	
	//根据家族成员id查询所有家庭成员信息
	List<FamilyMember> findFamilyMemberListByIdList(List<Integer> idList);
}
