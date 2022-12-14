package com.solvathon.lti.AntonCrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solvathon.lti.AntonCrud.bean.PolicyPayments;
import com.solvathon.lti.AntonCrud.dao.PolicyPaymentsDao;

@Service
public class PolicyPaymentsServiceImpl implements PolicyPaymentsService{
	
	@Autowired
	private PolicyPaymentsDao policyPaymentsDao;
	
	
	@Override
	public List<PolicyPayments> getPaymentsByUserId(Integer id) {
		
		//System.out.println(policyPaymentsDao.findPaymentsByUserid(id));
		return policyPaymentsDao.findPaymentsByUserid(id);
		
	}

}
