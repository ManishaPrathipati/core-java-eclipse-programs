package generics;

class Genericss<T,V,S>{
	T var1; V var2; S var3;
	public void input(T var1, V var2, S var3) {
		this.var1=var1;
		this.var2=var2;
		this.var3=var3;
	}
	public void getObject() {
		System.out.println("The value is: " + var1);
		System.out.println("The value is: " + var2);
		System.out.println("The value is: " + var3);
	}
}

//class Genericss{
//	int var1;
//	double var2;
//	String var3;
//	
//	public void input(int var1) {
//		this.var1=var1;
//	}
//	public void input(double var2) {
//		this.var2=var2;
//	}
//	public void input(String var3) {
//		this.var3=var3;
//	}
//	
//	public int output1() {
//		return var1;
//	}
//	public double output2() {
//		return var2;
//	}
//	public String output3() {
//		return var3;
//	}
//}

//class Genericss<T>{
//	T var;
//	
//	public void input(T var) {
//		this.var=var;
//	}
//	public T output() {
//		return var;
//	}
//}
public class GenericsEg {
	public static void main(String[] args) {
		Genericss g1=new Genericss();
		Genericss g2=new Genericss();
		Genericss g3=new Genericss();
		
		//g1.input(67);
//		System.out.println(g1.output());
		//System.out.println(g1.output1());
		
		//g2.input(45.90);
//		System.out.println(g2.output());
		//System.out.println(g2.output2());
		
		//g3.input("Manisha");
//		System.out.println(g3.output());
		//System.out.println(g3.output3());
		
		Genericss<Integer, String, Double> g=new Genericss<>();
		g.input(5765, "Manisha", 98.76);
		g.getObject();
		
		}
}
