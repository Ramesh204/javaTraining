import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectHandling {

public boolean saveObject(Object obj){
	boolean status = false;
	ObjectOutputStream outStream = null;
	
	try {
		 outStream = new ObjectOutputStream(new FileOutputStream(new File("Customer.ser")));
		 
		 outStream.writeObject(obj);
		 
		 status = true;
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally{
		try {
			outStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	return status;
}

	public Object loadObject(){
		Object obj=  null;
		ObjectInputStream inputStream = null;
		
		try {
			inputStream = new ObjectInputStream(new FileInputStream("Customer.ser"));
			obj = inputStream.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally{
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return obj;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ObjectHandling [loadObject()=" + loadObject() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public boolean writeToTextFile(Customer cust){
		boolean result = true;
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(new FileWriter(new File("Customer.txt")));
			writer.write(cust.toString());
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			writer.close();
		}
		return result;
	}
	
	
	public List<Customer> readFromTextFile(File file)
	{
		List<Customer> custList =  new ArrayList<>();
		
		BufferedReader reader = null;
		try {
			
			reader = new BufferedReader(new FileReader(file));
			
			String custAsString;
			while((custAsString=reader.readLine())!=null){
				String[] items = custAsString.split(",");
				
				Customer cust = new Customer(Long.parseLong(items[0]),items[1],Long.parseLong(items[2]));
				
				custList.add(cust);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 return custList;
	}
}
