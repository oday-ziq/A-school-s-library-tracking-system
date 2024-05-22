package schoolLibrary;

public class Book extends LibraryItem implements Comparable{
	
	private String author;
	private String ISBN;
	
	
	public Book(String author, String iSBN) {
		super();
		this.author = author;
		this.ISBN = iSBN;
	}


	public Book() {
		super();
	}
	
	


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getISBN() {
		return ISBN;
	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	@Override
	public void printInfo() {
	        System.out.println("Book: " + title + ", Author: " + author + ", number Of Copies : " + numberOfCopies);
		
	}
	
	@Override
	public int cmpauther(Name auther) {
		if (auther.equals(auther))
			return 1;
		else
			return 0;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}



	
	
	

}
