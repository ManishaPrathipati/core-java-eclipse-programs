package collections;

import java.util.LinkedList;

public class GenericLinkedList {

	public static void main(String[] args) {
		LinkedList<String> li=new LinkedList<String>();
						li.add("Technologies");
						li.addFirst("Massil");
						li.add(0, "Hello");
						li.addLast("Uppal");
		System.out.println(li);
		
		for (String string : li) {
			System.out.print(string + " ");
		}
		
		System.out.println();
		System.out.println(li.contains("Massil"));
		System.out.println(li.element());
		System.out.println(li.get(2));
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
						li.offerLast("Hyderabad");
		System.out.println(li);
		System.out.println("Peeak Value is: " + li.peek());
		System.out.println("Peeak First: " + li.peekFirst());
		System.out.println("Peeak Value is: " + li.peekLast());
		System.out.println(li);
		//System.out.println(li.poll());
		//System.out.println(li.pollFirst());
		System.out.println(li);
		System.out.println(li.pollLast());
		System.out.println(li);
		//System.out.println(li.pop());
		System.out.println(li.remove());
		System.out.println(li);
		System.out.println(li.removeLast());
		System.out.println(li);
		

	}

}
