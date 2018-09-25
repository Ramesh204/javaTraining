package com.training;

import java.util.Arrays;

public class myArrayList {

	private static final Exception ArrayIndexOutOfBoundsException = null;
	private int capacity = 10;
	private Object array[];
	private int size=0;
	
	public myArrayList(){
		array = new Object[10];
	}
	
	public boolean addElements(Object element){
		if(this.size==capacity){
			capacity*=2;
			array = Arrays.copyOf(array, size);
		}
		array[size]=element;
		size++;
		return true;
	}
	
	
	public Object getElement(int index) throws Exception{
		Object obj = null;
		
		if((index<size)&&(index>=0))
		{
			obj = array[index];
		}
		else throw new ArrayIndexOutOfBoundsException();
		
		return obj;
	}
	
	
	public int getIndex()
	{
		return size;
	}
	
	public void removeElement(int index){
		
		if((index<size)&&(index>=0))
		{
			array[index-1]= array[index+1];
		}
	}
}
