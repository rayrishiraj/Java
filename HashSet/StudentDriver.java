package HashSet;

import java.util.HashSet;

public class StudentDriver {
	public static void main(String[] args) {
        HashSet<Student> studentSet = new HashSet<>();

        studentSet.add(new Student(101, "Bond ", 85.5));
        studentSet.add(new Student(102, "Ethan", 90.0));
        studentSet.add(new Student(103, "James", 78.0));
        studentSet.add(new Student(101, "Bond ", 85.5)); 

        System.out.println("---------------Students---------------");
        System.out.println();
        for (Student student : studentSet) {
            System.out.println(student);
        }

	}
}
