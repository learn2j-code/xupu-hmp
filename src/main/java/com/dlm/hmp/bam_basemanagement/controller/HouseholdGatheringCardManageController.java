package com.dlm.hmp.bam_basemanagement.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.hmp.bam_basemanagement.service.HouseholdGatheringCardService;
import com.dlm.hmp.bam_basemanagement.service.HouseholdInfoService;
import com.dlm.hmp.bam_basemanagement.vo.InputPara;
import com.dlm.hmp.bam_basemanagement.vo.RequestEntity;
import com.dlm.hmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.hmp.constant.CommonConstant;
import com.dlm.hmp.pojo.HouseholdGatheringCard;
import com.dlm.hmp.pojo.HouseholdInfo;
import com.dlm.hmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;



//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("householdgatheringcardmanage")
public class HouseholdGatheringCardManageController {
	@Autowired
	HouseholdGatheringCardService service;	
	
	
	/**
	 * 	查询分页查询
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
		
		List<HouseholdGatheringCard> householdGatheringCardList = service.findByCondition(requestEntity.getHouseholdGatheringCard());
		
		int total = (int)new PageInfo<>(householdGatheringCardList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("list", householdGatheringCardList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个家庭信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody HouseholdGatheringCard record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		HouseholdGatheringCard para = service.get(record.getId());
		data.put("record", para);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	批量添加
	 * @param InputPara
	 * @return
	 */
	@RequestMapping("addBatchHouseholdGatheringCard")
	public @ResponseBody ResponseEntity addBatchHouseholdGatheringCard(@RequestBody InputPara record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			service.addBatchHouseholdGatheringCard(record);
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
	public @ResponseBody ResponseEntity add(@RequestBody HouseholdGatheringCard record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			service.add(record);
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
	public @ResponseBody ResponseEntity update(@RequestBody HouseholdGatheringCard record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			service.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody HouseholdGatheringCard record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			service.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
}
