package com.training;

import java.sql.SQLException;
import java.util.*;

import com.training.entity.Contact;
import com.training.entity.Person;
import com.training.utils.DAOImpl;
import com.training.utils.DbConnections;

public class Application {

	public static void main(String[] args) {
		System.out.println(DbConnections.getConnection());
		
		DAOImpl daoimpl = new DAOImpl();
		
		
//		
//		Person person1 = new Person("Ramesh","Anantavarapu","rams@gmail.com");
//		Set<String> phoneNumbers = new HashSet();
//		 phoneNumbers.add("7022209525");
//		 phoneNumbers.add("8247797522");
//		
//		Contact contact1 = new Contact(1,person1,"friend",phoneNumbers);
//		
//		
//		try {
//			rowAdded = daoimpl.addContact(contact1);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(rowAdded);
		
		
		int rowsDeleted = 0;
//		
//		try {
//			rowsDeleted = daoimpl.removeContact(1);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		
//		System.out.println(rowsDeleted);
//
//	}
//
//		try {
//			rowsDeleted = daoimpl.removeNumber("7022209525");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(rowsDeleted);

//	int rowsAdded = 0;
//	try {
//		 rowsAdded = daoimpl.addNumber("7022209525", 1);
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//		
//	System.out.println(rowsAdded);
//	List<String> numbers = new ArrayList<>();
//
//		try {
//		
//				numbers = daoimpl.getPhoneNumber(1);
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//	
//	System.out.println(numbers);
		
		int rowadded = 0;
//		try {
//			rowadded = daoimpl.editPhoneNumber("7022209525", "7702976601");
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
//	
//		try {
//			rowadded = daoimpl.editContact(1, "LastName", "Anantavarapu");
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		System.out.println(rowadded);
//		
//		Contact contact = null;
//		
//		try {
//			contact = daoimpl.getContactByName("Ramesh");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
//		System.out.println(contact);

		
//		Person person2 = new Person("Suresh","Kumar","surersh@gmial.com");
//		
//		List<String> phoneNumbers = new ArrayList<>();
//		
//		phoneNumbers.add("8529631470");
//		phoneNumbers.add("8549631257");
//		
//		Contact contact2 = new Contact(2,person2,"friend",phoneNumbers);
//		
//		try {
//			rowadded = daoimpl.addContact(contact2);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(rowadded);
		
//		Set<Contact> contactList = new HashSet<>();
//		try {
//		contactList =	daoimpl.showAllContacts();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(contactList);
		
//		
		Map<String,Number> map = new HashMap<>();
		
		try {
			map = daoimpl.showByCategory("office");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(map);

	
//	Person person3 = new Person("Harshit","verma","verma@gmial.com");
//	
//	List<String> phoneNumbers = new ArrayList<>();
//	
//	phoneNumbers.add("8759632587");
//	phoneNumbers.add("9632587412");
//	
//	Contact contact3 = new Contact(3,person3,"office",phoneNumbers);
//	
//	try {
//		rowadded = daoimpl.addContact(contact3);
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
//Person person4 = new Person("Mahesh","katamaneni","mahesh@gmial.com");
//	
//	List<String> phoneNumber = new ArrayList<>();
//	
//	phoneNumber.add("9632587412");
//	phoneNumber.add("9856321478");
//	
//	Contact contact4 = new Contact(4,person4,"office",phoneNumber);
//	
//	try {
//		rowadded = daoimpl.addContact(contact4);
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//	
//	System.out.println(rowadded);

	}		
}
