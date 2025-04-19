package Abstraction;

public class Driver {
public static void main(String[] args) {
	Calculator c = new CalculatorImplementation(); //Up-casting
	System.out.println("Addition: " + c.add(10, 200));
	System.out.println("Substraction: "+ c.sub(200, 100));
	//final int a = 10;
	
	
}
}
