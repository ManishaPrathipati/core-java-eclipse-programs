package threadtasks;

import java.util.*;

import java.util.Comparator;

class IdComp implements Comparator<Student>{

	public int compare(Student o1, Student o2) {
		return o1.id-o2.id;
	}

}

class NameComp implements Comparator<Student>{

	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}

}

class MarksComp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.marks>o2.marks) 
		  return 1;
		if(o1.marks<o2.marks) 
		  return -1; 
		return 0;
	}	
	

}


class Student {//implements Comparable<Student>{

	int id;
	String name;
	double marks;
	// int rank;

	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	
	
//	  public int compareTo(Student o) { 
//		  if(this.marks>o.marks) 
//			  return 1;
//		  if(this.marks<o.marks) 
//			  return -1; 
//		  return 0; 
//	  }
	 
}


public class StudentDetails {

	public static void main(String[] args) {

		
//		  ArrayList<Student> st=new ArrayList<Student>(); 
//		  st.add(new Student(3,"Mickey",34.7)); 
//		  st.add(new Student(2,"Minnie",84.14)); 
//		  st.add(new Student(1,"Daisy",80.14)); 
//		  st.add(new Student(4,"Milky",90.24));
		 
	//System.out.println(st);
	//Collections.sort(st);
	//System.out.println(st);
	//Collections.reverse(st);
	//System.out.println(st);
	
	
//	  int rank1=1; 
//	  for(Student s:st) { 
//		  s.rank=rank1++; 
//	  } 
//	  System.out.println(st);
	 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the manner");
		String s=sc.next();
		Comparator<Student> c=new IdComp();
		if(s.equalsIgnoreCase("name"))
			c=new NameComp();
		else if(s.equalsIgnoreCase("marks"))
			c=new MarksComp();
		
		TreeSet<Student> ts=new TreeSet<Student>(c);
		
		LinkedList<Integer> l=new LinkedList();
//		l.add(4544);
//		l.add(454);
//		l.add(65);
//		
//		System.out.println(l.get(2));
		
		ts.add(new Student(3,"Mickey",34.7));
		ts.add(new Student(2,"Minnie",84.14));
		ts.add(new Student(1,"Daisy",80.14));
		ts.add(new Student(4,"Milky",90.24));
		System.out.println(ts);
		
		/*
		 * int i=0; for(Student s:ts) { i++; if(i==2) System.out.println(s); }
		 */
	
		ArrayList<Student> st=new ArrayList<Student>(ts);
		System.out.println(st.get(st.size()-2));
		
		
	}

}

