package com.dlm.hmp.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.hmp.bam_basemanagement.service.HouseholdInfoService;
import com.dlm.hmp.mapper.HouseholdInfoMapper;
import com.dlm.hmp.pojo.HouseholdInfo;
import com.dlm.hmp.pojo.HouseholdInfoExample;
@Service
public class HouseholdInfoServiceImpl implements HouseholdInfoService {

	@Autowired
	HouseholdInfoMapper mapper;
	
	@Override
	public List<HouseholdInfo> list() {
		HouseholdInfoExample example = new HouseholdInfoExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(HouseholdInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(HouseholdInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public HouseholdInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public HouseholdInfo findHouseholdInfoByOpenId(String openId) {
		HouseholdInfoExample example = new HouseholdInfoExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andOpenIdEqualTo(openId);
		List<HouseholdInfo> householdInfoList = mapper.selectByExample(example);
		return householdInfoList.size()>0?householdInfoList.get(0):null;
	}

}
