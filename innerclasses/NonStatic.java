package innerclasses;

class OuterClass1{
	class InnerClass{
		public void show() {
			System.out.println("Hello Mickey");
		}
	}
}
public class NonStatic {

	public static void main(String[] args) {
		OuterClass1 outer=new OuterClass1();
		OuterClass1.InnerClass inner=outer.new InnerClass();
		inner.show();

	}

}
