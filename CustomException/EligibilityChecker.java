package CustomException;

import java.util.Scanner;

public class EligibilityChecker {
	public static void AgeChecker(int age) throws InvalidAge {
		if (age >= 21) {
			System.out.println("Go get Married");
		} else {
			throw new InvalidAge("Invalid Age");
		}
	}

	public static void main(String[] args) throws InvalidAge {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter age: ");
		int age = sc.nextInt();
		AgeChecker(age);
		sc.close();

	}
}
