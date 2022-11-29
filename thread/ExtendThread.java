package thread;

// Create a Thread by extending Thread
class NewThread extends Thread {
	NewThread() {
		// Create a new Thread
		super("Demo Thread");
		System.out.println("Child Thread : " + this);
		this.start(); // Start Thread
	}

	// This is entry point for the second thread
	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread : " + i);
				sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Thread Interrupted");
		}
		System.out.println("Child Thread Exiting");
	}
}

public class ExtendThread {

	public static void main(String[] args) {
		new NewThread(); // create a new Thread
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main Thread : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exiting");
	}

}
