package com.dlm.hmp.mapper;

import com.dlm.hmp.pojo.HouseholdInfo;
import com.dlm.hmp.pojo.HouseholdInfoExample;
import java.util.List;

public interface HouseholdInfoMapper {
    int countByExample(HouseholdInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseholdInfo record);

    int insertSelective(HouseholdInfo record);

    List<HouseholdInfo> selectByExample(HouseholdInfoExample example);

    HouseholdInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseholdInfo record);

    int updateByPrimaryKey(HouseholdInfo record);
}