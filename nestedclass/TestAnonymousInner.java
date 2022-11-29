package nestedclass;

interface Eatable{
	void eat();
}
//we can also created anonymous inner class by implements the interface

public class TestAnonymousInner{
	public static void main(String[] args) {
		new Eatable() {
			@Override
			public void eat() {
				System.out.println("Nice Fruits");
			}
		}.eat();
		//or you can create anonymous inner class like this
//		Eatable eatt = new Eatable() {
//			@Override
//			public void eat() {
//				System.out.println("Nice fruits");
//			}
//		};
//		eatt.eat();
	}

}
