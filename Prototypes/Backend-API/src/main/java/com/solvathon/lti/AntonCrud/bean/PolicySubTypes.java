package com.solvathon.lti.AntonCrud.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="policy_sub_types")
public class PolicySubTypes {
	
	@Id
	@Column(name="policy_type_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policyTypeId;
	
	@Column(name="description")
	private String description;
	
	@Column(name="yearsofpayments")
	private int yearsofpayments;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="maturityperiod")
	private int maturityperiod;
	
	@Column(name="maturityamount")
	private double maturityamount;
	
	@Column(name="validity")
	private int validity;
	
	@Column(name="medicalcondn")
	private String medicalcondn;
	
	@Column(name="vehiclecondn")
	private String vehiclecondn;
	
	@Column(name="agecondn")
	private String agecondn;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="policy_type_code")
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private RefPolicyTypes refPolicyTypes;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="company_id")
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private InsuranceCompanies insuranceCompanies;

	public PolicySubTypes() {
		super();
	}

	public PolicySubTypes(int policyTypeId, String description, int yearsofpayments, double amount, int maturityperiod,
			double maturityamount, int validity, String medicalcondn, String vehiclecondn, String agecondn,
			RefPolicyTypes refPolicyTypes, InsuranceCompanies insuranceCompanies) {
		super();
		this.policyTypeId = policyTypeId;
		this.description = description;
		this.yearsofpayments = yearsofpayments;
		this.amount = amount;
		this.maturityperiod = maturityperiod;
		this.maturityamount = maturityamount;
		this.validity = validity;
		this.medicalcondn = medicalcondn;
		this.vehiclecondn = vehiclecondn;
		this.agecondn = agecondn;
		this.refPolicyTypes = refPolicyTypes;
		this.insuranceCompanies = insuranceCompanies;
	}

	public int getPolicyTypeId() {
		return policyTypeId;
	}

	public void setPolicyTypeId(int policyTypeId) {
		this.policyTypeId = policyTypeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getYearsofpayments() {
		return yearsofpayments;
	}

	public void setYearsofpayments(int yearsofpayments) {
		this.yearsofpayments = yearsofpayments;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getMaturityperiod() {
		return maturityperiod;
	}

	public void setMaturityperiod(int maturityperiod) {
		this.maturityperiod = maturityperiod;
	}

	public double getMaturityamount() {
		return maturityamount;
	}

	public void setMaturityamount(double maturityamount) {
		this.maturityamount = maturityamount;
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public String getMedicalcondn() {
		return medicalcondn;
	}

	public void setMedicalcondn(String medicalcondn) {
		this.medicalcondn = medicalcondn;
	}

	public String getVehiclecondn() {
		return vehiclecondn;
	}

	public void setVehiclecondn(String vehiclecondn) {
		this.vehiclecondn = vehiclecondn;
	}

	public String getAgecondn() {
		return agecondn;
	}

	public void setAgecondn(String agecondn) {
		this.agecondn = agecondn;
	}

	public RefPolicyTypes getRefPolicyTypes() {
		return refPolicyTypes;
	}

	public void setRefPolicyTypes(RefPolicyTypes refPolicyTypes) {
		this.refPolicyTypes = refPolicyTypes;
	}

	public InsuranceCompanies getInsuranceCompanies() {
		return insuranceCompanies;
	}

	public void setInsuranceCompanies(InsuranceCompanies insuranceCompanies) {
		this.insuranceCompanies = insuranceCompanies;
	}

	@Override
	public String toString() {
		return "PolicySubTypes [policyTypeId=" + policyTypeId + ", description=" + description + ", yearsofpayments="
				+ yearsofpayments + ", amount=" + amount + ", maturityperiod=" + maturityperiod + ", maturityamount="
				+ maturityamount + ", validity=" + validity + ", medicalcondn=" + medicalcondn + ", vehiclecondn="
				+ vehiclecondn + ", agecondn=" + agecondn + ", refPolicyTypes=" + refPolicyTypes
				+ ", insuranceCompanies=" + insuranceCompanies + "]";
	}
	
	
}
