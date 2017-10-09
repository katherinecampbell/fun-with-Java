package assignment1;
import assignment1.MyCharacter;
public class MyString {
	//test to ensure this is the right file
	// Returns a new string with the characters in str converted to lowercase.
	public static String toLowerCase(String str) {
		String NewStr = "";
		for (int i=0; i<str.length(); i++){
				 char NewLetter = MyCharacter.toLowerCase(str.charAt(i));
				 NewStr += NewLetter;}
		
		return NewStr;
	}

	// Returns a new string with the characters in str converted to uppercase.
	public static String toUpperCase(String str) {
		String NewStr = "";
		for (int i=0; i<str.length(); i++){
				 char NewLetter = MyCharacter.toUpperCase(str.charAt(i));
				 NewStr += NewLetter;}
		
		return NewStr;
	}

	// Returns true if the two strings s1 and s2 are equal; false otherwise. 
	// Two strings are considered equal if they are of the same length and 
	// corresponding characters in the two strings are equal.
	public static boolean equals(String s1, String s2) {
		if (s1.length() != s2.length()){
			return false;
		}
		else {
			int counter = 0;
			for (int i=0; i < s1.length(); i++){
				if (s2.charAt(i)!=s1.charAt(i)){
						counter++;}
				else{};}
				
			if (counter > 0){return false;}
			else{return true;}
			}
		}
			
	// Returns true if the two strings s1 and s2 are equal ignoring case; false 
	// otherwise. Two strings are considered equal if they are of the same length 
	// and corresponding characters in the two strings are equal ignoring case.
	public static boolean equalsIgnoreCase(String s1, String s2) {
		if (s1.length() != s2.length()){
			return false;
		}
		else{
			String NewString1="";
			for (int i=0; i < s1.length(); i++){
				char ch = s1.charAt(i);
				if(MyCharacter.isUpperCase(ch)){
					char ch2 = MyCharacter.toLowerCase(ch);	
					NewString1+=ch2;
				}
				else{NewString1+=ch;}
			}
	
			String NewString2 = "";
			for (int i=0; i < s2.length();i++){
				char ch = s2.charAt(i);
				if(MyCharacter.isUpperCase(ch)){
					char ch2 = MyCharacter.toLowerCase(ch);	
					NewString2 +=ch2;
					}
				else{NewString2+=ch;}}
			if (MyString.equals(NewString1, NewString2)==true){
				return true;}
			else{return false;}
		}
	}
	
			
	// Returns a new string with every occurrence of character ch1 in str replaced 
	// with character ch2.	
	public static String replace(String str, char ch1, char ch2) {
		String NewString = "";
		for (int i=0; i < str.length(); i++){
			char letter = str.charAt(i);
			if (letter == ch1){
				letter =ch2;
				NewString+=letter;
			}
			else{
				NewString+=letter;
			}
		}
		return NewString;
	}

	// Returns a new string with all leading and trailing whitespace characters (space 
	// or tab characters) in str removed.
	public static String trim(String str) {
		String NewString = "";
		int countfront = 0;
		int countback = 0;
		
		for (int i=0; i < str.length(); i++){
			char letter = str.charAt(i);
			if (MyCharacter.isWhitespace(letter) == true){
				countfront +=1;
			}
			else{
				break;
			}
		}
		for (int i=str.length()-1;i>=0; i--){
		char letter = str.charAt(i);
		if (MyCharacter.isWhitespace(letter) == true){
			countback +=1;
		}
		else{break;}
		}
		for (int i=countfront; i < str.length()- countback; i++){
			char letter = str.charAt(i);
			NewString +=letter;}
return NewString;
}
			
	
	
	// Returns true if str starts with the specified prefix; false otherwise.
	public static boolean startsWith(String str, String prefix) {
		if(str.length()==0 && prefix.length()==0){
			return true;}
			
		else if (prefix.length()==0){
			return true;
		}
		else if (str.length()==0){
			return false;
		}
		
		else if (str.length()<prefix.length()){
			return false;}
			
		for (int i=0; i < prefix.length(); i++){
			char stringletter = (str.charAt(i));
			char prefixletter = (prefix.charAt(i));
			if (stringletter != prefixletter){
				return false;
			}
			}
			return true;}

	// Returns true if str ends with the specified suffix; false otherwise.
	public static boolean endsWith(String str, String suffix) {
		if(str.length()==0 && suffix.length()==0){
			return true;}
		else if (suffix.length()==0){
			return true;}
		else if (str.length()==0){
			return false;}
		else if (str.length()<suffix.length()){
			return false;}
		else{
			for (int i=0; i < suffix.length(); i++){
				char stringletter = str.charAt((str.length()-suffix.length())+i);
				char suffixletter = (suffix.charAt(i));
				if(suffixletter != stringletter){
					return false;}
			else{}}
			return true;
		}
	}}
			