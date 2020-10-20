package com.dlm.hmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.hmp.bam_basemanagement.service.ErrorInfoService;
import com.dlm.hmp.bam_basemanagement.service.ErrorPictureListService;
import com.dlm.hmp.bam_basemanagement.service.OpenListService;
import com.dlm.hmp.bam_basemanagement.service.WeixinUserInfoService;
import com.dlm.hmp.bam_basemanagement.vo.ErrorInfoExtends;
import com.dlm.hmp.mapper.ErrorInfoMapper;
import com.dlm.hmp.mapper.OpenListMapper;
import com.dlm.hmp.mapper.WeixinUserInfoMapper;
import com.dlm.hmp.pojo.ErrorInfo;
import com.dlm.hmp.pojo.ErrorInfoExample;
import com.dlm.hmp.pojo.ErrorPictureList;
import com.dlm.hmp.pojo.OpenList;
import com.dlm.hmp.pojo.OpenListExample;
import com.dlm.hmp.pojo.ErrorInfoExample.Criteria;
import com.dlm.hmp.pojo.WeixinUserInfo;
import com.dlm.hmp.pojo.WeixinUserInfoExample;
@Service
public class OpenListServiceImpl implements OpenListService {

	@Autowired
	OpenListMapper mapper;
	@Override
	public List<OpenList> list() {
		OpenListExample example = new OpenListExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(OpenList record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(OpenList record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public OpenList get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<OpenList> findOpenListByPhone(OpenList record) {
		OpenListExample example = new OpenListExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andPhoneEqualTo(record.getPhone()).andBookIdEqualTo(record.getBookId());
		return mapper.selectByExample(example);
	}

	@Override
	public List<OpenList> findOpenListByBookId(OpenList record) {
		OpenListExample example = new OpenListExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andBookIdEqualTo(record.getBookId());
		return mapper.selectByExample(example);
	}



}
