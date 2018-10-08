package com.training.resources;

import java.util.HashMap;

import com.training.beans.Customer;

public class CustomerDetails {

	
	private static HashMap<Long,Customer> custList;
	
	static{
		custList = new HashMap<>();
		
		custList.put(101L, new Customer(101,"Mahesh",15456L));
		custList.put(102L, new Customer(102,"Ganesh",1254L));
	}
	
	public static Customer getCustomer(long key){
		return custList.get(key);
	}
	
	public static HashMap<Long,Customer> getAllCustomer(){
		
		return custList;
	}
	
	public static String addCustomer(Customer cust){
		
		String message  = "Added";
		Customer result = (Customer)custList.put(cust.getCustomerId(), cust);
		
		if(result!=null)
		{
			message = "Replaced";
		}
		
		return message;
	
	}
	
	public static String removeCustomer(long key){
		Customer cust=custList.remove(key);
		return cust.getCustomerName();
	}
	
	public static String updateMobieNumber(Customer cust,long key){
		Customer foundCustomer = custList.put(key, cust);
//		cust.setMobileNumber(updateMobileNumber);
		
		
		return cust.getCustomerName()+"Number changed" +cust.getMobileNumber();
	}
}
