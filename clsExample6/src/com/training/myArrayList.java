package com.training;

import java.util.Arrays;
import java.util.Iterator;

public class myArrayList<T> implements Iterable<T>{

	
	private int capacity = 10;
	private Object array[];
	private int size=0;
	
	public myArrayList(){
		array = new Object[capacity];
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
	
	
	@Override
	public String toString() {
	
		String str="";
		
		
		for(int i=0;i<size;i++)
		{
			str+= array[i].toString()+",";
		}
		return str;
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

	@Override
	public Iterator<T> iterator() {
		
		return new  Iterator<T>() {
			
			int index =0;
			
			
			@Override
			public boolean hasNext() {
				boolean status = false;
				
				
				if(index<size)
				{
					status = true;
				}
				
				return status;
			}

			@Override
			public T next() {
				
				return  (T) array[index++];
			}
			
		};
	}




}
