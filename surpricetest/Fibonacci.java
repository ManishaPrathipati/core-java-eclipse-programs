package surpricetest;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Enter the number of Fibonacci terms");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1;
		int b=1;
		int c=a+b;
		System.out.print(a + " " + b + " ");
		for(int i=1; i<=(n-2); i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(c + " ");
		}

	}

}
