package Hashmap;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		//LinkedList l1 = new LinkedList(); //Heterogeneous Data Input in form of Object
		LinkedList <Integer> l1 = new LinkedList(); //Homogeneous Data Input
		//LinkedList <Node> l2 = new LinkedList(); //Only Node Objects
		l1.add(10);
		l1.add(20);
		//l1.add("abc");
		System.out.println(l1);
		
		System.out.println(l1.size());
		
		l1.remove(1);
		
		System.out.println(l1);
		
		for(int i = 0; i < l1.size(); i++) {
			int temp = l1.get(i);
			System.out.println(temp);
		}
		for(int x : l1)
			System.out.println(x);
		
	}

}
