package TreeSet;

import java.util.TreeSet;

public class Demo_TreeSet {
	    public static void main(String[] args) {
	        TreeSet<Integer> treeSet = new TreeSet<>();

	        treeSet.add(10);
	        treeSet.add(30);
	        treeSet.add(20);
	        treeSet.add(40);

	        System.out.println("TreeSet: " + treeSet);

	        System.out.println("First element: " + treeSet.first());
	        System.out.println("Last element: " + treeSet.last());

	        treeSet.pollFirst();
	        treeSet.pollLast();
	        System.out.println("After removing first and last: " + treeSet);

	        System.out.println("Contains 30? " + treeSet.contains(30));

	        System.out.println("Subset from 10 to 30: " + treeSet.subSet(10, true, 30, true));

	        System.out.println("Size of TreeSet: " + treeSet.size());
	    }
	}
