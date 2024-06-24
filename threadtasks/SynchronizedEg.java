package threadtasks;

public class SynchronizedEg {

	static int c;
	public static void main(String[] args) {
		SynchronizedEg s=new SynchronizedEg();
		Runnable r1=()->{
//			synchronized(s) {
//				run();
//			}
			s.sync();
		};
// 
//		Runnable r2=()->{
//			//run();
//			sync();
//		};
// 
		Thread t1=new Thread(r1);
		t1.start();
		Thread t2=new Thread(r1);
		t2.start();
	}

	 public void sync() {
		SynchronizedEg s=new SynchronizedEg();
		System.out.print("I am from Synchronized method: ");
		synchronized (this) {
			for(int i=1; i<=3; i++) {
				c++;
				System.out.println(i + " Sync " + c);
			}
		}
		System.out.println("Done with Execution");
	}

	public static void run() {
		System.out.print("I am from non Synchronized: ");
		for(int i=1; i<=3; i++)
			System.out.println(i + " Non Sync");
	}

}
