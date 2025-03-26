package oops_relationship; //One to One

public class Person {//People_Class
	private String name;
	private Passport passport;
	
	Person(String name, Passport passport){
		this.name = name;
		this.passport = passport;
	}	
	public String getName() {
		return this.name;
	}
	public Passport getPassport() {
		return this.passport;
	}
	public void display() {
		System.out.println(getName() + " has  passport with: " + passport.getPassport_number());
	}
}
