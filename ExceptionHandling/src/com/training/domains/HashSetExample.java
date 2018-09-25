package com.training.domains;

import java.util.*;
public class HashSetExample {

	public static void main(String []args)
	{
		Employee emp1= new Employee("Ramesh",22,100);
		Employee emp2= new Employee("Anant",25,109);
		Employee emp3= new Employee("Suresh",52,108);
		Employee emp4= new Employee("Ramesh",22,100);
		
		Employee.sortOrder = "desc";
		
		Set<Employee> empList = new TreeSet<>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		//empList.add(emp4);
		
		System.out.println(empList.add(emp4));
		
		empList.forEach(System.out::println);
	}
}
