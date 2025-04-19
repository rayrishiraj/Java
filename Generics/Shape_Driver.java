package Generics;

public class Shape_Driver {
	public static void main(String[] args) {
		Shape <Number, String> s1 = new Shape<>(1.023, "Rishi");
		System.out.println(s1.getKey() + " " + s1.getValue());
	}
}
