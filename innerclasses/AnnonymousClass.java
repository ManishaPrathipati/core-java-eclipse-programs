package innerclasses;

interface Outer{
	public void run();
}
public class AnnonymousClass {

	public static void main(String[] args) {

//		Outer outer=new Outer() {
//
//			@Override
//			public void run() {
//				System.out.println("I am Running");
//				
//			}
//			
//		};
//		outer.run();
		
		
		Outer outer=()->{
			System.out.println("I am Running");
		};
		outer.run();
	}

}
