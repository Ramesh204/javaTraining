import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 20L;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return customerId + "," + customerName + ","  + phoneNumber ;
	}
	private long customerId;
	private String customerName;
	private Address Address;
	private transient long   phoneNumber;
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		Customer cust = (Customer)obj;
		return this.customerId == cust.customerId && this.customerName.equals(cust.customerName);
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("CustomerId"+this.customerId);
	}
	
	private void readObject(ObjectInputStream in){
		try {
			in.defaultReadObject();
			this.phoneNumber = (long)in.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public Customer(long customerId, String customerName, long phoneNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
	}
	private void writeObject(ObjectOutputStream out){
		try {
			out.defaultWriteObject();
			out.writeObject(phoneNumber);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Customer(long customerId, String customerName, Address address, long phoneNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		Address = address;
		this.phoneNumber = phoneNumber;
	}

}
