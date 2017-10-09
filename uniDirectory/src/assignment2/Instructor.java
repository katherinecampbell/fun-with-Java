package assignment2;

public class Instructor extends Person {//shows that Instructor is subclass of student
	private Name name;
	private Address address;
	private String position;
	private Module module;
	
	//constructor to build instructor
	public Instructor(Name name, Address address, String position){
		super(name,address);//must call super constructor
		this.name = name;
		this.address = address;
		this.position = position;}
	
	//Set a new module
	public void setModule(Module module) {
		this.module = module;
	}
	
	//Return a string representation
		@Override
		public String toString() {
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append ("name: "+ name + "\n" + "address: "+ address + "\n" +"position: "+ position +"\n" + "module: " );
			if (module == null){
				stringbuilder.append("not set"+"\n");}
			else{
				stringbuilder.append (module.getCode()+" (");
				stringbuilder.append (module.getTitle() +")" +"\n");}
			return stringbuilder.toString();
	}}