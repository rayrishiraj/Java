package WrapperClass;


public class Demo1 {
	public static void main(String[] args) {
		int i1 = 150;
		Integer i2 = new Integer(i1); // Boxing - Deprecated way
		System.out.println(i1 + " " + i2);
		Integer i3 = Integer.valueOf(i1); // Boxing
		System.out.println(i3);
		Integer i4 = i1; // Auto-Boxing
		System.out.println(i4);
		
		int i5 = i2.intValue(); // Un-boxing
		System.out.println(i5);
		int i6 = 10; //  Auto-Unboxing
		System.out.println(i6);
		byte b1 = i3.byteValue(); // Convert Integer to byte
		System.out.println(b1);
		
		
	}
}
