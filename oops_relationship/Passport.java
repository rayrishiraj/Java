package oops_relationship;

public class Passport { //One to One
	private String passport_number;
	public String getPassport_number() {
		return passport_number;
	}
	public void setPassport_number(String passport_number) {
		this.passport_number = passport_number;
	}
	public Passport(String passport_number) {
		this.passport_number = passport_number;
	}
}
