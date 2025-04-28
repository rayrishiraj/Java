package Lamda;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Collections.sort(list, (n1, n2) -> n2 - n1);

        list.forEach(t -> System.out.println(t));
    }
}
