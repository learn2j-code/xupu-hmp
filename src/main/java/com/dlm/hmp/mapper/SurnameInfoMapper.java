package com.dlm.hmp.mapper;

import com.dlm.hmp.pojo.SurnameInfo;
import com.dlm.hmp.pojo.SurnameInfoExample;
import java.util.List;

public interface SurnameInfoMapper {
    int countByExample(SurnameInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SurnameInfo record);

    int insertSelective(SurnameInfo record);

    List<SurnameInfo> selectByExample(SurnameInfoExample example);

    SurnameInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SurnameInfo record);

    int updateByPrimaryKey(SurnameInfo record);
}