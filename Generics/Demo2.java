package Generics;

public class Demo2<T> {
	T num1;
	T num2;
	public Demo2(T num1, T num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void add(T num1, T num2) {
		
	}
	public static void main(String[] args) {
		Demo2<Integer> d1 = new Demo2<Integer>(10, 20);
		System.out.println(d1.num1 + d1.num2);
	}
}
