package TreeSet;

import java.util.TreeSet;

public class Demo2 {
	public static void main(String[] args) {
		TreeSet<Object> treeSet = new TreeSet<>();

		treeSet.add(10);
		treeSet.add(20.36);
		treeSet.add("Apple");

		System.out.println("TreeSet: " + treeSet);
	}

}
