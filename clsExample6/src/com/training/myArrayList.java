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
	
	public boolean isVaildIndex(int index){
		boolean status = true;
		if((index>size)||(index<0))
		{	
			status = false;
			throw new IndexOutOfBoundsException();
		}
		return status;
	}
	
	public Object getElement(int index) {
		Object obj = null;
		
		if(isVaildIndex(index))
			obj = array[index];
		
		return obj;
	}
	
	
	public int getSize()
	{
		return size;
	}
	
	
	public void removeElement(int index){
		
		if(isVaildIndex(index))
		{
			for(int i=index;i<size-1;i++){
			array[i]= array[i+1];
			}
			--size;
		}
		
		

	
	}




}
