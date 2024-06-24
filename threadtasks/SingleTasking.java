package threadtasks;

public class SingleTasking{
	public static void main(String[] args) {
		Runnable r=()->{
			boolean cond=true;
			task1();
			try {
				Thread.currentThread().sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			task2();
			//Externally terminating the thread
//			while(cond) {
//				return;
//			}
//			task3();
		};
		
		Runnable r1=()->{
			
			task2();
			task3();
		};
		
		Thread t=new Thread(r);
		t.start();
		Thread t1=new Thread(r1);
		t1.start();
	}

	public static void task1() {
		System.out.println("From task1 " + Thread.currentThread().getName() + " " + Thread.currentThread().getState());
		for(int i=1; i<=3; i++)
			System.out.println(i);
	}

	public static void task2() {
		System.out.println("From task2 " + Thread.currentThread().getName() + " " + Thread.currentThread().getState());
		for(int i=1; i<=3; i++)
			System.out.println(i);
		//new Thread().notify();
	}

	public static void task3() {
		System.out.println("From task3 " + Thread.currentThread().getName() + " " + Thread.currentThread().getState());
		for(int i=1; i<=3; i++)
			System.out.println(i);
	}

}