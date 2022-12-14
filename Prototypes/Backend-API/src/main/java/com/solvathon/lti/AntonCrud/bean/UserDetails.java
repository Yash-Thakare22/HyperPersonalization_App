package com.solvathon.lti.AntonCrud.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetails {
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mobileno")
	private String mobileNo;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="address_line")
	private String addressLine;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;
	
	@Column(name="postal_zipcode")
	private String postalZipcode;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="bmi")
	private double bmi;
	
	@Column(name="children")
	private int children;
	
	@Column(name="smoker")
	private boolean smoker;
	
	@Column(name="vehicle_age")
	private int vehicleAge;
	
	@Column(name="vehicle_damage")
	private boolean vehicleDamage;
	
	@Column(name="vehicle_reg_num")
	private String vehicleRegNum;
	
	@Column(name="model")
	private String model;
	
	@Column(name="employment")
	private String employment;
	
	@Column(name="family_history")
	private String familyHistory;
	
	@Column(name="medical_history")
	private String medicalHistory;

	
	
	public UserDetails() {
		super();
	}

	public UserDetails(int userId, String firstName, String lastName, String email, String mobileNo, Date dob,
			String addressLine, String city, String state, String country, String postalZipcode, int age, String gender,
			double bmi, int children, boolean smoker, int vehicleAge, boolean vehicleDamage, String vehicleRegNum,
			String model, String employment, String familyHistory, String medicalHistory) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postalZipcode = postalZipcode;
		this.age = age;
		this.gender = gender;
		this.bmi = bmi;
		this.children = children;
		this.smoker = smoker;
		this.vehicleAge = vehicleAge;
		this.vehicleDamage = vehicleDamage;
		this.vehicleRegNum = vehicleRegNum;
		this.model = model;
		this.employment = employment;
		this.familyHistory = familyHistory;
		this.medicalHistory = medicalHistory;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalZipcode() {
		return postalZipcode;
	}

	public void setPostalZipcode(String postalZipcode) {
		this.postalZipcode = postalZipcode;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public boolean isSmoker() {
		return smoker;
	}

	public void setSmoker(boolean smoker) {
		this.smoker = smoker;
	}

	public int getVehicleAge() {
		return vehicleAge;
	}

	public void setVehicleAge(int vehicleAge) {
		this.vehicleAge = vehicleAge;
	}

	public boolean isVehicleDamage() {
		return vehicleDamage;
	}

	public void setVehicleDamage(boolean vehicleDamage) {
		this.vehicleDamage = vehicleDamage;
	}

	public String getVehicleRegNum() {
		return vehicleRegNum;
	}

	public void setVehicleRegNum(String vehicleRegNum) {
		this.vehicleRegNum = vehicleRegNum;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEmployment() {
		return employment;
	}

	public void setEmployment(String employment) {
		this.employment = employment;
	}

	public String getFamilyHistory() {
		return familyHistory;
	}

	public void setFamilyHistory(String familyHistory) {
		this.familyHistory = familyHistory;
	}

	public String getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", mobileNo=" + mobileNo + ", dob=" + dob + ", addressLine=" + addressLine + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", postalZipcode=" + postalZipcode + ", age=" + age
				+ ", gender=" + gender + ", bmi=" + bmi + ", children=" + children + ", smoker=" + smoker
				+ ", vehicleAge=" + vehicleAge + ", vehicleDamage=" + vehicleDamage + ", vehicleRegNum=" + vehicleRegNum
				+ ", model=" + model + ", employment=" + employment + ", familyHistory=" + familyHistory
				+ ", medicalHistory=" + medicalHistory + "]";
	}
	
	
	
}
