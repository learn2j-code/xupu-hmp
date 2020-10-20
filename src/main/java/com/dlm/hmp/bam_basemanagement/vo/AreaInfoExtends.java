package com.dlm.hmp.bam_basemanagement.vo;

import com.dlm.hmp.pojo.AreaInfo;

public class AreaInfoExtends extends AreaInfo{
	private String parentAreaName;

	public String getParentAreaName() {
		return parentAreaName;
	}

	public void setParentAreaName(String parentAreaName) {
		this.parentAreaName = parentAreaName;
	}
}
