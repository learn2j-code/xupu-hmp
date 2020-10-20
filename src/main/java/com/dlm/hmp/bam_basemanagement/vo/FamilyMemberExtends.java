package com.dlm.hmp.bam_basemanagement.vo;

import java.util.List;

import com.dlm.hmp.pojo.FamilyMember;

public class FamilyMemberExtends extends FamilyMember {
	//前端用
	private String relationship;
	
	private PersonInfo parentNode;
	
	private PersonInfo mainNode;
	
	private List<PersonInfo> subNodeList;
	
	private List<PersonInfo> spouseNodeList;

	private Integer startGeneration;
	
	private Integer endGeneration;

	private Integer relId;
	
	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public PersonInfo getParentNode() {
		return parentNode;
	}

	public void setParentNode(PersonInfo parentNode) {
		this.parentNode = parentNode;
	}

	public List<PersonInfo> getSubNodeList() {
		return subNodeList;
	}

	public void setSubNodeList(List<PersonInfo> subNodeList) {
		this.subNodeList = subNodeList;
	}

	public List<PersonInfo> getSpouseNodeList() {
		return spouseNodeList;
	}

	public void setSpouseNodeList(List<PersonInfo> spouseNodeList) {
		this.spouseNodeList = spouseNodeList;
	}

	public Integer getStartGeneration() {
		return startGeneration;
	}

	public void setStartGeneration(Integer startGeneration) {
		this.startGeneration = startGeneration;
	}

	public Integer getEndGeneration() {
		return endGeneration;
	}

	public void setEndGeneration(Integer endGeneration) {
		this.endGeneration = endGeneration;
	}

	public PersonInfo getMainNode() {
		return mainNode;
	}

	public void setMainNode(PersonInfo mainNode) {
		this.mainNode = mainNode;
	}

	public Integer getRelId() {
		return relId;
	}

	public void setRelId(Integer relId) {
		this.relId = relId;
	}
}
