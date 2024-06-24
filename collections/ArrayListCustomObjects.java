package collections;

import java.util.ArrayList;

class Student{
	int id;
	String name;
	long mobile;
	String eMail;
	String address;
	
	public Student(int id, String name, long mobile, String eMail, String address) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.eMail = eMail;
		this.address = address;
	}

	@Override
	public String toString() {
		return "\n Student [id=" + id + ", name=" + name + ", mobile=" + mobile + ", eMail=" + eMail + ", address="
				+ address + "]";
	}
	
	
}
public class ArrayListCustomObjects {

	public static void main(String[] args) {
		ArrayList<Student> a=new ArrayList<Student>();
				a.add(new Student(101, "Manisha", 6187618191l, "manisha@gmail.com", "Guntur"));
				a.add(new Student(102, "Madhavi", 2612781810l, "madhavi@yahoo.com", "Warangal"));
				a.add(new Student(103, "Rahul", 236238282l, "r@gmail.com", "Vizag"));
				
		System.out.println(a);
	}

}
