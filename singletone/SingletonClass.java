/**
 * 1. To have control on the instantiation of the Java object
 * 				it wont allow you to create an instance of an object.
 * 2.It wont allow the class to be Subclasses
 * 3. This has a special advantage when implementing the singleton pattern,
 * 				Private constructor are used for it and have a control on the
 * 				creating the instance for the whole application.
 * 4.When you want to have a class with all constants or all of your method
 * 				in a class are static defined and does not require
 * 				its instance any more, then we declare that class as a
 * 				private constructor.
 */

package singletone;

public class SingletonClass {

	private static SingletonClass obj = null;

	private SingletonClass() {
		// Private Constructor will prevent
		// the instantiation of this class directly
	}

	public static SingletonClass getInstance() {
		// this logic will ensure that no more than
		// one object can be created at a time
		if (obj == null) {
			obj = new SingletonClass();
		}
		return obj;
	}

	public void display() {
		System.out.println("Singleton class example");
		System.err.println("Those people sounds like crazzy!!! seriously man!!!!!!!");
	}

	public static void main(String[] args) {
		// Object cannot be created directly due to prevent constructor
		// This way it is forced to created object via our method where
		// we have logic for only one object creation
		SingletonClass s = SingletonClass.getInstance();
		s.display();
	}

}
