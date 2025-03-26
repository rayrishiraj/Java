package Inheritance;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	void displayPersonDetails() {
		System.out.print("Name: " + getName() + ", Age: " + getAge());
	}
}
