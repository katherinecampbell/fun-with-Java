package assignment2;

public class Person {
	private Name name;
	private Address address;
	
	//constructor for name and address for person
	public Person(Name name, Address address){
		this.name = name;
		this.address = address;}
	
	//getter method for field name
	public Name getName(){
		return this.name;
	}
	// Return a string representation
		@Override
		public String toString() {
			return name + "\n" + address ;
		}	
	}
