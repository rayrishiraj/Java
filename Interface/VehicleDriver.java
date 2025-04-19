package Interface;

public class VehicleDriver {
	public static void main(String[] args) {

		Vehicle car = new Car("Ford Mustang", 100);
		Vehicle bike = new Bike("Harley Davidson", 80);
		Vehicle truck = new Truck("Volvo Truck", 60);

		car.displayType(); 
		car.start();
		car.accelerate(20);
		car.displayDetails();
		car.stop();

		System.out.println();
		bike.displayType();
		bike.start();
		bike.accelerate(15);
		bike.displayDetails();
		bike.stop();

		System.out.println();
		truck.displayType();
		truck.start();
		truck.accelerate(25);
		truck.displayDetails();
		truck.stop();
	}
}
