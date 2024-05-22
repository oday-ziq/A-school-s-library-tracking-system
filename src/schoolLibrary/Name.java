package schoolLibrary;

public class Name {
	
	String firstName;
	String middleName;
	String lastName;
	
	public Name() {
		super();
	}

	public Name(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String toString() {
		if (middleName == null)
			return  firstName + " " + lastName;

		else
			return  firstName + " " + middleName + " " + lastName;

	}

	
	

}
