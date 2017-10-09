package assignment1;
//test to ensure this is the right file
public class Test {
	public static void main(String[] args) {
		// Test MyCharacter class
		for (int i = 0; i < 128; i++) { // Iterate over ASCII characters
			char ch = (char)i;
			//System.out.println(i + " " + ch);
			testMyCharacterClass(ch);
		}

		// Test MyString class
		testMyString("");
		testMyString(" ");
		testMyString("\t");
		testMyString("Test");
		testMyString("\t 0 \t test 1  TEST 2 \t \t\t  ");

		testMyString("", "");
		testMyString(" ", "");
		testMyString("", " ");
		testMyString(" ", " ");
		testMyString("abc", "ab");
		testMyString("ab", "abc");
		testMyString("abc", "bc");
		testMyString("Abc", "abC");

		System.out.println("____________________________________________________________________________________");
		System.out.println("Any output above this line indicates there are errors in one of more of your methods");
	}

	// A method to test the MyCharacter class
	public static void testMyCharacterClass(char ch) {
		if (Character.isLowerCase(ch) != MyCharacter.isLowerCase(ch))
			printErrorMessage("Error in method: MyCharacter.isLowerCase(ch)", ch);

		if (Character.isUpperCase(ch) != MyCharacter.isUpperCase(ch))
			printErrorMessage("Error in method: MyCharacter.isUpperCase(ch)", ch);

		if (Character.isDigit(ch) != MyCharacter.isDigit(ch))
			printErrorMessage("Error in method: MyCharacter.isDigit(ch)", ch);

		if (ch == ' ' || ch == '\t')
			if (Character.isWhitespace(ch) != MyCharacter.isWhitespace(ch))
				printErrorMessage("Error in method: MyCharacter.isWhitespace(ch)", ch);

		if (Character.toLowerCase(ch) != MyCharacter.toLowerCase(ch))
			printErrorMessage("Error in method: MyCharacter.toLowerCase(ch)", ch);

		if (Character.toUpperCase(ch) != MyCharacter.toUpperCase(ch))
			printErrorMessage("Error in method: MyCharacter.toUpperCase(ch)", ch);
	}

	// A method to test the MyString class
	public static void testMyString(String str) {
		if (!str.toLowerCase().equals(MyString.toLowerCase(str)))
			printErrorMessage("Error in method: MyString.toLowerCase(str)", str);

		if (!str.toUpperCase().equals(MyString.toUpperCase(str)))
			printErrorMessage("Error in method: MyString.toUpperCase(str)", str);

		if (!str.trim().equals(MyString.trim(str)))
			printErrorMessage("Error in method: MyString.trim(str)", str);

		for (int i = 0; i < 128; i++) { // Iterate over ASCII characters, outer loop
			char ch1 = (char)i;

			for (int j = 0; j < 128; j++) { // Iterate over ASCII characters, inner loop
				char ch2 = (char)j;

				if (!str.replace(ch1, ch2).equals(MyString.replace(str, ch1, ch2)))
					printErrorMessage("Error in method: MyString.replace(str, ch1, ch2)", str, ch1, ch2);
			}
		}
	}

	// A method to test the MyString class
	public static void testMyString(String s1, String s2) {
		if (s1.equals(s2) != MyString.equals(s1, s2))
			printErrorMessage("Error in method: MyString.equals(s1, s2)", s1, s2);

		if (s1.equalsIgnoreCase(s2) != MyString.equalsIgnoreCase(s1, s2))
			printErrorMessage("Error in method: MyString.equalsIgnoreCase(s1, s2)", s1, s2);
		
		if (s1.startsWith(s2) != MyString.startsWith(s1, s2))
			printErrorMessage("Error in method: MyString.startsWith(s1, s2)", s1, s2);
		
		if (s1.endsWith(s2) != MyString.endsWith(s1, s2)) {
			System.out.println(s1 + " " + s2);
			printErrorMessage("Error in method: MyString.endsWith(s1, s2)", s1, s2);
		}
	}
	
	// A method to print a message to the console
	public static void printErrorMessage(String message, char ch) {
		System.out.println(message);
		System.out.println("ch is: '" + ch + "'");
		System.exit(0); // This statement terminates the program
	}

	// A method to print a message to the console
	public static void printErrorMessage(String message, String str) {
		System.out.println(message);
		System.out.println("str is: \"" + str + "\"");
		System.exit(0); // This statement terminates the program
	}
	
	// A method to print a message to the console
	public static void printErrorMessage(String message, String str, char ch1, char ch2) {
		System.out.println(message);
		System.out.println("str is: \"" + str + "\"");
		System.out.println("ch1 is: '" + ch1 + "'");
		System.out.println("ch2 is: '" + ch2 + "'");
		System.exit(0); // This statement terminates the program
	}
	
	// A method to print a message to the console
	public static void printErrorMessage(String message, String s1, String s2) {
		System.out.println(message);
		System.out.println("s1 is: \"" + s1 + "\"");
		System.out.println("s2 is: \"" + s2 + "\"");
		System.exit(0); // This statement terminates the program
	}
}
