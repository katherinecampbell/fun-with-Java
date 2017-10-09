package assignment2;

public class Name {
	private String firstName;
	private String lastName;

	// Construct a name object with the specified first name and last name
	public Name (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	// Return a string representation 
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}