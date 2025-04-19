package Interface;

public class Bike extends AbstractVehicle {

	public Bike(String name, int speed) {
		super(name, speed);
	}

	@Override
	public void start() {
		System.out.println("The bike has started.");
	}

	@Override
	public void stop() {
		System.out.println("The bike has stopped.");
	}

	@Override
	public void displayType() {
		System.out.println("Vehicle Name: " + name);
		System.out.println(name + " is a Bike.");
	}
}
