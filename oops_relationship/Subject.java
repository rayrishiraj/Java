package oops_relationship;

public class Subject {
    public String getSubjectName() {
		return subject_name;
	}

	public void setSubjectName(String subject_name) {
		this.subject_name = subject_name;
	}
	private String subject_name;


    public Subject(String subject_name) {
        this.subject_name = subject_name;
    }
}
