package com.dlm.hmp.mapper;

import com.dlm.hmp.pojo.OpenList;
import com.dlm.hmp.pojo.OpenListExample;
import java.util.List;

public interface OpenListMapper {
    int countByExample(OpenListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OpenList record);

    int insertSelective(OpenList record);

    List<OpenList> selectByExample(OpenListExample example);

    OpenList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpenList record);

    int updateByPrimaryKey(OpenList record);
}