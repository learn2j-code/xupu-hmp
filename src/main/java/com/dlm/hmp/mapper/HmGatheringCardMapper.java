package com.dlm.hmp.mapper;

import com.dlm.hmp.pojo.HmGatheringCard;
import com.dlm.hmp.pojo.HmGatheringCardExample;
import java.util.List;

public interface HmGatheringCardMapper {
    int countByExample(HmGatheringCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HmGatheringCard record);

    int insertSelective(HmGatheringCard record);

    List<HmGatheringCard> selectByExample(HmGatheringCardExample example);

    HmGatheringCard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HmGatheringCard record);

    int updateByPrimaryKey(HmGatheringCard record);
}