package oops;

public class O3 { //Calculator_Driver_Class
	public static void main(String[] args) {
		O1 o = new O1(5, 6);
		O1.add(o).mul(o); //Method Chaining
		System.out.println(o.getResult());
	}
}
