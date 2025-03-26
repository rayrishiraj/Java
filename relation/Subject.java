package relation;

public class Subject {
    static String[] subjectNames = {"Java", "Python", "C", "C++", "R"};
    static int[] subjectDurations = {1, 2, 1, 1, 2};

    public static int getDuration(String subject) {
        for (int i = 0; i < subjectNames.length; i++) {
            if (subjectNames[i].equalsIgnoreCase(subject)) {
                return subjectDurations[i];
            }
        }
        return 0; 
    }
}
