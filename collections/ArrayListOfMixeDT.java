package collections;

import java.util.ArrayList;

public class ArrayListOfMixeDT {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
				a.add("Hello");
				a.add(true);
				a.add("Welcome");
				a.add(2);
				a.add(12.42);
				a.add(321.231f);
				a.add(234567890l);
				a.add(null);
				a.add('m');
				
		System.out.println(a);
				a.remove(1);
		System.out.println(a.contains("Welcome"));
		System.out.println(a.get(4));
				a.set(5, 9876543210l);
		System.out.println(a.size());
		System.out.println(a);
		
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}


	}

}
