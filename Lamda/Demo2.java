package Lamda;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        // Sort in ascending order (default)
        Collections.sort(names);

        // Sort in descending order using lambda
        Collections.sort(names, (s1, s2) -> s2.compareTo(s1));

        names.forEach(name -> System.out.println(name));
    }
}
