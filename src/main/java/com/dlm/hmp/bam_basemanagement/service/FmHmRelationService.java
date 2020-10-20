package com.dlm.hmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.hmp.pojo.FmHmRelation;

public interface FmHmRelationService {
	List<FmHmRelation> list();
	void add(FmHmRelation record);
	void update(FmHmRelation record);
	void delete(int id);
	FmHmRelation get(int id);
	//根据家族成员id查家庭成员列表
	List<FmHmRelation> findHmListByFmId(Integer fmId);
	//根据家庭成员id查家族成员id
	Integer findFmIdByHmId(Integer hmId, Integer familyId);
}
