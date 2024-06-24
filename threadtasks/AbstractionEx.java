package threadtasks;




interface A{
	public void m1();
}


class D{
private class B implements A{
	
	
	public void m1() {
		System.out.println("m1 is called");
	}
}


		B a() {
			return new B();
		}



}
public class AbstractionEx {
	
	public static void main(String[] args) {
		
	
//	A b = new B();
//	b.m1();
	D d = new D();
	  A object = d.a();
	  object.m1();
	
	}
	
	
	
}
