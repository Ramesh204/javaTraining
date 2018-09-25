package com.training;

import java.util.List;

import com.training.domains.Employee;
import com.training.domains.EmployeeServices;
import com.training.domains.RangecheckExpection;

public class CollectionApplication {

	public static void printEmployee(List<Employee> emp){
		emp.forEach(System.out::println);
	
	}
	
	
	
	public static void main(String[] args) throws RangecheckExpection {
		Employee emp1= new Employee("Ramesh",22,100);
		Employee emp2= new Employee("Anant",25,109);
		Employee emp3= new Employee("Suresh",52,108);
		Employee emp4= new Employee("Sumesh",32,105);
		
		EmployeeServices service = new EmployeeServices();
		
		service.add(emp1 ,emp2,emp3,emp4);
		
		Employee.sortOrder="asc";
		
		List<Employee>empList = service.findAll();
		
		//System.out.println(service.sortById());
		
		//empList.forEach(System.out::println);
		
		List<Employee> em = service.sortByName();
		
		//em.forEach(System.out::println);
		
		em = service.sortByAge();
		
		printEmployee(em);
		
		
		
	}

}
