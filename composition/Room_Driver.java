package composition;

public class Room_Driver {// Composition Relationship
	public static void main(String[] args) {
		House house = new House("Blue", 600);

		System.out.println(house.getColor());
		System.out.println(house.getRoom().getArea());

		house = null; //house is destroyed
		
		System.out.println(house.getRoom().getArea()); //nullPointerException
	}
}
