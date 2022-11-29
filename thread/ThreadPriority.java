package thread;

public class ThreadPriority extends Thread {

	public void run() {
		System.out.println("Running Thread Name : " + Thread.currentThread().getName());
		System.out.println("Running Thread Priority : " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		ThreadPriority thread = new ThreadPriority();
		thread.setName("Thread1");
		ThreadPriority threadd = new ThreadPriority();
		threadd.setName("Thread2");

		thread.setPriority(MIN_PRIORITY); // Min_PRIORITY = 1; predefine value
		threadd.setPriority(MAX_PRIORITY); // MAX_PRIORITY = 10 ;predefine value
		// thread.setPriority(NORM_PRIORITY); // NORM_PRIORITY = 5;predefine value

		thread.start();
		threadd.start();
	}

}
