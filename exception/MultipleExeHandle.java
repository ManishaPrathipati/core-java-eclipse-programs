package exception;

import java.util.Scanner;

public class MultipleExeHandle {

	static int div;
	int i;
	int j;
	
	public MultipleExeHandle(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please Enter the size of the Array");
		int size=scan.nextInt();
		MultipleExeHandle[] mulCatch=new MultipleExeHandle[size];
		mulCatch[0]=new MultipleExeHandle(20,0);
		mulCatch[1]=new MultipleExeHandle(5,4);

		System.out.println("Enter the index value for a: ");
		int a=scan.nextInt();
		System.out.println("Enter the index value for b: ");
		int b=scan.nextInt();
		
		try {
			div=mulCatch[a].i/mulCatch[b].j;
			System.out.println(div);
		}
		catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("It is not the right way to Access the members");
		}
		
		finally {
			System.out.println("I am Always Execute...!!!");
		}
	}

}
