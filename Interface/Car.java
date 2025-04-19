package Interface;

public class Car extends AbstractVehicle {

	public Car(String name, int speed) {
		super(name, speed);
	}

	@Override
	public void start() {
		System.out.println("The car has started.");
	}

	@Override
	public void stop() {
		System.out.println("The car has stopped.");
	}

	@Override
	public void displayType() {
		System.out.println("Vehicle Name: " + name);
		System.out.println(name + " is a Car.");
	}
}
