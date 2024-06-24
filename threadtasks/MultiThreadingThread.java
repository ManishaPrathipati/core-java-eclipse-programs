package threadtasks;

import java.util.HashMap;

public class MultiThreadingThread extends Thread{
//public class MultiThreadingEg implements Runnable{
	
	public void run() {
			System.out.println("Run " + Thread.currentThread().getName());
			for(int i=1; i<=5; i++) {
				System.out.println(i);
				
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getState() + " " + Thread.currentThread().getName());
		MultiThreadingThread m=new MultiThreadingThread();
//		MultiThreadingEg t=new MultiThreadingEg();
//		Thread m=new Thread(t);
		System.out.println("M "+m.getState() + " " + m.getName());
		System.out.println("main Before New Thread " + Thread.currentThread().getState() + " " + Thread.currentThread().getName());
		m.run();
		m.read();
//		t.read();
		System.out.println(Thread.currentThread().getState() + " "+ Thread.currentThread().getName());
			m.start();
			m.join();
			System.out.println(Thread.currentThread().getState() + ", "+ Thread.currentThread().getName());
			MultiThreadingThread m1=new MultiThreadingThread();
//		MultiThreadingEg t1=new MultiThreadingEg();
//		Thread m1=new Thread(t1);
		m1.start();
		m1.join();
			System.out.println("Main After New Thread " + Thread.currentThread().getName());
	}

	public void read() {
		System.out.println("Read " + Thread.currentThread().getName());
	}
}
