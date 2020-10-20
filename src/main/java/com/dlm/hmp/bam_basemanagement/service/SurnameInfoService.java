package com.dlm.hmp.bam_basemanagement.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dlm.hmp.pojo.SurnameInfo;


public interface SurnameInfoService {
	List<SurnameInfo> list();
	void add(SurnameInfo record);
	void update(SurnameInfo record);
	void delete(int id);
	SurnameInfo get(int id);
	//通过姓氏名查找姓氏信息
	SurnameInfo findSurnameInfoByName(String surname);
	//通过字数查找姓氏信息
	List<SurnameInfo> findSurnameListByWordNum(Integer wordNum);
	//按字母封装姓氏列表
	HashMap<String,List<SurnameInfo>> packSurnameMap(List<SurnameInfo> surnameList);
	//查询姓氏中最大的字数是多少
	Integer findMaxWordNumInSurname();
}
