package objectLoadingProcess;

public class Driver {
	public static void main(String[] args) {
//		Child c = new Child(10, "rishi");
//		System.out.println(c.grade);
//		System.out.println(c.name);
		Child c = new Child();
		System.out.println(c.name);
		c.display();
	}
}
