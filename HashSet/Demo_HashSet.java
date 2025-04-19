package HashSet;

import java.util.HashSet;

public class Demo_HashSet {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Cherry");
		hashSet.add("Date");

		System.out.println("HashSet: " + hashSet);

		System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));
		System.out.println("Contains 'Grape': " + hashSet.contains("Grape"));

		hashSet.remove("Date");
		System.out.println("After removal of 'Date': " + hashSet);

		System.out.println("Size of HashSet: " + hashSet.size());

		hashSet.clear();
		System.out.println("HashSet after clear: " + hashSet);
	}
}
