package day6_task;

public class PolyMethodOverload {

	static{
		System.out.println("Calling the main() Explicitely");
		main(null);
	}
	public static void main(String[] args) {
		System.out.println("I am from String main()");
		main();

	}

	public static void main() {
		System.out.println("I am also main()");
		main(10,20);
	}
	
	public static void main(int a, int b) {
		System.out.println("I am one more main(). But, I have 2 int values");
		System.out.println("Addition of " + a + " and " + b + " is: " + (a+b));
	}
}
