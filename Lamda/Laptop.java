package Lamda;

import java.util.*;

public class Laptop {

	String brand;
	int price;

	public Laptop(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [" + "Brand='" + brand + '\'' + ", Price=" + price + ']';
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Laptop laptop = (Laptop) obj;
		return price == laptop.price && Objects.equals(brand, laptop.brand);
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, price);
	}
}

class LaptopBrandComparator implements Comparator<Laptop> {
	public int compare(Laptop l1, Laptop l2) {
		return l1.brand.compareTo(l2.brand);
	}
}
