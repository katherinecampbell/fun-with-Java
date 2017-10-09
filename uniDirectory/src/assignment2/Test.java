package assignment2;

public class Test {
	public static void main(String[] args) {
		// Create student objects
		Student student1 = new Student(new Name("Charles", "Darwin"), new Address("20 Lower Rathmines Road", "Dublin", "Ireland"), "Computer Science");
		Student student2 = new Student(new Name("Marie", "Curie"), new Address("20 Lower Rathmines Road", "Dublin", "Ireland"), "Computer Science");
		Student student3 = new Student(new Name("Ada", "Lovelace"), new Address("111 Clonskeagh Road", "Dublin", "Ireland"), "Computer Science");
		Student student4 = new Student(new Name("Alan", "Turing"), new Address("111 Clonskeagh Road", "Dublin", "Ireland"), "Computer Science");
		Student student5 = new Student(new Name("Bob", "Smith"), new Address("17 Woodlands Road", "Dublin", "Ireland"), "Computer Science");

		// Create instructor objects
		Instructor instructor1 = new Instructor(new Name("Albert", "Einstein"), new Address("222 Rathgar Road", "Dublin", "Ireland"), "Professor");
		Instructor instructor2 = new Instructor(new Name("Grace", "Hopper"), new Address("222 Rathgar Road", "Dublin", "Ireland"), "Professor");

		// Create module objects
		Module module1 = new Module("CS-0010", "Data Science");		
		Module module2 = new Module("CS-0020", "Artificial Intelligence");
		Module module3 = new Module("CS-0030", "Mathematics 101");

		// Set the instructor for module1 and set the module for instructor1
		module1.setInstructor(instructor1);
		instructor1.setModule(module1);

		// Add students to modules and add modules to students 
		module1.addStudent(student1);
		module1.addStudent(student2);
		module1.addStudent(student3);
		module1.addStudent(student4);
		student1.addModule(module1);
		student2.addModule(module1);
		student3.addModule(module1);
		student4.addModule(module1);

		module2.addStudent(student3);
		module2.addStudent(student4);
		student3.addModule(module2);
		student4.addModule(module2);

		// Display output
		System.out.println("Students\n========");
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println(student4.toString());
		System.out.println(student5.toString());

		System.out.println("Instructors\n===========");
		System.out.println(instructor1.toString());
		System.out.println(instructor2.toString());

		System.out.println("Modules\n=======");
		System.out.println(module1.toString());
		System.out.println(module2.toString());
		System.out.println(module3.toString());

	}
}