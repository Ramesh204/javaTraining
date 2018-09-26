package com.training;

public class MyMap<K,V> {
	
	private MapEntry<K,V>[] entries; 
	private int size=0;
	private int capacity=10;
	
	public V getElement(K key){
		
		for(int i=0;i<size;i++)
		{
			if(entries[i].getKey().equals(key)) return entries[i].getValue();
		}
		
		return null;
	}
	
	public V putElement(K key,V value){
		
		V val=null;
		
		for(int i=0;i<size;i++){
			
			
			if(entries[i].getKey().equals(key)){
				val = entries[i].getValue();
				
				entries[i].setValue(value);
			
			}

		}		
		
	}
}
