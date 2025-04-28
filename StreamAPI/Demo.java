package StreamAPI;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

//        List<Integer> list2 = new ArrayList<>();
//
//        for (int num : list) {
//            if (num % 2 == 0) {
//                list2.add(num);
//            }
//        }
//
//        System.out.println("Even numbers: " + list2);
        //List<Integer> list2 = list.stream().filter(i -> i%2 == 0).toList(); //Checking for even number
        List<Integer> list2 = list.stream().map(i -> i * i).toList(); //Doubling each number
        System.out.println("Even numbers: " + list2);
    }
}
