package threadtasks;

class Producer extends Thread{
	StringBuffer sb;
	boolean pOver=false;
	
	Producer(){
		sb=new StringBuffer();
	}
	
	public void run() {
		synchronized (sb) {
			for (int i = 1; i <= 10; i++) {
				sb.append("Item: " + i + " ");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
//			pOver=true;
			sb.notify();
		}
	}
}

class Consumer extends Thread{
	Producer prod;
	
	Consumer(Producer pro){
		this.prod=pro;
	}
	
	public void run() {
			synchronized (prod.sb) {
				try {
					//while(!prod.pOver) {
					prod.sb.wait();
						//Thread.sleep(1000);
						//prod.pOver=true;
					//}
					System.out.println("Consumer Class is Waiting");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Consumer is notified");
				System.out.println(prod.sb);
			}
	}
}
public class InterThreadWithOutWN {

	public static void main(String[] args) throws InterruptedException {
		Producer p=new Producer();
		Consumer c=new Consumer(p);
		
//		p.start();
		c.start();
//		c.join();
		p.start();
		
	}

}
