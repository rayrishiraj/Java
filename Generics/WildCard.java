package Generics;

import java.util.LinkedList;

public class WildCard {
	public static void printLinkedList(LinkedList<?> list) {
		for (Object i : list) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(10);
		printLinkedList(list1);
	}
}
