package finalexam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Stream;

class PersonObject {
	String name; 
	int age;
	String gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public PersonObject(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "PersonObject [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}

public class MainClass{
	public static void main(String[] args) {
		PersonObject p1=new PersonObject("Manisha", 25, "Female");
		PersonObject p2=new PersonObject("Mickey", 34, "Male");
		PersonObject p3=new PersonObject("Minnie", 28, "Female");
		PersonObject p4=new PersonObject("Donald", 25, "Male");
		PersonObject p5=new PersonObject("Daisy", 38, "Female");
		
		List<PersonObject> lp=Arrays.asList(p1,p2,p3,p4,p5);
		Stream<PersonObject> s = lp.stream().filter(p->p.getAge()>30);
		
		List<PersonObject> li = s.toList();
		HashMap<String, String> hm=new HashMap<String, String>();
		for (int i = 0; i < li.size(); i++) {
			hm.put(li.get(i).getName(), li.get(i).getGender());
		}
		System.out.println(hm);
	}
}
