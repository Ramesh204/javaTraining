package com.training;

public class BloodDonor {
	
	//instance variables are defined below
	/*
	 * instance variables has a default value 0 for integer
	 * null for string variable
	 */
	private String donorName;
	private String bloodGroup;
	private int age;
	private String gender;
	public String collectCertficate(){
		return "Collected";
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
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
	public BloodDonor(String donorName, String bloodGroup, int age, String gender) {
		super();
		this.donorName = donorName;
		this.bloodGroup = bloodGroup;
		this.age = age;
		this.gender = gender;
	}
	public BloodDonor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
