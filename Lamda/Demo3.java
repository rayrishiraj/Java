package Lamda;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Demo3 {
    public static void main(String[] args) {
        // Creating a list of Double values
        List<Double> numbers = Arrays.asList(10.5, 3.14, 7.7, 2.2, 5.0);

        // Sorting in reverse order
        Collections.sort(numbers, (n1, n2) -> n2.compareTo(n1));

        // Print the sorted numbers
        numbers.forEach(num -> System.out.println(num));
    }
}
