package com.dlm.hmp.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.hmp.bam_basemanagement.service.HmGatheringCardService;
import com.dlm.hmp.mapper.HmGatheringCardMapper;
import com.dlm.hmp.pojo.HmGatheringCard;
import com.dlm.hmp.pojo.HmGatheringCardExample;
import com.dlm.hmp.pojo.HmGatheringCardExample.Criteria;
@Service
public class HmGatheringCardServiceImpl implements HmGatheringCardService {

	@Autowired
	HmGatheringCardMapper mapper;
	
	@Override
	public List<HmGatheringCard> list() {
		HmGatheringCardExample example = new HmGatheringCardExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(HmGatheringCard record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(HmGatheringCard record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public HmGatheringCard get(int id) {
		return mapper.selectByPrimaryKey(id);
	}
	
	@Override
	public List<HmGatheringCard> findByCondition(HmGatheringCard condition) {
		HmGatheringCardExample example = new HmGatheringCardExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		if(condition.getHgcId()!=null) {
			criteria.andHgcIdEqualTo(condition.getHgcId());
		}
		if(StringUtils.isNotBlank(condition.getHouseholdCode())) {
			criteria.andHouseholdCodeEqualTo(condition.getHouseholdCode());
		}
		List<HmGatheringCard> hmGatheringCardList = mapper.selectByExample(example);
		return hmGatheringCardList;
	}

//	@Override
//	public HouseholdInfo findHouseholdInfoByOpenId(String openId) {
//		HouseholdInfoExample example = new HouseholdInfoExample();
//		example.setOrderByClause("id desc");
//		example.createCriteria().andOpenIdEqualTo(openId);
//		List<HouseholdInfo> householdInfoList = mapper.selectByExample(example);
//		return householdInfoList.size()>0?householdInfoList.get(0):null;
//	}

}
