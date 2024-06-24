package threadtasks;

import java.util.Iterator;

public class CreationOfThreadRunnable implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		CreationOfThreadRunnable creationOfThreadRunnable = new CreationOfThreadRunnable();
		Thread thread=new Thread(creationOfThreadRunnable);
		thread.start();
		for(int i=1; i<=5; i++)
			System.out.println(i);
		System.out.println(thread.getId());
		System.out.println(thread.getName());
		System.out.println(thread.isAlive());
		//System.out.println(thread.getState());
		thread.sleep(5000);
		//System.out.println(thread.getState());
	}
	
	
	@Override
	public void run() {
		System.out.println("I was Overriden by CreationOfThreadExtending class");
		for(int i=1; i<=7; i++)
			System.out.println(i); 
	}

}
