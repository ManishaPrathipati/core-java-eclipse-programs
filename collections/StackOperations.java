package collections;

import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<Integer>();
					stk.push(34);
					stk.push(123);
					stk.push(87);
					stk.add(21);
					stk.push(345);
					stk.push(12);
		System.out.println(stk);
		
		for (int i = 0; i < stk.size(); i++) {
			System.out.println(stk.get(i));
		}
		
		System.out.println("Peek value is :" + stk.peek());
		System.out.println("Stack Capacity is: " + stk.capacity());
		System.out.println(stk.contains(123));
		System.out.println("First Element is :" + stk.firstElement());
		System.out.println("Last Element is :" + stk.lastElement());
		System.out.println(stk.isEmpty());
		stk.clear();
		System.out.println(stk.isEmpty());
	}

}
