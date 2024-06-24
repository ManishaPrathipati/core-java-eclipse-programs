package finalexam;

import java.util.Enumeration;
import java.util.Vector;

class Base{
	int value=0;
	
	Base(){
		//System.out.println(value);
		addValue();
		//System.out.println(value);
	}

	void addValue() {
		//System.out.println("I am Parent");
		value+=10;
		//System.out.println(value);
	}
	int getValue() {
		return value;
	}
}

class Derived extends Base{
	
	Derived(){
		//System.out.println(value);
		addValue();
		//System.out.println(value);
	}

	void addValue() {
		//System.out.println("I am Child");
		value+=20;
		//System.out.println(value);
	}
}
public class Fourty {

	public static void main(String[] args){
		Base b=new Derived();
		System.out.println(b.getValue());
		
		Vector v=new Vector(3,7);
		v.add(23);
		v.add(34);
		v.add(12);
		v.add(1234);
		v.add(123);
		System.out.println(v);

		Enumeration en=v.elements();
		while (en.hasMoreElements()) {
			v.removeElement(1234);
			System.out.println(en.nextElement());
		}
		
	}

}
