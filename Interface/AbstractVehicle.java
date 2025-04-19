package Interface;

public abstract class AbstractVehicle implements Vehicle {
	protected String name;
	protected int speed;

	public AbstractVehicle(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	public void displayDetails() {
		System.out.println("Current Speed: " + speed + " km/h");
	}

	@Override
	public void accelerate(int increment) {
		speed += increment;
		System.out.println(name + " accelerated by " + increment + " km/h.");
	}

	@Override
	public void brake(int decrement) {
		speed -= decrement;
		System.out.println(name + " decelerated by " + decrement + " km/h.");
	}

	@Override
	public int getCurrentSpeed() {
		return speed;
	}

	@Override
	public abstract void start();

	@Override
	public abstract void stop();

	@Override
	public abstract void displayType();
}
