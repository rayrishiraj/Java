package Interface;

public interface Vehicle {
    void start();
    void stop();
    void accelerate(int increment);
    void brake(int decrement);
    int getCurrentSpeed();
    void displayType();
    void displayDetails();
}
