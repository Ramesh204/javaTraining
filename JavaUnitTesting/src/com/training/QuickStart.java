package com.training;

public class QuickStart {

	public String getMessage(){
		return "Hello".toUpperCase();
	}

	
	public double calculateDiscount(double amount){
		 double discount=0.0;
		
		 if(amount<5000){
			 discount = 0.10;
		 }else{
			 discount = 0.15;
		 }
		return discount;
	}



}


