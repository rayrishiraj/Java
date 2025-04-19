package CustomException;

import java.util.Scanner;

public class ATM {
	public static String withdraw(double money, int pin, int inputPIN) {
		if (inputPIN != pin) {
			throw new InvalidPIN("Invalid PIN");
		}
		if (money < 0) {
			throw new InvalidMoney("Money less than 0");
		} else {
			return "Money is withdrawn";
		}
	}

	public static void main(String[] args) {
		int pin = 1234;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Money: ");
		double money = sc.nextDouble();
		System.out.print("Enter PIN: ");
		int inputPIN = sc.nextInt();
		System.out.println(withdraw(money, pin, inputPIN));
	}
}
