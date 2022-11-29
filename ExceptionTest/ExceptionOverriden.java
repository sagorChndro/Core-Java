package ExceptionTest;

import java.io.EOFException;
import java.io.IOException;

public class ExceptionOverriden {
	// Rule-1: super method does not declare an exception
	void msg() {
		System.out.println("Parent class's method");
	}

	// Rule-2: super class method declare an exception
	public void someMethod() throws IOException {
		// method's body
	}

}

class Test1 extends ExceptionOverriden {
//	Rule-1 : subclass overridden method can not declare no exception
//	or the checked exception(like IOException)
//	but can declare unchecked exception(like ArithmeticException)

//	-valid (no exception)
//	@Override
//	void msg() {
//		
//	}

//	-valid (unchecked exception)
	@Override
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

//	-invalid (checked exception)
//	@override
//	void msg() throws IOException {
//		
//	}

//	-valid (same exception or same checked exception)	
//	@Override
//	public void someMethod() throws IOException {
//		
//	}

//	-valid (unchecked exception or subclass's exception)	
	@Override
	public void someMethod() throws EOFException {
		System.out.println("child");
	}

//	-invalid (super class's exception)	
//	@Override
//	public void someMethod() throws Exception{
//		
//	}
}
