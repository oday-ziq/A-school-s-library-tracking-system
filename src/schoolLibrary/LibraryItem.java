package schoolLibrary;

public abstract class LibraryItem {
	
	protected String title;
	protected int numberOfCopies;
	
	public LibraryItem() {
		super();
	}
	
	public LibraryItem(String title, int numberOfCopies) {
		super();
		this.title = title;
		this.numberOfCopies = numberOfCopies;
		
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
	
	public abstract void printInfo();
	
	public int cmp(Name composer) {
		return 0;
	}

	public int cmpauther(Name auther) {
		return 0;
	}
	

}
