package collections;

import java.util.LinkedList;

public class MixedLinkedList {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
				li.offer("My Name is");
				li.offerFirst("Hello ");
				li.offer("Manisha Prathipati");
				li.offer("My Id is: ");
				li.offer(1234);
				li.offer("Contact: ");
				li.offer(8276287821l);
				li.add("Salary: ");
				li.add(33243.234);
				li.offerLast("Thank You");
		System.out.println(li);
				
		for (Object obj : li) {
			System.out.print(obj + " ");
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
