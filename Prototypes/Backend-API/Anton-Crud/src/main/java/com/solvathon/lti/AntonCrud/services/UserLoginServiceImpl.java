package com.solvathon.lti.AntonCrud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solvathon.lti.AntonCrud.bean.UserDetails;
import com.solvathon.lti.AntonCrud.bean.UserLogin;
import com.solvathon.lti.AntonCrud.dao.UserDetailsDao;
import com.solvathon.lti.AntonCrud.dao.UserLoginDao;

@Service
public class UserLoginServiceImpl implements UserLoginService{
	@Autowired
	private UserLoginDao userLoginDao;
	@Autowired
	private UserDetailsDao userDetailsDao;
	
	
	@Override
	public UserLogin saveUser(UserLogin user, Integer userId){
		UserDetails usrDets= userDetailsDao.findUserDetailsByuserId(userId);
		user.setUserDetails(usrDets);
		
		return userLoginDao.save(user);

		
		
	}
	
	
	@Override
	public UserLogin fetchLoginUser(String email){
	
		
		return userLoginDao.findByemail(email);

		
		
	}

}
