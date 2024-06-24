package collections;

import java.util.LinkedList;

public class BasicLinkedList {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
				l.add("Welcome");
				l.add(0, "Hello");
				l.add(2);
		LinkedList l1=new LinkedList();
				l1.addLast("Technologies");
				l1.addFirst("Massil");
				l.addAll(l1);
				
		System.out.println(l);
		System.out.println(l.contains("hello"));
		System.out.println(l.containsAll(l1));
		System.out.println(l.get(1));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.indexOf("Massil"));
		System.out.println(l.lastIndexOf("Welcome"));
		System.out.println(l);
		System.out.println(l.offer(l1));
		System.out.println(l);
		System.out.println(l.peek());
		System.out.println(l.peekLast());
		System.out.println(l);
		System.out.println(l.poll());
		System.out.println(l);
		System.out.println(l.remove(3));
		System.out.println(l);
	}

}
