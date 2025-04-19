package Exception;

public class Demo2 {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		System.out.println(s.capacity());
		s.append("HelloWorld");
		System.out.println(s.capacity());
		StringBuffer s1 = new StringBuffer();
		s.append("HelloWorld");
		System.out.println(s1.capacity());
		}
	}

