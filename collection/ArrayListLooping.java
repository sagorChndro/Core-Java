package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListLooping {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Text1");
		list.add("Text2");
		list.add("Text3");

		System.out.println("#1 Normal for loop/ Conventional for loop");
		for (int i = 0; i < list.size(); i++) {
//			String s = list.get(i);
//			System.out.println(s);
			System.out.println(list.get(i));
		}

		System.out.println("#2 Enhanced for loop/ Advanced for loop");
		for (String temp : list) {
			System.out.println(temp);

		}
		System.out.println("This is the second position of enhanced for loop: " + list.get(1));

		System.out.println("#3 While loop");
		int j = 0;
		while (j < list.size()) {
//			String z = list.get(j);
//			System.out.println(z);
//			j++;
			System.out.println(list.get(j));
			j++;
		}

		System.out.println("#4 Iterator");
		Iterator<String> ittr = list.iterator();// with generic// no need to casting
		while (ittr.hasNext()) {
			String r = ittr.next();
			System.out.println(r);
		}

	}

}
