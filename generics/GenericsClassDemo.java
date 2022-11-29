package generics;

public class GenericsClassDemo<T> {

	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public static void main(String[] args) {
		GenericsClassDemo<String> stringBox = new GenericsClassDemo<>();
		stringBox.add(new String("Hello World"));
		GenericsClassDemo<Integer> integerBox = new GenericsClassDemo<>();
		integerBox.add(new Integer(80));

		System.out.println("String box : " + stringBox.getT());
		System.out.println("Integer Box : " + integerBox.getT());
	}

}
