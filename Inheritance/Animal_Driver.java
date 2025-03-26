package Inheritance;

public class Animal_Driver {
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.a);
		System.out.println(dog.b);
		
		Animal animal = new Animal();
		animal.methodOfparent();
		dog.methodOfparent();
		
		dog.methodOfchild();
		System.out.println(Animal.x);
		System.out.println(Dog.x);
		
		//System.out.println(Animal.y); //Will not work
		System.out.println(Dog.y);
		
		Animal.methodOfparent2();
		Dog.methodOfparent2();
		Dog.methodOfchild2();
		
	}
}
