package com.dlm.hmp.bam_basemanagement.vo;

import java.util.List;

import com.dlm.hmp.pojo.ErrorInfo;
import com.dlm.hmp.pojo.ErrorPictureList;

public class ErrorInfoExtends extends ErrorInfo{
	List<ErrorPictureList> errorPictureList;

	public List<ErrorPictureList> getErrorPictureList() {
		return errorPictureList;
	}

	public void setErrorPictureList(List<ErrorPictureList> errorPictureList) {
		this.errorPictureList = errorPictureList;
	}
}
