package collections;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class VectorAsStack {

	public static void main(String[] args) {
		Vector v=new Vector();
				v.add("Hello");
				v.add("Hiii");
				v.add(123);
		Stack s=new Stack();
			s.add("Massil");
			s.push("Technology");
			s.addAll(v);	//Vector as Stack
			
			System.out.println(s);
			System.out.println("Element is at " + s.search("Hello"));
			s.pop();
			System.out.println(s);
			s.peek();
			System.out.println(s);
			System.out.println(s.isEmpty());

			System.out.println(s.capacity());
			System.out.println(s.size());
			System.out.println(s.contains("Massil"));
			s.set(3, "Hi");
			System.out.println(s);
			
			s.clear();
			System.out.println(s.isEmpty());
			System.out.println(s);
			
	}

}
