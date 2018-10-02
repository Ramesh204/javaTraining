package com.training.entity;

import java.util.List;

public class Contact {
	
	private long contactId;
	private Person person;
	private String relation;
	private List<String> numbers;
	public long getContactId() {
		return contactId;
	}
	public void ListContactId(long contactId) {
		this.contactId = contactId;
	}
	public Person getPerson() {
		return person;
	}
	public void ListPerson(Person person) {
		this.person = person;
	}
	public String getRelation() {
		return relation;
	}
	public void ListRelation(String relation) {
		this.relation = relation;
	}
	public List<String> getNumbers() {
		return numbers;
	}
	public void ListNumbers(List<String> numbers) {
		this.numbers = numbers;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(long contactId, Person person, String relation, List<String> numbers) {
		super();
		this.contactId = contactId;
		this.person = person;
		this.relation = relation;
		this.numbers = numbers;
	}
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", person=" + person + ", relation=" + relation + ", numbers="
				+ numbers + "]";
	}
	
	
	
		
	
	
	
}