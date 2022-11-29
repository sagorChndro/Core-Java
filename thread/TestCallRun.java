package thread;

public class TestCallRun extends Thread {

	// @Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		TestCallRun thread = new TestCallRun();
		TestCallRun thread1 = new TestCallRun();

		thread.start(); // Thread method call
		thread1.start(); // Thread method call
//		thread.run(); // normal method call
//		thread1.run(); // normal method call
	}
}
