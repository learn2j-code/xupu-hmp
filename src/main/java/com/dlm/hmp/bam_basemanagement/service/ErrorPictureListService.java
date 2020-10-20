package com.dlm.hmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.hmp.pojo.ErrorPictureList;



public interface ErrorPictureListService {
	List<ErrorPictureList> list();
	void add(ErrorPictureList record);
	void update(ErrorPictureList record);
	void delete(int id);
	ErrorPictureList get(int id);
	
	List<ErrorPictureList> findErrorPictureListByErrorId(Integer errorId);
	void deleteErrorPictureListByErrorId(Integer errorId);
}
