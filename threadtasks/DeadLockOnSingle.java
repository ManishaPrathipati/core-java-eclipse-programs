package threadtasks;

public class DeadLockOnSingle {

	public static void main(String[] args) {
		DeadLockOnSingle d = new DeadLockOnSingle();
		Runnable r = () -> {
			d.marks();
		};
		Thread t1 = new Thread(r);
		t1.start();
		Thread t2 = new Thread(r);
		t2.start();
	}

	public void marks() {
		DeadLockOnSingle d = new DeadLockOnSingle();

		int marks = 10;
		// Remock
		synchronized (this) {
			int remock = 70;
		}
		// Betterment
		synchronized (this) {
			int bet = 60;
			marks += bet;
			System.out.println("Total Marks: " + marks);
		}

	}

}
