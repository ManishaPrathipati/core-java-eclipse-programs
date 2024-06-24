package threadtasks;

class Run1 extends Thread{
	public void run() {
			for(int i=1; i<=3; i++) {
				System.out.print(i + " I am from R1");
				System.out.println();
			}
	}
}

class Run2 extends Thread{
	public void run() {
			for(int i=1; i<=3; i++) {
				System.out.print(i + " I am from R2");
				System.out.println();
			}
	}
}

class Run3 extends Thread{
	public void run() {
			for(int i=1; i<=3; i++) {
				System.out.print(i + " I am from R3");
				System.out.println();
			}
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
	
		Run1 r1=new Run1();
		Run2 r2=new Run2();
		Run3 r3=new Run3();
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		
		t1.setPriority(10);
		t2.setPriority(8);
		t3.setPriority(3);
		
		t1.start();
//		System.out.println(t1.getPriority());
		t2.start();
		t3.start();
	}

	

	

	

}
