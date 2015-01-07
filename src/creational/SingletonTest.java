package creational;

public class SingletonTest {
	public static void main(String args[]) {
		Singleton st = Singleton.getTheInstance();
		System.out.println(st);
	}
}

class Singleton extends Creational {
		final String name = "Singleton Pattern";
		final String about = name + " is a pattern in which only single instance of the classs gets created. \n"
				+ "The class provides a way to access its only object which can be accessed directly without instantiating the object of the class.\n";
		private static Singleton theInstance = null;
		private Singleton() {}
		public String toString() {
			return "________________________________________________________________\n" + about + "\n";
		}		
		public static Singleton getTheInstance() {
			if (theInstance == null) {
				synchronized(Singleton.class) {
					theInstance = new Singleton();
				}
			} 
			return theInstance;
		}
}

