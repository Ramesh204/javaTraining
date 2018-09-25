package com.training.domain;

public  class Items {

	
	private long itemId;
	private String type;
	private double price;
	
	
	@Override
	public String toString() {
		return ( "\n" + type + ",   price:" +price+ ",  Quantity " );
		
		
	}
	
	
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Items(long itemId, String type, double price) {
		super();
		this.itemId = itemId;
		this.type = type;
		this.price = price;
	}
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}