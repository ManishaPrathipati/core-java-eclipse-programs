package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class ArrayListOfVector {

	public static void main(String[] args) {
		Vector v=new Vector();
			v.add("Hello");
			v.add("Hai");
			v.add("Massil");
		Vector v1=new Vector();
			v1.add("Java");
			v1.add("Html");
			v1.add("CSS");
		Vector v2=new Vector();
			v2.add("JavaScript");
			v2.add("React");
			v2.add("Angular");
		
		ArrayList<String> al=new ArrayList<String>(v);
						//al.addAll(v);
						al.addAll(v1);
						al.addAll(v2);
		System.out.println("ArrayList: " + al);
		
		
		ArrayList<Integer> a=new ArrayList<Integer>();
						a.add(45);
						a.add(32);
						a.add(56);
						a.add(123);
						a.add(378);
		Vector<Integer> vc=new Vector<Integer>(a);
		System.out.println("Vector: " + vc);
						
	}

}
