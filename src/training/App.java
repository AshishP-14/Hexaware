package training;

class Shape {
	public String name;
	public double area;
	static double pi = 3.141592653589793238;
	
	public Shape(String name) {
		this.name = name;
	}
	public String getName() {
		name = "Shape";
		return name;
	}

	public double getArea() {
		area = 0.0;
		return area;

	}
}

class Circle extends Shape {
	private double rad;
	public Circle(String name , double rad) {
		super(name);
		this.rad = rad;
	}
	public String getName() {
		name = "Circle";
		return name;
	}

	public double getArea() {
		area = pi * rad * rad;
		return area;
	}
}

class Rectangle extends Shape {
	private double length;
	private double breadth;
	public Rectangle(String name,double length,double breadth) {
		super(name);
		this.length=length;
		this.breadth = breadth;
	}
	public String getName() {
		name = "Rectangle";
		return name;
	}

	public double getArea() {
		area = length * breadth;
		return area;
	}

}

public class App {

	public static void main(String[] args) {
		Shape s = new Shape("shape");
		Shape c = new Circle("Circle",2.0);
		Shape r = new Rectangle("rectangle",4.0,5.0);

		System.out.println(s.getName());
		System.out.println(c.getName());
		System.out.println(r.getName());

		System.out.println(s.getArea());
		System.out.println(c.getArea());
		System.out.println(r.getArea());

	}

}