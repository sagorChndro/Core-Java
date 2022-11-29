package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(2)); // we can add any object in a list
		list.add("This is String type"); // we can any object in a list
		System.out.println((Integer) list.get(0)); // explicit casting needed
		System.out.println((String) list.get(1));// explicit casting needed

		// Generics
		List<String> list1 = new ArrayList<>();
		list1.add("This is generics list");
		list1.add("Collection framework");

		System.out.println(list1.get(0));
		// System.out.println(list1.add(new Integer(2)));// Compile time error
		for (String list2 : list1) {
			System.out.println(list2); // No explicit casting needed
		}
	}

}
