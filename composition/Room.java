package composition;

public class Room { // Aggregation Relationship
	private double area;

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	Room(double area) {
		this.area = area;
	}

}
