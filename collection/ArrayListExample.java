package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		// Add some Element inside ArrayList
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("C");
		list.add("E");
		list.add("F");
		list.add(3, "D");// Add the "D" into third position

		System.out.println("Size : " + list.size() + " and, Element inside the ArrayList : " + list);

		// Remove some element from the ArrayList
		list.remove(4);// Removing using the position
		list.remove("F");

		System.out.println("Size : " + list.size() + " and, Element inside the ArrayList : " + list);

		// Replace element "C" with "Z"
		list.remove("C");
		list.add(3, "Z");// This is the replacement

		System.out.println("Size : " + list.size() + " and, Element inside the ArrayList : " + list);

		// Looping ArrayList// It is conventional for loop

		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i);
			System.out.print(s + " ");
		}
		System.out.println();

		// Enhanced for loop / for each loop
		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();

		Iterator ittr = list.iterator();
		while (ittr.hasNext()) {
			String y = (String) ittr.next();// without generic need to casting
			System.out.print(y + " ");
			;
		}
		System.err.println();

	}

}
