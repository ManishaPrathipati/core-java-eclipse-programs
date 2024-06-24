package threadtasks;

public class SynchronizationWithBlocks {

	public static void main(String[] args) {
		SynchroBlock synchro=new SynchroBlock();
		
		
		Runnable r1=()->{
			synchro.display();
		};
		
		MyThread t=new MyThread(synchro);
		Thread t1=new Thread(t);
		Thread t2=new Thread(r1);
				t1.start();
				t2.start();

	}

}

class MyThread extends Thread{
		SynchroBlock sb;
		
		public MyThread(SynchroBlock sb) {
			super();
			this.sb = sb;
		}

		public void run() {
			sb.display();
		}
}

class SynchroBlock{
	public void display() {
		for(int i=1; i<=7; i++)
			System.out.print(i + " ");
		System.out.println();
		
		synchronized (this){
			for(int i=1; i<=7; i++)
				System.out.print(i);
			System.out.println();
		}
	}
}