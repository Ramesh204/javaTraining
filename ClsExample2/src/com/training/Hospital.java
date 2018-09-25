package com.training;
import java.util.*;

public class Hospital {
	
	private String hospitalName = "Sakra Hosptial";
	private Set<Doctor> doctor = new HashSet<>();
	private Set<Patient> patient = new TreeSet<>();
	
	public Map<Doctor,TreeSet<Patient>> appointments = new HashMap<Doctor,TreeSet<Patient>>();



	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", doctor=" + doctor + ", patient=" + patient
				+ ", appointments=" + appointments + "]";
	}

	public void addAppointment(Doctor doc,Patient pat){
		if(this.appointments.containsKey(doc))
		{
			TreeSet<Patient> patient_list = appointments.get(doc);
			patient_list.add(pat);
			
			this.appointments.put(doc,patient_list);
			
		}
		else
		{
			TreeSet<Patient> patient_list = new TreeSet<Patient>();
			patient_list.add(pat);
			
			this.appointments.put(doc,patient_list);
		}
	}
	
	
	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public Set<Doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(Set<Doctor> doctor) {
		this.doctor = doctor;
	}

	public Set<Patient> getPatient() {
		return patient;
	}

	public void setPatient(Set<Patient> patient) {
		this.patient = patient;
	}

	public Map<Doctor, TreeSet<Patient>> getAppointments() {
		return appointments;
	}

	public void setAppointments(Map<Doctor, TreeSet<Patient>> appointments) {
		this.appointments = appointments;
	}

	public Hospital(String hospitalName, Set<Doctor> doctor, Set<Patient> patient,
			Map<Doctor, TreeSet<Patient>> appointments) {
		super();
		this.hospitalName = hospitalName;
		this.doctor = doctor;
		this.patient = patient;
		this.appointments = appointments;
	}

	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
