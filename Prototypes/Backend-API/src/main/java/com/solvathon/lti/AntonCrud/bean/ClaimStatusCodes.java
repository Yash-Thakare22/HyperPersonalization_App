package com.solvathon.lti.AntonCrud.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="claim_status_codes")
public class ClaimStatusCodes {

	@Id
	@Column(name="status_code")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int statusCode;
	
	@Column(name="status_description")
	private String statusDescription;

	public ClaimStatusCodes(int statusCode, String statusDescription) {
		super();
		this.statusCode = statusCode;
		this.statusDescription = statusDescription;
	}

	public ClaimStatusCodes() {
		super();
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	@Override
	public String toString() {
		return "ClaimStatusCodes [statusCode=" + statusCode + ", statusDescription=" + statusDescription + "]";
	}
	
	
}
