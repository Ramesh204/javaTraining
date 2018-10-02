package com.training.entity;

import java.util.TreeSet;

public class ContactList {

	private static long contactId=0;
	private TreeSet<Contact> contacts;
	
	
	public static long getContactId() {
		return contactId;
	}
	public static void setContactId(long contactId) {
		ContactList.contactId = contactId;
	}
	public TreeSet<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(TreeSet<Contact> contacts) {
		this.contacts = contacts;
	}
	public ContactList(TreeSet<Contact> contacts) {
		super();
		this.contacts = contacts;
	}
	public ContactList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
