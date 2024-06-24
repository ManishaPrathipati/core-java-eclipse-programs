package day6_task;

class Animal{
	String name;
	
	Animal(String name){
		this.name=name;
	}
	
	public void sound() {
		System.out.println(this.name + " is the king of all animals and it roar with high voice");
	}
}

class Cat extends Animal{
	String cName;
	
	Cat(String cName) {
		super("Lion");
		this.cName=cName;
	}
	
	
	public void sound() {
		System.out.println(this.cName + " is fear of " + super.name + " and its voice is very less");
		System.out.println("Even after Method Overriding we can have a chance to get parent method");
		super.sound();
	}
}
public class PolyMethodOverride {

	public static void main(String[] args) {
		
		Cat cat=new Cat("Cat");
			cat.sound();

	}

}
