package thread;

public class TestJoin implements Runnable {

	public static void main(String[] args) {
		Thread thread = new Thread(new TestJoin());
		thread.start();
		System.out.println("Started");
		try {
			thread.join();
			System.out.println("Complete");
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

	@Override
	public void run() {
		System.out.println("Running......");
	}

}
