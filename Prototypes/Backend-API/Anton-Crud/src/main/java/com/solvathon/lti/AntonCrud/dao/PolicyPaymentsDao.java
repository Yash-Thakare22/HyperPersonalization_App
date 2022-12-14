package com.solvathon.lti.AntonCrud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.solvathon.lti.AntonCrud.bean.PolicyPayments;


public interface PolicyPaymentsDao extends JpaRepository<PolicyPayments, Integer>{
	
	@Query(value = "SELECT * FROM policy_payments where user_id = :userID", nativeQuery = true)
	List<PolicyPayments> findPaymentsByUserid(@Param("userID") Integer userId);

}
