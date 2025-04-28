package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Demo2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 6);
		
		System.out.println("Integer List: " + list);
		System.out.println("Stream Object Reference: " + list.stream().skip(2)); // Intermediate Operation - Return The
																					// Stream Object Reference
		System.out.println("Skiping: " + list.stream().skip(2).toList()); // Terminal Operation - Converting it to List
																			// Object
		System.out.println("Limiting the list: " + list.stream().limit(3).toList());
		System.out.println("Limit and Skip: " + list.stream().limit(3).skip(1).toList());
		System.out.println("Sorting: " + list.stream().sorted().toList());// Sorting
		System.out.println("Reverse Soring: " + list.stream().sorted(Comparator.reverseOrder()).toList()); // Reverse
																											// Sorting
		System.out.println("Remove Duplicates: " + list.stream().distinct().toList()); // Remove Duplicates
		//Filter - When we want to meet a condition for the entire element of the list
		System.out.println("Filtering: " + list.stream().filter(i -> i > 3).toList());// Filter the collection
		//Map - When we want to perform operation on each elements of the list we go with map
		System.out.println("Doubling each element: " + list.stream().map(i -> i * i).toList()); //Using map because we want to perform operation on each elements
		int result = list.stream().min(Integer :: compare).get();
		System.out.println("Minimum Number: " +  result);
		result =list.stream().max(Integer :: compareTo).get();
		System.out.println("Maximum Number: " +  result);
		System.out.println("Find first: " + list.stream().findFirst().get());
		
		System.out.println();
		List<String> list2 = Arrays.asList("BMW", "MERCEDES", "FORD", "TESLA", "MASERATTI", "CHEVY");
		
		System.out.println("String List: " + list2);
		System.out.println("Starting with M: " + list2.stream().filter(s -> s.charAt(0) == 'M').toList());
		System.out.println("No. of Characters: " + list2.stream().filter(s -> s.length() > 3).toList());
		System.out.println(list2.stream().collect(Collectors.groupingBy(String::length)));
		//Counting the first character and how many words start with it
		System.out.println(list2.stream().collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting())));
		System.out.println();
		
	}
}
