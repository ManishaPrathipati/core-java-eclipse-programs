package collections;

import java.util.ArrayList;
import java.util.Collections;

public class GenericArrayList {

	public static void main(String[] args) {
		ArrayList<Student> a1=new ArrayList<Student>();
						a1.add(new Student(1, "Manisha", 345657651l, "m@gmail.com", "Guntur"));
						a1.add(new Student(2, "Manjusha", 52768282091l, "sm@gmail.com", "Rajuhmundry"));
						a1.add(new Student(3, "Anitha", 562536276l, "a@yahoo.com", "Hyderabad"));
						a1.add(new Student(4, "Lakshmi", 354565766l, "l@twitter.com", "Palnadu"));
		System.out.println(a1);
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
						a2.add(517);
						a2.add(43);
						a2.add(435);
						a2.add(98);
						a2.add(6745);
		System.out.println(a2);
		Collections.sort(a2);
		System.out.println(a2);
		
		ArrayList<Double> a3=new ArrayList<Double>();
						a3.add(523.34);
						a3.add(123.23);
						a3.add(42.431);
		System.out.println(a3);
		Collections.sort(a3);
		System.out.println(a3);
	}

}
