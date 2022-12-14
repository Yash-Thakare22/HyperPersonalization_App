package com.solvathon.lti.AntonCrud.services;

import com.solvathon.lti.AntonCrud.bean.UserLogin;

public interface UserLoginService {

	UserLogin saveUser(UserLogin user, Integer userId);

	UserLogin fetchLoginUser(String email);

}
