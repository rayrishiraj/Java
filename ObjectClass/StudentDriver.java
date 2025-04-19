package ObjectClass;

public class StudentDriver {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Ram");
        student1.setPercentage(85.5);

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Laxman");
        student2.setPercentage(90.0);

        Student student3 = new Student();
        student3.setId(1);
        student3.setName("Ram");
        student3.setPercentage(85.5);
        
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
        System.out.println("Student 3: " + student3);


        System.out.println("Are student1 and student2 equal? " + student1.equals(student2));

        System.out.println("Are student1 and student3 equal? " + student1.equals(student3));
        
        System.out.println("Hashcode of student1: " + student1.hashCode());
        System.out.println("Hashcode of student2: " + student2.hashCode());
        System.out.println("Hashcode of student2: " + student3.hashCode());

    }
}
