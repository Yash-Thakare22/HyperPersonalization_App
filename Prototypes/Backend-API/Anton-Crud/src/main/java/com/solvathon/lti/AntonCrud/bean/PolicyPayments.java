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
@Table(name="policy_payments")
public class PolicyPayments {
	
	@Id
	@Column(name="receiptno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int receiptNo;
	
	@Column(name="dateofpayment")
	private Date dateofpayment;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="fine")
	private double fine;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="policy_no")
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private UserPolicies userPolicies;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private UserDetails userDetails;

	public PolicyPayments(int receiptNo, Date dateofpayment, double amount, double fine, UserPolicies userPolicies,
			UserDetails userDetails) {
		super();
		this.receiptNo = receiptNo;
		this.dateofpayment = dateofpayment;
		this.amount = amount;
		this.fine = fine;
		this.userPolicies = userPolicies;
		this.userDetails = userDetails;
	}

	public PolicyPayments() {
		super();
	}

	public int getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(int receiptNo) {
		this.receiptNo = receiptNo;
	}

	public Date getDateofpayment() {
		return dateofpayment;
	}

	public void setDateofpayment(Date dateofpayment) {
		this.dateofpayment = dateofpayment;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}

	public UserPolicies getUserPolicies() {
		return userPolicies;
	}

	public void setUserPolicies(UserPolicies userPolicies) {
		this.userPolicies = userPolicies;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	@Override
	public String toString() {
		return "PolicyPayments [receiptNo=" + receiptNo + ", dateofpayment=" + dateofpayment + ", amount=" + amount
				+ ", fine=" + fine + ", userPolicies=" + userPolicies + ", userDetails=" + userDetails + "]";
	}
	
	
}
