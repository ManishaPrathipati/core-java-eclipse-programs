package threadtasks;

class MyThread1 extends Thread{
	public void run() {
		synchronized (this) {
			for(int i=1; i<=4; i++) {
				System.out.println(i + " T1");
//			if(i==2) {
				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					System.out.println("I was Interrupted");
				}
//			}
		}
		}
	}
}
public class InterruptedThread {

	public static void main(String[] args) throws InterruptedException {
		MyThread1 t1=new MyThread1();
		Thread t2=new Thread(new Runnable() {

			public void run() {
				for(int i=1; i<=7; i++) {
					System.out.println(i + " T2");
				}
			}
			
		});
	
		t1.setPriority(10);
		t2.setPriority(5);
		t1.start();
//		t1.join();
		t1.interrupt();
		t2.start();
		System.out.println("Main");
	}

}
