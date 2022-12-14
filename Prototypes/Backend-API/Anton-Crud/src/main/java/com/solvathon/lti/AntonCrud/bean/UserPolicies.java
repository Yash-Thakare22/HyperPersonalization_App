package com.solvathon.lti.AntonCrud.bean;

import java.util.Date;

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

@Entity
@Table(name="user_policies")
public class UserPolicies {

	@Id
	@Column(name="policy_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policyNo;
	
	@Column(name="date_registered")
	private Date dateRegistered;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="final_amount")
	private double finalAmount; 
	
	@Column(name="premium_amount")
	private double premiumAmount;
	
	@Column(name="policy_renewable_type")
	private String policyRenewableType;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private UserDetails userDetails;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="policy_type_id")
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private PolicySubTypes policySubTypes;

	
	public UserPolicies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserPolicies(int policyNo, Date dateRegistered, Date endDate, double finalAmount, double premiumAmount,
			String policyRenewableType, UserDetails userDetails, PolicySubTypes policySubTypes) {
		super();
		this.policyNo = policyNo;
		this.dateRegistered = dateRegistered;
		this.endDate = endDate;
		this.finalAmount = finalAmount;
		this.premiumAmount = premiumAmount;
		this.policyRenewableType = policyRenewableType;
		this.userDetails = userDetails;
		this.policySubTypes = policySubTypes;
	}

	@Override
	public String toString() {
		return "UserPolicies [policyNo=" + policyNo + ", dateRegistered=" + dateRegistered + ", endDate=" + endDate
				+ ", finalAmount=" + finalAmount + ", premiumAmount=" + premiumAmount + ", policyRenewableType="
				+ policyRenewableType + ", userDetails=" + userDetails + ", policySubTypes=" + policySubTypes + "]";
	}

	public int getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}

	public Date getDateRegistered() {
		return dateRegistered;
	}

	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public double getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public String getPolicyRenewableType() {
		return policyRenewableType;
	}

	public void setPolicyRenewableType(String policyRenewableType) {
		this.policyRenewableType = policyRenewableType;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public PolicySubTypes getPolicySubTypes() {
		return policySubTypes;
	}

	public void setPolicySubTypes(PolicySubTypes policySubTypes) {
		this.policySubTypes = policySubTypes;
	}
	
}
