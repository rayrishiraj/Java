package oops;

public class O7 {
	public static void main(String[] args) {
		O6 o = new O6();
		o.Area(3);
		o.Diameter(3);
		o.Perimeter(3);
		System.out.println("Area: " + o.getArea());
		System.out.println("Diameter: " + o.getDiameter());
		System.out.println("Perimeter: " + o.getPerimeter());
	}
}
