package oops;

public class O4 { //Bank Account
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public O4 deposit(double money) {
		if(money > 0) {
			setBalance(getBalance() + money);
		}
		else {
			System.out.println("Invalid Money");
		}
		return this; // return the current address of the object
	}
	public O4 withdraw(double money) {
		if(money > 0 && money <= getBalance()) {
			setBalance(getBalance() - money);
		}
		else {
			System.out.println("Invalid Money");
		}
		return this; // return the current address of the object
	}

}
