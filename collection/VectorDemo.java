package collection;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector v = new Vector(3, 4);
		System.out.println("Inital Size : " + v.size());
		System.out.println("Initial Capacity : " + v.capacity());
		v.addElement(new Integer(1000000000));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		System.out.println("Capacity after four addition : " + v.capacity());
		v.addElement(new Double(3.334));
		System.out.println("Current capacity : " + v.capacity());
		v.addElement(new Double(5.67));
		System.out.println("Current capacity : " + v.capacity());
		v.addElement(new Float(3.4f));
		System.out.println("Current capacity : " + v.capacity());
		v.addElement(new Long(898888888));
		System.out.println("Capacity again after four addition : " + v.capacity());
		v.addElement(new Double(66.8d));
		System.out.println("Current capacity : " + v.capacity());
		v.addElement(new Double(66.8d));
		System.out.println("Current capacity : " + v.capacity());
		v.addElement(new Double(66.8d));
		System.out.println("Current capacity : " + v.capacity());
		v.addElement(new Double(66.8d));
		System.out.println("Capacity again after four addition : " + v.capacity());
		v.addElement(new Integer(11));
		v.addElement(new Long(1294059304));
		System.out.println("First element : " + v.firstElement());
		System.out.println("Last element : " + v.lastElement());
		System.out.println("Enter any Number : ");
		Integer x = new Integer(scanner.nextInt());
		if (v.contains(x)) {
			System.out.println("Vector contains : " + x);
		} else {
			System.out.println("Vector can't contains : " + x);
		}

		// enumerate the element of the vector
		Enumeration vEnum = v.elements();
		while (vEnum.hasMoreElements()) {
			System.out.print(vEnum.nextElement() + ", ");
		}

	}

}
