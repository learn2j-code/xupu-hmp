package com.dlm.hmp.mapper;

import com.dlm.hmp.pojo.WechatInfo;
import com.dlm.hmp.pojo.WechatInfoExample;
import java.util.List;

public interface WechatInfoMapper {
    int countByExample(WechatInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WechatInfo record);

    int insertSelective(WechatInfo record);

    List<WechatInfo> selectByExample(WechatInfoExample example);

    WechatInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WechatInfo record);

    int updateByPrimaryKey(WechatInfo record);
}