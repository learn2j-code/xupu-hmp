package com.dlm.hmp.bam_basemanagement.service;

import java.util.List;

import com.dlm.hmp.pojo.HouseholdPayEvidence;
import com.dlm.hmp.pojo.HouseholdPayment;



public interface HouseholdPaymentService {
	List<HouseholdPayment> list();
	void add(HouseholdPayment record);
	void update(HouseholdPayment record);
	void delete(int id);
	HouseholdPayment get(int id);
	
	List<HouseholdPayment> findHouseholdPaymentList(HouseholdPayment record);
}
