package exception;

import java.util.Scanner;

public class ArithException {

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int res=0;
		System.out.println("Please Enter the Number for Numerator");
		int num=scan.nextInt();
		System.out.println("Please enter the Number for Denominator");
		int den=scan.nextInt();
		
		try {
			res=num/den;
		}
		catch(ArithmeticException a) {
			System.out.println("Do not Divide Number by 0");
		}
		
		System.out.println(res);
	}

}
