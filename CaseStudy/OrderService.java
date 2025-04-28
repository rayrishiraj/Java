package CaseStudy;

import java.util.List;

public class OrderService {
	public void placeOrder(Customer customer, Restaurant restaurant, List<String> items)
			throws OrderLimitExceedException, MenuItemNotFoundException {

		if (!customer.isLoggedIn()) {
			System.out.println("Only logged in customers can place an order.");
			return;
		}

		if (items.size() > 5) {
			throw new OrderLimitExceedException("Cannot order more than 4 items.");
		}

		for (String item : items) {
			if (!restaurant.isItemAvailable(item)) {
				throw new MenuItemNotFoundException("Item " + item + " not found in menu.");
			}
		}

		System.out.println("\nOrder placed successfully by " + customer.getName() + " at " + restaurant.getName());
		System.out.println("Items ordered: " + items);
		System.out.println("\nHappy Dinning!! " + customer.getName() + ".");
	}
}
