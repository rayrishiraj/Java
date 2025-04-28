package Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Laptop_Driver {
	public static void main(String[] args) {
		Laptop dell = new Laptop("Dell", 800);
		Laptop apple = new Laptop("Apple", 1500);
		Laptop lenovo = new Laptop("Lenovo", 700);
		Laptop hp = new Laptop("HP", 900);

		List<Laptop> laptops = Arrays.asList(dell, apple, lenovo, hp);

		TreeMap<Laptop, String> laptopOwners = new TreeMap<>(new LaptopBrandComparator());
		laptopOwners.put(dell, "Alice");
		laptopOwners.put(apple, "Bob");
		laptopOwners.put(lenovo, "Charlie");
		laptopOwners.put(hp, "Diana");

		laptops.sort((l1, l2) -> Integer.compare(l1.price, l2.price));

		System.out.println("Sorted Laptops by Price:");
		laptops.forEach(l -> System.out.println(l + " - Owner: " + laptopOwners.get(l)));

		System.out.println("\nTreeMap (Sorted by Brand):");
		laptopOwners.forEach((laptop, owner) -> System.out.println(laptop + " - Owner: " + owner));
	}
}
