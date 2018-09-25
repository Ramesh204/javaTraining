package com.training.domains;

import com.training.ifaces.Iautomobile;

public class MarutiCar implements Iautomobile {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		
		return "Swift-Dzire";
		
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Silky Silver";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 700000.00;
	}

}
