package com.solvathon.lti.AntonCrud.bean;

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
@Table(name="preferences")
public class Preferences	{

	@Id
	@Column(name="pref_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prefId;
	
	@Column(name="pref_policy")
	private String prefPolicy;
	
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private UserDetails userDetails;
	
	public Preferences() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Preferences(int prefId, String prefPolicy, UserDetails userDetails) {
		super();
		this.prefId = prefId;
		this.prefPolicy = prefPolicy;
		this.userDetails = userDetails;
	}
	
	public int getPrefId() {
		return prefId;
	}
	
	public void setPrefId(int prefId) {
		this.prefId = prefId;
	}
	
	public String getPrefPolicy() {
		return prefPolicy;
	}
	
	public void setPrefPolicy(String prefPolicy) {
		this.prefPolicy = prefPolicy;
	}
	
	public UserDetails getUserDetails() {
		return userDetails;
	}
	
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	
	@Override
	public String toString() {
		return "Preferences [prefId=" + prefId + ", prefPolicy=" + prefPolicy + ", userDetails=" + userDetails + "]";
	}


}