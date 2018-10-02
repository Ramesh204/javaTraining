package com.training.utils;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.training.entity.Contact;
import com.training.entity.Person;

public class DAOImpl implements DAO {

	private Connection conn;
	PreparedStatement pstmt = null;
	String sql;
	int rowsAdded;
	int rowsDeleted;
	
	public DAOImpl() {
		super();
		conn = DbConnections.getConnection();
	}

	
	@Override
	public int addContact(Contact contact) throws SQLException {
		 sql = "insert into contactanant values(?,?,?,?,?)";
		
		rowsAdded =0;
		 
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setLong(1, contact.getContactId());
		pstmt.setString(2, contact.getPerson().getFirstName());
		pstmt.setString(3, contact.getPerson().getLastName());
		pstmt.setString(4, contact.getPerson().getemailId());
		pstmt.setString(5, contact.getRelation());
		
		rowsAdded = pstmt.executeUpdate();
		
		 sql = "insert into contactNumberanant values(?,?)";
		for(String n:contact.getNumbers()){
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, n);
			pstmt.setLong(2, contact.getContactId());
			
			rowsAdded+= pstmt.executeUpdate();
		}
		return rowsAdded;
	}

	

	@Override
	public int removeContact(long contactId) throws SQLException {
		
		sql= "delete from contactNumberanant where contactId=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, contactId);
		
		rowsDeleted =0;
		
		rowsDeleted = pstmt.executeUpdate();
		
		sql = "delete from contactanant where contactId=?";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, contactId);
		
		rowsDeleted += pstmt.executeUpdate();
		
		
		return rowsDeleted;
	}


	@Override
	public int removeNumber(String phoneNumber) throws SQLException {
		 sql = "delete from contactNumberanant where phoneNumber=?";
		 
		 pstmt = conn.prepareStatement(sql);
		 pstmt.setString(1, phoneNumber);
		 
		 rowsDeleted =0;
		rowsDeleted = pstmt.executeUpdate();
	
		return rowsDeleted;
	}


	@Override
	public int addNumber(String phoneNumber, long contactId) throws SQLException {
		
		sql = "insert into contactNumberanant values (?,?)";
		
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, phoneNumber);
		pstmt.setLong(2, contactId);
		
		rowsAdded =0;
		
		rowsAdded = pstmt.executeUpdate();
		
		
		return rowsAdded;
	}


	@Override
	public List<String> getPhoneNumber(long contactId) throws SQLException{
		
		List<String> phoneNumbers = new ArrayList<>();
		
		sql = "select phoneNumber from contactNumberanant where contactId=?";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, contactId);
		ResultSet rs = pstmt.executeQuery();
		 
		while(rs.next()){
			phoneNumbers.add(rs.getString(1));
		}
		
		
		return phoneNumbers;
	}


	@Override
	public Contact getContactByName(String name) throws SQLException {
		
		sql = "select * from contactanant where firstName=? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		ResultSet rs = pstmt.executeQuery();
		
		Contact contact = null;
		
		if(rs.next()){
			
			String firstName = rs.getString("firstName");
			String lastName = rs.getString("lastName");
			String emailId = rs.getString("emailId");
			Long contactId = rs.getLong("contactId");
			
			List<String> phoneNumbers = getPhoneNumber(rs.getLong("contactId"));
			
			String relation = rs.getString("relation");
			
			Person person = new Person(firstName,lastName,emailId);
			contact = new Contact(contactId,person,relation,phoneNumbers);
		}
		
		return contact;
	}


	@Override
	public int editPhoneNumber(String oldNumber, String newNumber) throws SQLException {
		
		sql = "update contactNumberanant set phoneNumber=? where phoneNumber=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, newNumber);
		pstmt.setString(2, oldNumber);
		int rowAdded = 0;
		 
		rowAdded = pstmt.executeUpdate();
		
		return rowAdded;
	}


	@Override
	public int editContact(long contactId, String propertyName, String newValue) throws SQLException {
		
		sql = "update contactanant set "+propertyName+" =? where contactId=?  ";
		
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, newValue);
		pstmt.setLong(2,contactId);
		
		int rowAdded = 0;
		
		rowAdded = pstmt.executeUpdate();
		
		return rowAdded;
	}


	@Override
	public TreeSet<Contact> showAllContacts() throws SQLException {
		
		sql = "select firstname from contactanant order by firstName";
		
		pstmt = conn.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		
		TreeSet<Contact> contactList = new TreeSet<>();
		while(rs.next()){
			
			contactList.add(getContactByName(rs.getString(1)));
		}
		
		
		
		return contactList;
	}


	@Override
	public Map<String, Number> showByCategory(String category) throws SQLException {
		
		sql = "select relation,count(*) from contactanant where relation=? group by relation ";
		
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, category);
		
		
		ResultSet rs = pstmt.executeQuery();
		
		Map<String,Number> map = new HashMap<>();
		if(rs.next()){
		map.put(rs.getString(1),rs.getInt(2));
		}
		
		return map;
	}


	

	
	
	

	
	
}
