package Comparable;

import java.util.Arrays;

public class StudentDriver {
    public static void main(String[] args) {
        Student[] students = {
            new Student(1, "A", 31.12),
            new Student(4, "B", 32.12),
            new Student(3, "C", 33.12),
        };
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
