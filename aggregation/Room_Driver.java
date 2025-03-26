package aggregation;

public class Room_Driver {// Aggregation Relationship
	public static void main(String[] args) {
		Room room = new Room(600);
		House house = new House("Blue", room);

		System.out.println(house.getColor());
		System.out.println(house.getRoom().getArea());

	}
}
