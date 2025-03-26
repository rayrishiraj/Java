package oops_relationship;

import java.util.Scanner;

public class Student_Driver_Class {
	private static void create_student_name(String name, String email) {
		School_Student s = new School_Student(name, email);
	}
	private static void subject_name(String subject_name) {
		Subject s = new Subject(subject_name);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of students: ");
	int count = sc.nextInt();
	for(int i = 0; i < count; i++) {
		System.out.print("Enter student's name: ");
		String name = sc.next();
		System.out.println();
		System.out.print("Enter student's email: ");
		String email = sc.next();
		System.out.println();
		create_student_name(name,email);
	}
	System.out.print("Enter the number of subjects: ");
	int numOfSubjects = sc.nextInt();
	for(int i = 0; i < numOfSubjects; i++) {
		System.out.print("Enter subject name: ");
		String subject_name = sc.next();
	}
	
	
}
}
