package relation;

import java.util.Scanner;

public class Main_Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100]; 
        int studentIndex = 0; 

        while (true) {
            System.out.println("1. Student\n2. Admin\n3. Exit\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                
                System.out.print("Enter number of students: ");
                int studentCount = scanner.nextInt();
                scanner.nextLine(); 

                for (int i = 0; i < studentCount; i++) {
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phone = scanner.nextLine();

                    System.out.print("Enter number of subjects: ");
                    int subjectCount = scanner.nextInt();
                    scanner.nextLine(); 

                    String[] subjects = new String[subjectCount];
                    for (int j = 0; j < subjectCount; j++) {
                        System.out.println("Enter subject " + (j + 1) + ": ");
                        subjects[j] = scanner.nextLine();
                    }

                    students[studentIndex] = new Student(name, email, phone, subjectCount);
                    students[studentIndex].setSubjects(subjects);
                    studentIndex++;
                }

                System.out.println("\nStudent Details with Subjects:");
                for (int i = 0; i < studentIndex; i++) {
                    students[i].displayStudentInfo();
                    for (String subject : students[i].getSubjects()) {
                        System.out.println("Subject: " + subject + " | Duration: " + Subject.getDuration(subject) + " hr(s)");
                    }
                    System.out.println("------------------------------");
                }

            } else if (choice == 2) {
                System.out.println("Enter subject to find students: ");
                String searchSubject = scanner.nextLine();

                System.out.println("\nStudents enrolled in " + searchSubject + ":");
                boolean found = false;

                for (int i = 0; i < studentIndex; i++) {
                    for (String subject : students[i].getSubjects()) {
                        if (subject.equalsIgnoreCase(searchSubject)) {
                            System.out.println("Name: " + students[i].getName() + 
                                               " | Email: " + students[i].getEmail() + 
                                               " | Phone: " + students[i].getPhone());
                            found = true;
                            break;
                        }
                    }
                }

                if (!found) {
                    System.out.println("No students found for this subject.");
                }
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        
        scanner.close();
    }
}
