package threadtasks;

public class ThreadGroupEg implements Runnable{

	public static void main(String[] args) {
		ThreadGroupEg te=new ThreadGroupEg();
		ThreadGroup tg=new ThreadGroup("Base");
		Thread t1=new Thread(tg, te, "T1");
		Thread t2=new Thread(tg, te, "T2");
		Thread t3=new Thread(tg, te, "T3");
		
		t1.start();	t2.start();t3.start();
		
		System.out.println("Group Name: " + tg.getName());
		tg.list();
		

	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
