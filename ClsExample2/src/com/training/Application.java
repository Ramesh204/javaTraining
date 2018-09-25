package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Patient patient1 = new Patient("Ramesh",22,1);
			Patient patient2 = new Patient("Suresh",25,2);
			
			Doctor doctor1 = new Doctor("John","Dentist",702220914);
			Doctor doctor2 = new Doctor("Shyam","Ortho",985632112);
			
			Hospital hospital = new Hospital();
			
			hospital.addAppointment(doctor1, patient1);
			hospital.addAppointment(doctor1, patient2);
			
		
			System.out.println(hospital.getAppointments());
			
			
			
	}

}
