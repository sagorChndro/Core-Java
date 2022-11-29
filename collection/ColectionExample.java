package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class ColectionExample {

	public static void main(String[] args) {
//		List can allow duplicate values 
		List<String> l = new LinkedList<String>();
		System.out.println("This is LinkedList");
		l.add("List : Angel");
		l.add("Schildt");
		l.add("Mathew");
		l.add("Schildt");
		print(l);
		System.out.println();

//		Set doesn't allow duplicate values
		Set<String> s = new HashSet<String>();
		System.out.println("This is HashSet");
		s.add("Set: Rose");
		s.add("Schildt");
		s.add("Mathew");
		s.add("Schildt");
		print(s);
		System.out.println();

		SortedSet<String> ss = new TreeSet<String>();
		System.out.println("This is TreeSet");
		ss.add("TreeSet: Jasmine");
		ss.add("Schildt");
		ss.add("Mathew");
		ss.add("Schildt");
		print(ss);
		System.out.println();

		LinkedHashSet<String> sss = new LinkedHashSet<String>();
		System.out.println("This is LinkedHashMap");
		sss.add("LinkedHashSet : Winslet");
		sss.add("Schildt");
		sss.add("Mathew");
		sss.add("Schildt");
		print(sss);
		System.out.println();

//		Here is unique key doesn't allow duplicate key
		Map<String, String> m = new HashMap<>();
		System.out.println("This is HashMap");
		m.put("Map", "HashMap");
		m.put("Schildt", "Java2s");
		m.put("Mathew", "Hyden");
		m.put("Schildt", "Java2e");
		print(m.keySet());
		print(m.values());
		System.out.println();

		SortedMap<String, String> sm = new TreeMap<>();
		System.out.println("This is TreeMap");
		sm.put("SortedMap", "TreeMap");
		sm.put("Schildt", "Java2s");
		sm.put("Mathew", "Hyden");
		sm.put("Schildt", "Java2e");
		print(sm.keySet());
		print(sm.values());
		System.out.println();

		LinkedHashMap<String, String> lm = new LinkedHashMap<>();
		System.out.println("This is LinkedHashMap");
		lm.put("Map", "LinkedHashMap");
		lm.put("Schildt", "Java2s");
		lm.put("Mathew", "Hyden");
		lm.put("Schildt", "Java2e");
		print(lm.keySet());
		print(lm.values());

	}

	public static void print(Collection<String> coll) {
		Iterator<String> ittr = coll.iterator();
		while (ittr.hasNext()) {
			String element = (String) ittr.next();
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
