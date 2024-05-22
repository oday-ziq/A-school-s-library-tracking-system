package schoolLibrary;

public class Professor extends LibraryMember{
	
	private int salary;

	


	public Professor(Name name, String phoneNumber, String emailAddress, NewDate dateOfBirth,
            Address address, int salary) {
        super(name, phoneNumber, emailAddress, dateOfBirth, new LibraryItem[5], address, 0); // Assuming an initial array
        this.salary = salary;
    }



	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
    protected void borrowItem(LibraryItem item) {
        for (int i = 0; i < getListOfLibraryItems().length; i++) {
            if (getListOfLibraryItems()[i] == null) {
                getListOfLibraryItems()[i] = item;
                setNumberOfBorrowItems(getNumberOfBorrowItems() + 1);
                System.out.println("Item borrowed: " + item.getTitle());
                return;
            }
        }
        System.out.println("Reached physical limit of borrowed items.");
    }

    @Override
    protected void printInfo() {
        System.out.println("Professor Information:");
        System.out.println("Name: " + getName());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Email: " + getEmailAddress());
        System.out.println("DOB: " + getDateOfBirth());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: $" + getSalary());
        System.out.println("Number of Borrowed Items: " + getNumberOfBorrowItems());
    }


	@Override
	protected int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
