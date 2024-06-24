package finalexam;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;


class Person{
	int date;
	int month;
	int year, destinyNumber;
	
	public Person(int date, int month, int year, int destinyNumber) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
		this.destinyNumber = destinyNumber;
	}

	public Person(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}



	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [date=" + date + ", month=" + month + ", year=" + year + ", destinyNumber=" + destinyNumber
				+ "]";
	}
	
	void computeDestinyNumber(){
		int sum=0;
		while(year!=0) {
			int rem=year%10;
			sum+=rem;
			year/=10;
		}
		int nSum=this.date+this.month+sum;
		int s=0;
		while(nSum!=0) {
			int rem=nSum%10;
			s+=rem;
			nSum/=10;
		}
		System.out.println(s);
	}
}

public class Numerology {

	static HashMap<Integer, String> planets=new HashMap<Integer, String>();
	static HashMap<String, String> planetsCharacteristics=new HashMap<String, String>();
	
	public static void main(String[] args) {

		Person p=new Person(3, 4, 1990, 7);
		Person p1=new Person(3, 3, 1990);
		p.computeDestinyNumber();
		Numerology n=new Numerology();
		
								planets.put(1, "Sun");
								planets.put(2, "Moon");
								planets.put(3, "Mars");
								planets.put(4, "Rahu");
								planets.put(5, "Mercury");
								planets.put(6, "Venus");
								planets.put(7, "Ketu");
								planets.put(8, "Saturn");
								planets.put(9, "Mars");
								
				planetsCharacteristics.put("Sun", "Confidence");
				planetsCharacteristics.put("Moon", "Emotions");
				planetsCharacteristics.put("Jupiter", "Knowledge");
				planetsCharacteristics.put("Rahu", "extravagance");
				planetsCharacteristics.put("Mercury", "Intelligence");
				planetsCharacteristics.put("Venus", "Beauty");
				planetsCharacteristics.put("Ketu", "Philosophy");
				planetsCharacteristics.put("Saturn", "Discipline");
				planetsCharacteristics.put("Mars", "Vitality");
				
		
		n.loadHasMap();
		n.loadHashMapCharacteristics();
//		System.out.println(n.getProperties(p1));

	}
	
	void loadHasMap(){
		Set<Entry<Integer, String>> p = planets.entrySet();
		for (Entry<Integer, String> entry : p) {
			System.out.println(entry.getKey() + "->''" + entry.getValue()+"''");
		}
	}
	
	void loadHashMapCharacteristics(){
		int count=0;
		Collection<String> v = planets.values();
		Set<Entry<String, String>> p1 = planetsCharacteristics.entrySet();
		for (String string : v) {
			for (Entry<String, String> entry : p1) {
				if(string.equals(entry.getKey())) {
					System.out.println("''" + string + "''-> " + "''" + entry.getValue()+ "''");
					count++;
					return;
				}
				else
					System.out.println(entry.getKey()+ " -> " + "''" + entry.getValue()+ "''" );
			}
//			if(count==planets.size())
		}
	}
	
	String getProperties(Person p){
		Person per=new Person();
		int destiny=per.destinyNumber;
//		System.out.println(destiny);
		return planetsCharacteristics.get(destiny);
	}

}
