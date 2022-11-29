package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GenericsLowerBoundExample {
	// Lower bound
	// List<? super Integer> means that the list its type to either the
	// Integer class or a super class of Integer such as number
	public static void add(List<? super Integer> listI) {
		listI.add(new Integer(50));
	}

	public static void add2(List<? super Double> listD) {
		listD.add(new Double(34.7));
	}

	public static void add3(List<? super Number> listL) {
		listL.add(new Long(8687876));
	}

	public static void main(String[] args) {
		List<Number> list1 = new ArrayList<>();
		list1.add(new Integer(3));
		list1.add(new Integer(5));
		list1.add(new Integer(60));
		add(list1);// method call

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		List<Number> list2 = new LinkedList<>();
		list2.add(new Double(89));
		list2.add(new Double(559.01));
		list2.add(new Double(789.90));
		add2(list2);
		Iterator<Number> ittr = list2.iterator();
		while (ittr.hasNext()) {
			Number d = ittr.next();
			System.out.println(d);
		}

		List<Number> list3 = new ArrayList<>();
		list3.add(new Long(875773));
		list3.add(new Long(899489));
		list3.add(new Long(637338));
		add3(list3);
		for (Number number : list3) {
			System.out.println(number);
		}
	}

}
