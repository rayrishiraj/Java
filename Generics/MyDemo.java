package Generics;

import java.util.ArrayList;

public class MyDemo {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.set(1, 101);
		System.out.println(a);
	}
}
