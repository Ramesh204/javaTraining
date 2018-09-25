package com.training;

public class Doctor {

	private String doctorName;
	private String specialization;
	private long phoneNumber;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", specialization=" + specialization + ", phoneNumber="
				+ phoneNumber + "]";
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Doctor(String doctorName, String specialization, long phoneNumber) {
		super();
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.phoneNumber = phoneNumber;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
