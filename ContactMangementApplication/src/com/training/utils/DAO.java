package com.training.utils;

import java.util.*;
import java.util.Set;
import java.util.TreeSet;
import java.sql.SQLException;

import com.training.entity.Contact;

public interface DAO {

	public int addContact(Contact obj) throws SQLException;
	public int addNumber(String phoneNumber,long contactId) throws SQLException; 
	
	
	public int removeContact(long key) throws SQLException;
	public int removeNumber(String key) throws SQLException;
	
	
	
	
	public List<String> getPhoneNumber(long contactId) throws SQLException;
	
	public Contact getContactByName(String name) throws SQLException;
	
	
	public int editPhoneNumber(String oldNumber, String newNumber) throws SQLException;
	
	
	public int editContact(long contactId,String oldValue,String newValue )throws SQLException;
	
	
	public Set<Contact> showAllContacts() throws SQLException;
	
	public Map<String,Number> showByCategory(String category) throws SQLException;
	
}
