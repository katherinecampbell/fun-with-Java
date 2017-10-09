package assignment2;

public class Address {
	private String street;
	private String city;
	private String country;
	
	// Construct an address object with the specified street, city and country 
	public Address(String street, String city, String country) {
		this.street = street;
		this.city = city;
		this.country = country;
	}
		
	// Return a string representation
	@Override
	public String toString() {
		return street + ", " + city + ", " + country;
	}
}