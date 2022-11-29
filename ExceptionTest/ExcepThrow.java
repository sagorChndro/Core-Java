/**
 * The throw keyword is used to explicitly throw an exception
 * We can throw either checked or unchecked exception.
 * The throw keyword is mainly used to throw custom exception.
 * unchecked is runtime exception and error exception.
 */

package ExceptionTest;

import java.util.Scanner;

public class ExcepThrow {

	static void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not allowed");
		} else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter your age : ");
			validate(scanner.nextInt());
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Code finished");
	}

}
