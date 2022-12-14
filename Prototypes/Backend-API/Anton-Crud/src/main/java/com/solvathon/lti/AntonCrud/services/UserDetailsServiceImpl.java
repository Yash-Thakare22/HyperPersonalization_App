package com.solvathon.lti.AntonCrud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.solvathon.lti.AntonCrud.bean.UserDetails;
import com.solvathon.lti.AntonCrud.dao.UserDetailsDao;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserDetailsDao userDetailsDao;
	
	
	@Override
	 public UserDetails findUserDetailsById(Integer id) {
		System.out.println("userid" + id);
		 
			//System.out.println(userDetailsDao.findUserDetailsByuserId(id));
			return userDetailsDao.findUserDetailsByuserId(id);
		}
	

	@Override
	 public UserDetails saveUser(UserDetails userDetails) {
		System.out.println("userDetails" + userDetails);
		 
			//System.out.println(userDetailsDao.save(userDetails));
			return userDetailsDao.save(userDetails);
		}
	
	
}
