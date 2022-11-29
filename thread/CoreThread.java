package thread;

class Sagor implements Runnable {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 11; i++) {
				System.out.print("Sagor ");
				Thread.sleep(500);
				synchronized (CoreThread.LOCK) {
					CoreThread.LOCK.notify();
					CoreThread.LOCK.wait();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Plus implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 11; i++) {
				synchronized (CoreThread.LOCK) {
					CoreThread.LOCK.wait();
				}
				System.out.print("+");
				Thread.sleep(500);
				synchronized (CoreThread.LOCK) {
					CoreThread.LOCK.notify();

				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Juhi implements Runnable {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 11; i++) {
				synchronized (CoreThread.LOCK) {
					CoreThread.LOCK.wait();
				}
				System.out.print(" Juhi");
				Thread.sleep(500);
				synchronized (CoreThread.LOCK) {
					CoreThread.LOCK.notify();

				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

class Equals implements Runnable {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 11; i++) {
				synchronized (CoreThread.LOCK) {
					CoreThread.LOCK.wait();
				}
				System.out.print(" = ");
				Thread.sleep(500);
				synchronized (CoreThread.LOCK) {
					CoreThread.LOCK.notify();

				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

class Shaju implements Runnable {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 11; i++) {
				synchronized (CoreThread.LOCK) {
					CoreThread.LOCK.wait();
				}
				System.out.print("Shaju(" + (i + 1) + ")\n");
				Thread.sleep(500);
				synchronized (CoreThread.LOCK) {
					CoreThread.LOCK.notify();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

public class CoreThread {

	public static final CoreThread LOCK = new CoreThread();

	public static void main(String[] args) throws InterruptedException {
		Thread sagor = new Thread(new Sagor());
		Thread plus = new Thread(new Plus());
		Thread juhi = new Thread(new Juhi());
		Thread equal = new Thread(new Equals());
		Thread shaju = new Thread(new Shaju());

		sagor.start();
		plus.start();
		juhi.start();
		equal.start();
		shaju.start();
		sagor.join();
		plus.join();
		juhi.join();
		equal.join();
		shaju.join();
		System.out.println("Yesssss!!!!! We are Football Team...");
	}

}
