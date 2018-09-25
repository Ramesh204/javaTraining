package com.training;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class QuickStartTest {
	
	
	QuickStart obj;
	@Before
	public void init(){
		obj = new QuickStart();
		}
	
	
	
	@Test
	public void testGetMessage() {
		
		
		String expected = "HELLO";
		String actual =obj.getMessage();
		
		assertEquals("Get Message Return should be string in  upper case string",expected,actual);
	}
	
	@Test
	public void testCalculateDiscountcond1(){
		Double amount = 5000.0;
		Double expected = 0.15;
		Double actual = obj.calculateDiscount(amount);
		
		assertEquals("Discount should be 0.15",expected,actual);
		
	}
	
	@Test
	public void testCalculateDiscountcond2(){
		Double amount = 5000.0;
		Double expected = 0.10;
		Double actual = obj.calculateDiscount(amount);
		
		assertEquals("Discount should be 0.15",expected,actual);
		
	}
	
	@Test
	public void testCalculateDiscountcond3(){
		
	}
	
}
