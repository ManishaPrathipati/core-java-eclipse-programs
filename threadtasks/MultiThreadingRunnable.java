package threadtasks;

public class MultiThreadingRunnable extends Thread{
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable r=()-> {
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
	};

		
		System.out.println(Thread.currentThread().getState() + " " + Thread.currentThread().getName());
//		MultiThreadingRunnable t=new MultiThreadingRunnable();
		Thread m=new Thread(r);
		System.out.println("M "+m.getState() + " " + m.getName());
		System.out.println("main Before New Thread " + Thread.currentThread().getState() + " " + Thread.currentThread().getName());
		m.run();
		read();
		System.out.println(Thread.currentThread().getState() + " "+ Thread.currentThread().getName());
			m.start();
			m.join();
			System.out.println(Thread.currentThread().getState() + ", "+ Thread.currentThread().getName());
//			MultiThreadingRunnable t1=new MultiThreadingRunnable();
		Thread m1=new Thread(r);
		m1.start();
		m1.join();
			System.out.println("Main After New Thread " + Thread.currentThread().getName());
	}

	public static void read() {
		System.out.println("Read " + Thread.currentThread().getName());
	}
}
