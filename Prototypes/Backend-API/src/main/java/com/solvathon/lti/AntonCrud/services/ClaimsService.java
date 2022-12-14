package com.solvathon.lti.AntonCrud.services;

import java.util.List;

import com.solvathon.lti.AntonCrud.bean.Claims;

public interface ClaimsService {

	List<Claims> findClaimsByUserId(Integer id);

}
