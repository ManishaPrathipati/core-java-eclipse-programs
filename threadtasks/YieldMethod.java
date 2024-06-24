package threadtasks;

public class YieldMethod {

	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=1; i<=4; i++) {
				Thread.yield();
				System.out.println("From Runnable");
			}
		};
		
//		Runnable r1=()->{
//			for(int i=1; i<=4; i++) {
//				System.out.println("From Runnable1");
//			}
//		};
		
		Thread t1=new Thread(r);
//		Thread t2=new Thread(r1);
		
		t1.setPriority(10);
//		t2.setPriority(9);
		
		t1.start();
//		t2.start();
		
		for(int i=1; i<=4; i++) {
			System.out.println("From Main");
		}
	}

}
