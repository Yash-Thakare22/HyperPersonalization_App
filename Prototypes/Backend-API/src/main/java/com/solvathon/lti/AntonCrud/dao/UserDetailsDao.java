package com.solvathon.lti.AntonCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.solvathon.lti.AntonCrud.bean.UserDetails;

public interface UserDetailsDao extends JpaRepository<UserDetails, Integer> {
	
	UserDetails findUserDetailsByuserId(Integer userId);

}
