package com.dlm.hmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.hmp.bam_basemanagement.vo.WeixinUserInfoExtends;
import com.dlm.hmp.pojo.WeixinUserInfo;



public interface WeixinUserInfoService {
	List<WeixinUserInfo> list();
	void add(WeixinUserInfoExtends record);
	void update(WeixinUserInfo record);
	void delete(int id);
	WeixinUserInfo get(int id);
	
	WeixinUserInfo findWeixinUserInfoByOpenid(String openid);
}
