package com.solvathon.lti.AntonCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solvathon.lti.AntonCrud.bean.RefPolicyTypes;

public interface RefPolicyTypesDao extends JpaRepository<RefPolicyTypes, Integer> {
	
	RefPolicyTypes findBypolicyTypeCode(Integer id);

}
