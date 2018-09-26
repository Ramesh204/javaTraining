package com.training;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MyMap<K,V> {
	
	private MapEntry<K,V>[] entries; 
	private int size=0;
	private int capacity=10;
	
	
	
	public MyMap() {
		super();
		entries = new MapEntry[capacity];
	}

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
				val = (V) entries[i].getValue();	
				entries[i].setValue(value);
			}
		}	
		
		if(val==null){
			if(size<capacity){
				MapEntry entry = new MapEntry(key,value);
				entries[size]=entry;
				size++;
			}
			else{
				capacity*=2;
				entries = Arrays.copyOf(entries, capacity);
			}
		}
		
		return val;}

	

	@Override
	public String toString() {
		return "MyMap [entries=" + Arrays.toString(entries) + "]";
	}

	public Set<MapEntry<K,V>> convertToSet(){
		Set<MapEntry<K,V>> set = new HashSet<MapEntry<K,V>>();
		
		for(int i=0;i<size;i++){
			set.add(entries[i]);
		}
		
		return set;
	}
	
	public MyMap(MapEntry<K, V>[] entries, int size, int capacity) {
		super();
		this.entries = entries;
		this.size = size;
		this.capacity = capacity;
	}
	
	

}
