package com.dlm.hmp.mapper;

import com.dlm.hmp.pojo.HouseholdPayEvidence;
import com.dlm.hmp.pojo.HouseholdPayEvidenceExample;
import java.util.List;

public interface HouseholdPayEvidenceMapper {
    int countByExample(HouseholdPayEvidenceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseholdPayEvidence record);

    int insertSelective(HouseholdPayEvidence record);

    List<HouseholdPayEvidence> selectByExample(HouseholdPayEvidenceExample example);

    HouseholdPayEvidence selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseholdPayEvidence record);

    int updateByPrimaryKey(HouseholdPayEvidence record);
}