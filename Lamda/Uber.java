package Lamda;

interface Vehicle {
	void start();
}

public class Uber {
	public static void main(String[] args) {
		Vehicle car = new Vehicle() {
			@Override
			public void start(int a, String b) { //Inner Class
				System.out.println("Car is Starting");
			}
		};
		Vehicle bike = () -> { //Lambda Expression
				System.out.println("Bike is Starting");

		};
		Vehicle scooty = () ->  //Lambda Expression without parenthesis
			System.out.println("Bike is Starting");

	}
	
}
