package com.dlm.hmp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.hmp.bam_basemanagement.service.HouseholdMemberService;
import com.dlm.hmp.bam_basemanagement.vo.RequestEntity;
import com.dlm.hmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.hmp.constant.CommonConstant;
import com.dlm.hmp.pojo.HouseholdMember;
import com.dlm.hmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;



//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("householdmembermanage")
public class HouseholdMemberManageController {
	@Autowired
	HouseholdMemberService householdMemberService;	
	
	
	/**
	 * 	查询所有家庭成员
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<HouseholdMember> householdMemberList = householdMemberService.list();
		data.put("householdMemberList", householdMemberList);
		responseEntity.setData(data);
		return responseEntity;
	}	
	
	/**
	 * 	根据家庭id和头节点查询家庭成员列表
	 * @return
	 */
	@RequestMapping("findHouseholdMemberListByHouseholdIdAndTopMemberId")
	public @ResponseBody ResponseEntity findHouseholdMemberListByHouseholdIdAndTopMemberId(@RequestBody HouseholdMember record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		List<HouseholdMember> householdMemberList = householdMemberService.findHouseholdMemberListByHouseholdIdAndTopMemberId(record.getHouseholdId(),record.getId());
		data.put("householdMemberList", householdMemberList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据家庭id查询家庭成员列表
	 * @return
	 */
	@RequestMapping("findHouseholdMemberListByHouseholdId")
	public @ResponseBody ResponseEntity findHouseholdMemberListByHouseholdId(@RequestBody HouseholdMember record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		List<HouseholdMember> householdMemberList = householdMemberService.findHouseholdMemberListByHouseholdId(record.getHouseholdId());
		data.put("householdMemberList", householdMemberList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询分页查询家庭成员
	 * @return
	 */
	@RequestMapping("findByPage")
	public @ResponseBody ResponseEntity findByPage(@RequestBody RequestEntity requestEntity){
		Page page = requestEntity.getPage();
		int pageNum = (page.getStart()-1);
		if(pageNum<0){
			return null;
		}
		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
		
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<HouseholdMember> householdMemberList = householdMemberService.list();
		
		int total = (int)new PageInfo<>(householdMemberList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("householdMemberList", householdMemberList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个家庭成员信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody HouseholdMember record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		HouseholdMember householdMember = householdMemberService.get(record.getId());
		data.put("householdMember", householdMember);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody HouseholdMember record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		try {
			householdMemberService.add(record);
			data.put("record", record);
			responseEntity.setData(data);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	编辑
	 * @param update
	 * @return
	 */
	@RequestMapping("update")
	public @ResponseBody ResponseEntity update(@RequestBody HouseholdMember record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdMemberService.update(record);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	/**
	 * 	删除
	 * @param deleteById
	 * @return
	 */
	@RequestMapping("deleteById")
	public @ResponseBody ResponseEntity deleteById(@RequestBody HouseholdMember record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdMemberService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
}
