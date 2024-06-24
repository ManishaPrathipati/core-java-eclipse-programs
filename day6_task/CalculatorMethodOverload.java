package day6_task;

public class CalculatorMethodOverload {

	public static void main(String[] args) {

		CalculatorMethodOverload cmo=new CalculatorMethodOverload();
							cmo.add();
							System.out.println(cmo.add(10, 67, 3));
							System.out.println(cmo.add("Hello", 10, 20));
							System.out.println(cmo.sub(28, 23.5f));
							System.out.println(cmo.sub(10, 8));
							System.out.println(cmo.mul(1, 3.5f));
							System.out.println(cmo.mul(13, 4));
							System.out.println(cmo.div(12, 'g'));
							System.out.println(cmo.div(34, 8));
							System.out.println(cmo.mod(12, 4));
							System.out.println(cmo.mod(80, 20.0f));

	}
	
	public void add() {
		int a=10, b=20;
		System.out.println(a+b);
	}
	
	public double add(int a, double b, int c) {
		return a+b+c;
	}
	
	public String add(String s, int a, int b) {
		return s+a+b;
	}
	
	public float sub(int i, float f) {
		return i-f;
		
	}
	
	public int sub(int a, int b) {
		return a-b;
	} 
	
	public int mul(int a, int b) {
		return a*b;
		
	}
	
	public double mul(int a, float b) {
		return a*b;
		
	}
	
	public int div(int a, char c) {
		return c/a;
		
	}
	
	public float div(int c, float f) {
		return f/c;
		
	}
	
	public int mod(int a, int b) {
		return a%b;
		
	}
	
	public double mod(int a, float b) {
		return a%b;
		
	}

}
