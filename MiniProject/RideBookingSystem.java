package MiniProject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RideBookingSystem {

	private List<Customer> customers;
	private List<Driver> drivers;
	private List<Ride> rides;

	public RideBookingSystem() {
		customers = new ArrayList<>();
		drivers = new ArrayList<>();
		rides = new ArrayList<>();
	}

	public void registerCustomer(Customer customer) {
		customers.add(customer);
	}

	public void registerDriver(Driver driver) {
		drivers.add(driver);
	}

	public Ride bookRide(Customer customer) {
		Optional<Driver> availableDriver = drivers.stream().filter(Driver::isAvailable).findFirst();
		if (availableDriver.isPresent()) {
			Driver driver = availableDriver.get();
			driver.setAvailable(false);
			Ride ride = new Ride(customer, driver);
			rides.add(ride);
			return ride;
		} else {
			throw new InvalidRideException("No drivers available for booking.");
		}
	}

	public void saveRides() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("rides.txt"))) {
			for (Ride ride : rides) {
				writer.write(ride.rideDetails());
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadDriversFromFile() {
		try (BufferedReader reader = new BufferedReader(new FileReader("drivers.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length == 2) {
					String id = parts[0].trim();
					String name = parts[1].trim();
					registerDriver(new Driver(id, name));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void saveDriversToFile() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("drivers.txt"))) {
			for (Driver driver : drivers) {
				writer.write(driver.id + "," + driver.name);
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showAllDrivers() {
		for (Driver driver : drivers) {
			driver.showProfile();
		}
	}

	public void showAllCustomers() {
		for (Customer customer : customers) {
			customer.showProfile();
		}
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
}
