package Abstraction;

class Calci1 extends BasicCalci {
    @Override
    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public double square(double a) {
        return 0;
    }

    @Override
    public double cube(double b) {
        return 0;
    }
}
