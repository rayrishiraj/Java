package StringClass;

public class Methods {
public static void main(String[] args) {
	String s  ="Engineer";
	System.out.println(s.charAt(0)); //to find the element in that index
	System.out.println(s.length()); //to find the length of the String
	System.out.println(s.toUpperCase()); //convert the String to uppercase
	System.out.println(s.toLowerCase()); //convert the String to lowercase
	System.out.println(s.contains("g")); //check the element present or not but always pass a string
	System.out.println(s.endsWith("e")); //checks if it ends with it
	System.out.println(s.equalsIgnoreCase("Engineer")); //checks with opting casing
	System.out.println(s.indexOf('e')); //checks for the element with index
	System.out.println(s.indexOf("e", 6)); //checks for the value but within a range
	System.out.println(s.lastIndexOf('e')); //checking from last
	char [] c = s.toCharArray(); //converts the string to char array
	for(char d: c) {
		System.out.println(d + " ");
	}
	System.out.println(s.substring(2, 5)); //creates a substring form within a range
	s = "Hi - I - Deep";
	String array[] = s.split("-");
	for(String string : array) {
		System.out.println(string);
	}
}
}
