package com.training.entity;

public class Person {

	private String firstName;
	private String lastName;
	private String emailId;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getemailId() {
		return emailId;
	}
	public void setemailId(String emailId) {
		this.emailId = emailId;
	}
	public Person(String firstName, String lastName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + "]";
	}
	
	
		
}
