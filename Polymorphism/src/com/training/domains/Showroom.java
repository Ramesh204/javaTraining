package com.training.domains;

import java.util.*;

import com.training.ifaces.Iautomobile;

public class Showroom {

	public static  void main(String args[]) {
		// TODO Auto-generated method stub
		
		QuoteManager quote = new UpdateQuoteManager();
		String choice="y";
		Scanner sc = new Scanner(System.in);
		do{
		
		
		System.out.println("enter the code [1-car 2-bike 3-tractor]");
		
		int key = sc.nextInt();
		
		Iautomobile auto = quote.getModel(key);
		
		quote.printQuote(auto);
		
		System.out.println("Enter Y to continue n to stop");
		
		choice =sc.next();
		}
		while(choice.equals("y"));
		sc.close();
		
		System.out.println("Bye......");

	}

}
