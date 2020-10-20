package com.dlm.hmp.mapper;

import com.dlm.hmp.pojo.FmHmRelation;
import com.dlm.hmp.pojo.FmHmRelationExample;
import java.util.List;

public interface FmHmRelationMapper {
    int countByExample(FmHmRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FmHmRelation record);

    int insertSelective(FmHmRelation record);

    List<FmHmRelation> selectByExample(FmHmRelationExample example);

    FmHmRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FmHmRelation record);

    int updateByPrimaryKey(FmHmRelation record);
}