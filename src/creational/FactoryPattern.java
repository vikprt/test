package creational;

public class FactoryPattern extends Creational {
	final String name = "Factory Pattern";
	final String about = name + " is the one of the most used Design Pattern";
	public FactoryPattern() {
		System.out.println("________________________________________________________________\n" + about + "\n");
	}
	public String toString() {
		return "________________________________________________________________\n" + about + "\n";
	}
	public static void main(String[] args) {
		FactoryPattern p = new FactoryPattern();
		ShapeFactory sf = new ShapeFactory();
		Shape shape1 = sf.getShape("CIRCLE");
		shape1.draw();
		shape1 = sf.getShape("RECTANGLE");
		shape1.draw();
		shape1 = sf.getShape("POLYGON");
		shape1.draw();		
	}
}

interface Shape {
	void draw();
}
class Circle implements Shape {
	public void draw() {
		System.out.println("Drawing a " + this.getClass().getSimpleName());
	}
}
class Rectangle implements Shape {
	public void draw() {
		System.out.println("Drawing a " + this.getClass().getSimpleName());
	}
}
class Polygon implements Shape {
	public void draw() {
		System.out.println("Drawing a " + this.getClass().getSimpleName());
	}
}
class ShapeFactory {
	Shape getShape(String shapeType) {
		if (shapeType == null)
			return null;
		if (shapeType.equals("CIRCLE"))
			return new Circle();
		if (shapeType.equals("RECTANGLE"))
			return new Rectangle();
		if (shapeType.equals("POLYGON"))
			return new Polygon();
		return null;
	}
}