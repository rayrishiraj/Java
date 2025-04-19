package LinkedHashSet;

import java.util.LinkedHashSet;

public class Demo2 {
	public static void main(String[] args) {
		LinkedHashSet<Object> LinkedhashSet = new LinkedHashSet<>();

		LinkedhashSet.add(10);
		LinkedhashSet.add(17.5);
		LinkedhashSet.add("Apple");

		System.out.println("LinkedHashSet: " + LinkedhashSet);
	}
}
