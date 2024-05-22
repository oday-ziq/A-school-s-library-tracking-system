package schoolLibrary;

public abstract class LibraryMember {
	
	private Name name;
	private String phoneNumber;
	private String emailAddress;
	private NewDate dateOfBirth;
	private LibraryItem[] listOfLibraryItems = new LibraryItem[5];
	private Address Address;
	private int numberOfBorrowItems;
	
	
	
	public LibraryMember() {
		super();
	}



	public LibraryMember(Name name, String phoneNumber, String emailAddress, NewDate dateOfBirth,
			LibraryItem[] listOfLibraryItems, schoolLibrary.Address address, int numberOfBorrowItems) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.dateOfBirth = dateOfBirth;
		this.listOfLibraryItems = listOfLibraryItems;
		this.Address  = address;
		this.numberOfBorrowItems = numberOfBorrowItems;
	}



	public Name getName() {
		return name;
	}



	public void setName(Name name) {
		this.name = name;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}



	public NewDate getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(NewDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public LibraryItem[] getListOfLibraryItems() {
		return listOfLibraryItems;
	}



	public void setListOfLibraryItems(LibraryItem[] listOfLibraryItems) {
		this.listOfLibraryItems = listOfLibraryItems;
	}



	public Address getAddress() {
		return Address;
	}



	public void setAddress(Address address) {
		Address = address;
	}



	public int getNumberOfBorrowItems() {
		return numberOfBorrowItems;
	}



	public void setNumberOfBorrowItems(int numberOfBorrowItems) {
		this.numberOfBorrowItems = numberOfBorrowItems;
	}



	protected abstract void borrowItem(LibraryItem item);




	protected abstract void printInfo();



	protected abstract int getId();
	
	

	
	

}
