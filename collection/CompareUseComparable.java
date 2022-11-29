package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CompareUseComparable {
	public static void main(String[] args) {
		ArrayList<CompareToStudent> al = new ArrayList<CompareToStudent>();
		al.add(new CompareToStudent(105, "Bikash", 26));
		al.add(new CompareToStudent(106, "Subinoy", 28));
		al.add(new CompareToStudent(107, "Taposh", 25));

		Collections.sort(al);
		Iterator<CompareToStudent> ittr = al.iterator();
		while (ittr.hasNext()) {
			CompareToStudent student = ittr.next();
			System.out.println(student.roll + " " + student.name + " " + student.age);
		}
	}
}
