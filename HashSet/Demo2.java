package HashSet;

import java.util.HashSet;

public class Demo2 {
	public static void main(String[] args) {
		HashSet<Object> hashSet = new HashSet<>();

		hashSet.add(10);
		hashSet.add(17.5);
		hashSet.add("Apple");
		//hashSet.add(null);

		System.out.println("HashSet: " + hashSet);
	}
}
