package com.training.domains;

public class Address {

	private String addressLine1;
	private String addressLine2;
	private String city;
	private long pincode;
	public Address(String addressLine1, String addressLine2, String city, long pincode) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		
		if(pincode<0)
		{
			try{
				throw new Exception("Pincode should not be negative");
			}
			catch(Exception e){
				//something should be there in catch otherwise JVM swallows the message
				System.err.println(e.getMessage());
			}
		}
		else{
			this.pincode = pincode;
		}
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) throws Exception {
		if(pincode<0){
			throw new Exception("pincode should be positive Number");
		}
		else
		this.pincode = pincode;
	}
	
	
}
