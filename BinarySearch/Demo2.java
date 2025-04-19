package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(",\\s*");
        int index = parts[0].charAt(0) - '0';
        String[] output = new String[parts.length - 1];

        for (int i = 1; i < parts.length; i++) {
            String word = parts[i];
            if (word.length() > index) {
                output[i - 1] = word.substring(0, index) + word.substring(index + 1);
            } else {
                output[i - 1] = word;
            }
        }

        System.out.println(Arrays.toString(output));
    }
}
