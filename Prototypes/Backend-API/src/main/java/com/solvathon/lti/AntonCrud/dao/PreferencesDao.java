package com.solvathon.lti.AntonCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.solvathon.lti.AntonCrud.bean.Preferences;

public interface PreferencesDao extends JpaRepository<Preferences, Integer>{
	@Query(value = "SELECT pref_policy FROM preferences where user_id = :userID", nativeQuery = true)
	String findPreferencesByUserid(@Param("userID") Integer userId);
	
	

}
