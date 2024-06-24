package finalexam;

import java.util.Scanner;

public class LargeNumberNotContainD {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Number");
		int n=scan.nextInt();
		System.out.println("Please Enter the Digit, Which not get in the Number");
		int d=scan.nextInt();
		
		for(int i=n; i>=0; i--) {
			int num=i, count=0;
			while(num!=0) {
				int rem=num%10;
					num/=10;
				if(rem==d) {
					count++;
				}
				
			}
			if(count<1) {
				System.out.println(i + " is the Largest Number, That not Contain " + d + " in it");	
				break;
			}
		}

	}

}
