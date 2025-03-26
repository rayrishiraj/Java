package relation;

public class Student {
    private String name;
    private String email;
    private String phone;
    private String[] subjects;

    public Student(String name, String email, String phone, int subjectCount) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.subjects = new String[subjectCount];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Email: " + email);
        System.out.print("Subjects: ");
        for (String subject : subjects) {
            System.out.print(subject + " ");
        }
        System.out.println("\n----------------------------");
    }
}
