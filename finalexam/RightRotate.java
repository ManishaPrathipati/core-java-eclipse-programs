package finalexam;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotate {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please Enter the Size of the array");
		int size=scan.nextInt();
		int [] a=new int[size];
		int res[]=new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Please Provide the Element for index " + i);
			a[i]=scan.nextInt();
		}
		
		System.out.println("Please Enter the No of steps you need to rotate the Array");
		int k=scan.nextInt();
		
		for (int i = a.length-k, j=0; i < a.length; i++) {
			res[j++]=a[i];
		}
		for (int i = 0, j=k; i < a.length-k; i++) {
			res[j++]=a[i];
		}
		//System.out.println(Arrays.toString(res));
		
		System.out.print("[ ");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.print("]");

	}

}
