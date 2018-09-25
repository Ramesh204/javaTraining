package com.training.domain;

import java.util.*;

public class Customer {

	private long customerId;
	private String customerName;
	private long PhoneNumber;
	private int rentDays;
	private List<Order> orders = new ArrayList<>();
	
	
	
	
	public Customer(long customerId, String customerName, long phoneNumber, int rentDays) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		PhoneNumber = phoneNumber;
		this.rentDays = rentDays;
		
	}

	public int getRentDays() {
		return rentDays;
	}

	public void setRentDays(int rentDays) {
		this.rentDays = rentDays;
	}

	

	

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public List<Order> getOrders() {
		return orders;
	}

	

	@Override
	public String toString() {
		return  "[customerId=" + customerId   + ", "
				+ "customerName=" + customerName + ", "
						+ "PhoneNumber=" + PhoneNumber+ ", "
								+ "rentDays=" + rentDays + "]";
		
		
	}
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(long customerId, String customerName, long phoneNumber, List<Order> orders) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		PhoneNumber = phoneNumber;
		this.orders = orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}