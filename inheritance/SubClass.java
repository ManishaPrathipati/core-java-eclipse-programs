package inheritance;

public class SubClass implements I{

	public static void main(String[] args) {
		SubClass class1=new SubClass();
				class1.run();
				class1.sleep();

	}

	@Override
	public void run() {
		System.out.println("I am Running");
	}

	@Override
	public void sleep() {
		System.out.println("I am Sleeping");
	}

}
