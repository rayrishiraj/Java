package CustomException;

public class InvalidAge extends Exception {
	private static String message = "Wait";
	InvalidAge(){
		super(message);
	}
	public InvalidAge(String message) {
		super(message);
	}

}
