package ObjectClass;

import java.util.Objects;

public class Student {
	private int id;
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
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	private String name;
	@Override
	public String toString() {
		return "Student [ID = " + id + ", NAME = " + name + ", PERCENTAGE = " + percentage + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, percentage);
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
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage);
	}
	private double percentage;
	
}
