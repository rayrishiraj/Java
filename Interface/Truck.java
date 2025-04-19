package Interface;

public class Truck extends AbstractVehicle {

	public Truck(String name, int speed) {
		super(name, speed);
	}

	@Override
	public void start() {
		System.out.println("The truck has started.");
	}

	@Override
	public void stop() {
		System.out.println("The truck has stopped.");
	}

	@Override
	public void displayType() {
		System.out.println("Vehicle Name: " + name);
		System.out.println(name + " is a Truck.");
	}
}