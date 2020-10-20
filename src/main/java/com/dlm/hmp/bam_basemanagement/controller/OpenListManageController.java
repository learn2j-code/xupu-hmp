package com.dlm.hmp.bam_basemanagement.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.hmp.bam_basemanagement.service.ErrorInfoService;
import com.dlm.hmp.bam_basemanagement.service.ErrorPictureListService;
import com.dlm.hmp.bam_basemanagement.service.OpenListService;
import com.dlm.hmp.bam_basemanagement.vo.ErrorInfoExtends;
import com.dlm.hmp.bam_basemanagement.vo.RequestEntityForErrorInfo;
import com.dlm.hmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.hmp.constant.CommonConstant;
import com.dlm.hmp.pojo.ErrorInfo;
import com.dlm.hmp.pojo.ErrorPictureList;
import com.dlm.hmp.pojo.OpenList;
import com.dlm.hmp.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;



//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("openlist")
public class OpenListManageController {
	@Autowired
	OpenListService openListService;	
	
	/**
	 * 	查询book id所有
	 * @return
	 */
	@RequestMapping("findOpenListByBookId")
	public @ResponseBody ResponseEntity findOpenListByBookId(@RequestBody OpenList record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<OpenList> openList = openListService.findOpenListByBookId(record);
		data.put("openList", openList);
		responseEntity.setData(data);
		return responseEntity;
	}	
	
//	/**
//	 * 	查询分页查询
//	 * @return
//	 */
//	@RequestMapping("findByPage")
//	public @ResponseBody ResponseEntity findByPage(@RequestBody RequestEntityForErrorInfo requestEntity){
//		Page page = requestEntity.getPage();
//		int pageNum = (page.getStart()-1);
//		if(pageNum<0){
//			return null;
//		}
//		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
//		
//		ResponseEntity responseEntity = new ResponseEntity();
//		Map<String, Object> data = new HashMap<String, Object>();
//		
//		List<ErrorInfoExtends> errorInfoList = errorInfoService.findErrorInfoByCondition(requestEntity.getRequestParameter());
//		
//		int total = (int)new PageInfo<>(errorInfoList).getTotal();
//		page.setTotal(total);
//		page.caculateLast(total);
//		
//		data.put("page", page);
//		data.put("errorInfoList", errorInfoList);
//		responseEntity.setData(data);
//		return responseEntity;
//	}
	
	/**
	 * 	查询该号码是否有权限查看
	 * @return
	 */
	@RequestMapping("findOpenListByPhone")
	public @ResponseBody ResponseEntity findOpenListByPhone(@RequestBody OpenList record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		Boolean enable = false;
		List<OpenList> openList = openListService.findOpenListByPhone(record);
		if(openList!=null&&openList.size()>0) {
			enable = true;
		}
		data.put("enable", enable);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	
	/**
	 * 	查询某个信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody OpenList record){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		OpenList openList = openListService.get(record.getId());
		data.put("openList", openList);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody OpenList record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			Map<String, Object> data = new HashMap<String, Object>();
			openListService.add(record);
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
	public @ResponseBody ResponseEntity update(@RequestBody OpenList record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			openListService.update(record);
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
	public @ResponseBody ResponseEntity deleteById(@RequestBody OpenList record){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			openListService.delete(record.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
}
