package com.solvathon.lti.AntonCrud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.solvathon.lti.AntonCrud.bean.Claims;
public interface ClaimsDao extends JpaRepository<Claims, Integer> {
	@Query(value = "SELECT * FROM claims where policy_no in(SELECT policy_no FROM user_policies where user_id = :userID)", nativeQuery = true)
	List<Claims> findClaimsByUserid(@Param("userID") Integer userId);
	
	

}
