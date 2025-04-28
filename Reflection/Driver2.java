package Reflection;

import java.lang.reflect.Method;

public class Driver2 {
public static void main(String[] args) {
	Class<Person> c = Person.class;
	Method[] all_methods = c.getMethods();
	for (Method method : all_methods) {
		System.out.println(method);
	}
	Method[] same_class_methods = c.getDeclaredMethods();
	for (Method method : same_class_methods) {
		System.out.println(method);
	}
	
}
}
