package surpricetest;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int temp=num;
		int rem;
		int rev=0;
		while(temp>0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev) {
			System.out.println(num + " " + "is Palindrome");
		}
		else {
			System.out.println(num + " " + "is NOT Palindrome");
		}
	}

}
