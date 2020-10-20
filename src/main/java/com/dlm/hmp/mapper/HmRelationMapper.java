package com.dlm.hmp.mapper;

import com.dlm.hmp.pojo.HmRelation;
import com.dlm.hmp.pojo.HmRelationExample;
import java.util.List;

public interface HmRelationMapper {
    int countByExample(HmRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HmRelation record);

    int insertSelective(HmRelation record);

    List<HmRelation> selectByExample(HmRelationExample example);

    HmRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HmRelation record);

    int updateByPrimaryKey(HmRelation record);
}