package CaseStudy;

import java.util.*;

public class FoodDeliveryAppDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> pizzaHutMenu = new HashMap<>();
		pizzaHutMenu.put("Pizza", 5);
		pizzaHutMenu.put("Pasta", 5);
		pizzaHutMenu.put("Noodles", 5);
		pizzaHutMenu.put("Burito", 5);
		pizzaHutMenu.put("Burger", 5);
		pizzaHutMenu.put("Garlic Bread", 3);
		pizzaHutMenu.put("Pepsi", 3);
		pizzaHutMenu.put("Coke", 3);

		Restaurant pizzaHut = new Restaurant("PizzaHut", new ArrayList<>(pizzaHutMenu.keySet()));
		OrderService orderService = new OrderService();

		System.out.println("Welcome to PizzaHut");
		int choice;

		do {
			System.out.println("\nCHOOSE");
			System.out.println("1. Place an order");
			System.out.println("2. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine(); // Consume newline

			if (choice == 2) {
				System.out.println("Thank you for using Food Delivery App. Goodbye!");
				break;
			}

			System.out.print("Enter your name: ");
			String name = sc.next();
			System.out.print("Enter your password: ");
			int password = sc.nextInt();
			Customer customer = new Customer(name, password);
			customer.login(password);

			switch (choice) {
			case 1:
				if (!customer.isLoggedIn()) {
					System.out.println("You must be logged in to order.");
					break;
				}

				System.out.println("\n------ MENU ------");
				for (Map.Entry<String, Integer> entry : pizzaHutMenu.entrySet()) {
					System.out.println(entry.getKey() + " - $" + entry.getValue());
				}

				sc.nextLine(); // Consume newline
				System.out.print("Enter items to order (comma separated): ");
				String input = sc.nextLine();
				List<String> orderItems = Arrays.asList(input.split("\\s*,\\s*"));

				try {
					orderService.placeOrder(customer, pizzaHut, orderItems);
					int total = 0;
					for (String item : orderItems) {
						if (pizzaHutMenu.containsKey(item)) {
							total += pizzaHutMenu.get(item);
						}
					}

					System.out.println("Total: $" + total);
					System.out.print("Pay by Cash/Card: ");
					String paymentMethod = sc.next();
					int adminPassword = 5678;
					int checkAdminPassword = 0;
					int paymentPass = 0;
					if (paymentMethod.equalsIgnoreCase("cash")) {
						System.out.print("Enter Admin Password to confirm the received payment: ");
						checkAdminPassword = sc.nextInt();
					}
					if (paymentMethod.equalsIgnoreCase("card")) {
						System.out.print("Enter Password to confirm payment: ");
						paymentPass = sc.nextInt();
					}
					if (paymentPass == password || checkAdminPassword == adminPassword) {
						System.out.println("Paid!!");
						System.out.println("\nHappy Dining!! " + customer.getName() + ".");
					} else {
						System.out.println("Payment failed. Incorrect password.");
					}

				} catch (OrderLimitExceedException | MenuItemNotFoundException e) {
					System.out.println("Order failed: " + e.getMessage());
				}
				break;

			default:
				System.out.println("Invalid choice. Try again.");
			}

			System.out.print("\nDo you want to order again? (yes/no): ");
			String again = sc.next().toLowerCase();
			if (!again.equals("yes")) {
				System.out.println("\nThank you for using Food Delivery App. Goodbye!");
				break;
			}

		} while (true);

		sc.close();
	}
}
