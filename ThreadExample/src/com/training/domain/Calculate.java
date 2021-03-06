package com.training.domain;

public class Calculate implements Runnable {
	
	private int count;
	
	public Calculate(int count) {
		super();
		this.count=count;
	}

	private long fact(long n)
	{
		if(n==1){
			return n;
		}
		return n*fact(n-1);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(fact(count));
		System.out.println(Thread.currentThread().getName());

	}
	
	public static void main(String[]args)
	{	
		
		System.out.println(Thread.currentThread().getName());
		Calculate cal = new Calculate(5);
		Thread thread = new Thread(cal);
		
		thread.setName("5 fact");
		thread.start();
		
		Calculate fourfact = new Calculate(4);
		Thread thread2 =  new Thread(fourfact);
		
		thread2.setName("4 Fact");
		thread2.start();
		
	}

}
