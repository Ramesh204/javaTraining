
public class Book {
	

	@Override
	public String toString() {
		return this.author + "," +this.bookName;
	}


	private String bookNumber;
	private String bookName;
	private String author;
	private int ratePerUnit;
	
	//Using Default Modifier
	static String publisher = "Orilley";
	
	
	public Book(String bookNumber, String bookName, String author) {
		/*super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;*/
		
	}


	public Book() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	


	public Book(String bookNumber, String bookName, String author, int ratePerUnit) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.ratePerUnit = ratePerUnit;
	}


	public String getBookNumber() {
		return bookNumber;
	}


	public void setBookNumber(String bookNumber) {
		this.bookNumber = bookNumber;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getRatePerUnit() {
		return ratePerUnit;
	}


	public void setRatePerUnit(int ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}


	public double findDiscount(){
		double discount = 0.1;
		if(this.author.equals("sashi")){
			discount = 0.15;
		}
		return discount;
	}
}
