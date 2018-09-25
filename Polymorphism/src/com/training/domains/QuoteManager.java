package com.training.domains;

import com.training.ifaces.Iautomobile;




public class QuoteManager {
	
	public void printQuote(Iautomobile polyAuto){
		
		if(polyAuto !=null){
			
		System.out.println(polyAuto.getModel());
		System.out.println(polyAuto.getColor());
		System.out.println(polyAuto.getPrice());
		}
	else
	{
		System.out.println("choice should be [1-3]-try again");
	}
	/**
	 * @parm key represents the key value 1-3 for the automobile
	 * @return the subtype of automobile 
	 */
	}
	public Iautomobile getModel(int key){
		switch(key){
		case 1:
			return new MarutiCar();
		case 2:
			return new BajajBike();
		default:
			return null;
		}
	}
}
