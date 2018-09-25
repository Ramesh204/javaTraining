package com.training.domains;

public class Employee implements Comparable<Employee> {
	public Employee(String empName, int age, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.age = age;
	}
	private String empName;
	private int empId;
	private int age;
	public static String sortOrder;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws RangecheckExpection {
		
		if(age<18 || age>56)
		{
			throw new RangecheckExpection("Please provide the age bt 18 &56");
		}
		else
		this.age = age;
	}
	public Employee(String empName, int age) throws RangecheckExpection {
		super();
		this.empName = empName;
		if(age<18 || age>56)
		{
			throw new RangecheckExpection("Please provide the age bt 18 &56");
		}
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", age=" + age + "empId=" + empId +"]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(sortOrder.equalsIgnoreCase("asc"))
		{
		if(this.empId>o.empId) return -1;
		if(this.empId<o.empId) return 1;
		return 0;
		}
		else
		{
			if(this.empId>o.empId) return 1;
			if(this.empId<o.empId) return -1;
			return 0;
		}
	}
	
	
}
