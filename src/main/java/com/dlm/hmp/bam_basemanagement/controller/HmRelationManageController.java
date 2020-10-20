package com.dlm.hmp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.hmp.bam_basemanagement.service.HmRelationService;
import com.dlm.hmp.bam_basemanagement.vo.RequestEntity;
import com.dlm.hmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.hmp.constant.CommonConstant;
import com.dlm.hmp.pojo.HmRelation;
import com.dlm.hmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;



//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("hmrelationmanage")
public class HmRelationManageController {
	@Autowired
	HmRelationService hmRelationService;	
	
	
	/**
	 * 	查询所有家庭成员关系
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<HmRelation> hmRelationList = hmRelationService.list();
		data.put("hmRelationList", hmRelationList);
		responseEntity.setData(data);
		return responseEntity;
	}	
	
	/**
	 * 	查询分页查询家庭成员关系
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
		
		List<HmRelation> hmRelationList = hmRelationService.list();
		
		int total = (int)new PageInfo<>(hmRelationList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("hmRelationList", hmRelationList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个家庭成员关系信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody HmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		HmRelation hmRelation = hmRelationService.get(record.getId());
		data.put("hmRelation", hmRelation);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	 根据家庭id生成家庭成员之间的关系
	 * @param createHmRelationByHouseholdId
	 * @return
	 */
	@RequestMapping("createHmRelationByHouseholdId")
	public @ResponseBody ResponseEntity createHmRelationByHouseholdId(@RequestBody HmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			hmRelationService.createHmRelationByHouseholdId(record.getHouseholdId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody HmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			hmRelationService.add(record);
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
	public @ResponseBody ResponseEntity update(@RequestBody HmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			hmRelationService.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody HmRelation record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			hmRelationService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
}
