package com.solvathon.lti.AntonCrud.services;

import java.util.List;

import com.solvathon.lti.AntonCrud.bean.UserPolicies;

public interface UserPoliciesService {

	List<UserPolicies> findPolicyByUserId(Integer id);

	UserPolicies buyUserPolicy(UserPolicies userPolicy, Integer userId, Integer policyTypeId);

}
