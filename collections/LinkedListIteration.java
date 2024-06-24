package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteration {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
					l.add(21);
					l.add(24);
					l.add(726);
					l.add(356);
					l.add(65);
					
		System.out.println(l);
		System.out.println("Using for");
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("Using for Each");
		for (Integer integer : l) {
			System.out.print(integer + " ");
		}
		
		System.out.println();
		System.out.println("Using Iterator");
		Iterator<Integer> itr=l.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() +" ");
		}
		
		System.out.println();
		System.out.println("Using List Iterator");
		ListIterator<Integer> litr=l.listIterator(l.size());
		while (litr.hasPrevious()) {
			System.out.print(litr.previous() +" ");
		}
	}

}
