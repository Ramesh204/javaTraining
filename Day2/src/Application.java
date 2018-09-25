
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book hfirst = new Book ("101","head First Java", "Kathy Sieera",450);
		Book thinkJava = new Book("102","Thinking in Java","Bruce Erikel",850);
		Book effJava = new Book("103","Effective Java","sashi",700);
		
		Book[] bookList = new Book[3];
		
		bookList[0] = hfirst;
		bookList[1] = thinkJava;
		bookList[2] = effJava;
		
		BookManger mgr = new BookManger();
		
		mgr.displayBooks(bookList);
		
	}

}
