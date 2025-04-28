package CaseStudy;

import java.util.List;

public class Restaurant {
    private String name;
    private List<String> menu;

    public Restaurant(String name, List<String> menu) {
        this.name = name;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public List<String> getMenu() {
        return menu;
    }

    public boolean isItemAvailable(String item) {
        return menu.contains(item);
    }
}
