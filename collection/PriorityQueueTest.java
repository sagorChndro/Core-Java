package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

class Student implements Comparable<Student> {
	private String name;
	private int rank;

	public Student(String name, int rank) {
		super();
		this.name = name;
		this.rank = rank;
	}

	@Override
	public int compareTo(Student st) {
		if (rank > st.rank) {
			// return 1;// Ascending order
			return -1; // Descending order
		} else if (rank < st.rank) {
			// return -1;// Ascending order
			return 1;// Descending order
		}
		return 0;
		// or you can return like which is given below

		// return rank - st.rank; // Ascending order
		// return st.rank - rank; // Descending order
	}

	@Override
	public String toString() {

		return "Student name : " + name + ".   Rank : " + rank;
	}

}

public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<Student> studentQ = new PriorityQueue<>();
		studentQ.add(new Student("Bikash", 10));
		studentQ.add(new Student("Taposh", 9));
		studentQ.add(new Student("Subinoy", 23));
		studentQ.add(new Student("Tutul", 7));

		System.out.println("Size of queue : " + studentQ.size());

		Iterator<Student> ittr = studentQ.iterator();
		while (ittr.hasNext()) {
			System.out.println("The items of queue : " + studentQ.poll().toString());
		}
	}
}
