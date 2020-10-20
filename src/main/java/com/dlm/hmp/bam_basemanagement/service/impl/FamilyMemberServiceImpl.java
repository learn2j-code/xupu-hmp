package com.dlm.hmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.hmp.bam_basemanagement.service.FamilyMemberService;
import com.dlm.hmp.bam_basemanagement.service.FmRelationService;
import com.dlm.hmp.bam_basemanagement.vo.PersonInfo;
import com.dlm.hmp.constant.CommonConstant;
import com.dlm.hmp.mapper.FamilyMemberMapper;
import com.dlm.hmp.pojo.FamilyMember;
import com.dlm.hmp.pojo.FamilyMemberExample;
import com.dlm.hmp.pojo.FamilyMemberExample.Criteria;
import com.dlm.hmp.pojo.FmRelation;

@Service
public class FamilyMemberServiceImpl implements FamilyMemberService {
	@Autowired
	FamilyMemberMapper mapper;
	
	@Autowired
	FmRelationService fmRelationService;
	@Override
	public List<FamilyMember> list() {
		FamilyMemberExample example = new FamilyMemberExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(FamilyMember record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(FamilyMember record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public FamilyMember get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<FamilyMember> findFamilyMemberListByBaseInfo(FamilyMember record) {
		FamilyMemberExample example = new FamilyMemberExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(record.getSecPersonalName()!=null) {
			criteria.andSecPersonalNameEqualTo(record.getSecPersonalName());
		}
		criteria.andMemberNameEqualTo(record.getMemberName());
		criteria.andMemberGenderEqualTo(record.getMemberGender());
		if(record.getSecPersonalName()!=null) {
			criteria.andSecPersonalNameEqualTo(record.getSecPersonalName());
		}
		if(record.getGenerationWord()!=null) {
			criteria.andGenerationWordEqualTo(record.getGenerationWord());
		}
		return mapper.selectByExample(example);
	}


	@Override
	public List<FamilyMember> findMainMemberListByFuzzyName(FamilyMember record) {
		FamilyMemberExample example = new FamilyMemberExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		//查询当前家族id下还有哪些分支家族id
//		List<Integer> familyIdList = 
//		criteria.andFamilyIdIn(familyIdList);
		criteria.andFamilyIdEqualTo(record.getFamilyId());
		criteria.andMemberNameLike("%"+record.getMemberName()+"%");
		if(record.getGenerationNum()!=null) {
			criteria.andGenerationNumEqualTo(record.getGenerationNum()-1);
		}
		return mapper.selectByExample(example);
	}

	@Override
	public List<FamilyMember> findFamilyMemberListByFamilyId(Integer familyId) {
		FamilyMemberExample example = new FamilyMemberExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		criteria.andFamilyIdEqualTo(familyId);
		return mapper.selectByExample(example);
	}

	@Override
	public List<FamilyMember> findFamilyMemberListByIdList(List<Integer> idList) {
		FamilyMemberExample example = new FamilyMemberExample();
		example.setOrderByClause("generation_num asc");
		Criteria criteria = example.createCriteria();
		criteria.andIdIn(idList);
		return mapper.selectByExample(example);
	}

//	@Override
//	public List<FamilyMemberExtends> findFamilyMemberExtendsListByNum(FamilyMemberExtends record) {
//		FamilyMemberExample example = new FamilyMemberExample();
//		example.setOrderByClause("order_no asc");
//		Criteria criteria = example.createCriteria();
//		//TODO: 需要查询该家族下的所有子家族节点id列表
////		criteria.andFamilyIdIn(values);
//		criteria.andFamilyIdEqualTo(record.getFamilyId());
//		List<FamilyMember> familyMemberList = mapper.selectByExample(example);
//		List<FamilyMemberExtends> familyMemberExtendsList = new ArrayList<FamilyMemberExtends>();
//		for(FamilyMember familyMember:familyMemberList){
//			FamilyMemberExtends familyMemberExtends = new FamilyMemberExtends();
//			BeanUtils.copyProperties(familyMember, familyMemberExtends);
//			List<PersonInfo> subNodeList = fmRelationService.findSubNodeListByParentId(familyMember.getId());
//			List<PersonInfo> spouseNodeList = fmRelationService.findSpouseNodeListByMainId(familyMember.getId());
//			PersonInfo parentNode = fmRelationService.findParentNodeByMainId(familyMember.getId());
//			PersonInfo mainNode = fmRelationService.findMainNodeBySpouseId(familyMember.getId());
//			familyMemberExtends.setMainNode(mainNode);
//			familyMemberExtends.setParentNode(parentNode);
//			familyMemberExtends.setSubNodeList(subNodeList);
//			familyMemberExtends.setSpouseNodeList(spouseNodeList);
//			familyMemberExtendsList.add(familyMemberExtends);
//		}
//		return familyMemberExtendsList;
//	}

}
