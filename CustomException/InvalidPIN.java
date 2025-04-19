package CustomException;

public class InvalidPIN extends ArithmeticException{
	private static String message = "Wait";

	InvalidPIN(){
		super(message);
	}

	public InvalidPIN(String message) {
		super(message);
	}
}
