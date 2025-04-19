package CustomException;

public class InvalidMoney extends RuntimeException {
	private static String message = "Wait";

	InvalidMoney(){
		super(message);
	}

	public InvalidMoney(String message) {
		super(message);
	}
}
