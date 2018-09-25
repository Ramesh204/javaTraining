package com.training.domain;

import java.io.*;
import java.util.*;
import java.util.TreeSet;

public class Application {

		List<Restaurant> restaurant = new ArrayList<Restaurant>();
		
		private static  boolean writeToTextFile(Restaurant rest){
			boolean status = false;
			PrintWriter writer = null;
			
			try {
				writer = new PrintWriter(new FileWriter(new File("Restaturant.txt"),true));
				writer.write(rest.toString()+"\n");
				status = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally{
				writer.close();
			}
			return status;
		}
		
		private static List<Restaurant> readFromTextFile()
		{
			List<Restaurant> restaurant = new ArrayList<Restaurant>();
			
			BufferedReader reader = null;
			
			try {
				reader = new BufferedReader(new FileReader(new File("Restaturant.txt")));
				
				String restAsString;
				while( (restAsString=reader.readLine() )!=null )
				{
					String[] items = restAsString.split(",");
					
					Restaurant rest = new Restaurant(items[0],items[1],Long.parseLong(items[2]),Integer.parseInt(items[3]));
					
					restaurant.add(rest);
					

					
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			finally{
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return restaurant;
		}
		
		
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant rest1 = new Restaurant("Amurtha","Benguluru",985621476,5);
		Restaurant rest2 = new Restaurant("Hyderbad Hotel","Benguluru",985621476,2);
		Restaurant rest3 = new Restaurant("Andhra Hotel","Benguluru",985621476,3);
		
		
		writeToTextFile(rest1);
		writeToTextFile(rest2);
		writeToTextFile(rest3);
		
		
		List<Restaurant> restlist = readFromTextFile();
		Collections.sort(restlist);
	System.out.println(restlist);
	}

}
