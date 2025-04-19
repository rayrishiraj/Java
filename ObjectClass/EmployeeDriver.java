package ObjectClass;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e = new Employee("Rishiraj", 2500000, 23);
		System.out.println(e);
		// System.out.println(e.name);
		Employee e2 = new Employee("Rishiraj", 2500000, 23);
		System.out.println(e2);
		System.out.println(e == e2); // address is false
		System.out.println(e.equals(e2)); // state is true because we override the equals
//Usually the equals the address is compared but only when we override it we compare the state or component in the objects
		System.out.println(e.hashCode() == e2.hashCode()); //checking the state 
	}
	
}
