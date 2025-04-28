package MethodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 54, 5, 6, 7, 9);
		// list.forEach(s -> System.out.println(s)); //Printing Using Lambda Expression
		//list.forEach(System.out::println); // Printing each element using a method
		// reference to the println method of the System.out object
		Collections.sort(list, Integer::compareTo); //Sorting using Method Reference using Integer Class
		list.forEach(System.out::println);
		Integer []arr = list.toArray(Integer[] ::new);
		System.out.println(arr.length);
	}
}
