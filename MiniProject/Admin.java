package MiniProject;

import java.util.List;
import java.util.Iterator;

//@SecurityCheck(role = "Admin")
public class Admin extends User {

    public Admin(String id, String name) {
        super(id, name);
    }

    @Override
    public void showProfile() {
        System.out.println("Admin Name: " + name + " | Role: Admin");
    }
}