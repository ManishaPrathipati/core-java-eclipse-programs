package threadtasks;

public class CreationOfThread {

	public static void main(String[] args) {
		int a=10;
		Thread t=new Thread();
		t.start();
		CreationOfThread creationOfThread=new CreationOfThread();
		System.out.println(t.currentThread().getName());
		creationOfThread.run();
		System.out.println(t.currentThread().getName());
		System.out.println(a);
		System.out.println(t.currentThread());
	}
	void run(){
		System.out.println("Hiii I am Normal run() from CreationOfThread Class");
	}

}
