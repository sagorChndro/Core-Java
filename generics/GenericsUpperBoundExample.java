package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GenericsUpperBoundExample {

	// Upper Bound
	// List<? extends Number> means a List of objects thats are instants of
	// the class Number, of subscribe of Number(e.g Integer , Double , Long and
	// shorts)

	public static double sum(List<? extends Number> list) {
		double sum = 0;
		for (Number number : list) {
			System.out.println(number.doubleValue());
			// sum = sum + number.doubleValue();
			sum += number.doubleValue();

		}

		return sum;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> ints = new ArrayList<>();
		System.out.print("Enter your First Number : ");
		ints.add(new Integer(scanner.nextInt()));
		System.out.print("Enter your Second Number : ");
		ints.add(new Integer(scanner.nextInt()));
		System.out.print("Enter your Third Number : ");
		ints.add(new Integer(scanner.nextInt()));
		System.out.print("Enter your Fourth Number : ");
		ints.add(new Integer(scanner.nextInt()));
		double sums = sum(ints);
		System.out.println(sums);

		List<Long> longs = new LinkedList<>();
		System.out.print("Enter your First Number : ");
		longs.add(new Long(scanner.nextInt()));
		System.out.print("Enter your Second Number : ");
		longs.add(new Long(scanner.nextInt()));
		System.out.print("Enter your Third Number : ");
		longs.add(new Long(scanner.nextInt()));
		System.out.print("Enter your Fourth Number : ");
		longs.add(new Long(scanner.nextInt()));
		double sums1 = sum(longs);
		System.out.print("Total Long value is : " + sums1);
	}

}
