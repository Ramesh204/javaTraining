
public class BookManger {

	
	public void display(Book...books){
		displayBooks(books);
	}
	public void displayBooks(Book[] bookList)
	{
		for(Book eachBook:bookList){
			double discount = eachBook.findDiscount();
			double amount = eachBook.getRatePerUnit();
			double netAmount = amount- amount*discount;
			
			System.out.println(eachBook.getBookName());
			System.out.println(eachBook.getAuthor());
			
			System.out.println("publisher :="+Book.publisher);
			
			/**
			 * toString method will be called  implicitly if its not overridden in the class
			 *  the superclass to string method will be called
			 */
			System.out.println(eachBook);
		}
	}
}
