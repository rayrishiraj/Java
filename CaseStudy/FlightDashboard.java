package CaseStudy;

import java.util.List;
import java.util.Scanner;

public class FlightDashboard {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FlightScheduleManager manager = new FlightScheduleManager();

		// Add 20 flights
		manager.addFlight(new DomesticFlight("D001", "06:00", "08:00", 20, "New York", "Boston", "NY"));
		manager.addFlight(new DomesticFlight("D002", "07:00", "09:00", 15, "Chicago", "Dallas", "TX"));
		manager.addFlight(new DomesticFlight("D003", "09:00", "11:00", 25, "Atlanta", "Miami", "FL"));
		manager.addFlight(new DomesticFlight("D004", "10:00", "12:00", 10, "Seattle", "Portland", "WA"));
		manager.addFlight(new DomesticFlight("D005", "11:00", "13:00", 12, "Denver", "Phoenix", "AZ"));
		manager.addFlight(new DomesticFlight("D006", "13:00", "15:00", 30, "San Diego", "San Jose", "CA"));
		manager.addFlight(new DomesticFlight("D007", "14:00", "16:00", 18, "Houston", "Austin", "TX"));
		manager.addFlight(new DomesticFlight("D008", "15:00", "17:00", 22, "Las Vegas", "Salt Lake City", "UT"));
		manager.addFlight(new DomesticFlight("D009", "16:00", "18:00", 14, "Detroit", "Columbus", "OH"));
		manager.addFlight(new DomesticFlight("D010", "17:00", "19:00", 5, "Minneapolis", "St. Louis", "MO"));

		manager.addFlight(new InternationalFlight("I001", "06:00", "14:00", 50, "New York", "London", "UK"));
		manager.addFlight(new InternationalFlight("I002", "08:00", "16:00", 60, "Los Angeles", "Tokyo", "JP"));
		manager.addFlight(new InternationalFlight("I003", "09:00", "17:00", 70, "Chicago", "Toronto", "CA"));
		manager.addFlight(new InternationalFlight("I004", "10:00", "18:00", 55, "Miami", "Paris", "FR"));
		manager.addFlight(new InternationalFlight("I005", "11:00", "19:00", 80, "Seattle", "Dubai", "AE"));
		manager.addFlight(new InternationalFlight("I006", "12:00", "20:00", 65, "San Francisco", "Berlin", "DE"));
		manager.addFlight(new InternationalFlight("I007", "13:00", "21:00", 75, "Dallas", "Madrid", "ES"));
		manager.addFlight(new InternationalFlight("I008", "14:00", "22:00", 90, "Boston", "Rome", "IT"));
		manager.addFlight(new InternationalFlight("I009", "15:00", "23:00", 68, "Denver", "Amsterdam", "NL"));
		manager.addFlight(new InternationalFlight("I010", "16:00", "00:00", 100, "Houston", "Sydney", "AU"));

		// Welcome message
		System.out.println("============================================");
		System.out.println("  Welcome to Poseidon's Airline Reservation");
		System.out.println("============================================");

		boolean continueBooking = true;

		while (continueBooking) {
			System.out.print("Is it a Domestic or International flight? (D/I): ");
			String flightType = scanner.nextLine().trim().toUpperCase();

			System.out.print("\nEnter Origin: ");
			String origin = scanner.nextLine();

			System.out.print("Enter Destination: ");
			String destination = scanner.nextLine();

			System.out.print("Enter Departure Time (e.g., 08:00): ");
			String departure = scanner.nextLine();

			List<Flight> availableFlights = manager.getFilteredFlights(flightType, departure, origin, destination);

			if (availableFlights == null || availableFlights.isEmpty()) {
				System.out.println("No flights available for the selected criteria.");
			} else {
				System.out.println("\nAvailable Flights:");
				for (int i = 0; i < availableFlights.size(); i++) {
					System.out.println((i + 1) + ". " + availableFlights.get(i).getFlightInfo());
				}

				System.out.print("\nSelect flight number to book: ");
				int flightChoice = Integer.parseInt(scanner.nextLine());

				if (flightChoice < 1 || flightChoice > availableFlights.size()) {
					System.out.println("Invalid selection.");
					continue;
				}

				Flight selectedFlight = availableFlights.get(flightChoice - 1);

				while (true) {
					System.out.print("Enter number of seats to book: ");
					int seats = Integer.parseInt(scanner.nextLine());

					if (selectedFlight.bookSeats(seats)) {
						System.out.println("Congratulations! Your booking is confirmed.");
						System.out.println("Flight Info: " + selectedFlight.getFlightInfo());
						break;
					} else {
						System.out.println("Not enough seats available. Try again or type 'exit' to cancel.");
						System.out.print("Do you want to re-enter seat count? (yes/exit): ");
						String response = scanner.nextLine();
						if (response.equalsIgnoreCase("exit")) {
							break;
						}
					}
				}
			}

			System.out.print("\nDo you want to book another flight? (yes/no): ");
			String again = scanner.nextLine();
			continueBooking = again.equalsIgnoreCase("yes");
		}

		System.out.println("\nThank you for choosing Poseidon's Airline!");
		scanner.close();
	}
}
