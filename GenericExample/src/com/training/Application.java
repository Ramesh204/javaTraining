package com.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

	//Generic Methods -Type1
	public static <T> T showNumbers(List<T>numList){
		
		return numList.get(2);
	}
	
//	//Generic Methods -Type2 WILDCARD TYPES
	public static void print(List<?>list){
		list.forEach(System.out::println);
	}
	
	
	
	// Generic method - Type3 - Producer
	public static void printList(List<? extends Number>list){
		list.forEach(System.out::println);
	}

	
	
	
//	//Generic Method - Type4 - Consuemr
//	
	public static void addToList(List<? super Integer>list){
		list.set(2, 7);
		list.add(41);
		
		// list.set(1,new Boolean(true)); we cant stuff also since Boolean isnt super of Integer
		// list.add(47) we can't add but we can stuff 
		// In case of wildcard generic types you cant do structural change (TYPE SAFETY)
	}
	public static void main(String[] args) {

	
		AddNumber<Double,String> marks = new AddNumber<>();
		marks.setDigit(98.3);
		marks.addObject("Ramesh");
		
		AddNumber<Integer,String> age = new AddNumber<>();
		age.setDigit(98);
		age.addObject("Suresh");
		
//		System.out.println(marks.getDigit()+", "+marks.getList());
//		System.out.println(age.getDigit()+", "+age.getList());
		
		
		List<Integer> engList =new  ArrayList<>();
		engList.add(25);
		engList.add(45);
		engList.add(12);
		
		List<Double>  mathList = Arrays.asList(20.03,30.12,41.02);
		
//		System.out.println(showNumbers(engList));
//		System.out.println(showNumbers(mathList));
	
		
		List<Object> studList = Arrays.asList(new Boolean(true),new Boolean(false),new Boolean(true));
		
//		print(studList);
//		print(engList);
//		print(mathList);

		
//		printList(mathList);
//		printList(engList);
//		printList(studList); // ? extends number 
//		
//		
	addToList(engList);
	engList.forEach(System.out::println);
		
		//addToList(studList);
//		addToList(mathList); // ? super Integer not accepting List<Double>
//		
//
}

}
