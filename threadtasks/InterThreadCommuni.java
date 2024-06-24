package threadtasks;

import java.util.LinkedList;

class Ticket{
	int seatsAvalilable=10;
	int noOfTickets;
	
	public void ticketBooking(int noOfTickets) throws InterruptedException {
		this.noOfTickets=noOfTickets;
		synchronized(this) {
			if(noOfTickets>this.seatsAvalilable) {
				System.out.println("Please Provide required seats Based on seats Availability");
				wait();
			}
			else {
				System.out.println("Your Seats are Booked");
				System.out.println("Thanks for booking Your " + noOfTickets + " tickets Here...!!!");
				this.seatsAvalilable-=this.noOfTickets;
				System.out.println("You have only " + this.seatsAvalilable + " seats available to book ticket");
			}
		}
	}
	
	public void seatsAvailability(){
		synchronized (this) {
			System.out.println("You have only " + this.seatsAvalilable + " seats available to book ticket");
			this.notify();
		}
	}
}

public class InterThreadCommuni {
	public static void main(String[] args) {
		Ticket t=new Ticket();
		Runnable r1=()->{
			try {
				t.ticketBooking(6);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Runnable r2=()->{
			t.seatsAvailability();
		};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
				t1.start();
				t2.start();
				
//				LinkedList l=new LinkedList();
//				l.add(242);
//				l.add(3476);
//				l.add(376);
//				
//				System.out.println(l);
//				l.remove();
//				System.out.println(l);
	}
}