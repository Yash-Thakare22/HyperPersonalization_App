package com.solvathon.lti.AntonCrud.services;

import java.util.List;

import com.solvathon.lti.AntonCrud.bean.PolicySubTypes;

public interface PolicySubTypesService {
	public PolicySubTypes getPolicySubType(Integer id);

	List<PolicySubTypes> getAllPolicies();

	List<PolicySubTypes> findBypolicyTypeCode(Integer id);

	PolicySubTypes findBypolicyTypeId(Integer id);

	List<PolicySubTypes> findBypolicyTypeName(String policyTypeName);

}
