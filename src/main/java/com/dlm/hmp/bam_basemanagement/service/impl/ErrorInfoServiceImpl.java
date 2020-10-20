package com.dlm.hmp.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.hmp.bam_basemanagement.service.ErrorInfoService;
import com.dlm.hmp.bam_basemanagement.service.ErrorPictureListService;
import com.dlm.hmp.bam_basemanagement.service.WeixinUserInfoService;
import com.dlm.hmp.bam_basemanagement.vo.ErrorInfoExtends;
import com.dlm.hmp.mapper.ErrorInfoMapper;
import com.dlm.hmp.mapper.WeixinUserInfoMapper;
import com.dlm.hmp.pojo.ErrorInfo;
import com.dlm.hmp.pojo.ErrorInfoExample;
import com.dlm.hmp.pojo.ErrorPictureList;
import com.dlm.hmp.pojo.ErrorInfoExample.Criteria;
import com.dlm.hmp.pojo.WeixinUserInfo;
import com.dlm.hmp.pojo.WeixinUserInfoExample;
@Service
public class ErrorInfoServiceImpl implements ErrorInfoService {

	@Autowired
	ErrorInfoMapper mapper;
	@Autowired
	ErrorPictureListService errorPictureListService;
	@Override
	public List<ErrorInfo> list() {
		ErrorInfoExample example = new ErrorInfoExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(ErrorInfoExtends record) {
		mapper.insertSelective(record);
//		List<ErrorPictureList>  errorPictureList = record.getErrorPictureList();
//		for(ErrorPictureList errorPicture:errorPictureList) {
//			errorPicture.setErrorId(record.getId());
//			errorPictureListService.update(errorPicture);
//		}
	}

	@Override
	public void update(ErrorInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
		errorPictureListService.deleteErrorPictureListByErrorId(id);
	}

	@Override
	public ErrorInfoExtends get(int id) {
		ErrorInfo errorInfo = mapper.selectByPrimaryKey(id);
		ErrorInfoExtends errorInfoExtends = new ErrorInfoExtends();
		BeanUtils.copyProperties(errorInfo, errorInfoExtends);
		List<ErrorPictureList>  errorPictureList = errorPictureListService.findErrorPictureListByErrorId(id);
		errorInfoExtends.setErrorPictureList(errorPictureList);
		return errorInfoExtends;
	}

	@Override
	public List<ErrorInfoExtends> findErrorInfoByCondition(ErrorInfo record) {
		ErrorInfoExample example = new ErrorInfoExample();
		Criteria criteria = example.createCriteria();
		if(record.getErrorType()!=null) {
			criteria.andErrorTypeEqualTo(record.getErrorType());
		}
		if(record.getErrorStatus()!=null) {
			criteria.andErrorStatusEqualTo(record.getErrorStatus());
		}
		List<ErrorInfo> errorList = mapper.selectByExample(example);
		List<ErrorInfoExtends> errorExtendsList = new ArrayList<ErrorInfoExtends>();
		for(ErrorInfo errorInfo:errorList) {
			ErrorInfoExtends errorInfoExtends = new ErrorInfoExtends();
			BeanUtils.copyProperties(errorInfo, errorInfoExtends);
			List<ErrorPictureList>  errorPictureList = errorPictureListService.findErrorPictureListByErrorId(errorInfo.getId());
			errorInfoExtends.setErrorPictureList(errorPictureList);
			errorExtendsList.add(errorInfoExtends);
		}
		return errorExtendsList;
	}



}
