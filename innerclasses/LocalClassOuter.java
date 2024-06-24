package innerclasses;

public class LocalClassOuter {

	public static void main(String[] args) {

		class LocalInner{
			public void eat() {
				System.out.println("I am eating");
			}
		}
		
		LocalInner linner=new LocalInner();
		linner.eat();
	}

}
