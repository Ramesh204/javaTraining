package com.training;

public class outer {

	public void show(String[] data,String condition){
		
		Filter obj = new Filter(){

			@Override
			public String filter(String[] data, String condition) {
				// TODO Auto-generated method stub
				
			
				return data[0];
			}};
			
		System.out.println(obj.filter(data, condition));	
	}
	public static void main(String[]args){
		outer obj = new outer();
		
		String[] names= {"Gaurav", "Aneesh","Magesh"};
		
		obj.show(names,"");
	}
}
