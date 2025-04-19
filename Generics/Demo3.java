package Generics;

public class Demo3<T> {
	T value;
	public Demo3(T value) {
		this.value = value;
	}
	public static void main(String[] args) {
		Demo3<Integer> d1 = new Demo3<Integer>(10);
		Demo3<?> d2 = d1;
		Demo3<? extends Object> d3 = d1;
		Demo3<? extends Number> d4 = d1;
	}
}
