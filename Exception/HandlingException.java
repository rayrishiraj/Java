package Exception;

public class HandlingException {
public static void main(String[] args) {
	System.out.println("Hi");
	try {
		System.out.println(10/0);
	}catch(Exception e) {
		//System.out.println("Catch Block");
		e.printStackTrace(); //entire details of the error
		System.out.println(e.getMessage()); //error what actually is
	}
	System.out.println("Bye");
}
}
