package com.dlm.hmp.mapper;

import com.dlm.hmp.pojo.HouseholdMember;
import com.dlm.hmp.pojo.HouseholdMemberExample;
import java.util.List;

public interface HouseholdMemberMapper {
    int countByExample(HouseholdMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseholdMember record);

    int insertSelective(HouseholdMember record);

    List<HouseholdMember> selectByExample(HouseholdMemberExample example);

    HouseholdMember selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseholdMember record);

    int updateByPrimaryKey(HouseholdMember record);
}