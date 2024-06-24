package threadtasks;

import java.util.Scanner;

public class DeadLockOnMultiple {

	static float marks1 = 40.00f;
	static float marks2 = 14.00f;
	static boolean cond1;
	static boolean cond2;
	static float mr1, mr2;

	static Scanner scan = new Scanner(System.in);
	static DeadLockOnMultiple dm=new DeadLockOnMultiple();

	public static void main(String[] args) throws InterruptedException {
		
		Runnable r1 = () -> {
			mr1=remock1();
		};
		Runnable r2 = () -> {
			mr2=remock2();
		};
		Runnable r3 = () -> {
			displayAvgMarks();
		};

		Thread t1 = new Thread(r1);
		t1.start();
		t1.join();
		Thread t2 = new Thread(r2);
		t2.start();
		t2.join();
		Thread t3 = new Thread(r3);
		t3.start();

	}

	synchronized public static float remock2() {
		System.out.println("Please enter Remock2 Results");
		float m2 = scan.nextFloat();
		if (m2 >= 50.0f && m2 < 65.00f) {
			System.out.println("Remock2 is waiting for Remock1 results");
			try {
				Thread.sleep(4000);
				synchronized (dm) {
					System.out.println("Remock1 is Locked");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return 1.0f;
		} 
		else if (m2 >= 65.00f) {
			return m2;
		}
		return marks2;
	}

	synchronized public static float remock1() {
		System.out.println("Please enter Remock1 Results");
		float m1 = scan.nextFloat();
		if (m1 >= 50.0f && m1 < 65.00f) {
			System.out.println("Remock1 is waiting for Remock2 results");
			try {
				Thread.sleep(5000);
				synchronized (dm) {
					System.out.println("Remock2 is Locked");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return 1.0f;
		} 
		else if (m1 >= 65.00f) {
			return m1;
		}
		return marks1;
	}

	 synchronized public static void displayAvgMarks() {
		System.out.println((mr1 + mr2) / 2);
	}

}
