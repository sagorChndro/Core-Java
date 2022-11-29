package collection;

public class CompareToStudent implements Comparable {
	int roll;
	String name;
	int age;

	public CompareToStudent(int roll, String name, int age) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object obj) {
		CompareToStudent st = (CompareToStudent) obj;

//		if (this.roll == st.roll) {
//			return 0;
//		} else if (this.roll > st.roll) {
//			return 1;
//		} else {
//			return -1;
//		}
		System.out.println("=========" + this.roll + " compare with " + st.roll);

		// System.out.println("==========" + this.roll + " compare with " + st.roll);

		// return st.age - this.age;/descending order to age
		// return this.age - st.age;//ascending order to age
		return this.roll - st.roll;// ascending order to roll
		// return st.roll - this.roll;// descending order to roll

	}

}
