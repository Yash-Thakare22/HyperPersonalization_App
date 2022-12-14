package com.solvathon.lti.AntonCrud.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ref_policy_types")
public class RefPolicyTypes {

	@Id
	@Column(name="policy_type_code")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policyTypeCode;
	
	@Column(name="policy_type_name")
	private String policyTypeName;

	public RefPolicyTypes() {
		super();
	}

	public RefPolicyTypes(int policyTypeCode, String policyTypeName) {
		super();
		this.policyTypeCode = policyTypeCode;
		this.policyTypeName = policyTypeName;
	}

	public int getPolicyTypeCode() {
		return policyTypeCode;
	}

	public void setPolicyTypeCode(int policyTypeCode) {
		this.policyTypeCode = policyTypeCode;
	}

	public String getPolicyTypeName() {
		return policyTypeName;
	}

	public void setPolicyTypeName(String policyTypeName) {
		this.policyTypeName = policyTypeName;
	}

	@Override
	public String toString() {
		return "RefPolicyTypes [policyTypeCode=" + policyTypeCode + ", policyTypeName=" + policyTypeName + "]";
	}
	
	
	
}
