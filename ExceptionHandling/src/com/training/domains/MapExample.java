package com.training.domains;
import java.util.*;



public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Employee> empList = new HashMap<>();
		
		
		Employee emp1= new Employee("Ramesh",22,100);
		Employee emp2= new Employee("Anant",25,109);
		Employee emp3= new Employee("Suresh",52,108);
		Employee emp4= new Employee("Ramesh",22,100);
		
		empList.put(new Integer(1), emp1);
		empList.put(2, emp2);
		empList.put(3, emp3);
		empList.put(4, emp4);
		
		System.out.println(empList.get(2));

		
	}

}
