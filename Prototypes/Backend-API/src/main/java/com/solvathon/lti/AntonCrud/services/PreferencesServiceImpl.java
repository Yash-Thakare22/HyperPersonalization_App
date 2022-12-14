package com.solvathon.lti.AntonCrud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solvathon.lti.AntonCrud.dao.PreferencesDao;

@Service
public class PreferencesServiceImpl implements PreferencesService{
	
	@Autowired
	private PreferencesDao preferencesDao;
	
	
	@Override
	 public String findPreferencesByUserId(Integer id) {
		System.out.println("userid" + id);
		 
			//System.out.println(preferencesDao.findPreferencesByUserid(id));
			return preferencesDao.findPreferencesByUserid(id);
		}
	

}
