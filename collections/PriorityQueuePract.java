package collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueuePract {

	public static void main(String[] args) {
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		p.add(12);
		p.add(3);
		p.add(13);
		p.add(10);
		p.add(3);
		p.add(456);
		//p.add(null);
		System.out.println(p);
		
	}

}
