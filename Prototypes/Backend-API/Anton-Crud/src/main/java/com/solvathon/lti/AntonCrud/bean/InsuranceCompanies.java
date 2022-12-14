package com.solvathon.lti.AntonCrud.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurance_companies")
public class InsuranceCompanies {

	@Id
	@Column(name="company_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int companyId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="about_company")
	private String aboutCompany;

	public InsuranceCompanies(int companyId, String companyName, String aboutCompany) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.aboutCompany = aboutCompany;
	}

	public InsuranceCompanies() {
		super();
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAboutCompany() {
		return aboutCompany;
	}

	public void setAboutCompany(String aboutCompany) {
		this.aboutCompany = aboutCompany;
	}

	@Override
	public String toString() {
		return "InsuranceCompanies [companyId=" + companyId + ", companyName=" + companyName + ", aboutCompany="
				+ aboutCompany + "]";
	}
	
	
}
