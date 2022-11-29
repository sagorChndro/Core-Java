package recursion;

import java.util.Scanner;

public class Factorial {
	public static long factorial(long n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any number : ");
		long y = scanner.nextInt();
		System.out.println("Total factorial is : " + factorial(y));
	}

}
