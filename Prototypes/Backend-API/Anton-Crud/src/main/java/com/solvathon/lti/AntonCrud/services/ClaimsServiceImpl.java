package com.solvathon.lti.AntonCrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solvathon.lti.AntonCrud.bean.Claims;

import com.solvathon.lti.AntonCrud.dao.ClaimsDao;

@Service
public class ClaimsServiceImpl implements ClaimsService{
	
	@Autowired
	private ClaimsDao claimsDao;
	

	@Override
	 public List<Claims> findClaimsByUserId(Integer id) {
		System.out.println("userid" + id);
		 
			return claimsDao.findClaimsByUserid(id);
		}

}
