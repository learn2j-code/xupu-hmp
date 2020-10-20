package com.dlm.hmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.hmp.bam_basemanagement.service.FamilyMemberService;
import com.dlm.hmp.bam_basemanagement.service.FmHmRelationService;
import com.dlm.hmp.bam_basemanagement.service.FmRelationService;
import com.dlm.hmp.bam_basemanagement.service.GenealogyMemberService;
import com.dlm.hmp.bam_basemanagement.service.HmRelationService;
import com.dlm.hmp.bam_basemanagement.service.HouseholdMemberService;
import com.dlm.hmp.bam_basemanagement.vo.FamilyMemberExtends;
import com.dlm.hmp.bam_basemanagement.vo.PersonInfo;
import com.dlm.hmp.pojo.FamilyMember;
import com.dlm.hmp.pojo.FmHmRelation;
@Service
public class GenealogyMemberServiceImpl implements GenealogyMemberService {

	@Autowired
	HmRelationService hmRelationService;
	@Autowired
	FmRelationService fmRelationService;
	@Autowired
	FmHmRelationService fmHmRelationService;
	@Autowired
	HouseholdMemberService householdMemberService;
	@Autowired
	FamilyMemberService familyMemberService;
	@Override
	public List<FamilyMemberExtends> findGenealogyMemberList(FmHmRelation record) {
		// 1、先根据家庭id查出户主id，根据户主id查出在家族中的id
		Integer mainIdInHousehold = householdMemberService.findMainIdByHouseholdId(record.getHouseholdId());
		Integer mainIdInFamily = fmHmRelationService.findFmIdByHmId(mainIdInHousehold,record.getFamilyId());
		// 2、根据户主在家族中的id，用while一层一层查出父级，直到没有父级了；
		List<Integer> mainIdList = new ArrayList<Integer>();
		mainIdList.add(mainIdInFamily);
		while(mainIdInFamily!=null) {
			Integer parenId = fmRelationService.findParentIdByMainId(mainIdInFamily);
			if(parenId!=null) {
				mainIdList.add(parenId);
			}
			mainIdInFamily = parenId;
		}
		//用所有的父节点查出家族成员列表，并将所有的成员对象进行扩充配偶和子节点对象
		List<FamilyMember> familyMemberList = familyMemberService.findFamilyMemberListByIdList(mainIdList);
		List<FamilyMemberExtends> familyMemberExtendsList = new ArrayList<FamilyMemberExtends>();
		for(FamilyMember familyMember:familyMemberList){
			FamilyMemberExtends familyMemberExtends = new FamilyMemberExtends();
			BeanUtils.copyProperties(familyMember, familyMemberExtends);
			List<PersonInfo> subNodeList = fmRelationService.findSubNodeListByParentId(familyMember.getId());
			List<PersonInfo> spouseNodeList = fmRelationService.findSpouseNodeListByMainId(familyMember.getId());
			PersonInfo parentNode = fmRelationService.findParentNodeByMainId(familyMember.getId());
			PersonInfo mainNode = fmRelationService.findMainNodeBySpouseId(familyMember.getId());
			familyMemberExtends.setMainNode(mainNode);
			familyMemberExtends.setParentNode(parentNode);
			familyMemberExtends.setSubNodeList(subNodeList);
			familyMemberExtends.setSpouseNodeList(spouseNodeList);
			familyMemberExtendsList.add(familyMemberExtends);
		}
		return familyMemberExtendsList;
	}
	
}
