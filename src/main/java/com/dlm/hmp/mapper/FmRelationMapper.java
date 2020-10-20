package com.dlm.hmp.mapper;

import com.dlm.hmp.pojo.FmRelation;
import com.dlm.hmp.pojo.FmRelationExample;
import java.util.List;

public interface FmRelationMapper {
    int countByExample(FmRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FmRelation record);

    int insertSelective(FmRelation record);

    List<FmRelation> selectByExample(FmRelationExample example);

    FmRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FmRelation record);

    int updateByPrimaryKey(FmRelation record);
}