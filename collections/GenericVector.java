package collections;

import java.util.Collections;
import java.util.Vector;

public class GenericVector {

	public static void main(String[] args) {
		Vector<String> v1=new Vector<String>();
					v1.add("Hello");
					v1.add("Massil");
					v1.add("Technology");
		Vector<Student> v2=new Vector<Student>();
					v2.add(new Student(10, "Mickey", 23478623l, "mickey@disney.com", "Banglore"));
					v2.add(new Student(7, "Minnie", 4564765612l, "minnie@disney.com", "Mysore"));
					v2.add(new Student(13, "Daisy", 23473223l, "daisy@disney.com", "Vizag"));
					v2.add(new Student(4, "donald", 7684765612l, "donald@disney.com", "Hyderabad"));

		Vector<Object> v3=new Vector<Object>();
					v3.addAll(v1);
					v3.addAll(v2);
		System.out.println(v3);
		System.out.println();
		for (Object object : v3) {
			System.out.println(object);
		}
					

	}

}
