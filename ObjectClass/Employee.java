package ObjectClass;

import java.util.Objects;

public class Employee {
	String name;
	double salary;
	int age;

	public Employee(String name, double salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name + " " + this.salary + " " + this.age;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.name.equals(e.name) && this.salary == e.salary && this.age == e.age;
		// we used down-casting and the name is string so we wrote it like this and here
		// we are checking the components of the objects then this becomes the first
		// object and obj becomes the second object

	}
	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.salary, this.age);
	}

}
