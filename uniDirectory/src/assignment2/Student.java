package assignment2;

public class Student extends Person{//extends notes a subclass and superclass
	public Name name;
	private Address address;
	private String programme; //student program
	private int counter = 0;
	final static int MAX_NUMBER_MODULES = 12;//constant max modules set at 12
	private  Module[] modules = new Module[MAX_NUMBER_MODULES];//modules student is taking
	
	//constructor for name and address for person
		public Student(Name name, Address address, String programme){
			super(name,address);//must call super constructor
			this.name = name;
			this.address = address;
			this.programme = programme;}

//method to add modules
public boolean addModule(Module m){
	if (counter <= MAX_NUMBER_MODULES){
		modules[counter] = m;
		counter ++;
		return true;}
	else{return false;}
}

//Return a string representation
	@Override
	public String toString() {
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append ("name: "+ name + "\naddress: "+ address + "\nprogramme: "+ programme +"\nmodules: \n" );
		if (modules[0] == null){
			stringbuilder.append("\t none \n");}
		else{
			for (int i=0; i < modules.length; i++){
				if(modules[i] != null){
					stringbuilder.append ("\t"+ modules[i].getCode()+" (");
					stringbuilder.append (modules[i].getTitle() +") \n");}}
	}
		return stringbuilder.toString();
}}