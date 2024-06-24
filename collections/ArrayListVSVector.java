package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class ArrayListVSVector {

	public static void main(String[] args) {
		//ArrayList
		ArrayList al=new ArrayList();
					al.add("Massil");
					al.add("Technology");
					al.add(40);
					al.add(null);
		ArrayList al1=new ArrayList();
				al1.add(38.39);
				al1.add(true);
				al1.add(57.7f);
				
				al.addAll(Arrays.asList(al1));
		System.out.println(al);
		System.out.println(al.size());
				al.add(786);
		System.out.println(al.size());
		System.out.println(al.get(4));
		Collections.synchronizedList(al);
		System.out.println(al);
		System.out.println("*******");
		
		//Vector
		Vector v=new Vector();
				v.add("Hello");
				v.add("Welcome");
				v.add(2);
		ArrayList a=new ArrayList();
				a.add("Massil");
				a.add("Technology");
			
				v.addAll(Arrays.asList(a));
				
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.get(3));
		
		
	}

}
