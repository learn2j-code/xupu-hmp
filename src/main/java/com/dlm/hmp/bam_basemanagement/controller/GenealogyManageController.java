package com.dlm.hmp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dlm.hmp.bam_basemanagement.service.GenealogyMemberService;
import com.dlm.hmp.bam_basemanagement.service.HmRelationService;
import com.dlm.hmp.bam_basemanagement.vo.FamilyMemberExtends;
import com.dlm.hmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.hmp.constant.CommonConstant;
import com.dlm.hmp.pojo.FmHmRelation;
import com.dlm.hmp.pojo.HouseholdMember;



//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("genealogymanage")
public class GenealogyManageController {
	
	@Autowired
	GenealogyMemberService genealogyMemberService;
	/**
	 * 	根据家庭id和家族id查询家族世系列表
	 * @return
	 */
	@RequestMapping("findGenealogyMemberList")
	public @ResponseBody ResponseEntity findGenealogyMemberList(@RequestBody FmHmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		List<FamilyMemberExtends> genealogyMemberList = genealogyMemberService.findGenealogyMemberList(record);
		data.put("genealogyMemberList", genealogyMemberList);
		responseEntity.setData(data);
		return responseEntity;
	}
}
