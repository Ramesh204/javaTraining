package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BloodDonor guest = new BloodDonor();
		
		
		guest.setDonorName("Ramesh");
		guest.setAge(34);
		
		BloodDonor rajesh=new BloodDonor("Rajesh","bpos",38,"male");
		
		System.out.println("DonarName :="+rajesh.getDonorName());
		
		System.out.println(guest.getAge());
		System.out.println(guest.getDonorName());
		
		Doctor rajesh1=new Doctor();
		rajesh1.setDocName(args[0]);
		rajesh1.setQualification(args[0]);
		
		System.out.println(rajesh1.getDocName());
		
	}

}
