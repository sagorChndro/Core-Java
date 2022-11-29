
//Custom exception
package ExceptionTest;

import java.util.Scanner;

public class ExcepThrows {

	static void validate(int age) throws InvalideException {
		if (age < 18) {
			throw new InvalideException("Not valid");
		} else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter Your Age : ");
			validate(scanner.nextInt());
		} catch (InvalideException e) {
			System.out.println(e);
		}
		System.out.println("Code is Finished");
	}

}
