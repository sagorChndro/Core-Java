package ExceptionTest;

public class ExcepTest {

	public static void main(String[] args) {
		int x = 0, y = 20;
		try {
			int z = y / 0;
			int w[] = new int[2];
			System.out.println("Accessing element three : " + w[3]);
		} catch (ArithmeticException e) {
//			System.err.println("Exception throws : " + e);
//			System.out.println("Exception throws : " + e);
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception throws : " + e);
		} finally {
			System.out.println("Out of the block");
		}

	}

}
