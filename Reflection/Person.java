package Reflection;

public class Person {
	private String name;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person() {
		System.out.println("no arr cons");
	}
	public String getDetails() {
		return name + '\t' + age;
	}
	private void task(String task) {
		System.out.println("Do the task: " +  task);
	}
	private int age;
}
