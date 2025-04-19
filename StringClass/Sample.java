package StringClass;

public class Sample {
	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s);
		System.out.println(s.hashCode());
		s = "Hello! Rishiraj";
		System.out.println(s);
		System.out.println(s.hashCode());
		String s1 = "Hello! Rishiraj";
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(s1.equals(s)); // state/component
		System.out.println(s1 == s); // address
		String s3 = new String();
		s3 = "Rishiraj";
		System.out.println(s3.concat(s));
	}
}
