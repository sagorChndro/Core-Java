package ExceptionTest;

public class ExceptionPropagation {

	void pro() {
//		try {
		int x = 50 / 0;
//		} catch (ArithmeticException e) {
//			System.out.println(e);
//		}

	}

	void pa() {
		pro();
	}

	void gation() {
		try {
			pa();
		} catch (ArithmeticException e) {
			System.out.println("Exception Handled.");
		}
	}

	public static void main(String[] args) {
		ExceptionPropagation s = new ExceptionPropagation();
		s.gation();
		System.out.println("Normal flow......");

	}

}
