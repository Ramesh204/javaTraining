package com.training;

public class Doctor {
	
	private long doctorId;
	private String docName;
	private String department;
	private String qualification;
	private String speciality;
	private int Experience;
	private long phoneNumber;
	private String Location;
	
	public String patientRecord(){
		return "Raj visited for Headache";
	}
	
	public String givePrescription(){
		return "paracetamol for normal fever";
	}
	
	
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getExperience() {
		return Experience;
	}
	public void setExperience(int experience) {
		Experience = experience;
	}
	public Doctor(String docName, String qualification, String speciality, int experience) {
		super();
		this.docName = docName;
		this.qualification = qualification;
		this.speciality = speciality;
		Experience = experience;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
}
