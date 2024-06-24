package exception;

import java.util.Scanner;

public class ExceptionPropagation {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		try {
			run();
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("You are trying to access the Elemeent from the index, Which is not present");
		}
	}

	public static void run() throws ArrayIndexOutOfBoundsException {
		walk();
	}

	public static void walk() throws ArrayIndexOutOfBoundsException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("Please Enter the index to fetch the Element");
		int i=scan.nextInt();
		a[0]=23;
		a[1]=12;
		a[2]=78;
		
		System.out.println(a[i]);
		
	}

}
