package exception;

import java.util.Scanner;

public class NullException {
	int i;
	static NullException exe;

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please Enter the size of the Array");
		int size=scan.nextInt();
		NullException[] nExe=new NullException[size];
		nExe[0]=new NullException();
		nExe[1]=new NullException();

		try {
			System.out.println(nExe[2].i);
		}
		catch(NullPointerException n) {
			System.out.println("Do not Access variable Using Null Reference");
		}
		
		
		
//		try {
//			System.out.println(exe.i);
//		}
//		catch(NullPointerException n) {
//			System.out.println("Do not Access variable Using Null Reference");
//		}
	}

}
