package com.dlm.hmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.dlm.hmp.bam_basemanagement.service.FamilyMemberService;
import com.dlm.hmp.bam_basemanagement.service.FmRelationService;
import com.dlm.hmp.bam_basemanagement.vo.PersonInfo;
import com.dlm.hmp.constant.CommonConstant;
import com.dlm.hmp.mapper.FmRelationMapper;
import com.dlm.hmp.pojo.FmRelation;
import com.dlm.hmp.pojo.FmRelationExample;
import com.dlm.hmp.pojo.FmRelationExample.Criteria;
import com.dlm.hmp.pojo.FamilyMember;

@Service
public class FmRelationServiceImpl implements FmRelationService {
	@Autowired
	FmRelationMapper mapper;
	@Autowired
	FamilyMemberService familyMemberService;
	
	@Override
	public List<FmRelation> list() {
		FmRelationExample example = new FmRelationExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(FmRelation record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(FmRelation record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public FmRelation get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<PersonInfo> findSubNodeListByParentId(Integer parentId) {
		FmRelationExample example = new FmRelationExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andRelTypeEqualTo(CommonConstant.RELTYPE_SONFATHER).andMbIdEqualTo(parentId);
		List<FmRelation> fmRelationList = mapper.selectByExample(example);
		List<PersonInfo> subNodeList = new ArrayList<PersonInfo>();
		for(FmRelation fmRelation:fmRelationList) {
			PersonInfo personInfo = new PersonInfo();
			personInfo.setId(fmRelation.getMaId());
			FamilyMember familyMember = familyMemberService.get(fmRelation.getMaId());
			personInfo.setGender(familyMember.getMemberGender());
			personInfo.setName(familyMember.getMemberName());
			subNodeList.add(personInfo);
		}
		return subNodeList;
	}

	@Override
	public List<PersonInfo> findSpouseNodeListByMainId(Integer mainId) {
		FmRelationExample example = new FmRelationExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andRelTypeEqualTo(CommonConstant.RELTYPE_SPOUSEMAIN).andMbIdEqualTo(mainId);
		List<FmRelation> fmRelationList = mapper.selectByExample(example);
		List<PersonInfo> spouseNodeList = new ArrayList<PersonInfo>();
		for(FmRelation fmRelation:fmRelationList) {
			PersonInfo personInfo = new PersonInfo();
			personInfo.setId(fmRelation.getMaId());
			FamilyMember familyMember = familyMemberService.get(fmRelation.getMaId());
			personInfo.setGender(familyMember.getMemberGender());
			personInfo.setName(familyMember.getMemberName());
			spouseNodeList.add(personInfo);
		}
		return spouseNodeList;
	}

	@Override
	public PersonInfo findParentNodeByMainId(Integer mainId) {
		FmRelationExample example = new FmRelationExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andRelTypeEqualTo(CommonConstant.RELTYPE_SONFATHER).andMaIdEqualTo(mainId);
		List<FmRelation> fmRelationList = mapper.selectByExample(example);
		if(fmRelationList.size()>=1){
			PersonInfo personInfo = new PersonInfo();
			personInfo.setId(fmRelationList.get(0).getMbId());
			FamilyMember familyMember = familyMemberService.get(fmRelationList.get(0).getMbId());
			personInfo.setGender(familyMember.getMemberGender());
			personInfo.setName(familyMember.getMemberName());
			return personInfo;
		}
		return null;
	}
	
	@Override
	public PersonInfo findMainNodeBySpouseId(Integer spouseId) {
		FmRelationExample example = new FmRelationExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andRelTypeEqualTo(CommonConstant.RELTYPE_SPOUSEMAIN).andMaIdEqualTo(spouseId);
		List<FmRelation> fmRelationList = mapper.selectByExample(example);
		if(fmRelationList.size()>=1){
			PersonInfo personInfo = new PersonInfo();
			personInfo.setId(fmRelationList.get(0).getMbId());
			FamilyMember familyMember = familyMemberService.get(fmRelationList.get(0).getMbId());
			personInfo.setGender(familyMember.getMemberGender());
			personInfo.setName(familyMember.getMemberName());
			return personInfo;
		}
		return null;
	}

	@Override
	public Integer findParentIdByMainId(Integer mainId) {
		FmRelationExample example = new FmRelationExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andRelTypeEqualTo(CommonConstant.RELTYPE_SONFATHER).andMaIdEqualTo(mainId);
		List<FmRelation> fmRelationList = mapper.selectByExample(example);
		if(fmRelationList.size()>=1){
			return fmRelationList.get(0).getMbId();
		}
		return null;
	}
	
}

