import java.io.File;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		
		Address addr1 = new Address("Gandhi Street","Nehru Nagar","Cheanni",254789);
		Address addr2 = new Address("Rajiv Street","Indria Nagar","Bengaluru",500124);
		
		Customer ramesh1 = new Customer(101,"Ramesh Babu",addr1,98404040);
		
		ObjectHandling handler =  new ObjectHandling();
		
		boolean result = handler.saveObject(ramesh1);
		
		if(result)
		{
			System.out.println("Saved the file");
		}
		else{
			System.out.println("Not saved");
		}

		Customer obj = (Customer)handler.loadObject();
		
		System.out.println(obj);
		
		
		
		boolean status = handler.writeToTextFile(ramesh1);
		
		if(status){
			System.out.println("saved the txt file");
			
		}
		else
		{
			System.out.println("Not the txt file");
		}
		
		
		List<Customer> custList =  handler.readFromTextFile(new File("Customer.txt"));
		
		System.out.println(custList);
		}

}
