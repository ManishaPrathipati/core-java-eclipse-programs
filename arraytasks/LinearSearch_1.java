package arraytasks;

import java.util.Scanner;

public class LinearSearch_1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the Array"); 
		int size=scanner.nextInt();
		int[] a=new int[size];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the Element for index " +i);
			a[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the Element to be Search from the Array");
		int element=scanner.nextInt();
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==element) {
				System.out.println("Element is found at index " + i);
				break;
			}
		}
	}

}
