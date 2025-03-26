package Inheritance;

public class Student extends Person {
    private int studentID;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }


    public Student(String name, int age, int studentID) {
        super(name, age); 
        this.studentID = studentID;
    }


    void displayDetails() {
    	displayPersonDetails();
        System.out.print(", Student ID: " + studentID);
    }
}