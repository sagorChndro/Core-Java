package thread;

public class ThreadBankAccount {

	double amount = 500000;

	synchronized void withdraw(double withdrawAmount) {
		System.out.println("Withdraw....");

		if (this.amount < withdrawAmount) {
			System.out.println("Less balance. Waiting for deposite......");
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// this.amount = amount-withdrawAmount;
		this.amount -= withdrawAmount;
		System.out.println("Withdraw completed......");
		System.out.println("Current balance : " + this.amount);
	}

	synchronized void deposite(double depositeAmount) {
		System.out.println("Deposite...");
		this.amount = amount + depositeAmount;
		// or
		// this.amount +=depositeAmount;
		System.out.println("Deposite Completed...");
		notify();
	}

	public static void main(String[] args) {
		final ThreadBankAccount bankAccount = new ThreadBankAccount();
		new Thread() {
			@Override
			public void run() {
				bankAccount.withdraw(600000);
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				bankAccount.deposite(200000);
			}
		}.start();
	}

}
