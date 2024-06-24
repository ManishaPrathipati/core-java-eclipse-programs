package exception;

import java.util.Scanner;

public class MultiCatchBlock {

	static int div;
	int i;
	int j;
	
	public MultiCatchBlock(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please Enter the size of the Array");
		int size=scan.nextInt();
		MultiCatchBlock[] mulCatch=new MultiCatchBlock[size];
		mulCatch[0]=new MultiCatchBlock(10,0);
		mulCatch[1]=new MultiCatchBlock(5,1);

		System.out.println("Enter the index value for a: ");
		int a=scan.nextInt();
		System.out.println("Enter the index value for b: ");
		int b=scan.nextInt();
		
		try {
			div=mulCatch[a].i/mulCatch[b].j;
			System.out.println(div);
		}
		catch(NullPointerException n) {
			System.out.println("Do not Access the members by using null Reference");
		}
		catch(ArithmeticException ae) {
			System.out.println("Do not divide by zero");
		}
		catch (ArrayIndexOutOfBoundsException aio) {
			System.out.println("Do not access using the index which is not present");
		}
		finally {
			System.out.println("I am Always Execute...!!!");
		}
	}

}
