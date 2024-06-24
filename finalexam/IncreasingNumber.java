package finalexam;

import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		IncreasingNumber in=new IncreasingNumber();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Number to Check whether the Number is Increasing Number or Not");
		String number=scan.next();
		if(in.checkNumber(number))
			System.out.println(number + " is an Increasing Number");
		else
			System.out.println(number + " is not an Increasing Number");
	}

	public boolean checkNumber(String number) {
		int count=0;
		for (int i = 0; i < number.length()-1; i++) {
			if(number.charAt(i)<=number.charAt(i+1)) {
				count++;
			}
			if(count==number.length()-1) {
				return true;
			}
		}
		return false;
	}

}
