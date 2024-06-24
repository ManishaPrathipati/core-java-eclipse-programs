package arraytasks;

import java.util.Scanner;

public class ArrayInitialiseAndSum_1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the size of the array");
		int size=scan.nextInt();
		int[] a=new int[size];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Please Enter the Element " + (i+1));
			a[i]=scan.nextInt();
		}
		
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println("Sum of the Elements in the Array is: " + sum);
	}

}
