package com.dlm.hmp.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.hmp.bam_basemanagement.service.ErrorInfoService;
import com.dlm.hmp.bam_basemanagement.service.ErrorPictureListService;
import com.dlm.hmp.bam_basemanagement.service.WeixinUserInfoService;
import com.dlm.hmp.mapper.ErrorPictureListMapper;
import com.dlm.hmp.pojo.ErrorPictureList;
import com.dlm.hmp.pojo.ErrorPictureListExample;
import com.dlm.hmp.pojo.ErrorPictureListExample.Criteria;
@Service
public class ErrorPictureListServiceImpl implements ErrorPictureListService {

	@Autowired
	ErrorPictureListMapper mapper;
	
	@Override
	public List<ErrorPictureList> list() {
		ErrorPictureListExample example = new ErrorPictureListExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(ErrorPictureList record) {
		mapper.insertSelective(record);
	}

	@Override
	public void update(ErrorPictureList record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public ErrorPictureList get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<ErrorPictureList> findErrorPictureListByErrorId(Integer errorId) {
		ErrorPictureListExample example = new ErrorPictureListExample();
		Criteria criteria = example.createCriteria();
		if(errorId!=null) {
			criteria.andErrorIdEqualTo(errorId);
		}
		return mapper.selectByExample(example);
	}

	@Override
	public void deleteErrorPictureListByErrorId(Integer errorId) {
		ErrorPictureListExample example = new ErrorPictureListExample();
		Criteria criteria = example.createCriteria();
		if(errorId!=null) {
			criteria.andErrorIdEqualTo(errorId);
		}
		List<ErrorPictureList> errorPictureList = mapper.selectByExample(example);
		for(ErrorPictureList errorPicture:errorPictureList) {
			delete(errorPicture.getId());
		}
			
	}


}
