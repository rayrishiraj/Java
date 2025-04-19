package StringBuffer;

public class Sample {
public static void main(String[] args) {
	StringBuffer s = new StringBuffer("Hi");
	System.out.println(s.capacity());
	s.append("-Rishiraj");
	System.out.println(s);
	System.out.println(s.capacity());
}
}
