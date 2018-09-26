package com.training;

import java.util.Set;

public class Application {

	public static void main(String[] args) {
		
//		MapEntry entry1 = new MapEntry(1,"Ramesh");
//		MapEntry entry2 =new MapEntry(2,"Suresh");
//		MapEntry enrty3 = new MapEntry(3,"Mahesh");
		
		MyMap<Integer,String> custMap = new MyMap<>();
		
		custMap.putElement(1, "Ramesh");
		custMap.putElement(2, "Suresh");
		custMap.putElement(3, "Mahesh");
		
		System.out.println(custMap.getElement(3));
		
//		Set custSet = custMap.convertToSet();
//		
//		System.out.println(custSet);
//		
		
		System.out.println(custMap);
		

	}

}
