package com.training.ifaces;

public class SecondExample {

		public static void main(String[]args){
			
			Converter exi = (dlrAmt)->{return dlrAmt*72.01;};
			
			System.out.println(exi.dollarToInr(20));
			
		}
}
