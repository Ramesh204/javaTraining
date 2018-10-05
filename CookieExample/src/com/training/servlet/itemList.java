package com.training.servlet;

import java.util.*;

public class itemList {

		
	public static Map<String,List<String>> getItems(){
		
		List<String> books = Arrays.asList("Head First Java","Thinking In java");
		
		List<String>  fashion = Arrays.asList("LipStick","Kajal");
		
		List<String>  textiles = Arrays.asList("Casual Wear","Party Wear");
		
		List<String>   electronics = Arrays.asList("Laptop","mobile");
		
		
		Map<String,List<String>> items = new HashMap<>();
		
		
		items.put("Books", books);
		items.put("Textiles", textiles);
		items.put("Fashion", fashion);
		
		items.put("Electronics", electronics);
		
		return items;
	
	}
}
