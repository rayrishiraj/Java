package oops;

public class O5 {//ATM 
//	void display() {
//		System.out.println(this);
//	}
	public static void main(String[] args) {
		O4 o = new O4();
		System.out.println(o.deposit(100000).deposit(2000).withdraw(3000).getBalance());
//		O5 a1 = new O5();
//		System.out.println(a1);
//		a1.display();
 	}

}
