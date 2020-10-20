package com.dlm.hmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.hmp.pojo.OpenList;

public interface OpenListService {
	List<OpenList> list();
	void add(OpenList record);
	void update(OpenList record);
	void delete(int id);
	OpenList get(int id);
	
	List<OpenList> findOpenListByPhone(OpenList record);
	List<OpenList> findOpenListByBookId(OpenList record);
}
