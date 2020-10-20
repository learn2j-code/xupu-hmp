package com.dlm.hmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.hmp.bam_basemanagement.vo.ErrorInfoExtends;
import com.dlm.hmp.pojo.ErrorInfo;



public interface ErrorInfoService {
	List<ErrorInfo> list();
	void add(ErrorInfoExtends record);
	void update(ErrorInfo record);
	void delete(int id);
	ErrorInfoExtends get(int id);
	
	List<ErrorInfoExtends> findErrorInfoByCondition(ErrorInfo record);
}
