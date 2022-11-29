package varargs;

public class HelloWorldVarargs {

	public static void test(int some, String... strings) {
		System.out.println("Integer : " + some);
		for (String args : strings) {
			System.out.print(args + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		test(1234, "Sagor", "Bikash", "Taposh", "Subinoy", "Tutul");
		test(321, "Bikash", "Tutul");
	}

}
