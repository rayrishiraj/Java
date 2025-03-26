package oops_relationship;

public class Person_Driver { //One to One
	public static void main(String[] args) {
		Passport passport = new Passport("123456");
		Person person = new Person("rishiraj", passport);

		System.out.println(person.getName());
		System.out.println(person.getPassport().getPassport_number());
		person.display();
	}
}
