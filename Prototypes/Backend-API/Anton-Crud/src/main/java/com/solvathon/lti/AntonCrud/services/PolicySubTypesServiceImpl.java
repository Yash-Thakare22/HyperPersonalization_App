package com.solvathon.lti.AntonCrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solvathon.lti.AntonCrud.bean.PolicySubTypes;
import com.solvathon.lti.AntonCrud.dao.PolicySubTypesDao;

@Service
public class PolicySubTypesServiceImpl implements PolicySubTypesService{
	
	 @Autowired
	    private PolicySubTypesDao policySubTypesDao;
	 @Override
	 public PolicySubTypes getPolicySubType(Integer id) {
			
			//System.out.println(policySubTypesDao.findBypolicyTypeId(id));
			return policySubTypesDao.findBypolicyTypeId(id);
		}
	 
	 @Override
	 public List<PolicySubTypes> getAllPolicies() {
		 
			//System.out.println(policySubTypesDao.findAll());
			return policySubTypesDao.findAll();
		}
	
	@Override
	 public List<PolicySubTypes> findBypolicyTypeCode(Integer id) {
		 
			//System.out.println(policySubTypesDao.findByPolicyTypeCode(id));
			return policySubTypesDao.findByPolicyTypeCode(id);
		}
	 
	@Override
	 public PolicySubTypes findBypolicyTypeId(Integer id) {
		 
			//System.out.println(policySubTypesDao.findBypolicyTypeId(id));
			return policySubTypesDao.findBypolicyTypeId(id);
		}
	 
	@Override
	 public List<PolicySubTypes> findBypolicyTypeName(String policyTypeName) {
		 
			//System.out.println(policySubTypesDao.findByPolicyTypeName(policyTypeName));
			return policySubTypesDao.findByPolicyTypeName(policyTypeName);
		}

}
