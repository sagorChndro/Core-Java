package thread;

public class DeadLock {

	public static DeadLock lock1 = new DeadLock();
	public static DeadLock lock2 = new DeadLock();

	public static void main(String[] args) {
		ThreadDemo1 thread1 = new ThreadDemo1();
		ThreadDemo2 thread2 = new ThreadDemo2();
		thread1.start();
		thread2.start();

	}

	private static class ThreadDemo1 extends Thread {
		@Override
		public void run() {
			synchronized (lock1) {
				System.out.println("Thread 1 : Holding Lock 1.......");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 1 : Waiting for lock 2....");
				synchronized (lock2) {
					System.out.println("Thread 1 : Holding lock 1 & 2.....");
				}

			}
		}
	}

	private static class ThreadDemo2 extends Thread {
		@Override
		public void run() {
			synchronized (lock1) {
				System.out.println("Thread 2 : Holding Lock 2.......");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("Thread 2 : Waiting for lock 1......");
				synchronized (lock2) {
					System.out.println("Thread 2: Holding Lock 1 & 2.......");
				}
			}
		}
	}

}
