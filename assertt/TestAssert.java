package assertt;

public class TestAssert {

	public static void main(String[] args) {
		int x = 1;
		// assert(x>0); //simple form
		assert (x > 0) : "Assertion error cought"; // augmented form
	}

}
//this code run like this 
//javac TestAssert.java
//java -ea TestAssert