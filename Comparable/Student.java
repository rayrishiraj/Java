package Comparable;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    int rollNo;
    String name;
    double percentage;

    public Student(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return rollNo + "\t" + name + "\t" + percentage;
    }

    @Override
    public int compareTo(Student other) { 
    	Student s = (Student) other;
//        if (this.rollNo > s.rollNo) {
//            return 1;
//        } else if (this.rollNo < s.rollNo) {
//            return -1;
//        } else {
//            return 0;
//        }
    	return Double.compare(this.percentage , s.percentage);
    }
}