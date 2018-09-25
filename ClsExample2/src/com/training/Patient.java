package com.training;

public class Patient implements Comparable<Patient>{

	@Override
	public int compareTo(Patient o) {
	if(this.getAppointmentNo()>o.appointmentNo) return -1;
	if(this.getAppointmentNo()<o.appointmentNo) return 1;
	return 0;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", patientAge=" + patientAge + ", appointmentNo=" + appointmentNo
				+ "]";
	}
	
	private String patientName;
	private int patientAge;
	private long appointmentNo;
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public long getAppointmentNo() {
		return appointmentNo;
	}
	public void setAppointmentNo(long appointmentNo) {
		this.appointmentNo = appointmentNo;
	}
	public Patient(String patientName, int patientAge, long appointmentNo) {
		super();
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.appointmentNo = appointmentNo;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
