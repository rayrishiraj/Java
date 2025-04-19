package HashSet;

import java.util.Objects;

public class Student {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	private int id;
	private String name;
	private Double percentage;

	public Student(int id, String name, Double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(percentage, other.percentage);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, percentage);
	}

	@Override
    public String toString() {
        return "ID:" + id + " | Name: " + name + " | Percentage:" + percentage;
}
}
