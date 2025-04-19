package TreeSet;
import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() { return id; }
    public String getName() { return name; }
    public double getCGPA() { return cgpa; }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>((a, b) -> {
            if (Double.compare(b.getCGPA(), a.getCGPA()) != 0) return Double.compare(b.getCGPA(), a.getCGPA());
            if (!a.getName().equals(b.getName())) return a.getName().compareTo(b.getName());
            return Integer.compare(a.getID(), b.getID());
        });

        for (String event : events) {
            String[] details = event.split(" ");
            if ("ENTER".equals(details[0])) {
                pq.add(new Student(Integer.parseInt(details[3]), details[1], Double.parseDouble(details[2])));
            } else if ("SERVED".equals(details[0])) {
                pq.poll();
            }
        }

        List<Student> result = new ArrayList<>();
        while (!pq.isEmpty()) result.add(pq.poll());
        Collections.reverse(result);  // Reverse to get them in priority order
        return result;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<String> events = new ArrayList<>();
        for (int i = 0; i < n; i++) events.add(sc.nextLine());

        Priorities priorities = new Priorities();
        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            students.forEach(student -> System.out.println(student.getName()));
        }
    }
}
