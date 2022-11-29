/**
 * Local Inner Class
 * A class that is created inside a method is known as a local inner class.
 * If you want to invoke the method of local inner class,
 * you must instantiate this class inside the method.
 * 1) Local inner class can not be invoked from outside the method.
 * 2) Local inner class can not be access non-final local variable.
 */

package nestedclass;

public class LocalInner {
	private int data =30;//instance variable
	public void display() {
		class LocalInnerInside{
			void msg() {
				System.out.println("Data is : "+data);
			}
		}
		LocalInnerInside inner = new LocalInnerInside();
		inner.msg();
	}
	public static void main(String[] args) {
		LocalInner in = new LocalInner();
		in.display();
	}

}
