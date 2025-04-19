package Generics;

public class GenericMethod {
	public static <T extends Number> void printArray(T arr[]) {
		for (T i : arr) {
			System.out.print(i + "\t");
		}
	}

	public static void main(String[] args) {
		Number[] arr = { 1, 2.0, 3.6, -4, 5 };
		printArray(arr);
	}
}
