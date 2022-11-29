package ExceptionTest;

public class FinallyDemo {
	static int processA(int x, int y) {
		try {
			return x / y;
		} catch (ArithmeticException e) {
			System.err.println("Exception thrown : " + e);
			e.printStackTrace();
			return 0;

		} finally {
			System.out.println("Finally block are always execute");
		}
	}

	public static void main(String[] args) {
		// processA(20,0);
		FinallyDemo.processA(20, 0);
	}

}
