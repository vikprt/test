package creational;
/* Test */ 
public class Creational {
	public final String type = "Creational Design Pattern\n";
	public final String details = "\nCreational Design Patterns: \n" + 
			"1. Provides one of the best ways to create objects without exposing the creation logic\n" + 
			"2. No need to use the New Operator to instantiate object\n" +
			"3. Refer to newly created object using common interface\n" +
			"4. Gives more flexibility to the Program in terms of deciding what kind of object is needed";
	public Creational() {
		System.out.println("You are looking at a form of " + type + details);
	}
	public String toString() {
		StringBuilder str = new StringBuilder("");
		str.append(type).append(details); 
		return str.toString();
	}
}
