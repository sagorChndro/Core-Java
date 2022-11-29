package generics;

import java.util.ArrayList;
import java.util.List;

class SuperClass {

}

class ChildsClass extends SuperClass {

}

class GrandChildsClass extends ChildsClass {

}

public class GenericsLowerBoundExample1 {
	public static void main(String[] args) {

		// List of grand child
		List<GrandChildsClass> grandsChilds = new ArrayList<>();
		grandsChilds.add(new GrandChildsClass());
		addGrandChild(grandsChilds);

		// List of child
		List<ChildsClass> child = new ArrayList<>();
		child.add(new GrandChildsClass());
		addGrandChild(child);

		// List of super
		List<SuperClass> supers = new ArrayList<>();
		supers.add(new GrandChildsClass());
		addGrandChild(supers);

	}

	public static void addGrandChild(List<? super GrandChildsClass> grandChild) {
		grandChild.add(new GrandChildsClass());
		System.out.println(grandChild);
	}

}
