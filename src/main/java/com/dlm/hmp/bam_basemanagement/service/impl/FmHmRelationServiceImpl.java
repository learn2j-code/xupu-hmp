package com.dlm.hmp.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.hmp.bam_basemanagement.service.FmHmRelationService;
import com.dlm.hmp.mapper.FmHmRelationMapper;
import com.dlm.hmp.pojo.FmHmRelation;
import com.dlm.hmp.pojo.FmHmRelationExample;

@Service
public class FmHmRelationServiceImpl implements FmHmRelationService {
	@Autowired
	FmHmRelationMapper mapper;

	@Override
	public List<FmHmRelation> list() {
		FmHmRelationExample example = new FmHmRelationExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(FmHmRelation record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(FmHmRelation record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public FmHmRelation get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<FmHmRelation> findHmListByFmId(Integer fmId) {
		FmHmRelationExample example = new FmHmRelationExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andFamilyMemberIdEqualTo(fmId);
		return mapper.selectByExample(example);
	}

	@Override
	public Integer findFmIdByHmId(Integer hmId, Integer familyId) {
		FmHmRelationExample example = new FmHmRelationExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andHouseholdMemberIdEqualTo(hmId).andFamilyIdEqualTo(familyId);
		List<FmHmRelation> fmHmRelationList = mapper.selectByExample(example);
		if(fmHmRelationList.size()>0) {
			return fmHmRelationList.get(0).getFamilyMemberId();
		}
		return null;
	}

}
