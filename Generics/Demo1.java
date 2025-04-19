package Generics;

public class Demo1 {
	public static void printBox(Shape<?, ?> Shape) { //wildCard if you don't know the datatype
		Object key = Shape.getKey();
		Object value = Shape.getValue();
		System.out.println(key);
		System.out.println(value);
	}

	public static void main(String[] args) {
		Shape<?, ?> b1 = new Shape<>(10, 23);
		printBox(b1);
	}
}
