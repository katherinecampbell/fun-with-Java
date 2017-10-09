package assignment2;

public class Module {
	private String code;
	private String title;
	private Instructor instructor;
	private int counter = 0;
	final static int MAX_NUMBER_STUDENTS = 80;//constant to set max number of students to 80
	private Student[] students = new Student[MAX_NUMBER_STUDENTS];
	
	//constructor to make a module
	public Module(String code, String title){
		this.code = code;
		this.title = title;
		this.instructor = instructor;
		this.students = students;}
	
	// set instructor
			public void setInstructor(Instructor instructor) {
				this.instructor = instructor;}
			
	//getters for code, title, and instructor fields
		//get code
		public String getCode(){
			return this.code;}
		//get title
		public String getTitle (){
			return this.title;}
		//get instructor
		public Instructor getInstructor(){
			return this.instructor;}

		//method to add a student
		public boolean addStudent(Student s){
			if (counter <= MAX_NUMBER_STUDENTS){
				students[counter] = s;
				counter ++;
				return true;}
			else{return false;}
				}
		

		//Return a string representation
				@Override
				public String toString() {
					StringBuilder stringbuilder = new StringBuilder();
					stringbuilder.append ("code: "+ code + "\ntitle: "+ title+"\n");
					if (instructor == null){
						stringbuilder.append("instructor: not set \n");}
						else{ stringbuilder.append("instructor: " + instructor);
					}
					stringbuilder.append ("students: \n \t");
					if (students[0]==null){
						stringbuilder.append("none");}
					else{
					
						for (int i=0; i < students.length; i++){
							if(students[i] != null){
								stringbuilder.append(students[i].getName()+ "\n \t");}}

					}
				
					return stringbuilder.toString();
				}}

