package com.training.domains;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address addr1 = new Address("Gandhi Street","Nehru Nagar","Cheanni",-254789);
		Address addr2 = new Address("Rajiv Street","Indria Nagar","Bengaluru",500124);
		
		Customer ramesh1 = new Customer(101,"Ramesh Babu",addr1,98404040);
		
		Customer ramesh2 = new Customer(101,"Ramesh Babu",addr1,98404040);
		
		ramesh2=null;
		
		System.gc();
		
		System.out.println("Are they Equal"+ramesh1.equals(ramesh2));
		
		System.out.println(ramesh1.getAddress().getPincode());
		
		Customer suresh = new Customer();
		
		try {
			suresh.getAddress().setPincode(-5050);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Employee emp1= new Employee("emp",12);
		} catch (RangecheckExpection e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
