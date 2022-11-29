/**
 * Anonymous Inner Class-A class created for implementing interface
 * or extending class. Its name is decided by the java compiler.
 * anonymous inner class by abstract class
 */

package nestedclass;
abstract class Person{
	abstract void eat();
}

public class TestAnonymousInner1 {
	public static void main(String[] args) {
		//This is anonymous inner class
		new Person() {
			@Override
			public void eat() {
				System.out.println("He eats rice");
			}
		}.eat();
		
		//or you can write the another way like this
		Person person = new Person() {
			@Override
			public void eat() {
				System.out.println("He eats meat");
			}
		};
		person.eat();
	}

}
