package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListAsStack {

	public static void main(String[] args) {
		LinkedList<Double> sl=new LinkedList<Double>();
						sl.add(123.43);
						sl.add(32443.34);
						sl.add(1, 2354.88);
						sl.addFirst(111.32);
						sl.addLast(123.56);
		Stack<Double> stk=new Stack<Double>();
					stk.addElement(12313.42);
					stk.addAll(sl);
					stk.push(2135.234);
					
		System.out.println(stk);
		
		for (int i = 0; i < stk.size(); i++) {
			System.out.print(stk.get(i) + "  ");
		}
		System.out.println();
		
		System.out.println(stk);
		System.out.println("Peek value is :" + stk.peek());
		System.out.println(stk);
		stk.pop();
		System.out.println("After pop,the elements are " + stk);
		System.out.println("Stack Capacity is: " + stk.capacity());
		System.out.println(stk.contains(123.43));
		System.out.println("First Element is :" + stk.firstElement());
		System.out.println("Last Element is :" + stk.lastElement());
		System.out.println(stk);
		stk.remove(123.43);
		System.out.println(stk);
		System.out.println(stk.isEmpty());
		stk.clear();
		System.out.println(stk.isEmpty());
						

	}

}
