package threadtasks;

public class DeadLockMultiple {

	static String n1="Mickey";
	static String n2="Minnie";

	public static void main(String[] args) throws InterruptedException {
		Runnable r1=()->{
			synchronized (n1){
				System.out.println(n1 + " is calling to " + n2);
				System.out.println(n2 + " call is getting busy to " +n1);
				synchronized(n2) {
					System.out.println(n1 + " Successfully make a call with " + n2);
				}
			}
		};
		
		Runnable r2=()->{
			synchronized (n2){
				System.out.println(n2 + " is calling to " + n1);
				System.out.println(n1 + " call is getting busy to " +n2);
				synchronized(n1) {
					System.out.println(n2 + " Successfully make a call with " + n1);
				}
			}
		};
		
		Thread t1=new Thread(r1);
		t1.start();
		
		Thread t2=new Thread(r2);
		t2.start();
	}

}
