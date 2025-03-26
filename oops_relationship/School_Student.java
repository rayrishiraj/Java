package oops_relationship;

public class School_Student {
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

	private String name;
    private String email;

    public School_Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
    void creat_student_name(String name, String email) {
    	
    }
    
    
}
