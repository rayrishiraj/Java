package Abstraction;

public class CalciDriver {
    public static void main(String[] args) {
        BasicCalci calci1 = new Calci1();
        BasicCalci calci2 = new Calci2();
        
        System.out.println("Addition: " + calci1.add(5, 3)); 
        System.out.println("Subtraction: " + calci1.sub(10, 3)); 
        System.out.println("Power: " + calci1.power(2, 3)); 
        System.out.println("Square: " + calci2.square(5)); 
        System.out.println("Cube: " + calci2.cube(4)); 
    }
}
