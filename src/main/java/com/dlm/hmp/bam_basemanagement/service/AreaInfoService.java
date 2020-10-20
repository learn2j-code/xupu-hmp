package com.dlm.hmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.hmp.pojo.AreaInfo;

public interface AreaInfoService {
	List<AreaInfo> list();
	void add(AreaInfo record);
	void update(AreaInfo record);
	void delete(int id);
	AreaInfo get(int id);
	
	AreaInfo findAreaInfoByCodeId(Integer codeId);
	//通过区域编码和类型查询区域
	List<AreaInfo> findAreaInfoListByParentId(Integer parentId);
	//根据区域名称模糊查询区域信息列表
	List<AreaInfo> findAreaInfoListByAreaName(String areaName);
}
