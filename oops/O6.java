package oops;

public class O6 {
	private double diameter;
	private double radius;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	private double area;
	private double perimeter;
	public O6 Area(double radius) {
		setArea(radius * radius * 3.14);
		return this;
	}
	public O6 Diameter(double radius) {
		setDiameter(radius + radius);
		return this;
	}
	public O6 Perimeter(double radius) {
		setPerimeter(2 * 3.14 * radius);
		return this;
	}
}
