package Exception;

public class Demo {
	public static int div(int a, int b) throws ArithmeticException {
		return a / b;
	}

	public static int calculate(int a, int b) {
		return div(a, b);
	}

	public static void main(String[] args) {
		int res = calculate(10, 0);
	}
}
