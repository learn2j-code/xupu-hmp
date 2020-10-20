package com.dlm.hmp.mapper;

import com.dlm.hmp.pojo.ErrorInfo;
import com.dlm.hmp.pojo.ErrorInfoExample;
import java.util.List;

public interface ErrorInfoMapper {
    int countByExample(ErrorInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ErrorInfo record);

    int insertSelective(ErrorInfo record);

    List<ErrorInfo> selectByExample(ErrorInfoExample example);

    ErrorInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ErrorInfo record);

    int updateByPrimaryKey(ErrorInfo record);
}