package objectLoadingProcess;

public class Child extends Parent {
//	int grade;
//	Child(int grade, String name){
//		super(name);
//		this.grade = grade;
//		System.out.println("Child Constructor");
//}
	String name = "Messi";
	void display() {
		String name = "Local";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		
		System.out.println(this);
		//System.out.println(super); //keyword to point to immediate parent class
	}
	
}
