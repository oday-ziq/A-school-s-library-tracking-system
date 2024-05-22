package schoolLibrary;

public class Student extends LibraryMember{
	
	private int studentNumber;
	private double avargeMark;
	
	public Student(int id, Name name, String phoneNumber, String emailAddress, NewDate dateOfBirth, Address address, int studentNumber, double avargeMark) {
        super(name, phoneNumber, emailAddress, dateOfBirth, new LibraryItem[5], address, 0);
        this.studentNumber = studentNumber;
        this.avargeMark = avargeMark;
    }

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public double getAvargeMark() {
		return avargeMark;
	}

	public void setAvargeMark(double avargeMark) {
		this.avargeMark = avargeMark;
	}


	@Override
    protected void borrowItem(LibraryItem item) {
        if (getNumberOfBorrowItems() >= 5) {
            System.out.println("Cannot borrow more items. Limit reached.");
            return;
        }

        for (int i = 0; i < getListOfLibraryItems().length; i++) {
            if (getListOfLibraryItems()[i] == null) {
                getListOfLibraryItems()[i] = item;
                incrementNumberOfBorrowedItems();
                System.out.println("Item borrowed: " + item.getTitle());
                return;
            }
        }

        System.out.println("No space to borrow more items.");
    }

	 @Override
	    protected void printInfo() {
	        System.out.println("Student Information:");
	        System.out.println("ID: " + getId());
	        System.out.println("Name: " + getName().toString());
	        System.out.println("Student Number: " + getStudentNumber());
	        System.out.println("Average Mark: " + getAvargeMark());
	        System.out.println("Date of Birth: " + getDateOfBirth().toString());
	        System.out.println("Address: " + getAddress().toString());
	        System.out.println("Number of Borrowed Items: " + getNumberOfBorrowItems());

	    }

	    private void incrementNumberOfBorrowedItems() {
	        int currentCount = getNumberOfBorrowItems();
	        setNumberOfBorrowItems(currentCount + 1);
	    }

		@Override
		protected int getId() {
			// TODO Auto-generated method stub
			return 0;
		}
	

}
