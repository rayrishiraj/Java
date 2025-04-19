package LinkedHashSet;

import java.util.LinkedHashSet;

public class Demo_LinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

		linkedHashSet.add("Red");
		linkedHashSet.add("Blue");
		linkedHashSet.add("Green");
		linkedHashSet.add("Yellow");

		System.out.println("LinkedHashSet: " + linkedHashSet);

		System.out.print("Iterating through LinkedHashSet: ");
		for (String color : linkedHashSet) {
			System.out.print(color + " ");
		}
		System.out.println();

		System.out.println("Contains 'Blue': " + linkedHashSet.contains("Blue"));

		linkedHashSet.remove("Yellow");
		System.out.println("After removal of 'Yellow': " + linkedHashSet);

		System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

		System.out.println("Is LinkedHashSet empty? " + linkedHashSet.isEmpty());
	}
}
