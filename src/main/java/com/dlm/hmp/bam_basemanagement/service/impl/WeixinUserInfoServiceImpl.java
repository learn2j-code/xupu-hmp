package com.dlm.hmp.bam_basemanagement.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dlm.hmp.bam_basemanagement.service.HouseholdInfoService;
import com.dlm.hmp.bam_basemanagement.service.HouseholdMemberService;
import com.dlm.hmp.bam_basemanagement.service.WeixinUserInfoService;
import com.dlm.hmp.bam_basemanagement.vo.WeixinUserInfoExtends;
import com.dlm.hmp.mapper.WeixinUserInfoMapper;
import com.dlm.hmp.pojo.HouseholdInfo;
import com.dlm.hmp.pojo.WeixinUserInfo;
import com.dlm.hmp.pojo.WeixinUserInfoExample;
@Service
public class WeixinUserInfoServiceImpl implements WeixinUserInfoService {

	@Autowired
	WeixinUserInfoMapper mapper;
	@Autowired
	HouseholdMemberService householdMemberService;	
	@Autowired
	HouseholdInfoService householdInfoService;
	@Override
	public List<WeixinUserInfo> list() {
		WeixinUserInfoExample example = new WeixinUserInfoExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void add(WeixinUserInfoExtends record) {
		mapper.insertSelective(record);
		//创建家庭
		HouseholdInfo householdInfo = new HouseholdInfo();
		householdInfo.setHouseholdName(record.getSurname()+record.getSecName()+"的家庭");
		householdInfo.setOpenId(record.getOpenid());
		Date date = new Date();
		String strDate = new SimpleDateFormat("yyyyMMdd").format(date);
		String strDateTime = new SimpleDateFormat("HHmmss").format(date);
		householdInfo.setHouseholdCode("HI"+strDate+strDateTime);
		householdInfoService.add(householdInfo);
		record.setHouseholdId(householdInfo.getId());
		//添加家庭及个人名片
		householdMemberService.addMyselfBy(record);
	}

	@Override
	public void update(WeixinUserInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public WeixinUserInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public WeixinUserInfo findWeixinUserInfoByOpenid(String openid) {
		WeixinUserInfoExample example = new WeixinUserInfoExample();
		example.createCriteria().andOpenidEqualTo(openid);
		List<WeixinUserInfo> weixinUserInfoList = mapper.selectByExample(example);
		if(weixinUserInfoList!=null&&weixinUserInfoList.size()>0) {
			return weixinUserInfoList.get(0);
		}
		return null;
	}


}
