package com.training;


public class Application {

	public static void main(String[] args) {

		myArrayList exmpArray = new myArrayList();
		
		
		exmpArray.addElements("Ramesh");
		exmpArray.addElements("Suresh");
		exmpArray.addElements("Mahesh");
		
	System.out.println(exmpArray.getSize());	
	
		String ele =null;
		try {
			ele = (String) exmpArray.getElement(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(ele);
		
		
//		exmpArray.removeElement(2);
		
		
	}

}
