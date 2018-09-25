package com.training.domain;
import java.io.*;
import java.util.*;


public class Rentals {
	
	
	private List<Customer> customers = new ArrayList<>();
	private  List<Items> items = new ArrayList<>();
	
	
	public  double Calrent(HashMap<Items,Integer> item,long orderId,Customer cust)
	{
		double val=0.0;
		if(customers.contains(cust))
		{	
			
			List<Order> orderList = cust.getOrders();
			Order order = new Order(orderId,item);
			orderList.add(order);
			cust.setOrders(orderList);
		}
		Set<Items> keys = item.keySet();
		for(Items i:keys)
		{
			if(cust.getRentDays()<5){
			 val+= i.getPrice()*item.get(i)*cust.getRentDays();
			}
			else
			{
				val+=i.getPrice()*item.get(i)*0.9*cust.getRentDays();
			}
		}
		
		return val;
	}

	
	

	public List<Customer> getCustomers() {
		return customers;
	}



	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}



	public List<Items> getItems() {
		return items;
	}



	public void setItems(List<Items> items) {
		this.items = items;
	}



	@Override
	public String toString() {
		return "Rentals [customers=" + customers + ", items=" + items + "]";
	}


	public Rentals(List<Customer> customers, List<Items> items) {
		super();
		this.customers = customers;
		this.items = items;
	}


	public Rentals() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
//	public boolean saveObject(Object obj){
//		boolean status = false;
//		ObjectOutputStream outStream = null;
//		
//		try {
//			 outStream = new ObjectOutputStream(new FileOutputStream(new File("Customer.ser")));
//			 
//			 outStream.writeObject(obj);
//			 
//			 status = true;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally{
//			try {
//				outStream.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//		return status;
//	}
//
//		public Object loadObject(){
//			Object obj=  null;
//			ObjectInputStream inputStream = null;
//			
//			try {
//				inputStream = new ObjectInputStream(new FileInputStream("Customer.ser"));
//				obj = inputStream.readObject();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			finally{
//				try {
//					inputStream.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			
//			return obj;
//		}
//		
//		public boolean writeToTextFile(Items items){
//			boolean result = true;
//			
//			PrintWriter writer = null;
//			try {
//				writer = new PrintWriter(new FileWriter(new File("Items.txt")),true);
//				writer.write(items.toString());
//				result = true;
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			finally{
//				writer.close();
//			}
//			return result;
//		}
//		
//		
//		public List<Items> readFromTextFile(File file)
//		{
//			List<Items> itemsList = new ArrayList<>();
//
//			
//			BufferedReader reader = null;
//			try {
//				
//				reader = new BufferedReader(new FileReader(file));
//				
//				String itemAsString;
//				while((itemAsString=reader.readLine())!=null){
//					String[] content = itemAsString.split(",");
//					
//					
//					Items item = new Items(content[0],content[1],Double.parseDouble(content[2]));
//					
//					itemsList.add(item);
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			finally{
//				try {
//					reader.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			 return itemsList;
//		}
	
		
	
	
	
}
