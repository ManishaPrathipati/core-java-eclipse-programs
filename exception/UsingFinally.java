package exception;

import java.util.Scanner;

public class UsingFinally {

	public static void main(String[] args) {
		String s="Timing Wishes";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the index to search the Character");
		int i=scan.nextInt();
		
		try {
			System.out.println(s.charAt(i));
			System.out.println("Good Morning");
		}
		catch(StringIndexOutOfBoundsException si) {
			System.out.println("No wishes You get");
		}
		finally {
			System.out.println("Have a nice day");
		}
		
	}

}
