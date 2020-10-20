package com.dlm.hmp.mapper;

import com.dlm.hmp.pojo.FamilyMember;
import com.dlm.hmp.pojo.FamilyMemberExample;
import java.util.List;

public interface FamilyMemberMapper {
    int countByExample(FamilyMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FamilyMember record);

    int insertSelective(FamilyMember record);

    List<FamilyMember> selectByExample(FamilyMemberExample example);

    FamilyMember selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FamilyMember record);

    int updateByPrimaryKey(FamilyMember record);
}