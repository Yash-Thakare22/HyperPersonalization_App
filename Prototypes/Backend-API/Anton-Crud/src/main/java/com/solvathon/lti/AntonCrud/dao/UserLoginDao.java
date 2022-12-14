package com.solvathon.lti.AntonCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solvathon.lti.AntonCrud.bean.UserLogin;

public interface UserLoginDao extends JpaRepository<UserLogin, String>{
	
	UserLogin findByemail(String email);

}
