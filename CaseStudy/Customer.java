package CaseStudy;

public class Customer {
    private String name;
    private boolean loggedIn;
    private int password; 

    public Customer(String name, int password) {
        this.name = name;
        this.password = password;
        this.loggedIn = false;
    }

    public void login(int password) {
    	if(password == 1234) {
    		this.loggedIn = true;
            System.out.println(name + " logged in successfully.");
    	}  
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
    public int getPassword() {
    	return password;
    }
    public String getName() {
        return name;
    }
}
