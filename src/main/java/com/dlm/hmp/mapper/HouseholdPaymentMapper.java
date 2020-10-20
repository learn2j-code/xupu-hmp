package com.dlm.hmp.mapper;

import com.dlm.hmp.pojo.HouseholdPayment;
import com.dlm.hmp.pojo.HouseholdPaymentExample;
import java.util.List;

public interface HouseholdPaymentMapper {
    int countByExample(HouseholdPaymentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HouseholdPayment record);

    int insertSelective(HouseholdPayment record);

    List<HouseholdPayment> selectByExample(HouseholdPaymentExample example);

    HouseholdPayment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseholdPayment record);

    int updateByPrimaryKey(HouseholdPayment record);
}