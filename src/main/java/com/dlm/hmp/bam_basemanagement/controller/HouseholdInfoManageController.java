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

import com.dlm.hmp.bam_basemanagement.service.HouseholdInfoService;
import com.dlm.hmp.bam_basemanagement.vo.RequestEntity;
import com.dlm.hmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.hmp.constant.CommonConstant;
import com.dlm.hmp.pojo.HouseholdInfo;
import com.dlm.hmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;



//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("householdinfomanage")
public class HouseholdInfoManageController {
	@Autowired
	HouseholdInfoService householdInfoService;	
	
	
	/**
	 * 	查询所有家庭
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<HouseholdInfo> householdInfoList = householdInfoService.list();
		data.put("householdInfoList", householdInfoList);
		responseEntity.setData(data);
		return responseEntity;
	}	
	
	/**
	 * 	查询分页查询家庭
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
		
		List<HouseholdInfo> householdInfoList = householdInfoService.list();
		
		int total = (int)new PageInfo<>(householdInfoList).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("householdInfoList", householdInfoList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据openid查询某个家庭信息
	 * @return
	 */
	@RequestMapping("findHouseholdInfoByOpenId")
	public @ResponseBody ResponseEntity findHouseholdInfoByOpenId(@RequestBody HouseholdInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		HouseholdInfo householdInfo = householdInfoService.findHouseholdInfoByOpenId(record.getOpenId());
		if(householdInfo==null) {
			householdInfo = new HouseholdInfo();
			householdInfo.setHouseholdName("xx的家庭");
			householdInfo.setOpenId(record.getOpenId());
			Date date = new Date();
			String strDate = new SimpleDateFormat("yyyyMMdd").format(date);
			String strDateTime = new SimpleDateFormat("HHmmss").format(date);
			householdInfo.setHouseholdCode("HI"+strDate+strDateTime);
			householdInfoService.add(householdInfo);
		}
		data.put("householdInfo", householdInfo);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个家庭信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody HouseholdInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		HouseholdInfo householdInfo = householdInfoService.get(record.getId());
		data.put("householdInfo", householdInfo);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody HouseholdInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdInfoService.add(record);
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
	public @ResponseBody ResponseEntity update(@RequestBody HouseholdInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdInfoService.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody HouseholdInfo record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			householdInfoService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
}
