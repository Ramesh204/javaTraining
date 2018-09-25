package com.training.domain;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Items item1 = new Items(1425,"Furniture",100);
		Items item2 = new Items(1247,"Car",150);
		Items item3 = new Items(1457,"Utensils",200);
		Items item4 = new Items(1236,"Fan",140);
		
		Customer cust1 = new Customer(89632,"Ramesh",125478,3);
		Customer cust2 = new Customer(85632,"Suresh",124578,5);
		Customer cust3 = new Customer(25896,"Mahesh",256893,5);
		
		
		List<Customer> customers = new ArrayList<>();
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		
		
		List<Items> itemList = new ArrayList<>();
		
		itemList.add(item1);
		itemList.add(item2);
		itemList.add(item3);
		itemList.add(item4);
		
		
		Rentals rentals  = new Rentals(customers,itemList);
		
		
		
		HashMap<Items,Integer> rentalItems = new HashMap();
		
		rentalItems.put(item1, 2);
		rentalItems.put(item2, 4);
		rentalItems.put(item3, 5);
		rentalItems.put(item4, 1);
		
		double rent=0.0;
		
		rent = rentals.Calrent(rentalItems, 25631, cust1);
		
		System.out.println("Rent Amount: "+rent);
		System.out.println(cust1);
		System.out.println(rentalItems);
		
		
		
	}

}
