package innerclasses;

import innerclasses.OuterClass1.InnerClass;

class OuterClass2{
	static class InnerClass{
		public void show() {
			System.out.println("Hello Mickey");
		}
	}
}
public class StaticClass {

	public static void main(String[] args) {
		OuterClass2.InnerClass inner=new OuterClass2.InnerClass();
		inner.show();
	}

}
