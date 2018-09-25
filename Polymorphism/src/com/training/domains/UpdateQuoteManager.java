package com.training.domains;

import com.training.ifaces.Iautomobile;

public class UpdateQuoteManager extends QuoteManager {

	@Override
	public Iautomobile getModel(int key) {
		// TODO Auto-generated method stub
		
		if(key==3)
		{
			return new Tractor();
		}
		else
		{
		return super.getModel(key);
		}
	}

}
