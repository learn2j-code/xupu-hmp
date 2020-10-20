package com.dlm.hmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.hmp.bam_basemanagement.vo.FamilyMemberExtends;
import com.dlm.hmp.pojo.FmHmRelation;


public interface GenealogyMemberService {
	
	List<FamilyMemberExtends> findGenealogyMemberList(FmHmRelation record);
}
