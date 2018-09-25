package com.training.domains;

import com.training.ifaces.Iautomobile;

public class Tractor implements Iautomobile {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "John Deer";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 130000.00;
	}

}
