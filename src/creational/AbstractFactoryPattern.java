package creational;

public class AbstractFactoryPattern extends Creational {
	final String name = "Abstract Factory Pattern";
	final String about = name + " works around a super factory which creates other factories.\n "
			+ "In Abstract Foctory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes.";
	public AbstractFactoryPattern() {
		System.out.println("________________________________________________________________\n" + about + "\n");
	}
	public String toString() {
		return "________________________________________________________________\n" + about + "\n";
	}
	public static void main(String[] args) {
		AbstractFactoryPattern p = new AbstractFactoryPattern();
		AbstractFactory af = FactoryProducer.getFactory("SHAPE");
		Shape shape1 = af.getShape("CIRCLE");
		shape1.draw();
		shape1 = af.getShape("RECTANGLE");
		shape1.draw();
		shape1 = af.getShape("POLYGON");
		shape1.draw();		
	}
}

interface Color {
	void fill();
}
class Red implements Color {
	public void fill() {
		System.out.println("Painted " + this.getClass().getSimpleName());
	}
}
class Green implements Color {
	public void fill() {
		System.out.println("Painted " + this.getClass().getSimpleName());
	}
}
class Blue implements Color {
	public void fill() {
		System.out.println("Painted " + this.getClass().getSimpleName());
	}
}
abstract class AbstractFactory {
	abstract Shape getShape(String shape);
	abstract Color getColor(String color);
}

class ShapeFactory2 extends AbstractFactory {
	@Override
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
	
	@Override
	Color getColor(String color) {
		return null;
	}
}

class ColorFactory extends AbstractFactory {
	@Override
	Shape getShape(String shape) {
		return null;
	}
	
	Color getColor(String color) {
		if (color == null)
			return null;
		if (color.equals("RED"))
			return new Red();
		if (color.equals("GREEN"))
			return new Green();
		if (color.equals("BLUE"))
			return new Blue();
		return null;
	}
}

class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice == null)
			return null;
		if (choice.equals("SHAPE")) 
			return new ShapeFactory2();
		if (choice.equals("COLOR"))
			return new ColorFactory();
		return null;
	}
}
