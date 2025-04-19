package Abstraction;

public class CalculatorImplementation extends Calculator {
	@Override
	int add(int a, int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
}
