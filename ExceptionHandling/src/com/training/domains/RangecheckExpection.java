package com.training.domains;

public class RangecheckExpection extends Exception {

	private String message;
	
	public RangecheckExpection(String message){
		super();
		this.message = message;
		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "runtime exception"+ message;
	}
	
}
