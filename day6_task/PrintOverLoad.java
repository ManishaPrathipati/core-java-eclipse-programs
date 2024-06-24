package day6_task;

class System1{
	
	static PrintStream1 out1=new PrintStream1();
}

class PrintStream1{
	
	public void println1() {
		
	}
	
	public int println1(int a) {
		return a;
	}
	
	public float println1(float f) {
		return f;
	}
	
	public double println1(double d) {
		return d;
	}
	
	public String println1(String s) {
		return s;
	}
	
	public int print1(int a) {
		return a;
	}
	
	public float print1(float f) {
		return f;
	}
	
	public double print1(double d) {
		return d;
	}
	
	public char print1(char ch) {
		return ch;
	}
	
	public String print1(String s) {
		return s;
	}
}
public class PrintOverLoad {

	public static void main(String[] args) {

		System1.out1.println1();
		System1.out1.print1(20.0);

	}

}
