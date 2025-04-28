package MiniProject;

import java.util.Scanner;
import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		RideBookingSystem system = new RideBookingSystem();
		Scanner sc = new Scanner(System.in);

		system.loadDriversFromFile();

		boolean running = true;

		while (running) {
			System.out.println("\n--- Ride Booking System Menu ---");
			System.out.println("1. Register a Customer");
			System.out.println("2. Register a Driver");
			System.out.println("3. Book a Ride");
			System.out.println("4. Show All Drivers");
			System.out.println("5. Save Data and Exit");
			System.out.print("Enter your choice: ");

			int choice;
			try {
				choice = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a number.");
				continue;
			}

			switch (choice) {
			case 1:
				System.out.print("Enter Customer ID: ");
				String customerId = sc.nextLine();
				System.out.print("Enter Customer Name: ");
				String customerName = sc.nextLine();
				Customer customer = new Customer(customerId, customerName);
				system.registerCustomer(customer);
				System.out.println("Customer registered successfully.");
				break;

			case 2:
				System.out.print("Enter Driver ID: ");
				String driverId = sc.nextLine();
				System.out.print("Enter Driver Name: ");
				String driverName = sc.nextLine();
				Driver driver = new Driver(driverId, driverName);
				system.registerDriver(driver);
				System.out.println("Driver registered successfully.");
				break;

			case 3:
				System.out.print("Enter Customer ID to book a ride: ");
				String bookingCustomerId = sc.nextLine();
				Optional<Customer> bookingCustomer = system.getCustomers().stream()
						.filter(c -> c.id.equals(bookingCustomerId)).findFirst();
				if (bookingCustomer.isPresent()) {
					try {
						Ride ride = system.bookRide(bookingCustomer.get());
						System.out.println("Ride booked successfully!");
						System.out.println("----- Ride Details -----");
						System.out.println(ride.rideDetails());
					} catch (InvalidRideException e) {
						System.out.println("Error: " + e.getMessage());
					}
				} else {
					System.out.println("Customer ID not found.");
				} 
				break;

			case 4:
				system.showAllDrivers();
				break;
			case 5:
				system.saveDriversToFile();
				system.saveRides();
				System.out.println("Data saved successfully. Exiting...");
				running = false;
				break;

			default:
				System.out.println("Invalid choice. Please select a valid option.");
			}
		}

		sc.close();
	}
}
