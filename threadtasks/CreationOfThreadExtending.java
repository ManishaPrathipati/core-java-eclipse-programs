package threadtasks;

public class CreationOfThreadExtending extends Thread{

	public static void main(String[] args) throws InterruptedException{
		CreationOfThreadExtending creationOfThreadExtending=new CreationOfThreadExtending();
		creationOfThreadExtending.start();
		System.out.println("Deafault Name: "+creationOfThreadExtending.getName());
		creationOfThreadExtending.setName("My New Thread");
		System.out.println("Name of the Thread: "+creationOfThreadExtending.getName());
		System.out.println(creationOfThreadExtending.currentThread().getName());
		creationOfThreadExtending.display();
		System.out.println(creationOfThreadExtending.currentThread().getName());
		creationOfThreadExtending.suspend();
		//System.out.println(creationOfThreadExtending.getState());
		creationOfThreadExtending.resume();
		//System.out.println(creationOfThreadExtending.getState());
		creationOfThreadExtending.sleep(700);
		//System.out.println(creationOfThreadExtending.getState());
		System.out.println(creationOfThreadExtending.getPriority());
		
	}

	public void run() {
		System.out.println("I was Overriden by CreationOfThreadExtending Class");
		
	}
	
	public void display() {
		System.out.println("Hello, Welcome");
	}
}
