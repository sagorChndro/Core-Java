/**
 * The non static nested classes are also known Inner Class
 * 	1.non-static nested class(inner class)
 * 		a)Member inner class
 * 		b)Anonymous inner class
 * 		c)Local Inner class
 * 	2.static nested class
 * Member Inner Class-A class created within class and outside method
 * Example of member inner class that is invoked inside a class
 */
package nestedclass;

public class TestOuterMember1 {
	private int data =30;
	// this is a member inner class. which is always outside of any method.
	class Inner{
		void msg() {
			System.out.println("Data is "+data);
		}
	}
	void display() {
		Inner inner = new Inner();
		//or you can call this way
		//TestOuterMember1.Inner inner = new TestOuterMember1.Inner();
		inner.msg();
	}
	
	public static void main(String[] args) {
		TestOuterMember1 test = new TestOuterMember1();
		test.display();
	}

}
