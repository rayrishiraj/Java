import java.util.Scanner;

class Subject_S1 {
    private String name;
    private Student[] students; // Array of students enrolled in this subject
    private int studentCount;

    public Subject(String name) {
        this.name = name;
        this.students = new Student[10]; // Assuming a maximum of 10 students per subject
        this.studentCount = 0;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getStudentCount() {
        return studentCount;
    }

    // Add student to this subject
    public void addStudent(Student student) {
        if (studentCount < 10) {
            students[studentCount] = student;
            studentCount++;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}

class Student {
    private String name;
    private String email;
    private Subject[] subjects; // Array of subjects this student is enrolled in
    private int subjectCount;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
        this.subjects = new Subject[5]; // Assuming a maximum of 5 subjects per student
        this.subjectCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public int getSubjectCount() {
        return subjectCount;
    }

    // Add subject to this student
    public void addSubject(Subject subject) {
        if (subjectCount < 5) {
            subjects[subjectCount] = subject;
            subjectCount++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Available subjects
        Subject java = new Subject("Java");
        Subject python = new Subject("Python");
        Subject cpp = new Subject("C++");

        // Array to hold all subjects
        Subject[] allSubjects = {java, python, cpp};

        // Get number of students from user
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Array to hold all students
        Student[] students = new Student[numStudents];

        // Collect details for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student email: ");
            String email = scanner.nextLine();

            // Create student object
            Student student = new Student(name, email);

            // Ask the student how many subjects they want to opt for
            System.out.print("How many subjects do you want to opt for? ");
            int numSubjects = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Ask the student to select subjects
            for (int j = 0; j < numSubjects; j++) {
                System.out.println("Select a subject: ");
                System.out.println("1. Java");
                System.out.println("2. Python");
                System.out.println("3. C++");
                System.out.print("Enter the subject number (1/2/3): ");
                int subjectChoice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                Subject selectedSubject = null;
                if (subjectChoice == 1) {
                    selectedSubject = java;
                } else if (subjectChoice == 2) {
                    selectedSubject = python;
                } else if (subjectChoice == 3) {
                    selectedSubject = cpp;
                } else {
                    System.out.println("Invalid choice!");
                }

                // Add subject to the student's subject list
                if (selectedSubject != null) {
                    student.addSubject(selectedSubject);
                    // Add student to the selected subject
                    selectedSubject.addStudent(student);
                }
            }

            // Add student to the student list
            students[i] = student;
        }

        // Display the many-to-many relationship
        System.out.println("\n--- Students and their subjects ---");
        for (int i = 0; i < numStudents; i++) {
            Student student = students[i];
            System.out.println(student.getName() + " (" + student.getEmail() + ") is enrolled in the following subjects:");
            for (int j = 0; j < student.getSubjectCount(); j++) {
                System.out.println("- " + student.getSubjects()[j].getName());
            }
            System.out.println();
        }

        System.out.println("--- Subjects and their enrolled students ---");
        for (Subject subject : allSubjects) {
            System.out.println("Subject: " + subject.getName());
            for (int i = 0; i < subject.getStudentCount(); i++) {
                System.out.println("- " + subject.getStudents()[i].getName() + " (" + subject.getStudents()[i].getEmail() + ")");
            }
            System.out.println();
        }
    }
}
