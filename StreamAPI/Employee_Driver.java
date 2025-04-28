package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee_Driver {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
		empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
		// empList.forEach(System.out::println);
		// Group By City
		// Map<String, List<Employee>> map =
		// empList.stream().collect(Collectors.groupingBy(Employee::getCity));
		// System.out.println(map);
		// Group By Age
//		Map<Integer, List<Employee>> map = empList.stream().collect(Collectors.groupingBy(Employee::getAge));
//		for(int age: map.keySet()) {
//			System.out.println(age + "\n" + map.get(age));
//		}
		// Print the names of all the departments
		System.out.println("Departments: " + empList.stream().map(d -> d.getDeptName()).distinct().toList());
		// Employee whose age is greater than 28
		System.out.println(
				"Employees whose age is greater than 28: " + empList.stream().filter(a -> a.getAge() > 28).toList());
		// Maximum Age
		int maxAge = empList.stream().map(Employee::getAge).max(Integer::compareTo).get();
		System.out.println("Maximum Age: " + maxAge);
		// Minimum Age Female Employee
		int minAgeFemale = empList.stream().filter(e -> e.getGender().equals("F")).map(Employee::getAge)
				.min(Integer::compareTo).get();
		//Minimum age of a Female Employee
		System.out.println("Minimum age of female employees: " + minAgeFemale);
		//Employees whose age is greater than 20 and less than 25
		System.out.println("Employees whose age is greater than 20 and less than 25: "
				+ empList.stream().filter(a -> a.getAge() < 25 && a.getAge() > 20).toList());
		//Total Employees
		System.out.println("Total Employees: " + empList.stream().count());
		//Employees in a certain Department
		System.out.println(
				"Employees in HR Department: " + empList.stream().filter(a -> a.getDeptName() == "HR").toList());
		//Employee with Maximum Salary
		long maxSalary = empList.stream().map(Employee::getSalary).max(Long::compareTo).get();
		System.out.println("Maximum Salary: " + maxSalary);
		//Sorting by age
		System.out.println(
				"Sorting by Age: " + empList.stream().sorted(Comparator.comparingInt(Employee::getAge)).toList());
		//Employee Names
		System.out.println("Employee Names: " + empList.stream().map(Employee::getName).toList());
		//Employees living in Bangalore
		System.out.println("Employee Names living in Bangalore: "
				+ empList.stream().filter(e -> e.getCity() == "Blore").map(Employee::getName).sorted().toList());
		//Employees with most experience
		int maxExperience = empList.stream().map(Employee::getYearOfJoining).min(Integer::compareTo).get();
		System.out.println("Employee with most experience:"
				+ empList.stream().filter(e -> e.getYearOfJoining() == maxExperience).map(Employee::getName).toList());

	}
}
