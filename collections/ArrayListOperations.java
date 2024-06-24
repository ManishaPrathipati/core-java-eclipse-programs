package collections;

import java.util.ArrayList;

public class ArrayListOperations {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
						al.add(100);
						al.add(102);
						al.add(0, 100);
						al.add(106);
		ArrayList<Integer> al1=new ArrayList<Integer>();
						al1.add(103);
						al1.add(104);
						al1.add(105);
						al.addAll(3, al1);
		System.out.println(al);
						al.remove(1);
						//al.removeAll(al1);
		System.out.println(al);
						al.set(0,101);
		System.out.println(al);
		System.out.println(al.contains(104));
		System.out.println(al.get(5));
		System.out.println(al.size());
		//System.out.println(al.isEmpty());
						al.clear();
		System.out.println(al.isEmpty());
		

	}

}
