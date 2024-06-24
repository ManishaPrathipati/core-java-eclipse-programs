package collections;

import java.util.LinkedList;

class Employee{
	
	String id;
	String name;
	String email;
	long mobile;
	String address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Employee(String id, String name, String email, long mobile, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
	
	public Employee() {
		super();
	}
	
	@Override
	public String toString() {
		return "\n Employee [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", address="
				+ address + "]";
	}
	
	
}

public class CustomLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Employee> empList=new LinkedList<Employee>();
							empList.add(new Employee("T0040", "Manisha", "jorge@gmail.com", 8872639291l, "Guntur"));
							empList.add(new Employee("T0041", "Eva Maria", "eva@gmail.com", 9219219847l, "Mysore"));
						Employee e=new Employee();
						e.setId("T0039");
						e.setName("Mathew");
						e.setEmail("methew@gmail.com");
						e.setMobile(8082729381l);
						e.setAddress("Banglore");
							empList.addFirst(e);
							empList.addLast(new Employee("T0043", "Peter", "peter@gmail.com", 8625002670l, "Hyderabad"));
							empList.offer(new Employee("T0042", "John", "john@gmail.com", 7098382934l, "Chennai"));
			System.out.println(empList);
			
			for (Object obj : empList) {
				System.out.print(obj + " ");
			}
					
			System.out.println();
			for (int i = 0; i < empList.size(); i++) {
				if(empList.get(i).getName().contains("John")){
					System.out.println(empList.get(i));
				};
			}
			
			System.out.println();
			System.out.println("Fetching with index " + empList.get(2));
			System.out.println("Getting First " + empList.getFirst());
			System.out.println("Getting First " + empList.getLast());
			System.out.println(empList);
			System.out.println("Peeak Value is: " + empList.peek());
			System.out.println("Peeak First: " + empList.peekFirst());
			System.out.println("Peeak Last: " + empList.peekLast());
			System.out.println(empList);
			//System.out.println(empList.poll());
			//System.out.println(empList.pollFirst());
			//System.out.println(empList);
			System.out.println(empList.pollLast());
			System.out.println(empList);
			//System.out.println(empList.pop());
			System.out.println(empList.remove());
			System.out.println(empList);
			System.out.println(empList.removeLast());
			System.out.println(empList);
				
	}

}
