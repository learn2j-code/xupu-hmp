package com.dlm.hmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.hmp.bam_basemanagement.vo.PersonInfo;
import com.dlm.hmp.pojo.FmRelation;

public interface FmRelationService {
	List<FmRelation> list();
	void add(FmRelation record);
	void update(FmRelation record);
	void delete(int id);
	FmRelation get(int id);
	
	//根据父id查询其下子id列表
	List<PersonInfo> findSubNodeListByParentId(Integer parentId);
	//根据主id查询其下配偶id列表
	List<PersonInfo> findSpouseNodeListByMainId(Integer mainId);
	//根据主id查询其父节点
	PersonInfo findParentNodeByMainId(Integer mainId);
	//根据配偶id查询其主id
	PersonInfo findMainNodeBySpouseId(Integer spouseId);
	//根据主id查询其父id
	Integer findParentIdByMainId(Integer mainId);
}
