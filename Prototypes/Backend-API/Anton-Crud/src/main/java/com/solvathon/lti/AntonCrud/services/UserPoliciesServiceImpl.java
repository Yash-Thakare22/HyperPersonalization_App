package com.solvathon.lti.AntonCrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solvathon.lti.AntonCrud.bean.PolicySubTypes;
import com.solvathon.lti.AntonCrud.bean.UserDetails;
import com.solvathon.lti.AntonCrud.bean.UserPolicies;
import com.solvathon.lti.AntonCrud.dao.PolicySubTypesDao;
import com.solvathon.lti.AntonCrud.dao.UserDetailsDao;
import com.solvathon.lti.AntonCrud.dao.UserPoliciesDao;

@Service
public class UserPoliciesServiceImpl implements UserPoliciesService {
	
	@Autowired
	 private UserPoliciesDao userPolicyDao;
	@Autowired
	 private UserDetailsDao userDetailsDao;
	@Autowired
	 private PolicySubTypesDao policySubTypesDao;
	
	
	
	@Override
	 public List<UserPolicies> findPolicyByUserId(Integer id) {
		System.out.println("userid" + id);
		 
			//System.out.println(userPolicyDao.findPoliciesByUserid(id));
			return userPolicyDao.findPoliciesByUserid(id);
		}
	
	@Override
	 public UserPolicies buyUserPolicy(UserPolicies userPolicy, Integer userId, Integer policyTypeId) {
		System.out.println("userpolicy" + userPolicy);
		System.out.println("userId"+ userId);
		System.out.println("policyTypeID"+ policyTypeId);
		
		UserDetails fetchedUser = 	userDetailsDao.findUserDetailsByuserId(userId);
		PolicySubTypes fetchedPolicy = policySubTypesDao.findBypolicyTypeId(policyTypeId);
		
		userPolicy.setUserDetails(fetchedUser);
		userPolicy.setPolicySubTypes(fetchedPolicy);
		System.out.println("userpolicy updated" + userPolicy);
		 
			
			return userPolicyDao.save(userPolicy);
		}

}
