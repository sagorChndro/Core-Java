package ExceptionTest;

public class Test {

	public static void main(String[] args) {
		int x = 0, y = 10;
		try {
			int sum = y / x;
			int[] z = new int[2];
			System.out.println("Accessing element three : " + z[3]);
		} catch (ArithmeticException e) {
			System.err.println("You Have a Problem at the Calculation");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finished......");
		}
	}

}
