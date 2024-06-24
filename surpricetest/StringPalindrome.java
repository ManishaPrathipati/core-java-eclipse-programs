package surpricetest;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		String result="";
		for(int i=str.length()-1; i>=0; i--) {
			result=result+str.charAt(i);
		}
		if(str.equals(result)) {
			System.out.println(str + " " + "is a Palindrome String");
		}
		else {
			System.out.println(str + " " + "is NOT a Palindrome String");
		}
	}

}
