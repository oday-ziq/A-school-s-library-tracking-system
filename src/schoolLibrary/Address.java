package schoolLibrary;

public class Address {
	
	private String street;
	private String city;
	private String biuldingName;
	private String poBox;
	private String country;


	public Address(String street, String city, String biuldingName, String poBox, String country) {
		super();
		this.street = street;
		this.city = city;
		this.biuldingName = biuldingName;
		this.poBox = poBox;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBiuldingName() {
		return biuldingName;
	}

	public void setBiuldingName(String biuldingName) {
		this.biuldingName = biuldingName;
	}

	public String getPoBox() {
		return poBox;
	}

	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", biuldingName=" + biuldingName + ", poBox=" + poBox
				+ ", country=" + country + "]";
	}


}
