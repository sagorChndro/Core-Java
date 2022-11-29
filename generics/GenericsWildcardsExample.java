package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsWildcardsExample {
	// Unbound Wildcard
	// List<?> means a list type to an unknown type
	// Its same an using <? extends object>

	public static void processElement(List<?> elements) {
		for (Object element : elements) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(4);
		ints.add(2);
		ints.add(6);
		processElement(ints);

		List<String> s = new LinkedList<>();
		s.add("This is first String");
		s.add("This is second String");
		s.add("This is third String");
		processElement(s);

		List<Float> d = new ArrayList<>();
		d.add(2.3f);
		d.add(4.667f);
		processElement(d);
	}

}
