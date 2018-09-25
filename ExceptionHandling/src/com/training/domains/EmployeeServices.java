package com.training.domains;

import java.util.*;

public class EmployeeServices implements EmployeeAPI {

	
	List<Employee>empList;

	public EmployeeServices() {
		super();
		// TODO Auto-generated constructor stub
		
		empList = new ArrayList<>();
	}

	@Override
	public boolean add(Employee... emp) {
		// TODO Auto-generated method stub
		
		boolean result = false;
		for(Employee e:emp)
		{
			result = empList.add(e);
		}
		return result;
		
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return this.empList;
	}

	@Override
	public List<Employee> sortById() {
		// TODO Auto-generated method stub
		
		Collections.sort(empList);
		return null;
	}

	@Override
	public List<Employee> sortByName() {
		// TODO Auto-generated method stub
		Collections.sort(empList,new EmployeeNameComparator());
		return empList;
	}

	@Override
	public List<Employee> sortByAge() {
		// TODO Auto-generated method stub
		Collections.sort(empList,new EmployeeAgeComparator());
		return empList;
	}

}
