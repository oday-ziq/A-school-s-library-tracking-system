package schoolLibrary;

public class Borrow {
	
	private NewDate ecquisitionDate;
	private NewDate dueDate;
	private LibraryMember who;

	public Borrow(NewDate ecquisitionDate, NewDate dueDate, LibraryMember who) {
		super();
		this.ecquisitionDate = ecquisitionDate;
		this.dueDate = dueDate;
		this.who = who;
	}

	public NewDate getEcquisitionDate() {
		return ecquisitionDate;
	}

	public void setEcquisitionDate(NewDate ecquisitionDate) {
		this.ecquisitionDate = ecquisitionDate;
	}

	public NewDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(NewDate dueDate) {
		this.dueDate = dueDate;
	}

	public LibraryMember getWho() {
		return who;
	}

	public void setWho(LibraryMember who) {
		this.who = who;
	}

	
}
