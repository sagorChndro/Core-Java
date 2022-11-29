package thread;

public class SyncTest extends Thread {
	public static void main(String[] args) {
		SyncTest test1 = new SyncTest();
		SyncTest test2 = new SyncTest();

		test1.start();
		test2.start();
	}

	static synchronized void print() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				// Thread.sleep(3000);
				Thread.sleep((long) (3000 * Math.random()));
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}

	@Override
	public void run() {
		synchronized (this) {
			print();
		}
	}
}
