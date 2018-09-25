package com.training.domains;

public class Customer {

	private long customerId;
	private String customerName;
	private Address Address;
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		Customer cust = (Customer)obj;
		return this.customerId == cust.customerId && this.customerName.equals(cust.customerName);
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("CustomerId"+this.customerId);
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
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
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Customer(long customerId, String customerName, com.training.domains.Address address, long phoneNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		Address = address;
		this.phoneNumber = phoneNumber;
	}
	private long phoneNumber;
}
