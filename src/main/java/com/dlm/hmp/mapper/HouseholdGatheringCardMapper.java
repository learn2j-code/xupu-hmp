package com.dlm.hmp.mapper;

import com.dlm.hmp.pojo.HouseholdGatheringCard;
import com.dlm.hmp.pojo.HouseholdGatheringCardExample;
import java.util.List;

public interface HouseholdGatheringCardMapper {
    int countByExample(HouseholdGatheringCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseholdGatheringCard record);

    int insertSelective(HouseholdGatheringCard record);

    List<HouseholdGatheringCard> selectByExample(HouseholdGatheringCardExample example);

    HouseholdGatheringCard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseholdGatheringCard record);

    int updateByPrimaryKey(HouseholdGatheringCard record);
}