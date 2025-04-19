package Abstraction;

abstract class BasicCalci {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public abstract double power(double a, double b);
    public abstract double square(double a);
    public abstract double cube(double b);
}
