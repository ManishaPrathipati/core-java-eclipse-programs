package collectionsframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionEg {

	public static void main(String[] args) {
		TreeSet<Integer> al=new TreeSet<Integer>();
		List l=Arrays.asList(1,2,3);
		System.out.println(l);
		System.out.println(al.add(356));
		System.out.println(al.add(356));
		System.out.println(al.add(879));
		System.out.println(al.addAll(l) + " addAll");
		System.out.println(al.remove(356));
		System.out.println(al.remove(356));
		al.toArray();
		System.out.println(al);
		System.out.println(al.retainAll(l));
		System.out.println(al);
		System.out.println(al.equals(1));
		
//		Collection c;
	}

}
