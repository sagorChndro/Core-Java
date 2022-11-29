/**
 * Static nested class
 * A static nested class that is created inside a class is known as
 * static nested class. It can not access the non static members.
 * It can access static data member of outer class including private.
 * static nested class can not access non static (instance) data member.
 */

package nestedclass;

public class StaticNested {
	static int data = 40;
	static class Inner{
		void msg() {
			System.out.println("Data is : "+data);
		}
		static void msg2() {
			System.out.println("Data is : "+(data+data));
		}
	}
	
	public static void main(String[] args) {
		StaticNested.Inner nested = new StaticNested.Inner();
		nested.msg();
		Inner.msg2();
	}
}
