package thread;

class NewThread1 implements Runnable {
	Thread thread;

	NewThread1() {
		thread = new Thread(this, "Demo Thread");
		System.out.println("Child Thread : " + this);
		System.out.println("Child Thread : " + thread);
		thread.start(); // Start thread
	}

	// This is entry point for the second thread
	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread : " + i);
				thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Interrupted");
		}
		System.out.println("Child Thread Exiting");
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		new NewThread1();
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main Thread : " + i);
				// Let the thread sleep for a while
				Thread.currentThread().sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exiting");
	}

}
