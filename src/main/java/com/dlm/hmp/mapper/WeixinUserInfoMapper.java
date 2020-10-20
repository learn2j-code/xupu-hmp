package com.dlm.hmp.mapper;

import com.dlm.hmp.pojo.WeixinUserInfo;
import com.dlm.hmp.pojo.WeixinUserInfoExample;
import java.util.List;

public interface WeixinUserInfoMapper {
    int countByExample(WeixinUserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeixinUserInfo record);

    int insertSelective(WeixinUserInfo record);

    List<WeixinUserInfo> selectByExample(WeixinUserInfoExample example);

    WeixinUserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WeixinUserInfo record);

    int updateByPrimaryKey(WeixinUserInfo record);
}