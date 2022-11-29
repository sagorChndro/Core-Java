package thread;

public class TestThreadTwice extends Thread {

	public void run() {
		System.out.println("Running.......");
	}

	public static void main(String[] args) {
		TestThreadTwice thread = new TestThreadTwice();
		thread.start();
		// thread.start(); a single thread can to start second time

		TestThreadTwice thread1 = new TestThreadTwice(); // if i create new object then its
															// will run second time
		thread1.start();
	}

}
