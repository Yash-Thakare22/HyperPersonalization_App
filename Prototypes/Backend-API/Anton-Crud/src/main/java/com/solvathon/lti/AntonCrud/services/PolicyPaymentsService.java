package com.solvathon.lti.AntonCrud.services;

import java.util.List;

import com.solvathon.lti.AntonCrud.bean.PolicyPayments;

public interface PolicyPaymentsService {

	List<PolicyPayments> getPaymentsByUserId(Integer id);

}
