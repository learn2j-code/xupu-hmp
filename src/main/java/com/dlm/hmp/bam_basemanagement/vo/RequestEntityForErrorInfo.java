package com.dlm.hmp.bam_basemanagement.vo;

import com.dlm.hmp.bam_basemanagement.vo.RequestEntity;

public class RequestEntityForErrorInfo extends RequestEntity{
	private ErrorInfoExtends requestParameter;

	public ErrorInfoExtends getRequestParameter() {
		return requestParameter;
	}

	public void setRequestParameter(ErrorInfoExtends requestParameter) {
		this.requestParameter = requestParameter;
	}

}
