package com.solvathon.lti.AntonCrud.services;

import com.solvathon.lti.AntonCrud.bean.UserDetails;

public interface UserDetailsService {

	UserDetails findUserDetailsById(Integer id);

	UserDetails saveUser(UserDetails userDetails);

}
