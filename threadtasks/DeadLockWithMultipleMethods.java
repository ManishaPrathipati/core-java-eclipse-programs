package threadtasks;

public class DeadLockWithMultipleMethods {

	static String n1="Dudu";
	static String n2="Bubu";
	
	public static void main(String[] args) {
		Runnable r1=()->{
			
		};
		Runnable r2=()->{
			
		};
		
		Thread t1=new Thread(r1);
		t1.start();
		
		Thread t2=new Thread(r2);
		t2.start();
	}
	
	public synchronized String name1() {
		
		return n1;
	}

}
