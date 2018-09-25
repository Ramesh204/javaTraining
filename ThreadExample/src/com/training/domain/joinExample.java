package com.training.domain;

import java.io.IOException;

public class joinExample {
	
	public static void main(String[]args)
	{
		System.out.println("Main started");
		 
		System.out.println(Thread.currentThread().getName());
		
		Thread thread =  new Thread(){

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("Reading");
				
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Finished threading");
			}
			
			
		};
		
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main FInished");
	}
}
