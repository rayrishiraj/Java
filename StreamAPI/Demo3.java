package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "apricot");
        System.out.println("List: " + list);
        List<String> upperList = list.stream()
                                     .map(String::toUpperCase)
                                     .collect(Collectors.toList());

        System.out.println("Upper-case Conversion: " + upperList);
        System.out.println(list.stream().filter(s -> s.charAt(0) == 'a').findFirst());
        
    }
}
