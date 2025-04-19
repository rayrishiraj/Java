package Exception;

public class Demo3 {
	public static void printNumber() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			Thread.sleep(100); //to print in time 
		}
	}
	public static void call(){
		try {
			printNumber();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		call();
	}
}
