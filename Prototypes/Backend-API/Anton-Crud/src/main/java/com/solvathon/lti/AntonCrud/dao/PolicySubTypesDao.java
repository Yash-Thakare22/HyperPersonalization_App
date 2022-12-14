package com.solvathon.lti.AntonCrud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.solvathon.lti.AntonCrud.bean.PolicySubTypes;

public interface PolicySubTypesDao extends JpaRepository<PolicySubTypes, Integer>{
	
	PolicySubTypes findBypolicyTypeId(Integer policyTypeId);

	
	@Query(value = "SELECT * FROM policy_sub_types where policy_type_code = :policyTypeId", nativeQuery = true)
	List<PolicySubTypes> findByPolicyTypeCode(@Param("policyTypeId") Integer policyTypeId);
	

	@Query(value = "SELECT * FROM policy_sub_types where policy_type_code =(SELECT policy_type_code FROM ref_policy_types where policy_type_name like :policyTypeName )", nativeQuery = true)
	List<PolicySubTypes> findByPolicyTypeName(@Param("policyTypeName") String policyTypeName);


}
