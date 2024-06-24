package threadtasks;

public class SynchronizationWithMethods {

	public static void main(String[] args) {
		Synchro synchro=new Synchro();
		Runnable r1=()->{
			for(int i=1; i<=4; i++)
				System.out.println("Hello");
			synchro.display();
		};
		
		Runnable r2=()->{
			synchro.display();
		};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
				t1.start();
				t2.start();

	}

}

class Synchro{
//	public void display() {
//		for(int i=1; i<=7; i++)
//			System.out.print(i + " ");
//	}
	
	public synchronized void display() {
		for(int i=1; i<=7; i++)
			System.out.print(i + " ");
	}
}