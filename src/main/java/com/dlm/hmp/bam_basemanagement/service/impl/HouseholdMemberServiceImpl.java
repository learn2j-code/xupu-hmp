package com.dlm.hmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.hmp.bam_basemanagement.service.HouseholdInfoService;
import com.dlm.hmp.bam_basemanagement.service.HouseholdMemberService;
import com.dlm.hmp.bam_basemanagement.vo.WeixinUserInfoExtends;
import com.dlm.hmp.bam_basemanagement.service.HmRelationService;
import com.dlm.hmp.constant.CommonConstant;
import com.dlm.hmp.mapper.HouseholdMemberMapper;
import com.dlm.hmp.pojo.HmRelation;
import com.dlm.hmp.pojo.HouseholdMember;
import com.dlm.hmp.pojo.HouseholdMemberExample;
@Service
public class HouseholdMemberServiceImpl implements HouseholdMemberService {

	@Autowired
	HouseholdMemberMapper mapper;
	
	@Autowired
	HmRelationService householdRelationService;
	
	@Override
	public List<HouseholdMember> list() {
		HouseholdMemberExample example = new HouseholdMemberExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(HouseholdMember record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(HouseholdMember record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public HouseholdMember get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<HouseholdMember> findHouseholdMemberListByHouseholdId(Integer id) {
		HouseholdMemberExample example = new HouseholdMemberExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andHouseholdIdEqualTo(id);
		return mapper.selectByExample(example);
	}

	@Override
	public List<HouseholdMember> findHouseholdMemberListByHouseholdIdAndTopMemberId(Integer householdId,
			Integer memberId) {
		//先查出主干成员
		List<HmRelation> sonFatherList = householdRelationService.findMaIdlistByHouseholdIdRelTypeAndMbId(householdId,CommonConstant.RELTYPE_SONFATHER, memberId);
		List<HouseholdMember> householdMemberList = new ArrayList<HouseholdMember>();
		//添加头节点
		householdMemberList.add(get(memberId));
		//添加头节点的配偶节点
		List<HmRelation> spouseMainTopList = householdRelationService.findMaIdlistByHouseholdIdRelTypeAndMbId(householdId,CommonConstant.RELTYPE_SPOUSEMAIN, memberId);
		for(HmRelation spouseMainTop:spouseMainTopList){
			Integer spouseId = spouseMainTop.getMaId();
			HouseholdMember spouse = get(spouseId);
			householdMemberList.add(spouse);
		}
		
		List<HmRelation> sonList = new ArrayList<HmRelation>();
		//穷举该节点下所有主干成员
		while(sonFatherList.size()>0){
			for(HmRelation householdRelation:sonFatherList){
				Integer sonId = householdRelation.getMaId();
				HouseholdMember son = get(sonId);
				householdMemberList.add(son);
				//查出所有子节点的配偶
				List<HmRelation> spouseMainList = householdRelationService.findMaIdlistByHouseholdIdRelTypeAndMbId(householdId,CommonConstant.RELTYPE_SPOUSEMAIN, sonId);
				for(HmRelation spouseMain:spouseMainList){
					Integer spouseId = spouseMain.getMaId();
					HouseholdMember spouse = get(spouseId);
					householdMemberList.add(spouse);
				}
				
				List<HmRelation> tempList = householdRelationService.findMaIdlistByHouseholdIdRelTypeAndMbId(householdId,CommonConstant.RELTYPE_SONFATHER, memberId);
				sonList.addAll(tempList);
			}
			sonFatherList = sonList;
			sonList.clear();
		}
		return householdMemberList;
	}

	@Override
	public Integer findMainIdByHouseholdId(Integer householdId) {
		HouseholdMemberExample example = new HouseholdMemberExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andHouseholdIdEqualTo(householdId).andRelationCodeEqualTo("myself");
		List<HouseholdMember> householdMemberList = mapper.selectByExample(example);
		if(householdMemberList.size()>0) {
			return householdMemberList.get(0).getId();
		}
		return null;
	}

	@Override
	public void addHouseholdMember(HouseholdMember record) {
		// TODO Auto-generated method stub
		//字XX，号XX，X年X月X日X时生，小传，X年X月X日X时没，葬XX
		String memberDetail="";
		if(StringUtils.isNotBlank(record.getSecPersonalName())) {
			memberDetail+=("字"+record.getSecPersonalName()+",");
		}
		if(StringUtils.isNotBlank(record.getMark())) {
			memberDetail+=("号"+record.getMark()+",");
		}
		if(StringUtils.isNotBlank(record.getBirthdayTimeTra())) {
			memberDetail+=(record.getBirthdayTimeTra()+"生,");
		}
		if(StringUtils.isNotBlank(record.getMemberStory())) {
			memberDetail+=(record.getMemberStory()+",");
		}
		if(StringUtils.isNotBlank(record.getDeathdayTimeTra())) {
			memberDetail+=(record.getDeathdayTimeTra()+"殁,");
		}
		if(StringUtils.isNotBlank(record.getBuriedLocation())) {
			memberDetail+=("葬"+record.getBuriedLocation());
		}
		if(memberDetail.endsWith(",")) {
			memberDetail = memberDetail.substring(0, memberDetail.length()-2);
		}
		record.setMemberDetail(memberDetail);
		add(record);
	}

	@Override
	public void updateHouseholdMember(HouseholdMember record) {
		// TODO Auto-generated method stub
		update(record);
		HouseholdMember householdMember = get(record.getId());
		//字XX，号XX，X年X月X日X时生，小传，X年X月X日X时没，葬XX
		String memberDetail="";
		if(StringUtils.isNotBlank(householdMember.getSecPersonalName())) {
			memberDetail+=("字"+householdMember.getSecPersonalName()+",");
		}
		if(StringUtils.isNotBlank(householdMember.getMark())) {
			memberDetail+=("号"+householdMember.getMark()+",");
		}
		if(StringUtils.isNotBlank(householdMember.getBirthdayTimeTra())) {
			memberDetail+=(householdMember.getBirthdayTimeTra()+"生,");
		}
		if(StringUtils.isNotBlank(householdMember.getMemberStory())) {
			memberDetail+=(householdMember.getMemberStory()+",");
		}
		if(StringUtils.isNotBlank(householdMember.getDeathdayTimeTra())) {
			memberDetail+=(householdMember.getDeathdayTimeTra()+"殁,");
		}
		if(StringUtils.isNotBlank(householdMember.getBuriedLocation())) {
			memberDetail+=("葬"+householdMember.getBuriedLocation());
		}
		if(memberDetail.endsWith(",")) {
			memberDetail = memberDetail.substring(0, memberDetail.length()-2);
		}
		householdMember.setMemberDetail(memberDetail);
		update(householdMember);
	}

	@Override
	public void addMyselfBy(WeixinUserInfoExtends weixinUserInfoExtends) {
		HouseholdMember householdMember = new HouseholdMember();
		householdMember.setRelationCode("myself");
		householdMember.setRelationName("自己");
		householdMember.setHouseholdId(weixinUserInfoExtends.getHouseholdId());
		householdMember.setMemberSurname(weixinUserInfoExtends.getSurname());
		householdMember.setMemberName(weixinUserInfoExtends.getSecName());
		householdMember.setMemberGender(weixinUserInfoExtends.getSex());
//		householdMember.setBirthdayTime(weixinUserInfoExtends.getBirthday());
		householdMember.setNativePlace(weixinUserInfoExtends.getNativePlace());
//		householdMember.setAddressDetail(weixinUserInfoExtends.getLocation());
		householdMember.setPhone(weixinUserInfoExtends.getPhone());
//		householdMember.setIdentityNo(weixinUserInfoExtends.getIdentityNo());
		householdMember.setGenerationLevelCode(5);
		householdMember.setRanking(weixinUserInfoExtends.getRanking());
		householdMember.setHeadImage(weixinUserInfoExtends.getHeadimgurl());
		add(householdMember);
		
	}
}
