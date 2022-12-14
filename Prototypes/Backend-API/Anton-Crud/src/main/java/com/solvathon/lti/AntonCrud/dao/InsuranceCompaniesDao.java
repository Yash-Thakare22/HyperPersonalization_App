package com.solvathon.lti.AntonCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solvathon.lti.AntonCrud.bean.InsuranceCompanies;

public interface InsuranceCompaniesDao extends JpaRepository<InsuranceCompanies, Integer> {

	InsuranceCompanies findBycompanyId(Integer id);
}
