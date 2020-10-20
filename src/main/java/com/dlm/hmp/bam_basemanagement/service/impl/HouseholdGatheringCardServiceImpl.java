package com.dlm.hmp.bam_basemanagement.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.hmp.bam_basemanagement.service.HouseholdGatheringCardService;
import com.dlm.hmp.bam_basemanagement.vo.InputPara;
import com.dlm.hmp.mapper.HouseholdGatheringCardMapper;
import com.dlm.hmp.pojo.HouseholdGatheringCard;
import com.dlm.hmp.pojo.HouseholdGatheringCardExample;
import com.dlm.hmp.pojo.HouseholdGatheringCardExample.Criteria;

@Service
public class HouseholdGatheringCardServiceImpl implements HouseholdGatheringCardService {

	@Autowired
	HouseholdGatheringCardMapper mapper;
	
	@Override
	public List<HouseholdGatheringCard> list() {
		HouseholdGatheringCardExample example = new HouseholdGatheringCardExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(HouseholdGatheringCard record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(HouseholdGatheringCard record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public HouseholdGatheringCard get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<HouseholdGatheringCard> findByCondition(HouseholdGatheringCard condition) {
		HouseholdGatheringCardExample example = new HouseholdGatheringCardExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		if(condition.getFamilyId()!=null) {
			criteria.andFamilyIdEqualTo(condition.getFamilyId());
		}
		if(StringUtils.isNotBlank(condition.getHouseholdCode())) {
			criteria.andHouseholdCodeEqualTo(condition.getHouseholdCode());
		}
		if(StringUtils.isNotBlank(condition.getGatheringDate())) {
			criteria.andGatheringDateEqualTo(condition.getGatheringDate());
		}
		List<HouseholdGatheringCard> householdGatheringCardList = mapper.selectByExample(example);
		return householdGatheringCardList;
	}

	@Override
	public void addBatchHouseholdGatheringCard(InputPara para) {
		Date date = new Date();  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateStr = sdf.format(date);
        
        String numStr = para.getNum().toString();//数值
		Integer numberSize = numStr.length();
		
		for(int i=1;i<=para.getNum();i++) {
			HouseholdGatheringCard record = new HouseholdGatheringCard();
			record.setHouseholdCode(dateStr+String.format("%0"+numberSize+"d",i));
			record.setFamilyId(para.getFamilyId());
			add(record);
		}
	}

//	@Override
//	public HouseholdInfo findHouseholdInfoByOpenId(String openId) {
//		HouseholdInfoExample example = new HouseholdInfoExample();
//		example.setOrderByClause("id desc");
//		example.createCriteria().andOpenIdEqualTo(openId);
//		List<HouseholdInfo> householdInfoList = mapper.selectByExample(example);
//		return householdInfoList.size()>0?householdInfoList.get(0):null;
//	}

	public static void main(String[] args) {
		Integer kk = 100;
		for(int i=1;i<=kk;i++) {
			System.out.println(String.format("%0"+kk.toString().length()+"d",i));
		}
	}
}
