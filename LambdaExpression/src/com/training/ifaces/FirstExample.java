package com.training.ifaces;
import java.util.*;


public class FirstExample {
	
	public static void main (String[]args){
		
		IGreeting greeter = (name)->{return "HI " + name.toUpperCase();};
		
		System.out.println(greeter.greet("Ramesh"));
		
		//OLD WAY OF DOING
		/*String[] names = {"Ramesh","Suresh","Magesh"};
		
		for(String name:names){
			System.out.println(name);
		}*/
		
		
		//Java8 Way of Doing
		List<String> nameList = Arrays.asList("Ramesh","Suresh","Magesh");
		
		nameList.forEach(System.out::println);
	}

}
