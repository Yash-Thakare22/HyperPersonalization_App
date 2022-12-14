package com.solvathon.lti.AntonCrud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.solvathon.lti.AntonCrud.bean.UserPolicies;

public interface UserPoliciesDao  extends JpaRepository<UserPolicies, Integer>{
	@Query(value = "SELECT * FROM user_policies where user_id = :userID", nativeQuery = true)
	List<UserPolicies> findPoliciesByUserid(@Param("userID") Integer userId);
	
	

}
