package Abstraction;

class Calci2 extends BasicCalci {
    @Override
    public double power(double a, double b) {
        return 0;
    }

    @Override
    public double square(double a) {
        return a * a;
    }

    @Override
    public double cube(double b) {
        return b * b * b;
    }
}
