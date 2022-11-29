package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
//		String sArray[] = {"Array1","Array2","Array3","Array4"};
		String sArray[] = new String[] { "Array1", "Array2", "Array3" };

		List<String> lList = Arrays.asList(sArray);

		System.out.print("#1. This is for iterator : ");
		Iterator ittr = lList.iterator();
		while (ittr.hasNext()) {
			String r = (String) ittr.next();// type casting
			System.out.print(r + " ");
		}
		System.out.println();

		System.out.print("#2. This is for enhanced for loop : ");
		for (String ss : lList) {
			System.out.print(ss + " ");
		}
		System.out.println();

		System.out.print("#3. This is normal for loop : ");
		for (int i = 0; i < lList.size(); i++) {
			System.out.print(lList.get(i) + " ");
		}

		System.out.println();

		System.out.print("#4. This is for while loop : ");
		int j = 0;
		while (j < lList.size()) {
			System.out.print(lList.get(j) + " ");
			j++;
		}

	}

}
