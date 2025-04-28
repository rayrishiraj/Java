package Reflection;

import java.lang.reflect.Constructor;

public class Driver {
public static void main(String[] args) throws NoSuchMethodException, SecurityException {
	Class<Person> c = Person.class;
	
	//get specified constructor
	Constructor<Person>con1 = c.getDeclaredConstructor();
	System.out.println(con1);
	
	Constructor<?> con2 = c.getDeclaredConstructor(String.class, int.class);
	System.out.println(con2);
	
	//get all constructor
	Constructor<?>[] con3 = c.getDeclaredConstructors();
	for (Constructor<?> constructor : con3) {
		System.out.println(constructor);
	}
	
}
}
