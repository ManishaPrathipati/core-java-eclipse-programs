package threadtasks;

public class DaemonThreads {

	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = () -> {
			if (Thread.currentThread().isDaemon()) {
				System.out.println("Executing Daemon Thread");
				for (int i = 1; i <= 5; i++) {
					System.out.println(i + " From R1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
			} else {
				System.out.println("This is Non daemon Thread");
			}

		};

		Runnable r2 = () -> {
//			if (Thread.currentThread().isDaemon()) {
//				System.out.println("Executing Daemon Thread");
				for (int i = 1; i <= 5; i++) {
					System.out.println(i + " From R2");
				}
//			} else {
//				System.out.println("This is Non daemon Thread");
//			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.setDaemon(true);
		t1.start();
//		t1.interrupt();
		t2.start();

//		System.out.println(Thread.currentThread().isDaemon() + "Main");
//		System.out.println(t1.isDaemon() + "T1");
//		System.out.println(t2.isDaemon() + "T2");

		for (int i = 1; i <= 5; i++) {
//			Thread.sleep(300);
			System.out.println(i + " From Main");
		}
	}

}
