package com.dlm.hmp.bam_basemanagement.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.hmp.bam_basemanagement.service.HouseholdPaymentService;
import com.dlm.hmp.mapper.HouseholdPaymentMapper;
import com.dlm.hmp.pojo.HouseholdPayment;
import com.dlm.hmp.pojo.HouseholdPaymentExample;
import com.dlm.hmp.pojo.HouseholdPaymentExample.Criteria;
@Service
public class HouseholdPaymentServiceImpl implements HouseholdPaymentService {

	@Autowired
	HouseholdPaymentMapper mapper;
	
	@Override
	public List<HouseholdPayment> list() {
		HouseholdPaymentExample example = new HouseholdPaymentExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(HouseholdPayment record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(HouseholdPayment record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public HouseholdPayment get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<HouseholdPayment> findHouseholdPaymentList(HouseholdPayment record) {
		HouseholdPaymentExample example = new HouseholdPaymentExample();
		example.setOrderByClause("id asc");
		Criteria criteria = example.createCriteria();
		if(record.getHouseholdId()!=-1) {
			criteria.andHouseholdIdEqualTo(record.getHouseholdId());
		}
		if(record.getFamilyId()!=-1) {
			criteria.andFamilyIdEqualTo(record.getFamilyId());
		}
		if(StringUtils.isNotBlank(record.getOutTradeNo())) {
			criteria.andOutTradeNoEqualTo(record.getOutTradeNo());
		}
		if(record.getPayDone()!=-1) {
			criteria.andHouseholdIdEqualTo(record.getPayDone());
		}
		if(record.getPaymentWay()!=-1) {
			criteria.andFamilyIdEqualTo(record.getPaymentWay());
		}
		return mapper.selectByExample(example);
	}

}
