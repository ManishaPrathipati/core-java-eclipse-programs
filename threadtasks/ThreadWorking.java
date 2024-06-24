package threadtasks;

public class ThreadWorking {

	public static void main(String[] args) throws InterruptedException {
		Runnable r1=()->{
			for(int i=1; i<=4; i++) {
				System.out.println("From R1");
			}
		};
		
		Runnable r2=()->{
			for(int i=1; i<=4; i++) {
				System.out.println("From R2");
			}
		};
		
		Runnable r3=()->{
			for(int i=1; i<=4; i++) {
				System.out.println("From R3");
			}
		};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		
		
	}

}
