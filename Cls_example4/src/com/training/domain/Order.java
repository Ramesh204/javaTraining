package com.training.domain;

import java.util.*;

public class Order {


	private long orderId;
	
	private HashMap<Items,Integer> items = new HashMap<>();
	
	public void addItems(Items item, Integer quantity)
	{
		int qty;
		if(items.containsKey(item))
		{
			 qty = items.get(item);
			 qty+=quantity;
			
		}
		else
			qty= quantity;
		
		items.put(item, qty);
		
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(long orderId, HashMap<Items, Integer> items) {
		super();
		this.orderId = orderId;
		this.items = items;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public HashMap<Items, Integer> getItems() {
		return items;
	}

	public void setItems(HashMap<Items, Integer> items) {
		this.items = items;
	}
	
	
}
