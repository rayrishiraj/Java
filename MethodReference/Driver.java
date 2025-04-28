package MethodReference;

public class Driver {
    public static void main(String[] args) {
        //Operation o = (a, b) -> a + b;
        //Operation o = Calculator::add; //Method Reference - Static
        Operation o = new Calculator()::add; //Method Reference - Non Static
        int result = o.operate(5, 3);
        System.out.println(o);
        System.out.println("Result: " + result);
    }
}
