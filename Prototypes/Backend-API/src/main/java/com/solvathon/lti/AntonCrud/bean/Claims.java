package com.solvathon.lti.AntonCrud.bean;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="claims")
public class Claims {
	
	@Id
	@Column(name="claim_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int claimId;
	
	@Column(name="date_of_claim")
	private Date dateOfClaim;
	
	@Column(name="amount_of_claim")
	private double amountOfClaim;
	
	@Column(name="details_of_claim")
	private String detailsOfClaim;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="policy_no")
	private UserPolicies userPolicies;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="status_code")
	private ClaimStatusCodes claimStatusCodes;

	public Claims(int claimId, Date dateOfClaim, double amountOfClaim, String detailsOfClaim, UserPolicies userPolicies,
			ClaimStatusCodes claimStatusCodes) {
		super();
		this.claimId = claimId;
		this.dateOfClaim = dateOfClaim;
		this.amountOfClaim = amountOfClaim;
		this.detailsOfClaim = detailsOfClaim;
		this.userPolicies = userPolicies;
		this.claimStatusCodes = claimStatusCodes;
	}

	public Claims() {
		super();
	}

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public Date getDateOfClaim() {
		return dateOfClaim;
	}

	public void setDateOfClaim(Date dateOfClaim) {
		this.dateOfClaim = dateOfClaim;
	}

	public double getAmountOfClaim() {
		return amountOfClaim;
	}

	public void setAmountOfClaim(double amountOfClaim) {
		this.amountOfClaim = amountOfClaim;
	}

	public String getDetailsOfClaim() {
		return detailsOfClaim;
	}

	public void setDetailsOfClaim(String detailsOfClaim) {
		this.detailsOfClaim = detailsOfClaim;
	}

	public UserPolicies getUserPolicies() {
		return userPolicies;
	}

	public void setUserPolicies(UserPolicies userPolicies) {
		this.userPolicies = userPolicies;
	}

	public ClaimStatusCodes getClaimStatusCodes() {
		return claimStatusCodes;
	}

	public void setClaimStatusCodes(ClaimStatusCodes claimStatusCodes) {
		this.claimStatusCodes = claimStatusCodes;
	}

	@Override
	public String toString() {
		return "Claims [claimId=" + claimId + ", dateOfClaim=" + dateOfClaim + ", amountOfClaim=" + amountOfClaim
				+ ", detailsOfClaim=" + detailsOfClaim + ", userPolicies=" + userPolicies + ", claimStatusCodes="
				+ claimStatusCodes + "]";
	}
	
	
	
}
