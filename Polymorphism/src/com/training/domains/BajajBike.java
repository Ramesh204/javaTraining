package com.training.domains;

import com.training.ifaces.Iautomobile;

public class BajajBike implements Iautomobile {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Pulsar";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Blue";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 125000.00;
	}

}
